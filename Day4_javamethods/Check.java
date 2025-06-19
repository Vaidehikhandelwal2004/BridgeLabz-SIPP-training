import java.util.*;

public class Check {
    public static boolean isPos(int x) {
        return x >= 0;
    }

    public static boolean isEven(int x) {
        return x % 2 == 0;
    }

    public static int comp(int a, int b) {
        if (a > b) return 1;
        if (a < b) return -1;
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) arr[i] = sc.nextInt();
        for (int i = 0; i < 5; i++) {
            if (isPos(arr[i])) {
                if (isEven(arr[i])) System.out.println(arr[i] + " even");
                else System.out.println(arr[i] + " odd");
            } else System.out.println(arr[i] + " negative");
        }
        int r = comp(arr[0], arr[4]);
        if (r == 0) System.out.println("First and last are equal");
        else if (r == 1) System.out.println("First is greater");
        else System.out.println("Last is greater");
    }
}
