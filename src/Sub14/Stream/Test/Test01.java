package Sub14.Stream.Test;

import java.util.List;
import java.util.stream.Stream;

public class Test01 {
    static void main() {
        List<Integer>nums= List.of(1,2,3,4,5,6,7,8,9,10);
        Stream<Integer> stream = nums.stream();
        List<Integer> result = stream.filter(n->n%2==0).toList();

        System.out.println(result);
    }
}
