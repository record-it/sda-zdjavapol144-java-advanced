package pl.sda.pol144.day4;

public enum Monety {
    ZLOTOWKA(1),           // public static Monety ZLOTOWKA = new Monety(1);
    DWUZLOTOWKA(2),
    PIEC_ZLOTYCH(5),
    GROSZ(0.01);

    private double value;

    Monety(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
