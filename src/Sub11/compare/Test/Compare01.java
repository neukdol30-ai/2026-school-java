package Sub11.compare.Test;

import java.util.Arrays;
import java.util.Comparator;

public class Compare01 {
    static void main() {
        Integer [] arr = {-3, 1, -7, 4, -2, 6};
        Arrays.sort(arr,new AbsComparator());
        System.out.println(Arrays.toString(arr));

    }
}

class AbsComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        int absCompare = Integer.compare(Math.abs(o1), Math.abs(o2));

        if (absCompare != 0){
            return absCompare;
        }
        return Integer.compare(o1,o2);
    }
}
