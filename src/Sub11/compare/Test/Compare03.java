package Sub11.compare.Test;

import java.util.Arrays;
import java.util.Comparator;

public class Compare03 {
    static void main() {

        Integer [] scores= {80,95,70,95,60,85};
        //Arrays.sort(scores, new AbsComparator3());
        Arrays.sort(scores, Comparator.reverseOrder());
        System.out.println(Arrays.toString(scores));


    }
}

class AbsComparator3 implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return Integer.compare(o2,o1);
    }
}

