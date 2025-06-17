import java.util.Scanner;

public class Max{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 10;
        int[] a = new int[max];
        int idx = 0;
        while (n > 0) {
            if (idx == max) {
                max *= 2;
                int[] t = new int[max];
                for (int i = 0; i < idx; i++) t[i] = a[i];
                a = t;
            }
            a[idx++] = n % 10;
            n /= 10;
        }
        int first = 0, second = 0;
        for (int i = 0; i < idx; i++) {
            if (a[i] > first) {
                second = first;
                first = a[i];
            } else if (a[i] > second && a[i] != first) {
                second = a[i];
            }
        }
        System.out.println(first + " " + second);
    }
}
