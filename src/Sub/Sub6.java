package Sub;

import java.time.LocalDate;

public class Sub6 {
    public static void main(String[] args){
        LocalDate now = LocalDate.now();
        int mon = now.getMonthValue();

        System.out.print("이번 달 : " + mon);
        String season = null;

        season = switch (mon) {
            case 12, 1, 2 -> "winter";
            case 3, 4, 5 ->  "spring";
            case 6, 7, 8-> "summer";
            default -> "autumn";
        };

        System.out.println(season);
        System.out.println(now.getYear());

    }

}
