package pl.sda.pol144.day5;

import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> names = new LinkedList<>(
                List.of("Ewa", "Karol", "Ania", "Adam")
        );
        System.out.println(names.get(0));
        // nie jest zalecane tworzenie takich pętli
        for(int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }
        // lepiej korzystać z foreach
        for(var name: names){
            System.out.println(name);
        }
        names.set(0, "Beata");
        System.out.println(names);
        names.remove(3);
        System.out.println(names);
        names.add(0, "Robert");
        System.out.println(names);
        final int index = names.indexOf("Beata");
        System.out.println(index);
        // widok, perspektywa, lista jest częścią całości, a nie osobną listą!!!
        final List<String> subNames = names.subList(1, 2);
        System.out.println(subNames);
        subNames.add("Lucyna");
        System.out.println(names);
    }
}
