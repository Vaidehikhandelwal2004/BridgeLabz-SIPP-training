import java.util.*;

public class Naturals {
    public static int total(int n) {
        int sum = 0;
        for (int x = 1; x <= n; x++) sum += x;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        System.out.println(total(z));
    }
}
