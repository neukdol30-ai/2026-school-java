package Sub1;

import java.time.LocalDate;

public class sub7 {
    public static void main(String[] args){
        LocalDate now = LocalDate.now();
        int mon = now.getMonthValue();

        System.out.print("이번 달 : " + mon);
        String season = null;

        season = switch (mon) {
            case 12, 1, 2 ->
            {
                yield "winter";
            }
            //System.out.println("winter");
            case 3, 4, 5 ->
            //System.out.println("spring");
            {
                yield "spring";
            }
            case 6, 7, 8->
            //System.out.println("summer");
            {
                yield "summer";
            }
            default ->
            //System.out.println("winter");
            {
                yield "autumn";
            }


        };

        System.out.println(season);
        System.out.println(now.getYear());

    }

}
