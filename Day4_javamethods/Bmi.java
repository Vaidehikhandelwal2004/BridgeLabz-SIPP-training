import java.util.*;

public class Bmi {
    public static void fill(double[][] d) {
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            d[i][0] = s.nextDouble();
            d[i][1] = s.nextDouble();
            double h = d[i][1] / 100;
            d[i][2] = d[i][0] / (h * h);
        }
    }

    public static String[] stat(double[][] d) {
        String[] r = new String[10];
        for (int i = 0; i < 10; i++) {
            double x = d[i][2];
            if (x < 18.5) r[i] = "Underweight";
            else if (x < 25) r[i] = "Normal";
            else if (x < 30) r[i] = "Overweight";
            else r[i] = "Obese";
        }
        return r;
    }

    public static void main(String[] args) {
        double[][] arr = new double[10][3];
        fill(arr);
        String[] result = stat(arr);
        for (int i = 0; i < 10; i++) {
            System.out.println("W: " + arr[i][0] + " H: " + arr[i][1] + " BMI: " + arr[i][2] + " -> " + result[i]);
        }
    }
}
