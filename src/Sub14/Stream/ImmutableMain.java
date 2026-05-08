package Sub14.Stream;

import java.util.List;

public class ImmutableMain {
    static void main() {
        List<Integer> origin = List.of(1,2,3,4,5);
        List<Integer> filterList =
                origin.stream()
                .filter(n->n%2==0)
                .toList();

        System.out.println(filterList);
        System.out.println(origin);
    }
}
