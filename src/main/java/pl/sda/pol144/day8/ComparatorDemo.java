package pl.sda.pol144.day8;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Customer> customerList = List.of(
                new Customer(1, "Ewa", LocalDate.of(2000,10,10)),
                new Customer(2, "Adam", LocalDate.of(2001,11,10)),
                new Customer(3, "Karol", LocalDate.of(1999,10,11)),
                new Customer(3, "Ewa", LocalDate.of(1998,1,1))
        );
        Comparator<Customer> byName = (c1, c2) -> c1.name.compareTo(c2.name);
        Comparator<Customer> byBirth = Comparator.comparing(c -> c.birth);
        Comparator<Customer> byNameAndByBirth = byName.thenComparing(byBirth);
        System.out.println("Sortowanie wg imion i dat urodzin: ");
        customerList.stream().sorted(byNameAndByBirth).forEach(System.out::println);
        // utwórz komparator dla pola birth
        Comparator<Customer> byId = Comparator.comparing(c -> c.id);
        customerList.stream().sorted(byBirth.reversed()).forEach(System.out::println);
        customerList = new ArrayList<>(customerList);
        customerList.sort(byBirth);     // posortowanie listy w porządku komparatora byBirth
        System.out.println(customerList);
    }
}
