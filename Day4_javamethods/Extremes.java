import java.util.*;

public class Extremes {
    public static int[] maxmin(int a, int b, int c) {
        int big = a, small = a;
        if (b > big) big = b;
        if (c > big) big = c;
        if (b < small) small = b;
        if (c < small) small = c;
        return new int[]{small, big};
    }

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int x = n.nextInt();
        int y = n.nextInt();
        int z = n.nextInt();
        int[] g = maxmin(x, y, z);
        System.out.println(g[0] + " " + g[1]);
    }
}
