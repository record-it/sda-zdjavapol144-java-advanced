package pl.sda.pol144.day8;

import lombok.Getter;

import java.time.LocalDate;
import java.util.Locale;

@Getter
public class Customer implements Comparable<Customer>{
    long id;

    String name;

    LocalDate birth;

    public Customer(long id, String name, LocalDate birth) {
        this.id = id;
        this.name = name;
        this.birth = birth;
    }

    @Override
    public int compareTo(Customer o) {
        return name.compareTo(o.name);
        // przykład porównania dla Long.compare(id, o.id);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birth=" + birth +
                '}';
    }
}
