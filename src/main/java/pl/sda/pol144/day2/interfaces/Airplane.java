package pl.sda.pol144.day2.interfaces;

public class Airplane implements Flyable {

    private int engineNumber;

    public Airplane(int engineNumber) {
        this.engineNumber = engineNumber;
    }

    @Override
    public void takeOff() {
        if (engineNumber == 4){
            System.out.println("Airplane taking off!");
        }
    }

    @Override
    public void fly(int distance) {
        if (engineNumber == 4){
            System.out.println("Airplane is flying!");
        }
    }

    @Override
    public void land() {
        System.out.println("Airplane landed!");
    }
}
