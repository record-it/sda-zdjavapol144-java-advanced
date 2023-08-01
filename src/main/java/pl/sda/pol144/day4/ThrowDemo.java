package pl.sda.pol144.day4;

public class ThrowDemo {
    public static void main(String[] args) {
        Battery battery = new Battery(50);
        System.out.println(battery.consume(-5));
    }

}
