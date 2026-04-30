package Sub11.compare;

import java.util.Arrays;
import java.util.Comparator;

public class Compare02 {
    static void main() {
        //자바가 제공하는 Comparator 라는 interface를 직접 구현
        Integer [] array = {3,2,1};
        System.out.println(Arrays.toString(array));
        System.out.println("Comparator 비교");
        Arrays.sort(array,new AscComparator());
        System.out.println("AscComparator : "+Arrays.toString(array));
        Arrays.sort(array,new DescComparator());
        System.out.println("DescComparator : "+Arrays.toString(array));
        Arrays.sort(array,new AscComparator().reversed());
        System.out.println("AscComparator reversed() : "+Arrays.toString(array));

    }
    static class AscComparator implements Comparator<Integer> {

        @Override
        public int compare(Integer o1, Integer o2) {
            System.out.println("o1 = "+o1+" , o2 = "+o2);
            //-1,0,1
//            if(o1<o2) {
//                return -1;
//            } else if(o1==o2) {
//                return 0;
//            } else {
//                return 1;
//            }
            return (o1 < o2) ? -1 : (o1 == o2 ? 0 : 1);
        }
    }
    static class DescComparator implements Comparator<Integer> {

        @Override
        public int compare(Integer o1, Integer o2) {
            System.out.println("o1 = "+o1+" , o2 = "+o2);
            //-1,0,1
//            if(o1<o2) {
//                return -1;
//            } else if(o1==o2) {
//                return 0;
//            } else {
//                return 1;
//            }
            return ((o1 < o2) ? -1 : (o1 == o2 ? 0 : 1))*-1;
        }
    }
}
