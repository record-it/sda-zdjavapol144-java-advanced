package pl.sda.pol144.day4;

public class ThrowDemo {
    public static void main(String[] args) {
        Battery battery = new Battery(50);
        try{
            System.out.println(battery.consume(-5));
            Battery b = new Battery(-5);
        } catch (InvalidCapacityException e){
            System.out.println("Pojemność ujemna lub większa od 200");
        } catch (IllegalArgumentException e){

        }
    }

}
