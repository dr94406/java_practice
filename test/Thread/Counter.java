package Thread;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Counter {
    private int count;

    public void increment(){
        try {
            int temp = count;
            count = temp + 1;
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int getCount() {
        return count;
    }

    @DisplayName("FixedThreadPool 생성")
    @Test
    void testCounterWithConcurrencyFixed() throws InterruptedException  {
        int numberOfThreads = 18;
        ExecutorService service = Executors.newFixedThreadPool(5);
        CountDownLatch latch = new CountDownLatch(numberOfThreads);
        Counter counter = new Counter();
        iterateThread(numberOfThreads, service, latch, counter);

    }

    private void iterateThread(int numberOfThreads, ExecutorService service, CountDownLatch latch, Counter counter) throws InterruptedException {
        for (int i = 0; i < numberOfThreads; i++) {
            service.submit(() -> {
                counter.increment();
                latch.countDown();
                throw new IllegalArgumentException();
            });
        }
        latch.await();
    }
}
