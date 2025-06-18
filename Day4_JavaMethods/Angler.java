public class Angler {
    public static double[] trig(double x) {
        double z = Math.toRadians(x);
        return new double[]{Math.sin(z), Math.cos(z), Math.tan(z)};
    }

    public static void main(String[] args) {
        double[] d = trig(30);
        for (double a : d) System.out.println(a);
    }
}
