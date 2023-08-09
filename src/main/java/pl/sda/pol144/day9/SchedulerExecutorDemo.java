package pl.sda.pol144.day9;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SchedulerExecutorDemo {
    public static void main(String[] args) throws InterruptedException {
        final ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
        scheduler.schedule(() -> System.out.println("Task 1"), 2, TimeUnit.SECONDS);
        scheduler.scheduleAtFixedRate(() -> System.out.println("Task 2"), 0, 3, TimeUnit.SECONDS);

        Thread.sleep(5000);
        scheduler.shutdown();
//        String s = "abc";
//        System.out.print(s);
//        Thread.sleep(1000);
//        System.out.print("\b\b\b");

    }
}
