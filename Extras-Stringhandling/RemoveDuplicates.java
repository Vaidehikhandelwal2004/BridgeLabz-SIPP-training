public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "programming";
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (res.indexOf(c) == -1) {
                res += c;
            }
        }
        System.out.println(res);
    }
}
