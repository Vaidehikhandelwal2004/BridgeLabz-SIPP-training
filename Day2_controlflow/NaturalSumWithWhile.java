import java.util.Scanner;

public class NaturalSumWithWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("The number " + n + " is not a natural number.");
        } else {
            int loopSum = 0;
            int i = 1;

            
            while (i <= n) {
                loopSum += i;
                i++;
            }

           
            int formulaSum = n * (n + 1) / 2;

        
            System.out.println("Sum using while loop: " + loopSum);
            System.out.println("Sum using formula: " + formulaSum);

            if (loopSum == formulaSum) {
                System.out.println("Both computations are correct. ");
            } else {
                System.out.println("Mismatch in results. ");
            }
        }

        sc.close();
    }
}
