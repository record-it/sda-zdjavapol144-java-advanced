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
        // 1. Wstaw imię "Tomek" za imieniem "Kasia"
        // Podpowiedź: wykorzystaj indexOf

        // 2. Zamień imię "Karol" na "Karolina"

        // 3. Policz, ile jest imion zaczynających się literą "A"

        // 4. wyświetl podlistę imion od Roberta do końca
        System.out.println(names.subList(names.indexOf("Robert"), names.size()));
    }
}
