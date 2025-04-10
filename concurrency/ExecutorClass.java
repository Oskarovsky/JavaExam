package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorClass {

    public void runExecutor() {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        try {
            System.out.println("START");
            executor.execute(printFirst());
            executor.execute(printRecords(10));
            executor.execute(printSecond());
            System.out.println("END");
        } finally {
            executor.shutdown();
        }
    }

    private Runnable printFirst() {
        return new Thread(() -> System.out.println("First one!"));
    }

    private Runnable printSecond() {
        return new Thread(() -> System.out.println("Second one!"));
    }

    private Runnable printRecords(int size) {
        return new Thread(() -> {
            for (int i = 0; i < size; i++) {
                System.out.printf("Record %d\n", i);
            }
        });
    }
}
