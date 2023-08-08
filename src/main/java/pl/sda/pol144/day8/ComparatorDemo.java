package pl.sda.pol144.day8;

import java.time.LocalDate;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Customer> customerList = List.of(
                new Customer(1, "Ewa", LocalDate.of(2000,10,10)),
                new Customer(2, "Adam", LocalDate.of(2001,11,10)),
                new Customer(3, "Karol", LocalDate.of(1999,10,11))
        );
        customerList.stream().sorted().forEach(System.out::println);
    }
}
