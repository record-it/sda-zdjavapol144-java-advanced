package pl.sda.pol144.day4;

// Napisz program, który wczytuje dwie liczby i umieszcza je
// w tablicy results pod indeksami 0 i 1
// Dodaj przechwytywanie wyjątku na wypadek zapisu poza zakres tablicy
// w klauzuli catch wyświetl komunikat np. zbyt mała tablica
public class TryExercise {
    public static void main(String[] args) {
        int[] results = new int[(int) Math.round(Math.random() * 3)];
    }
}
