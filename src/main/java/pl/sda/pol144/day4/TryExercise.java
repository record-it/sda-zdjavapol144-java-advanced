package pl.sda.pol144.day4;

import java.util.Scanner;

// Napisz program, który wczytuje dwie liczby i umieszcza je
// w tablicy results pod indeksami 0 i 1
// Dodaj przechwytywanie wyjątku na wypadek zapisu poza zakres tablicy,
// w klauzuli catch wyświetl komunikat np. zbyt mała tablica.
public class TryExercise {
    public static void main(String[] args) {
        int[] results = new int[(int) Math.round(Math.random() * 3)];
        Scanner scanner = new Scanner(System.in);
        try{
            results[0] = scanner.nextInt();
            results[1] = scanner.nextInt();
            results[2] = scanner.nextInt();
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Zbyt mała tablica! Błąd: " + e.getMessage());
        }
    }
}
