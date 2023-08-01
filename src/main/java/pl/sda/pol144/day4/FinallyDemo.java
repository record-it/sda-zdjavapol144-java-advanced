package pl.sda.pol144.day4;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;

public class FinallyDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = 0;
        int month = 0;
        int day = 0;
        try{
            month = scanner.nextInt();
            year = scanner.nextInt();
            day = scanner.nextInt();
            LocalDate date = LocalDate.of(year, month, day);
        } catch (DateTimeException e){
            System.out.println("Niepoprawne dane daty!");
            return;
        } finally {
            System.out.println("Koniec programu");
            System.out.println("Rok: " + year);
            System.out.println("Miesiąc: " + month);
            System.out.println("Dzień: " + day);
        }
    }
}
