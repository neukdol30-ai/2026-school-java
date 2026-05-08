package Sub14.Stream.Test;

import java.util.List;
import java.util.stream.Stream;

public class Test04 {
    static void main() {

        List<Integer>nums=
                List.of(1,2,3,4,5);

        Stream<Integer> stream = nums.stream();

        List<Integer> result = stream.map(n->n*n).toList();

        System.out.println(result);
    }
}
