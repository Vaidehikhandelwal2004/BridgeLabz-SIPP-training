import java.time.LocalDate;

public class CompareDate {
    public static void main(String[] args) {
        LocalDate a = LocalDate.of(2023, 6, 1);
        LocalDate b = LocalDate.of(2025, 6, 22);

        if (a.isBefore(b)) {
        System.out.println("First date is before second");
        }
        else if (a.isAfter(b))
        { 
            System.out.println("First date is after second");
        }
        else 
        {
            System.out.println("Both dates are same");
        }
    }
}
