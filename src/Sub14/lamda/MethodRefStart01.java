package Sub14.lamda;

import java.util.function.BinaryOperator;

public class MethodRefStart01 {
    static void main() {
        BinaryOperator<Integer> add01 = (x,y) -> x+y;
        BinaryOperator<Integer> add02 = (x,y) -> x+y;

        Integer result01 = add01.apply(10,20);
        System.out.println(result01);
        Integer result02 = add02.apply(10,20);
        System.out.println(result02);
    }
    static int add(int x, int y){
        return x+y;
    }
}
