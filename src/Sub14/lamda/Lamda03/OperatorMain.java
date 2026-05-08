package Sub14.lamda.Lamda03;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class OperatorMain {
    static void main() {
        Function<Integer, Integer> square01 = x -> x * x;
        UnaryOperator<Integer> square02 = x -> x * x;
        System.out.println(square01.apply(10));
        System.out.println(square02.apply(10));

    }
}
