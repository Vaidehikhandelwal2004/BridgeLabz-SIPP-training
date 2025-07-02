public class LongestWord {
    public static void main(String[] args) {
        String s = "Java is a beautiful language";
        String[] words = s.split(" ");
        String max = "";
        for (String w : words) {
            if (w.length() > max.length()) {
                max = w;
            }
        }
        System.out.println(max);
    }
}
