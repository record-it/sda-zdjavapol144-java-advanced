package pl.sda.pol144.day9;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class LombokPersonEntity {
    @EqualsAndHashCode.Include
    private long id;

    private String firstName;

    private String lastName;

    private LocalDate birth;
}
