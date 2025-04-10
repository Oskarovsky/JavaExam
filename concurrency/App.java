package concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;


public class App {

    public static void performCount(int animal) {
        // IMPLEMENTATION OMITTED
    }
    public static void printResults(Future<?> f) {
        try {
            System.out.println(f.get(1, TimeUnit.DAYS)); // o1
        } catch (Exception e) {
            System.out.println("Exception!");
        }
    }


    public static void main(String... nap) {
        var data = List.of(2,5,1,9,8);
        data.stream().parallel()
                .mapToInt(s -> s)
                .peek(t -> System.out.printf("-o%so-", t))
                .forEachOrdered(System.out::print);
    }

}
