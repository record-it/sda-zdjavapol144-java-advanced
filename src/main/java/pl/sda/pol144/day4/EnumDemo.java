package pl.sda.pol144.day4;

import java.util.Random;

public class EnumDemo {
    static Random random = new Random();
    public static void main(String[] args) {
        CardColors cardColor = CardColors.HEARTS;
        final CardColors value = CardColors.values()[random.nextInt(4)];
        int points = 0;
        switch (value){
            case HEARTS:
                points = 40;
                break;
            case SPADES:
                points = 30;
                break;
            case DIAMONDS:
                points = 20;
                break;
            case CLUBS:
                points = 10;
        }
        System.out.println("Liczba punktów za kolor: " + points);
    }
}
