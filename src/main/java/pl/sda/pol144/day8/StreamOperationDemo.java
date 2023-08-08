package pl.sda.pol144.day8;

import pl.sda.pol144.day7.FunctionsDemo;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamOperationDemo {
    public static void main(String[] args) {
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
    }
}
