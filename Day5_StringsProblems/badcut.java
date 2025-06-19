import java.util.*;

public class badcut {
    public static void main(String[] z) {
        Scanner x = new Scanner(System.in);
        String t = x.next();
        rip(t);
        fix(t);
    }

    static void rip(String s) {
        String t = s.substring(5, 2);
        System.out.println(t);
    }

    static void fix(String s) {
        try {
            String t = s.substring(5, 2);
            System.out.println(t);
        } catch (IllegalArgumentException e) {
            System.out.println("bad");
        } catch (RuntimeException e) {
            System.out.println("oops");
        }
    }
}
