package pl.sda.pol144.day9;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class LombokPerson {

    private String firstName;

    private String lastName;

    private LocalDate birth;
}
