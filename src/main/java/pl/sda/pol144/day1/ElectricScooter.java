package pl.sda.pol144.day1;

public class ElectricScooter extends Vehicle{
    public int capacity;
    public double energyLevel;

    public ElectricScooter() {
        // niejawne wywołanie new Vehicle()
        capacity = 10;
        get
    }

    public ElectricScooter(int capacity, String name, int weight) {
        super(0, weight, name); // jawne wywołanie konstruktora super klasy - new Vehicle(0, weight, name)
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "ElectricScooter{" +
                "capacity=" + capacity +
                ", energyLevel=" + energyLevel +
                "} " + super.toString();
    }

    // "1" + "1" -> "11"
    // 1 + 1 -> 2
}
