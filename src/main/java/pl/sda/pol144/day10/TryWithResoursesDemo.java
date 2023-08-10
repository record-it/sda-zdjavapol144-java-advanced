package pl.sda.pol144.day10;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
class Person{
    private long id;
    private String name;
    private LocalDate birth;
}
public class TryWithResoursesDemo {
    static List<Person> people;
    public static void main(String[] args) {
        try(
                BufferedReader reader = new BufferedReader(new FileReader("c:\\data\\persons.txt"))
                ){
            AtomicInteger count = new AtomicInteger(1);
            people = reader.lines()
                    .map(line -> line.split("\\t"))
                    .peek(arr -> System.out.println(Arrays.toString(arr)))
                    .map(arr -> {
                        final long id = Long.parseLong(arr[0]);
                        String name = arr[1];
                        LocalDate birth = null;
                        try {
                            birth = LocalDate.parse(arr[2]);
                        } catch (DateTimeParseException e){
                            System.out.println("Błąd parsowania - data w pliku ma nieznany format, wiersz numer = " + count.get());
                            return null;
                        } finally {
                            count.getAndIncrement();
                        }
                        return Person
                                .builder()
                                .id(id)
                                .name(name)
                                .birth(birth)
                                .build();
                    })
                    .filter(Objects::nonNull)
                    .toList();
        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku z danymi!");
            return;
        } catch (IOException e) {
            System.out.println("Błąd odczytu danych");
            return;
        }
        // blok try .. with .. resourses automatycznie zamyka zadeklarowane strumienie
        System.out.println("Sukces, udało się wczytać dane!");
        System.out.println(people);
        System.out.println("KONIEC");
    }
}
