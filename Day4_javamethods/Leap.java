import java.util.*;

public class Leap {
    public static boolean check(int y) {
        if (y < 1582) return false;
        return (y % 4 == 0 && y % 100 != 0) || y % 400 == 0;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (check(n)) System.out.println("Leap Year");
        else System.out.println("Not a Leap Year");
    }
}
