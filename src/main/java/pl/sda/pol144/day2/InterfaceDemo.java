package pl.sda.pol144.day2;

public class InterfaceDemo {
    public static void main(String[] args) {
        Flyable[] flyables = new Flyable[5];
        flyables[0] = new Wasp();
        flyables[1] = new Airplane(4);
        for(var flyable: flyables){
            flyable.takeOff();
            // rozpoznaj, który obiekt jest samolotem

        }
        for(var flyable: flyables){
            flyable.fly(10);
        }
        for(var flyable: flyables){
            flyable.land();
        }
    }
}
