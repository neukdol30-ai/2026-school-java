package Sub10;

import java.time.*;
import java.time.format.TextStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class test {
    static void main() {

        int year = LocalDate.now().getYear();
        LocalDate today = LocalDate.now();
        LocalDate LastYear = LocalDate.of(year, 12, 31);


        System.out.println(year);
        if((year % 4 == 0 && year % 400 == 0)|| year % 100 == 0){
            System.out.println("윤년");

        }else{
            System.out.println("평년");
        }

        System.out.println();

        System.out.println(today);
        System.out.println(LastYear);
        System.out.println(ChronoUnit.DAYS.between(today, LastYear));

        System.out.println();

        System.out.println(LocalDate.of(2026,10,15).getDayOfYear());

        System.out.println();

        System.out.println(ChronoUnit.MONTHS.between(today, LastYear));
        System.out.println(ChronoUnit.DAYS.between(today.plusMonths(8),LastYear));

        System.out.println();

        LocalTime in = LocalTime.of(9,10);
        LocalTime out =  LocalTime.of(18,45);
        Duration howMuch = Duration.between(in,out);
        System.out.println(in);
        System.out.println(out);
        Duration howMuchCH = howMuch.minusHours(1);
        long hMH = howMuchCH.toHours();
        long hMM = howMuchCH.toMinutesPart();
        System.out.println(hMH +" "+ hMM);

        System.out.println();

        LocalDateTime startTime = LocalDateTime.of(2026,5,10,14,30);
        System.out.println(startTime);
        System.out.println(startTime.minusMinutes(90));

        System.out.println();

        LocalDate day1 = LocalDate.of(2026,1,31);
        LocalDate day2 = LocalDate.of(2026,3,31);
        LocalDate day3 = LocalDate.of(2024,1,31);
        System.out.println(day1.plusMonths(1));
        System.out.println(day2.plusMonths(1));
        System.out.println(day3.plusMonths(1));

        System.out.println();

        LocalDate yoilDay = LocalDate.of(2026,4,26);
        String yoilDay2 = yoilDay.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREAN);
        System.out.println(yoilDay2);

        System.out.println();

        LocalDateTime CFTest = LocalDateTime.of(2026,11,7,16,25,40);
        System.out.println(CFTest.get(ChronoField.YEAR));
        System.out.println(CFTest.get(ChronoField.MONTH_OF_YEAR));
        System.out.println(CFTest.get(ChronoField.DAY_OF_MONTH));
        System.out.println(CFTest.get(ChronoField.HOUR_OF_DAY));
        System.out.println(CFTest.get(ChronoField.MINUTE_OF_HOUR));
        System.out.println(CFTest.get(ChronoField.SECOND_OF_MINUTE));
        System.out.println(CFTest.get(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
        System.out.println(CFTest.get(ChronoField.DAY_OF_WEEK));

        System.out.println();

        LocalDate DDAYTEST = LocalDate.now();
        LocalDate DDAYGoal = LocalDate.of(2026,12,25);
        long DDAYdays = ChronoUnit.DAYS.between(DDAYTEST, DDAYGoal);

        System.out.println();

        if (DDAYTEST.isBefore(DDAYGoal)){
            System.out.println(DDAYdays);
        } else if (DDAYTEST.isEqual(DDAYGoal)) {
            System.out.println("D-Day");
        }else {
            System.out.println(Math.abs(DDAYdays));
        }

        System.out.println();

        LocalDate StartProjectDay = LocalDate.of(2025,11,18);
        LocalDate EndProjectDay = LocalDate.of(2026,8,7);
        Period PDDD = Period.between(StartProjectDay,EndProjectDay);

        long PDY = PDDD.getYears();
        long PDM = PDDD.getMonths();
        long PDD = PDDD.getDays();

        System.out.println(PDY +" "+ PDM +" "+ PDD);
        System.out.println(ChronoUnit.DAYS.between(StartProjectDay,EndProjectDay));
        System.out.println(ChronoUnit.MONTHS.between(StartProjectDay,EndProjectDay));
        System.out.println(ChronoUnit.WEEKS.between(StartProjectDay,EndProjectDay));

        System.out.println();

        LocalDateTime StartDay = LocalDateTime.of(2026,4,23,22,30);
        LocalDateTime EndDay = LocalDateTime.of(2026,4,24,6,10);

        System.out.println(Duration.between(StartDay,EndDay));



    }
}
