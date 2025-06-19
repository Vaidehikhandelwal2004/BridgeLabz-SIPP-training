import java.util.*;

public class Choco {
    public static int[] split(int a, int b) {
        return new int[]{a / b, a % b};
    }

    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        int w = q.nextInt();
        int e = q.nextInt();
        int[] r = split(w, e);
        System.out.println(r[0] + " " + r[1]);
    }
}
