import java.util.Scanner;

public class ElectionBoothManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int votes1 = 0, votes2 = 0, votes3 = 0;

        while (true) {
            System.out.print("\nEnter your age (or -1 to exit): ");
            int age = sc.nextInt();

            if (age == -1) {
                System.out.println("Voting ended.");
                break;
            }

            if (age < 18) {
                System.out.println("You are not eligible to vote.");
                continue;
            }

            System.out.println("Choose candidate to vote (1, 2, or 3): ");
            int vote = sc.nextInt();

            switch (vote) {
                case 1:
                    votes1++;
                    break;
                case 2:
                    votes2++;
                    break;
                case 3:
                    votes3++;
                    break;
                default:
                    System.out.println("Invalid vote.");
            }
        }

        System.out.println("\nFinal Vote Count:");
        System.out.println("Candidate 1: " + votes1);
        System.out.println("Candidate 2: " + votes2);
        System.out.println("Candidate 3: " + votes3);

        sc.close();
    }
}
