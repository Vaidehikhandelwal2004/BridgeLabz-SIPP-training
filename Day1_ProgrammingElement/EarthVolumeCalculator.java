import java.util.Scanner;

public class EarthVolumeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double radiusKm = 6378;
        double pi = 3.14159;

        double volumeKm3 = (4.0 / 3) * pi * Math.pow(radiusKm, 3);
        double volumeMiles3 = volumeKm3 / Math.pow(1.6, 3);

        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 + 
                           " and cubic miles is " + volumeMiles3);

        sc.close();
    }
}
