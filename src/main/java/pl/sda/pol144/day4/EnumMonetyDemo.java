package pl.sda.pol144.day4;

import java.util.Arrays;
import java.util.Scanner;

public class EnumMonetyDemo {
    public static void main(String[] args) {
        Monety[] values = {
                Monety.DWUZLOTOWKA,
                Monety.DWUZLOTOWKA,
                Monety.GROSZ,
                Monety.ZLOTOWKA,
                Monety.PIEC_ZLOTYCH,
                Monety.ZLOTOWKA
        };
        var sum = 0.0;
        for(var value: values){
            sum += value.getValue();
            System.out.println(value.ordinal());
        }
        System.out.println("Suma monet: " + sum);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj jaką monetę chcesz wrzucić:");
        System.out.println(Arrays.toString(Monety.values()));
        while(true) {
            try {
                String nazwaMonety = scanner.next();
                if (nazwaMonety.equals("quit")){
                    break;
                }
                values[0] = Monety.valueOf(nazwaMonety.toUpperCase());
                System.out.println("Wrzuciłeś: " + values[0]);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Nieznana moneta!");
                System.out.println("Spróbuj jeszcze raz wpisać");
                System.out.println("Lub wpisz quit aby wyjść");
            }
        }
    }
}
