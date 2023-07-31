package pl.sda.pol144.day3;

public class BookBuilderDemo {
    public static void main(String[] args) {
        final Book book1 = Book.builder().title("Java").author("Bloch").isbn("6737823428").build();
        final Book book2 = Book.builder().title("Spring").author("Pivotal").build();
        System.out.println(book1);
        System.out.println(book2);
    }
}
