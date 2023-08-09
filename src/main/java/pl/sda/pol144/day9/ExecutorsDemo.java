package pl.sda.pol144.day9;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsDemo {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(() -> {
            System.out.println("Task 2");
            System.out.println(Thread.currentThread().getName());
        });
        Thread.sleep(10);
        service.execute(() -> {
            System.out.println("Task 1");
            System.out.println(Thread.currentThread().getName());
            for(int i = 0; i < 10; i++){
                System.out.println("Hello from executor!");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        service.shutdown();
    }
}
