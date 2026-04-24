package Sub9.lang.wrapper;

public class WrapperClassTest01 {
    static void main() {
        int num = 10;

        Integer integer = new Integer(10);//boxing -> 안쓰는게 좋음
        Integer integerObject = Integer.valueOf(10);

        System.out.println(integer); //기본형
        System.out.println(integerObject); //

        System.out.println(integer == integerObject);//동일성
        System.out.println(integer.equals(integerObject) );//동등성




    }
}
