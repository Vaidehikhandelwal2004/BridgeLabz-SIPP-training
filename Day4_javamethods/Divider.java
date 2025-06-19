import java.util.*;

public class Divider {
    public static int[] calc(int p, int q) {
        return new int[]{p / q, p % q};
    }

    public static void main(String[] args) {
        Scanner h = new Scanner(System.in);
        int j = h.nextInt();
        int k = h.nextInt();
        int[] m = calc(j, k);
        System.out.println(m[0] + " " + m[1]);
    }
}
