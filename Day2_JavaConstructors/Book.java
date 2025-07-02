
public class Book {
    String x;
    String y;
    double z;

    Book() {
    }

    Book(String x, String y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static void main(String[] q) {
        Book a = new Book();
        Book b = new Book("Zero Day", "Riley", 599.0);
        System.out.println(a.x + " " + a.y + " " + a.z);
        System.out.println(b.x + " " + b.y + " " + b.z);
    }
}
