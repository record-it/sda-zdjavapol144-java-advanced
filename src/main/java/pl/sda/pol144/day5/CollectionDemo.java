package pl.sda.pol144.day5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();
        System.out.println(names.add("Ewa"));
        System.out.println(names.add("Karol"));
        System.out.println(names.add("Karol"));
        System.out.println(names.add("Adam"));
        System.out.println(names.size());
        for(var name: names){
            System.out.println(name);
        }
        System.out.println("Czy jest Ewa? " + names.contains("Ewa"));
        System.out.println("Czy usunięto Karola? " + names.remove("Karol"));
        System.out.println(names);
        names.clear();
        System.out.println(names);
        System.out.println("Czy kolekcja pusta? " + names.isEmpty());
    }
}
