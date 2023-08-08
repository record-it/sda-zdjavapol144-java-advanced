package pl.sda.pol144.day8;

import java.util.Arrays;

public class StreamCreationDemo {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 2, 8, 5, 7, 9};
        // na podstawie tablicy arr utwórz tablicę liczb nieparzystych
        // podniesionych do kwadratu
        final int[] result = Arrays.stream(arr)
                .filter()
                .map()
                .toArray();
        System.out.println(Arrays.toString(result));
    }
}
