package pl.sda.pol144.day1;

import java.util.BitSet;

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
        Vehicle scooter = new ComposeElectricScooter(new Battery(20));
        if (scooter instanceof ComposeElectricScooter){
            ComposeElectricScooter composeElectricScooter = (ComposeElectricScooter) scooter;
            System.out.println(composeElectricScooter.getBatteryCapacity());
            System.out.println("Typ ComposeElectricScooter");
        }
        if (scooter instanceof Vehicle){
            System.out.println("Typ Vehicle");
        }
        if (scooter instanceof Object){
            System.out.println("Typ Object");
        }
        // niepoprawne rzutowanie - brak sprawdzenia, czy jest instancją typu Bicycle
        Bicycle bicycle = (Bicycle) scooter;
        System.out.println(bicycle.gearNumber);
    }
}
