package pl.sda.pol144.day4;

import java.io.IOError;
import java.io.IOException;
import java.util.Scanner;

public class TryDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] results = new int[1];
        try {
            int result = calc(a);
            System.out.println(result);
            results[1] = result;
        } catch (ArithmeticException e){
            System.out.println("Nie można wykonać dzielenia dla 0!");
        } catch (RuntimeException e){  // na wypadek pozostałych wyjątków
            System.out.println(e.getMessage());
        }
    }

    public static int calc(int a){
        return run(a);
    }

    public static int  run(int a){
        return 4 / a;
    }
}
