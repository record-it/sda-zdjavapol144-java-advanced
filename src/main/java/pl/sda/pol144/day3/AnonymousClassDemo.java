package pl.sda.pol144.day3;

import pl.sda.pol144.day2.interfaces.example.History;

public class AnonymousClassDemo {
    public static void main(String[] args) {
        History history = new History() {
            @Override
            public void insert(String item) {
                System.out.println("Item inserted");
            }

            @Override
            public void printAll() {
                System.out.println("Print all items");
            }
        };
        history.insert("item");
        history.insert("item");
        history.printAll();
    }
}
