package Sub11;

import java.util.ArrayList;
import java.util.Vector;

public class list {
    static void main() {

        Integer arr[] = new Integer[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        //arr[3] = 4; -> error

        //ArrayList<Integer> arrayList = new ArrayList<Integer>();
        ArrayList arrayList = new ArrayList();

        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add("foa");
        arrayList.add(1,100);
        System.out.println(arrayList.size());
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.get(2));
        System.out.println(arrayList.get(3));

    }
}
