package Sub14.lamda.Lamda03;

import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateMain {
    static void main() {
        Predicate<Integer> predicate01 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        };
        System.out.println(predicate01.test(10));

        Predicate<Integer> predicate02 = n -> n % 2 == 0;
        System.out.println(predicate02.test(10));
        Function<Integer, Boolean> predicate03 = n-> n%2==0;
        System.out.println(predicate03.apply(10));
    }
}
