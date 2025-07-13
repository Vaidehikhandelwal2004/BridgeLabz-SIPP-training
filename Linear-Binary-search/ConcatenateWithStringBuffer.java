public class ConcatenateWithStringBuffer {
    public static String concatenate(String[] arr) {
        StringBuffer sb = new StringBuffer();
        for (String s : arr)
            sb.append(s);
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] input = {"Java", "Is", "Powerful"};
        System.out.println(concatenate(input));
    }
}
