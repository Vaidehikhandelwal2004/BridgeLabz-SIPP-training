import java.util.Scanner;

public class FactorArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 10;
        int[] f = new int[max];
        int idx = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                if (idx == max) {
                    max *= 2;
                    int[] t = new int[max];
                    for (int j = 0; j < idx; j++) {
                        t[j] = f[j];
                    }
                    f = t;
                }
                f[idx++] = i;
            }
        }
        for (int i = 0; i < idx; i++) {
            System.out.print(f[i] + " ");
        }
    }
}
