package Sub14.lamda.Lamda02;

public class GenericMain01 {
    static void main() {
        StringFunction upperCase = s -> s.toUpperCase();
        String result01 = upperCase.apply("hello");
        System.out.println(result01);

        NumberFunction square = n -> n*n;
        Integer result02 = square.apply(10);
        System.out.println(result02);



    }

    @FunctionalInterface
    interface StringFunction{
        String apply(String s);
    }

    @FunctionalInterface
    interface NumberFunction{
        Integer apply(Integer n);
    }

    @FunctionalInterface
    interface ObjectFunction{
        Object apply(Object o);
    }

    @FunctionalInterface
    interface  GenericFunction<T, R>{
        R apply(T s);
    }
}
