import java.util.Scanner;

public class Triparkrun {
    public static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        double totalDistance = 5000; // in meters (5 km)
        return totalDistance / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side A of triangle (meters): ");
        double a = sc.nextDouble();
        System.out.print("Enter side B of triangle (meters): ");
        double b = sc.nextDouble();
        System.out.print("Enter side C of triangle (meters): ");
        double c = sc.nextDouble();
        double rounds = calculateRounds(a, b, c);
        System.out.println("Rounds needed to complete 5km: " + Math.ceil(rounds));
    }
}
