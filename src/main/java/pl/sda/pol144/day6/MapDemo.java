package pl.sda.pol144.day6;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Player> players = new HashMap<>();
        players.put("Adam", new Player("Adam", 10));
        players.put("Ewa", new Player("Ewa", 23));
        var prevoiusPlayer = players.put("Adam", new Player("Adam W", 22));
        System.out.println(prevoiusPlayer);
        System.out.println(players);
        System.out.println(players.get("Adam"));
        System.out.println(players.get("Karol"));
        System.out.println(" Czy jest klucz 'Karol'? " + players.keySet().contains("Karol"));
        players.remove("Adam");
        System.out.println(players.remove("Karol"));
        players.replace("Adam", new Player("Adam D", 33));
        System.out.println(players);
        int sum = 0;
        for(var player: players.values()){
            sum += player.points;
        }
        System.out.println("Suma punktów graczy: " + sum);
        for(var entry: players.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue().points);
        }
        // przykład zliczania wystąpień w liście
        // wyniki przechowywane są w mapie
        List<String> names = List.of("Adam", "Ewa", "Karol", "Ewa", "Tomek", "Ewa");
        Map<String, Integer> counters = new HashMap<>();
        for(var name: names){
            if (counters.keySet().contains(name)){
                int counter = counters.get(name);
                counters.put(name, counter + 1);
            }
            counters.putIfAbsent(name, 1);
        }
        System.out.println(counters);
    }
}
