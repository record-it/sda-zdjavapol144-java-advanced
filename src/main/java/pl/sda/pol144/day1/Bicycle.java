package pl.sda.pol144.day1;

public class Bicycle extends Vehicle{
    public int gearNumber;

    public Bicycle() {
        gearNumber = 5;
    }

    public Bicycle(int weight, String name, int gearNumber) {
        super(0, weight, name);
        this.gearNumber = gearNumber;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "gearNumber=" + gearNumber +
                "} " + super.toString();
    }
}
