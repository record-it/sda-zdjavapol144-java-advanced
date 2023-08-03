package pl.sda.pol144.day6;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        List<String> names = List.of("A", "B", "C", "A", "B", "F");
        Set<String> setNames = new HashSet<>();
        setNames.add("Ania");
        setNames.add("Ewa");
        System.out.println(setNames.add("Ania"));
        setNames.add("Adam");
        System.out.println(setNames);
        System.out.println("Unikalne elementy listy names: " + new HashSet<>(names));

        // złożoność operacji O(1)
        setNames.contains("Ania");

        // złożoność operacji O(n)
        names.contains("A");
    }
}
