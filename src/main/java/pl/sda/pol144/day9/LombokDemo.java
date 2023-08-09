package pl.sda.pol144.day9;

import java.time.LocalDate;

public class LombokDemo {
    public static void main(String[] args) {
        LombokPerson person = new LombokPerson("Adam","Kowal", LocalDate.now());
        System.out.println(person.getLastName());
        person.setBirth(LocalDate.of(2000, 10, 01));
        System.out.println(person);
        System.out.println(person.hashCode());
        LombokPerson twin = new LombokPerson("Adam","Kowal", LocalDate.of(2000, 10, 01));
        System.out.println(twin.hashCode());
        System.out.println(person.equals(twin));
    }
}
