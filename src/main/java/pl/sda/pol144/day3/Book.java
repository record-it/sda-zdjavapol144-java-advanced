package pl.sda.pol144.day3;

public class Book {
    private String title;

    private String author;

    private String isbn;

    public Book() {
    }

    public Book(String title) {
        this.title = title;
    }



    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
