package pl.sda.pol144.day1;

public class OOPDemo {
    public static void main(String[] args) {
        // dziedziczenie
        Vehicle[] vehicles = new Vehicle[10];
        vehicles[0] = new ElectricScooter(20, "XXX", 25);
        vehicles[1] = new Bicycle(15, "BMX", 6);
        for (int i = 0; i < 2; i++){
            System.out.println(vehicles[i]);
        }
        // hermetyzacja
        vehicles[0].drive(5);
        vehicles[0].drive(10);
        System.out.println(vehicles[0].getMileage());
        // kompozycja

    }
}
