import java.util.Scanner;

public class NaturalSumComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("The number " + n + " is not a natural number.");
        } else {
            
            int loopSum = 0;
            for (int i = 1; i <= n; i++) {
                loopSum += i;
            }

          
            int formulaSum = n * (n + 1) / 2;

            System.out.println("Sum using loop: " + loopSum);
            System.out.println("Sum using formula: " + formulaSum);

            if (loopSum == formulaSum) {
                System.out.println("Both methods give the same result. ✅");
            } else {
                System.out.println("There is a mismatch in the results. ❌");
            }
        }

        sc.close();
    }
}
