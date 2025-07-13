public class ReverseWithStringBuilder {
    public static String reverse(String input) {
        StringBuilder sb = new StringBuilder();
        sb.append(input);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String input = "hello";
        System.out.println(reverse(input));
    }
}
