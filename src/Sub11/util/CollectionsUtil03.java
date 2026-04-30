package Sub11.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsUtil03 {
    static void main() {
        List<Integer> list = List.of(1,2,3,4,5); //of로 만들면 불변객체가 된다.
        //불변객체를 가변으로 바꾸기
        ArrayList<Integer> mutableList = new ArrayList<>(list);
        mutableList.add(6);
        System.out.println(mutableList.toString());

        //가변을 불변으로 바꾸기.
        List<Integer> immutableList = Collections.unmodifiableList(mutableList);
        //immutableList.add(7);
    }
    }

