package pl.sda.pol144.day2;

public class Hydroplaine implements Hydro{
    @Override
    public void takeOff() {
        System.out.println("Hydro take Of");
    }

    @Override
    public void fly(int distance) {
        System.out.println("Hydro is flying");
    }

    @Override
    public void land() {
        System.out.println("Hydro landed");
    }

    @Override
    public void swim() {
        System.out.println("Hydro is swimming");
    }
}
