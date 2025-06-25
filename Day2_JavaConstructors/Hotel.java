public class Hotel {
    String g;
    String t;
    int k;

    Hotel() {
    }

    Hotel(String g, String t, int k) {
        this.g = g;
        this.t = t;
        this.k = k;
    }

    Hotel(Hotel o) {
        this(o.g, o.t, o.k);
    }

    public static void main(String[] q) {
        Hotel one = new Hotel();
        Hotel two = new Hotel("Mira", "Deluxe", 3);
        Hotel three = new Hotel(two);
        System.out.println(one.g + " " + one.t + " " + one.k);
        System.out.println(two.g + " " + two.t + " " + two.k);
        System.out.println(three.g + " " + three.t + " " + three.k);
    }
}
