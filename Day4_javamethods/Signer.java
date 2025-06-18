import java.util.*;

public class Signer {
    public static int what(int x) {
        if (x > 0) return 1;
        if (x < 0) return -1;
        return 0;
    }

    public static void main(String[] args) {
        Scanner b = new Scanner(System.in);
        int y = b.nextInt();
        System.out.println(what(y));
    }
}

