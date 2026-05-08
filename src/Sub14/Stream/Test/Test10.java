package Sub14.Stream.Test;

import java.util.List;
import java.util.stream.Stream;

public class Test10 {
    static void main() {

        List<Integer>nums=
                List.of(12,3,7,9,15,2,30,21);

        Stream<Integer> stream = nums.stream();

        List<Integer> result = stream.filter(n->n%3==0).sorted().toList();


        System.out.println(result);


    }
}
