package pl.sda.pol144.day9;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public class ThreadTask2 {
    public static void main(String[] args) {
        /*
            Napisz program wyświetlający czas co 1 sekundę
         */
        AtomicReference<String> time = new AtomicReference<>("");
        final ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        service.scheduleAtFixedRate(() -> {
            System.out.print("\b".repeat(time.get().length()));
            String t = LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm:ss"));
            time.set(t);
            System.out.print(t);
        },0, 1000, TimeUnit.MILLISECONDS);
        System.out.println("****");
        System.out.println("*  *");
        System.out.println("*  *");
        System.out.println("*  *");
        System.out.println("****");
    }
}
