import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;

        System.out.println("Enter numbers to add (0 or negative to stop):");

        while (true) {
            double number = sc.nextDouble();
            if (number <= 0) {
                break;
            }
            total += number;
        }

        System.out.println("Total sum is: " + total);
        sc.close();
    }
}
