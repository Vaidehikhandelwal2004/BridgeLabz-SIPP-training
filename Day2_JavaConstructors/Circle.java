public class Circle{
    double r;

    Circle() {
        this(0.0);
    }

    Circle(double r) {
        this.r = r;
    }

    public static void main(String[] q) {
        Circle a = new Circle();
        Circle b = new Circle(5.5);
        System.out.println(a.r);
        System.out.println(b.r);
    }
}
