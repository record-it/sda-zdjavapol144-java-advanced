package pl.sda.pol144.day7;

public class StreamDemo {
    public static void main(String[] args) {
        FunctionsDemo
                .names
                .stream()
                .skip(2)
                .limit(3)
                .peek(name -> System.out.println("Item " + name))
                .filter(name -> name.length() == 3) // operacja pośrednia
                .map(name -> name.toUpperCase())    // operacja pośrednia
                .sorted()
                .forEach(name -> System.out.println(name)); // operacja terminalna


    }
}
