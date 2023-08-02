package pl.sda.pol144.day5;

public class BoxDemo {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>(5);
        System.out.println("Czy puste: " + integerBox.isEmpty());
        System.out.println("Content * 5 :" + integerBox.getContent() * 5);
        System.out.println("Ustawiamy content jako null, puste pudełko");
        integerBox.setContent(null);
        System.out.println("Czy puste: " + integerBox.isEmpty());
        // Stwórz pudełko dla String'a,
        // wykonaj te same operacje jak dla Integera (oprócz mnożenia).
    }
}
