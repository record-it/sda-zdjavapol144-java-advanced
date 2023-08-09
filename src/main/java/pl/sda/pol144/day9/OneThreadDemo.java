package pl.sda.pol144.day9;

import java.util.Scanner;

public class OneThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Hello");
            Thread.sleep(1000);
            // jak zatrzymać program, nie zatrzymując tej pętli?
            if (scanner.next().equals("q")){
                break;
            }
            // powyższe rozwiązanie nie zadziała zgodnie z wolą użytkownika
        }
    }
}
