package pl.sda.pol144.day6;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListExercise {
    public static void main(String[] args) {
        List<String> names = new LinkedList<>(
                List.of("Ewa", "Karol", "Ania", "Adam", "Robert", "Kasia", "Aneta")
        );
        Collections.shuffle(names);
        System.out.println(names);
        // Wstaw imię "Tomek" za imieniem "Kasia"
        // Podpowiedź wykorzystaj indexOf
    }
}
