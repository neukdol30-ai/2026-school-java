package Sub14.Stream.Test;

import java.util.List;
import java.util.stream.Stream;

public class Test07 {
    static void main() {

        List<Integer>nums=
                List.of(10,20,30,40,50);

        Stream<Integer> stream = nums.stream();

        int result = stream.mapToInt(n->n).sum();

        System.out.println(result);


    }
}
