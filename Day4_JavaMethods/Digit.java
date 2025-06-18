public class Digit {
    public static void main(String[] args) {
        int num = 378;

        int[] digits = getDigits(num);
        System.out.println("Digit Count: " + digits.length);
        System.out.println("Sum: " + sumDigits(digits));
        System.out.println("Sum of Squares: " + sumSquares(digits));
        System.out.println("Is Harshad: " + isHarshad(num, digits));

        int[][] freq = digitFrequency(digits);
        for (int[] row : freq) {
            System.out.println("Digit " + row[0] + ": " + row[1]);
        }
    }

    public static int[] getDigits(int num) {
        String s = String.valueOf(num);
        int[] d = new int[s.length()];
        for (int i = 0; i < s.length(); i++) d[i] = s.charAt(i) - '0';
        return d;
    }

    public static int sumDigits(int[] d) {
        int sum = 0;
        for (int i : d) sum += i;
        return sum;
    }

    public static int sumSquares(int[] d) {
        int sum = 0;
        for (int i : d) sum += Math.pow(i, 2);
        return sum;
    }

    public static boolean isHarshad(int n, int[] d) {
        return n % sumDigits(d) == 0;
    }

    public static int[][] digitFrequency(int[] d) {
        int[] count = new int[10];
        for (int i : d) count[i]++;
        int[][] result = new int[10][2];
        for (int i = 0; i < 10; i++) {
            result[i][0] = i;
            result[i][1] = count[i];
        }
        return result;
    }
}
