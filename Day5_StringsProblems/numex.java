import java.util.*;

public class numex {
    public static void main(String[] a) {
        Scanner x = new Scanner(System.in);
        String y = x.next();
        wow(y);
        ha(y);
    }

    static void wow(String t) {
        int z = Integer.parseInt(t);
        System.out.println(z);
    }

    static void ha(String t) {
        try {
            int z = Integer.parseInt(t);
            System.out.println(z);
        } catch (NumberFormatException e) {
            System.out.println("notnum");
        } catch (RuntimeException e) {
            System.out.println("oops");
        }
    }
}
