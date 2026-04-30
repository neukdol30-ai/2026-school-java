package Sub11.compare.Test;

import java.util.Arrays;
import java.util.Comparator;

public class Compare09 {
    static void main() {
        String [] nums= {"10","2","30","21","1"};

        Arrays.sort(nums, new Comparator09());
        System.out.println(Arrays.toString(nums));


    }
}

class Comparator09 implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {
        int n1=Integer.parseInt(o1);
        int n2=Integer.parseInt(o2);

        return Integer.compare(n1,n2);
    }
}
