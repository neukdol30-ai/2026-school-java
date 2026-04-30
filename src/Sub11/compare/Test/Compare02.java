package Sub11.compare.Test;

import java.util.Arrays;
import java.util.Comparator;

public class Compare02 {
    static void main() {

        String [] words= {"banana","kiwi","apple","fig","grape","pear"};

        Arrays.sort(words, new AbsComparator2());

        System.out.println(Arrays.toString(words));



    }
}

class AbsComparator2 implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {

        int result=o1.length() - o2.length();

        if(result==0) {
            return o1.compareTo(o2);
        }
        return result;
    }
}
