import java.util.Scanner;

public class NaturalNumberSumCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n > 0) {
            int sum = 0;
            int i = 1;
            while (i <= n) {
                sum += i;
                i++;
            }

            int formulaSum = n * (n + 1) / 2;

            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using while loop: " + sum);
        } else {
            System.out.println("Not a natural number");
        }
    }
}
