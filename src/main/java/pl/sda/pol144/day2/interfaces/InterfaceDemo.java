package pl.sda.pol144.day2.interfaces;

public class InterfaceDemo {
    public static void main(String[] args) {
        Flyable[] flyables = new Flyable[3];
        flyables[0] = new Wasp();
        flyables[1] = new pl.sda.pol144.day2.interfaces.Airplane(4);
        flyables[2] = new Hydroplaine();
        for(var flyable: flyables){
            flyable.travel(10);
            // rozpoznaj, który obiekt jest samolotem
            if (flyable instanceof Airplane){
                System.out.println("To jest samolot");
            }
        }

        Swimmable[] swimmables = new Swimmable[2];
        swimmables[0] = new Hydroplaine();

        // negatywny przykład - tak nie robimy
        Object[] trash = new Object[5];
        trash[0] = 1;
        trash[1] = "Ala";
        trash[2] = flyables[1];

    }
}
