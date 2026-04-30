package Sub11.util;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsUtil02 {
    static void main() {
        List<Integer> list = List.of(1,2,3,4,5); //of로 만들면 불변객체가 된다.
        System.out.println(list.toString());
        //list.add(10);
        //System.out.println(list.toString());
        Set<Integer> set = Set.of(1,2,3);
        System.out.println(set.toString());
        Map<Integer,String> map = Map.of(1,"one",2,"two");
        System.out.println(map.toString());
        System.out.println(list.getClass());
    }
}
