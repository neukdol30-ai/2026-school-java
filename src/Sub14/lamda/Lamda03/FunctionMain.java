package Sub14.lamda.Lamda03;

import java.util.function.Function;

public class FunctionMain {
    static void main() {
        Function<String, Integer> function01 = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };
        System.out.println(function01.apply("hello"));

        Function<String, Integer> function02 = s->s.length();
        System.out.println(function02.apply("hello"));
    }
}
