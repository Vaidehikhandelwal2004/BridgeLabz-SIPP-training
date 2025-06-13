import java.util.Scanner;

public class KilometerToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double kilometers = 10.8;
        double conversionRate = 1.6;

        double miles = kilometers * conversionRate;

        System.out.println("The distance " + kilometers + " km in miles is " + miles);

        sc.close();
    }
}
