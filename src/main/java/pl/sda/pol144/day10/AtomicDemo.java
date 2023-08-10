package pl.sda.pol144.day10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicDemo {
    public static void main(String[] args) throws InterruptedException {
        AtomicInteger counter = new AtomicInteger(0);
        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(() -> {
            for(int i = 0; i < 10_000; i++){
                counter.getAndIncrement();
            }
        });
        service.execute(() -> {
            for(int i = 0; i < 10_000; i++){
                counter.getAndIncrement();
            }
        });
        service.shutdown();
        service.awaitTermination(1000, TimeUnit.MILLISECONDS);
        System.out.println(counter.get());
    }
}
