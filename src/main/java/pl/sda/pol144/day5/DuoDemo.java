package pl.sda.pol144.day5;

public class DuoDemo {
    public static void main(String[] args) {
        Duo<GuitarPlayer, Musican> duo = new Duo<>();
        Duo<?,GuitarPlayer> duo2 = new Duo<>();
        var box = new Box<>("abc");
        printBoxContent(box);
    }

    public static void printBoxContent(Box<? extends Object> box){
        System.out.println(box.getContent());
    }
}
