package pl.sda.pol144.day6;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Player> players = new HashMap<>();
        players.put("Adam", new Player("Adam", 10));
        players.put("Ewa", new Player("Ewa", 23));
        System.out.println(players);
    }
}
