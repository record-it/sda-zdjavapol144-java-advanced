package pl.sda.pol144.day3;

public class Book {
    private String title;

    private String author;

    private String isbn;

    private Book() {
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }

    static public Builder builder(){
        Builder builder = new Builder();
        builder.book = new Book();
        return builder;
    }

    public static class Builder{

        private Book book;

        public Builder title(String t){
            book.title = t;
            return this;
        }

        public Builder author(String a){
            book.author = a;
            return this;
        }

        public Builder isbn(String isbn){
            book.isbn = isbn;
            return this;
        }

        public Book build(){
            return book;
        }
    }
}
