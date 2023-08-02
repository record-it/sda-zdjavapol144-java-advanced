package pl.sda.pol144.day5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>(
                List.of("Ewa", "Karol", "Ania", "Adam")
        );
        // ta wersja usuwania nie działa poprawnie, nie można modyfikować kolekcji podczas przeglądania
        for(var name: names){
            if (name.length() == 4){
                names.remove(name);
            }
        }
        System.out.println(names);

        // poprawne usuwanie elementów kolekcji podczas przeglądania
        final Iterator<String> iterator = names.iterator();
        while(iterator.hasNext()){
            final String name = iterator.next();
            if (name.length() == 4){
                iterator.remove();
            }
        }
        System.out.println(names);
    }
}
// ->       ->
//    "Ewa"    "Karol"   "Ania"   "Adam