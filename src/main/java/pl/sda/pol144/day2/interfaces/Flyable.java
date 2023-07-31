package pl.sda.pol144.day2.interfaces;

public interface Flyable {
    void takeOff();

    void fly(int distance);

    void land();

    default void travel(int distance){
        takeOff();
        fly(distance);
        land();
    }
}
