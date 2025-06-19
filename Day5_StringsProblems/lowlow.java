import java.util.*;

public class lowlow {
    public static void main(String[] m) {
        Scanner x = new Scanner(System.in);
        String t = x.nextLine();
        String a = down(t);
        String b = t.toLowerCase();
        boolean res = same(a, b);
        System.out.println(res);
    }

    static String down(String s) {
        String o = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') c += 32;
            o += c;
        }
        return o;
    }

    static boolean same(String a, String b) {
        if (a.length() != b.length()) 
            return false;
            
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) 
              return false;
        }
        return true;
    }
}
