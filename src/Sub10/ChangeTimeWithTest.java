package Sub10;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class ChangeTimeWithTest {
    static void main() {
        LocalDateTime localDateTime = LocalDateTime.of(2018,1,1,13,40,59);

        LocalDateTime chDT = localDateTime.with(ChronoField.YEAR,2026);
        LocalDateTime chDt2 = localDateTime.withYear(2026);

        System.out.println(chDT);
        System.out.println(chDt2);
        System.out.println();

        LocalDateTime whit101 = localDateTime.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        System.out.println(localDateTime);
        System.out.println(whit101);
    }
}
