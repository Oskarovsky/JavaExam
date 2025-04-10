package concurrency;

import java.util.concurrent.locks.Lock;

public class ReetrantService {

    public void downloadFile(Lock lock) {
        try {
            lock.lock();
            System.out.println("Starting download...");
            Thread.sleep(500);
            System.out.println("...");
            Thread.sleep(500);
            System.out.println("...");
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
            System.out.println("Finished download.");
        }
    }
}
