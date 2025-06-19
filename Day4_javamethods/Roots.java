import java.util.*;

public class Roots {
    public static double[] solve(double a, double b, double c) {
        double d = b * b - 4 * a * c;
        if (d > 0) {
            double x = (-b + Math.sqrt(d)) / (2 * a);
            double y = (-b - Math.sqrt(d)) / (2 * a);
            return new double[]{x, y};
        } else if (d == 0) {
            double x = -b / (2 * a);
            return new double[]{x};
        }
        return new double[]{};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble();
        double q = sc.nextDouble();
        double r = sc.nextDouble();
        double[] res = solve(p, q, r);
        for (double z : res) System.out.println(z);
    }
}
