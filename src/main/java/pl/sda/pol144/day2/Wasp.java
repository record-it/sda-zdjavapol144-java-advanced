package pl.sda.pol144.day2;

public class Wasp implements Flyable{
    private int size;

    @Override
    public void takeOff() {
        System.out.println("Wasp is taking off!");
    }

    @Override
    public void fly(int distance) {
        System.out.println("Wasp flying distance " + distance);
    }

    @Override
    public void land() {
        System.out.println("Wasp landed!");
    }
}
