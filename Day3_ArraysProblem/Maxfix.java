import java.util.Scanner;

public class Maxfix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[10];
        int idx = 0;
        while (n > 0) {
            if (idx == 10) break;
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
