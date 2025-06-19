import java.util.*;

public class Interest {
    public static double calc(double p, double r, double t) {
        return (p * r * t) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double z = calc(a, b, c);
        System.out.println("The Simple Interest is " + z + " for Principal " + a + ", Rate of Interest " + b + " and Time " + c);
    }
}
