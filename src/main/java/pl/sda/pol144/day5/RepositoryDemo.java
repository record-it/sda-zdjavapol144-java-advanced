package pl.sda.pol144.day5;

import java.time.LocalDate;

class Person{
    private int id;
    private String name;
    private LocalDate birthDate;

    public Person(int id, String name, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
public class RepositoryDemo {
    public static void main(String[] args) {
        Repository<String, Integer> stringRepository = new ArrayRepository<>(new String[100]);
        int adamKey = stringRepository.save("adam");
        int ewaKey = stringRepository.save("ewa");
        int karolKey = stringRepository.save("karol");
        System.out.println(karolKey);
        System.out.println(stringRepository.find(karolKey));
        Repository<Person, Integer> personRepository = new ArrayRepository<>(new Person[10]);
        Person person = new Person(0, "ewa", LocalDate.of(2000,10,10));
        int id = personRepository.save(person);
    }
}
