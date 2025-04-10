package concurrency;

import java.util.concurrent.*;

public class FutureClass {

    private static int counter = 0;

    public Future<?> executeFuture() {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        return executorService.submit(() -> System.out.println("Running executor!"));
    }

    public void pollingAndPauseFunction() {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        try {
            Future<?> result = executorService.submit(() -> {
                System.out.println("Running executor in polling and pause!");
                for (int i = 0; i < 1_000_000_000; i++) {
                    counter++;
                }
            });
            result.get(1, TimeUnit.SECONDS);
            System.out.println("Reached!");
        } catch (TimeoutException | ExecutionException | InterruptedException ex) {
            System.out.println("Not reached in time");
        } finally {
            executorService.shutdown();
        }
    }
}
