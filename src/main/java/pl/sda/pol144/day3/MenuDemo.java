package pl.sda.pol144.day3;

import pl.sda.pol144.day2.interfaces.example.History;
import pl.sda.pol144.day2.interfaces.example.StringHistory;

import java.util.Scanner;
/*
  Dodaj do menu kolejne polecenie o etykiecie "O programie",
  które wyświetla Twoje dane jako autora programu.
 */
public class MenuDemo {
    public static void main(String[] args) {
        History history = new StringHistory();
        Menu.MenuItem[] items = new Menu.MenuItem[4];
        items[3] = new Menu.MenuItem(
                "O programie",
                new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("Autor programu:");
                        System.out.println("Imię Nazwisko");
                    }
                }
        );
        items[0] = new Menu.MenuItem(
                "Dodaj do historii",
                new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("Podaj wpis historii");
                        history.insert("new item");
                    }
                }
        );
        items[1] = new Menu.MenuItem(
                "Wyświetl historię",
                new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("Wyświetlenie historii");
                        history.printAll();
                    }
                }
        );
        items[2] = new Menu.MenuItem(
                "Koniec",
                new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("Wyśjcie");
                        System.exit(0);
                    }
                }
        );
        Menu menu = new Menu(items);
        Scanner scanner = new Scanner(System.in);
        while(true){
            menu.print();
            int option = scanner.nextInt();
            menu.run(option);
        }
    }
}
