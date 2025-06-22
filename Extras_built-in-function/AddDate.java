import java.time.LocalDate;

public class AddDate {
    public static void main(String[] args) {
        LocalDate d = LocalDate.of(2020, 6, 22);
        LocalDate r = d.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
        System.out.println("Final Date: " + r);
    }
}

