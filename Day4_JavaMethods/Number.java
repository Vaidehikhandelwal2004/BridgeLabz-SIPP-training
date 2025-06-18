import java.util.Scanner;

public class Number {

    public static boolean isPositive(int num) {
        return num >= 0;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static int compare(int a, int b) {
        return Integer.compare(a, b); // returns -1, 0 or 1
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];

        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            nums[i] = sc.nextInt();

            if (isPositive(nums[i])) {
                if (isEven(nums[i])) {
                    System.out.println(nums[i] + " is Positive and Even.");
                } else {
                    System.out.println(nums[i] + " is Positive and Odd.");
                }
            } else {
                System.out.println(nums[i] + " is Negative.");
            }
        }

        int result = compare(nums[0], nums[4]);
        if (result == 0)
            System.out.println("First and last elements are equal.");
        else if (result > 0)
            System.out.println("First element is greater than last.");
        else
            System.out.println("First element is less than last.");
    }
}
