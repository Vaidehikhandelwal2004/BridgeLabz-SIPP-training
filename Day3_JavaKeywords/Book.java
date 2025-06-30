public class Book {
    static String libraryName = "City Library";

    final String isbn;
    String title, author;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    void displayBookDetails() {
        if (this instanceof Book) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java Programming", "James Gosling", "978-0135166307");
        Book b2 = new Book("Effective Java", "Joshua Bloch", "978-0134685991");

        Book.displayLibraryName();

        b1.displayBookDetails();
        b2.displayBookDetails();
    }
}
