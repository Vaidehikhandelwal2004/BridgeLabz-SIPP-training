import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ShowDate {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();

        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter f3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        System.out.println("Format 1: " + d.format(f1));
        System.out.println("Format 2: " + d.format(f2));
        System.out.println("Format 3: " + d.format(f3));
    }
}

