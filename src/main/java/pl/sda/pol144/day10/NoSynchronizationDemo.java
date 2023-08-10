package pl.sda.pol144.day10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Counter{
    int count;
}
class NoSyncEmailSender implements Runnable{

    Counter counter;

    public NoSyncEmailSender(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10_000; i++){
            // wysłanie email'a
            counter.count++;    // sekcja krytyczna, wspólny zasób dla wątków
        }
    }
}
public class NoSynchronizationDemo {
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        Counter counter = new Counter();
        NoSyncEmailSender job1 = new NoSyncEmailSender(counter);
        NoSyncEmailSender job2 = new NoSyncEmailSender(counter);
        service.execute(job1);
        service.execute(job2);
        service.shutdown();
        while(!service.isTerminated()){

        }
        System.out.println(counter.count);
    }
}
