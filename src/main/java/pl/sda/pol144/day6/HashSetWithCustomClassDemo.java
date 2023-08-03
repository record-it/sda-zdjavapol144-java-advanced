package pl.sda.pol144.day6;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Player{
    String name;

    int points;

    public Player(String name, int points) {
        this.name = name;
        this.points = points;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", points=" + points +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("Player equals call");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return points == player.points && Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        System.out.println("Player hasCode call");
        return Objects.hash(name, points);
    }
}
public class HashSetWithCustomClassDemo {
    public static void main(String[] args) {
        Set<Player> players = new HashSet<>();
        players.add(new Player("Adam", 10));
        players.add(new Player("Ewa", 15));
        players.add(new Player("Adam", 10));
        players.add(new Player("Ania", 10));
        System.out.println(players);
        record
    }
}
