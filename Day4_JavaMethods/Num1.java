public class Num1 {
    public static void main(String[] args) {
        int num = 153;
        int[] digits = getDigits(num);
        System.out.println("Count: " + getCount(num));
        System.out.println("Duck: " + isDuck(digits));
        System.out.println("Armstrong: " + isArmstrong(num, digits));
        int[] max2 = findMaxTwo(digits);
        System.out.println("Max: " + max2[0] + " Second Max: " + max2[1]);
        int[] min2 = findMinTwo(digits);
        System.out.println("Min: " + min2[0] + " Second Min: " + min2[1]);
    }

    public static int getCount(int n) {
        return String.valueOf(n).length();
    }

    public static int[] getDigits(int n) {
        String
