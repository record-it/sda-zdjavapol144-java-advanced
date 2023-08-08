package pl.sda.pol144.day8;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreationDemo {
    public static void main(String[] args) {
        /**
         * Tworzenie strumienia na podstawie tablic
         */
        int[] arr = { 1, 2, 4, 2, 8, 5, -7, 9};
        // na podstawie tablicy arr utwórz tablicę liczb nieparzystych
        // podniesionych do kwadratu
        final int[] result = Arrays.stream(arr)
                .filter(x -> x % 2 != 0)
                .peek(System.out::println)
                .map(x -> x * x)
                .toArray();
        System.out.println(Arrays.toString(result));
        /**
         * Tworzenie strumieni klasą Stream
         */
        final int sum = Stream.of(4, 7, 3, 6, 3)
                .mapToInt(x -> x)
                .sum();
        // przygotowanie strumienia z 10-cioma liczbami losowymi, strumienie są leniwe
        final Stream<Double> limited = Stream
                .generate(() -> Math.random())
                .peek(System.out::println)
                .limit(10);
        // operacja terminalna wymusza wykonanie operacji zapisanych w strumieniu limited
        limited.anyMatch(x -> x < 0.1);
        /**
         * Strumienie typów prostych
         */
        Random random = new Random();
        String[] namesDict = {"Ewa", "Adam", "Ola", "Karol", "Beata", "Kazik"};
        var names = IntStream
                .range(0, 100)
                .mapToObj(i -> namesDict[random.nextInt(namesDict.length)])
                .toList();
        System.out.println(names);
        // LongStream, DoubleStream
    }
}
