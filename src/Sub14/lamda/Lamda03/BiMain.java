package Sub14.lamda.Lamda03;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;

public class BiMain {
    static void main() {

        BiFunction<Integer, Integer, Integer> addition01 = (a,b)->a+b;
        BinaryOperator<Integer> addition02 = (a, b)-> a+b;
        BiConsumer<String, Integer> repeat = (c, n)->{
            for (int i = 0; i < n; i++){
                System.out.println(c);
            }
            System.out.println();
        };
        repeat.accept("*",10);
        BiPredicate<Integer, Integer> isGreater = (a ,b) -> a>b;
        System.out.println(isGreater.test(10,20));
        System.out.println(addition01.apply(10,20));
        System.out.println(addition02.apply(20,30));
    }
}
