package pl.sda.pol144.day6;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
// przykład klasy, której obiekty są identycznej, jeśli każde z pól
// jest równe odpowiednikowi w drugim obiekcie
// łatwiej to zrobić za pomocą record'u, nie trzeba definiować equal i hashCode!
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
        /*
            Przykład działania metody equals
         */
        Player player = new Player("Adam", 32);
        System.out.println("Czy player jest równy 'Karol'? " + player.equals("Karol"));
        Player playerOne = new Player("Ewa", 11);
        System.out.println("Czy player jest równy playerOne? " + player.equals(playerOne));
        System.out.println("Czy player jest równy sobie? " + player.equals(player));
        Player playerTwo = new Player("Adam", 32);
        System.out.println("Czy player jest równy playerTwo? " + player.equals(playerTwo));
        /*
           Przykład działania HashSet
         */
        Set<Player> players = new HashSet<>();
        players.add(new Player("Adam", 10));
        players.add(new Player("Ewa", 15));
        players.add(new Player("Adam", 10));
        players.add(new Player("Ania", 10));
        System.out.println(players);
        // Przykład rekordu z tożsamością
        // identyczne obiekty to takie, które mają to samo id
        // reszta pól nie jest istotna
        record RecordPlayer(int id, String name, int points){
            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                RecordPlayer that = (RecordPlayer) o;
                return id == that.id;
            }

            @Override
            public int hashCode() {
                return Objects.hash(id);
            }
        };
        Set<RecordPlayer> recordPlayers = new HashSet<>();
        recordPlayers.add(new RecordPlayer(1,"Adam", 10));
        recordPlayers.add(new RecordPlayer(1, "Adam", 15));
        System.out.println(recordPlayers);
    }
}
