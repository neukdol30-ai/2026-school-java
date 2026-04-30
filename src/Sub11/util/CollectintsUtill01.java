package Sub11.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectintsUtill01 {
    static void main() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Integer max = Collections.max(list);
        System.out.println(max);
        Integer min = Collections.min(list);
        System.out.println(min);
        Collections.shuffle(list);
        System.out.println(list.toString());
        Collections.sort(list);
        System.out.println(list.toString());
        Collections.reverse(list);
        System.out.println(list.toString());


    }
}
