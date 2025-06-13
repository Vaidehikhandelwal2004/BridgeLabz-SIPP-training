import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base in cm: ");
        double base = sc.nextDouble();

        System.out.print("Enter height in cm: ");
        double height = sc.nextDouble();

        double areaCm = 0.5 * base * height;
        double areaInches = areaCm / 6.4516; // 1 square inch = 6.4516 square cm

        System.out.println("Area of the triangle is " + areaCm + " cm² and " + areaInches + " inch²");

        sc.close();
    }
}
