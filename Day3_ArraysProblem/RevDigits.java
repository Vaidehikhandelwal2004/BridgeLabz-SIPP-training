import java.util.Scanner;

public class RevDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int len = String.valueOf(n).length();
        int[] a = new int[len];
        int i = 0;
        while (n > 0) {
            a[i++] = n % 10;
            n /= 10;
        }
        for (int j = 0; j < i; j++) {
            System.out.print(a[j]);
        }
    }
}

