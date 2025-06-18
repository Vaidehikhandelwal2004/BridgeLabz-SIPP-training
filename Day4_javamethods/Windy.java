public class Windy {
    public static double chill(double t, double v) {
        return 35.74 + 0.6215 * t - 35.75 * Math.pow(v, 0.16) + 0.4275 * t * Math.pow(v, 0.16);
    }

    public static void main(String[] args) {
        System.out.println(chill(10, 20));
    }
}
