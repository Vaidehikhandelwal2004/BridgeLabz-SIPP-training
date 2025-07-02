public class SubOcc {
    public static void main(String[] args) {
        String txt = "abababa";
        String sub = "aba";
        int count = 0;
        for (int i = 0; i <= txt.length() - sub.length(); i++) {
            if (txt.substring(i, i + sub.length()).equals(sub)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
