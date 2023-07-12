package pl.sda.pol144.day1;

public class ElectricScooter extends Vehicle{
    public final int capacity;
    private double energyLevel;

    public ElectricScooter() {
        // niejawne wywołanie new Vehicle()
        capacity = 10;
    }

    public void recharge(){
        energyLevel = capacity;
    }

    @Override
    public void drive(int distance) {
        // TODO co powinniśmy zrobić, gdy jest za mało energii na jazdę?
        super.drive(distance);
        energyLevel -= distance * 5;
    }

    public boolean canDrive(int distance){
        return energyLevel >= distance * 5;
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
