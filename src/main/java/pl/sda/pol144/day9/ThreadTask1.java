package pl.sda.pol144.day9;

public class ThreadTask1 {
    public static void main(String[] args) throws InterruptedException {
        /*
            Utwórz i uruchom wątek, który wyświetli 10 razy dowolny komunikat
            z przerwami co 2 sekundy
         */
        Thread thread = new Thread(
                // kod wykonywany w wątku
                () -> {
                    for (int i = 0; i < 10; i++) {
                        System.out.println("Hello again");
                        try {
                            Thread.sleep(200);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
        );
        thread.start();
        System.out.println("Po start");
        System.out.println("Czy wątek działa? " + thread.isAlive());
        thread.join();
        System.out.println("Koniec programu");
        System.out.println("Czy wątek działa? " + thread.isAlive());
        thread.start();
    }
}
