import java.util.*;

public class Factors {
    public static int[] get(int x) {
        int z = 0;
        for (int i = 1; i <= x; i++) if (x % i == 0) z++;
        int[] a = new int[z];
        int j = 0;
        for (int i = 1; i <= x; i++) if (x % i == 0) a[j++] = i;
        return a;
    }

    public static int sum(int[] a) {
        int t = 0;
        for (int x : a) t += x;
        return t;
    }

    public static int prod(int[] a) {
        int p = 1;
        for (int x : a) p *= x;
        return p;
    }

    public static int squareSum(int[] a) {
        int s = 0;
        for (int x : a) s += Math.pow(x, 2);
        return s;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int y = s.nextInt();
        int[] b = get(y);
        System.out.println(Arrays.toString(b));
        System.out.println("Sum: " + sum(b));
        System.out.println("Product: " + prod(b));
        System.out.println("Square Sum: " + squareSum(b));
    }
}
