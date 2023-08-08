package pl.sda.pol144.day8;

import pl.sda.pol144.day7.FunctionsDemo;

import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamOperationDemo {
    public static void main(String[] args) throws Exception {
        final boolean isNameStartsWithB = FunctionsDemo.names.stream()
                .anyMatch(name -> name.startsWith("B"));
        System.out.println("Czy jest imię zaczynające na B? " + isNameStartsWithB);
        final boolean isAllNamesWithLengthGt3 = FunctionsDemo.names
                .stream()
                .allMatch(name -> name.length() > 3);
        System.out.println("Czy wszystkie imiona są dłuższe od 3? " + isAllNamesWithLengthGt3);
        final Optional<String> first = Stream.<String>empty()
                .findFirst();
        final Optional<String> any = FunctionsDemo.names.stream()
                .findAny();
        System.out.println(first);
        System.out.println(any);
        final Optional<String> name5 = FunctionsDemo.names
                .stream()
                .filter(x -> x.length() == 8)
                .findFirst();
        // Sposób 1 - imperatywny
        if (name5.isPresent()){
            System.out.println("1. Imię o 5 znakach: " + name5.get());
        } else {
            System.out.println("1. Brak imienia o 5 znakach!");
        }
        // sposób 2 - tylko dla przypadku znalezienia wartości
        name5.ifPresent(x -> System.out.println("2. Imię o 5 znakach: " +x));
        // sposób 3 - dla przypadku znalezienia i zgłoszenie wyjątku, gdy brak wyników
        try {
            name5.map(x -> {
                System.out.println("3. Imię o 5 znakach: " + x);
                return x;
            }).orElseThrow(() -> {
                System.out.println("3. Brak imienia o 5 znakach!");
                return new Exception();
            });
        } catch (Exception e){
            // obsługa wyjątku, gdy brak imienia
        }
        // sposób 4 - utworzenie komunikatu dla obu przypadków
        String message = name5
                .map(x -> "4. Imię o 5 znakach: " + x)
                .orElse("4. Brak imienia o 5 znakach!");
        System.out.println(message);


    }

    public static Optional<String> findName(Predicate<String> pedicate){
        for(var name: FunctionsDemo.names){
            if (pedicate.test(name)){
                return Optional.ofNullable(name);
            }
        }
        return Optional.empty();
    }
}
