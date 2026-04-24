package Sub9.lang.wrapper;

public class AtoboxingTest {
    static void main() {
//        int value = 7;
//        //primitive -> wrapper
//        Integer boxedValue = Integer.valueOf(value);

        Integer boxedValue = 7; //auto boxing

        //Wrapper -> primitive
        int unboxedValue = boxedValue.intValue();
        System.out.println(boxedValue);
        System.out.println(unboxedValue);
    }
}

