import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] h = new double[11];
        double sum = 0;
        for (int i = 0; i < 11; i++) {
            h[i] = sc.nextDouble();
            sum += h[i];
        }
        double mean = sum / 11;
        System.out.println(mean);
    }
}

