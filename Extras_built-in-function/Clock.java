import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Clock {
    public static void main(String[] args) {
        ZonedDateTime g = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime i = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime p = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        System.out.println("GMT: " + g);
        System.out.println("IST: " + i);
        System.out.println("PST: " + p);
    }
}
