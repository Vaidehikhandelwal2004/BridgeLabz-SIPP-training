import java.util.*;

public class samecheck {
    public static void main(String[] p) {
        Scanner s = new Scanner(System.in);
        String a = s.next();
        String b = s.next();
        boolean v = chk(a, b);
        boolean w = a.equals(b);
        System.out.println(v + " " + w);
    }

    static boolean chk(String a, String b) {
        if (a.length() != b.length()) {
             return false;
        }
        for (int i = 0; i < a.length(); i++) 
        {
            if (a.charAt(i) != b.charAt(i)) {
                return false;
        }
    }
        return true;
    }
}
