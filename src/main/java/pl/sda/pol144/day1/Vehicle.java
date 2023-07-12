package pl.sda.pol144.day1;

// klasa bazowa, super klasa
public class Vehicle{
    private int mileage;
    public int weight;
    public String name;

    public Vehicle() {
        weight = 100;
        name = "noname";
    }



    public Vehicle(int mileage, int weight, String name) {
        this.mileage = mileage;
        this.weight = weight;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "mileage=" + mileage +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }

    public void drive(int distance){
        mileage += distance;
    }

    public int getMileage() {
        return mileage;
    }
}
