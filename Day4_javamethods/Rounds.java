import java.util.*;

public class Rounds {
    public static double laps(int a, int b, int c) {
        int s = a + b + c;
        return 5000.0 / s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        int r = sc.nextInt();
        System.out.println((int)Math.ceil(laps(p, q, r)));
    }
}
