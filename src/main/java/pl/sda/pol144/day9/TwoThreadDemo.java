package pl.sda.pol144.day9;

import java.util.Scanner;

public class TwoThreadDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Thread thread = new Thread(() ->
        {
            while(!Thread.currentThread().isInterrupted()){
                System.out.println("Hello");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    break;
                }
            }
        }
        );
        // uruchamiamy wątek roboczy
        thread.start();
        // wątek main, obsługa zdarzeń
        while(true){
            if (scanner.next().equals("q")){
                System.out.println("Quit");
                thread.interrupt();
                break;
            }
        }
    }
}
