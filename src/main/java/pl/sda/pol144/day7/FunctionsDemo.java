package pl.sda.pol144.day7;

import java.util.*;
import java.util.function.*;

public class FunctionsDemo {
    public static Supplier<String> randomName;
    public static List<String> names = List.of("Adam", "Ewa", "Ania", "Ola", "Karol");
    public static void main(String[] args) {
        /**
         * Funkcje
         */
        Map<String, BiFunction<Double, Double, Double>> calc = new HashMap<>();
        BiFunction<Double, Double, Double> add = (a, b) -> a + b;
        calc.put("+", add);
        calc.put("/", (a,b) -> a / b);
        // "3 + 5 / 5";
        System.out.println(calc.get("/").apply(12.0, 4.0));

        Function<Double, Double> sin = x -> Math.sin(x);
        Function<Double, Double> sinRef = Math::sin;
        Function<Product, Double> mapToDouble = product -> product.bruttoPrice();
        // zapisz mapowanie łańcucha na jego długość
        Function<String, Integer> mapToLenght = s -> s.length();
        Function<String, Integer> mapToLenghtRef = String::length;
        /**
         * Predykaty
         */
        Predicate<String> fiveLettersLong = s -> s.length() == 5;
        Predicate<Double> greaterThenFive = i -> i > 5;
        System.out.println(fiveLettersLong.test("Adam"));

        var aNames = filter(names, name -> name.startsWith("A"));
        System.out.println(aNames);
        // Stwórz listę imion trzyliterowych
        System.out.println(filter(names, s -> s.length() == 3));
        List<Integer> ints = List.of(1, 4, 3, 7, 2, 8);
        System.out.println(filter(ints, i -> i % 2 == 0));

        /**
         * Consumer
         */
        Consumer<String> printer = s -> System.out.println(s.toUpperCase());
        printer.accept("abcd");
        names.forEach(s-> System.out.println(s.toUpperCase()));
        forEach(names, s -> System.out.println(s.toUpperCase()));

        /**
         * Supplier
         */
        randomName = () -> {
            Random random = new Random();
            // domknięcie, odwołanie do zmiennej w lokalnym otoczeniu lambdy
            return names.get(random.nextInt(names.size()));
        };
        System.out.println(randomName.get());
    }

    public static <T> void forEach(Collection<T> collection, Consumer<T> consumer){
        for(var item: collection){
            consumer.accept(item);
        }
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> predicate){
        List<T> results = new ArrayList<>();
        for(var item: list){
            if (predicate.test(item)){
                results.add(item);
            }
        }
        return results;
    }
}
