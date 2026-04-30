package Sub11.compare.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class Compare10 {
    static void main() {

        String [] dates= {
                "2026-04-29",
                "2025-12-25",
                "2026-01-01",
                "2024-10-10"
        };

        Arrays.sort(dates, new comparator10());
        System.out.println(Arrays.toString(dates));


    }
}

class comparator10 implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {
        LocalDate d1=LocalDate.parse(o1);
        LocalDate d2=LocalDate.parse(o2);

        return d1.compareTo(d2);
    }
}
