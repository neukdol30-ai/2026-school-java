package Sub11.compare.Test;

import java.util.Arrays;
import java.util.Comparator;

public class CompareEX {
    static void main() {

        Order[]orders= {
                new Order("kim",3000,2),
                new Order("lee",2000,5),
                new Order("kim",1000,5),
                new Order("park",3000,1),
                new Order("lee",2000,3)
        };

        //Arrays.sort(orders, new ComparatorEX());
        Arrays.sort(orders);
        System.out.println(Arrays.toString(orders));

    }
}



