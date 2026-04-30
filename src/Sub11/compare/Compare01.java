package Sub11.compare;

import java.util.Arrays;

public class Compare01 {
    //정렬
    static void main() {
        Integer [] array = {3,2,1};
        System.out.println(Arrays.toString(array));
        System.out.println("기본 정렬");
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
