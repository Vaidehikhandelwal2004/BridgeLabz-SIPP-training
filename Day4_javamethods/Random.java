import java.util.*;

public class Random {
    public static int[] get(int x) {
        int[] a = new int[x];
        for (int i = 0; i < x; i++) a[i] = (int)(Math.random() * 9000) + 1000;
        return a;
    }

    public static double[] calc(int[] y) {
        int min = y[0], max = y[0], sum = 0;
        for (int i : y) {
            sum += i;
            min = Math.min(min, i);
            max = Math.max(max, i);
        }
        return new double[]{(double)sum / y.length, min, max};
    }

    public static void main(String[] args) {
        int[] arr = get(5);
        System.out.println(Arrays.toString(arr));
        double[] res = calc(arr);
        System.out.println("Avg: " + res[0]);
        System.out.println("Min: " + res[1]);
        System.out.println("Max: " + res[2]);
    }
}
