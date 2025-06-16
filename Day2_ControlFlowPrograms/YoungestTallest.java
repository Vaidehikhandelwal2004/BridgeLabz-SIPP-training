import java.util.Scanner;

public class YoungestTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ageAmar = sc.nextInt();
        int heightAmar = sc.nextInt();
        int ageAkbar = sc.nextInt();
        int heightAkbar = sc.nextInt();
        int ageAnthony = sc.nextInt();
        int heightAnthony = sc.nextInt();

        String youngest = "";
        int minAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        if (minAge == ageAmar) youngest = "Amar";
        else if (minAge == ageAkbar) youngest = "Akbar";
        else youngest = "Anthony";

        String tallest = "";
        int maxHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        if (maxHeight == heightAmar) tallest = "Amar";
        else if (maxHeight == heightAkbar) tallest = "Akbar";
        else tallest = "Anthony";

        System.out.println("The youngest friend is " + youngest);
        System.out.println("The tallest friend is " + tallest);
    }
}
