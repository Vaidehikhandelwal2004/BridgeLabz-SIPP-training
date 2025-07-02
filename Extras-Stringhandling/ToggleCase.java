public class ToggleCase {
    public static void main(String[] args) {
        String s = "HeLLo WoRLd";
        String r = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch)) {
                r += Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)) {
                r += Character.toUpperCase(ch);
            } else {
                r += ch;
            }
        }
        System.out.println(r);
    }
}
