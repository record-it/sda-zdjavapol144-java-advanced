package pl.sda.pol144.day7;

// a + b
// a - b
// a * b
// a / b
/*
    Przykład interfejsu funkcyjnego:
    - musi mieć tylko jedną metodę abstrakcyjną!
 */
public interface Operation {
    double apply(double a, double b);
}
