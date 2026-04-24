package Sub10;

import java.time.LocalDate;



public class time {
    static void main() {
        LocalDate nowDate = LocalDate.now();

        System.out.println(nowDate);

        LocalDate ofDate = LocalDate.of(2026,12,25);

        System.out.println(ofDate);


    }
}
