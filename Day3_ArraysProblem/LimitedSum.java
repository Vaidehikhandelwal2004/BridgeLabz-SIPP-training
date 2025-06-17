import java.util.Scanner;

public class LimitedSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] a = new double[10];
        double sum = 0.0;
        int idx = 0;
        while (true) {
            double n = sc.nextDouble();
            if (n <= 0 || idx == 10) break;
            a[idx++] = n;
        }
        for (int i = 0; i < idx; i++) {
            sum += a[i];
        }
        System.out.println(sum);
    }
}
