package pl.sda.pol144.day10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class SyncCounter{
    private int count;

    // przykład metody synchronizowanej,
    // żaden inny obiekt nie może `wywołać` tej metody,
    // gdy metoda jest wykonywana
    public synchronized void inc(){
        count++;
    }

    public int getCount(){
        return count;
    }
}
class SyncEmailSender implements Runnable{

    SyncCounter counter;

    public SyncEmailSender(SyncCounter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10_000; i++){
            // wysłanie email'a
            counter.inc();    // sekcja krytyczna, wspólny zasób dla wątków
        }
    }
}
public class SynchronizationDemo {
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        SyncCounter counter = new SyncCounter();
        SyncEmailSender job1 = new SyncEmailSender(counter);
        SyncEmailSender job2 = new SyncEmailSender(counter);
        service.execute(job1);
        service.execute(job2);
        service.shutdown();
        while(!service.isTerminated()){

        }
        System.out.println(counter.getCount());
    }
}
