package Sub9.lang.wrapper;

public class WrapperUtilsTest {
    static void main() {
        int age = Integer.parseInt("10");
        System.out.println(age + 10);
        System.out.println(Integer.sum(10,20));
        System.out.println(Integer.max(10,20));
        System.out.println(Integer.min(10,20));
        Integer integer01 = Integer.valueOf(10);
        Integer integer02 = Integer.valueOf(20);
        Integer integer03 = Integer.valueOf(30);
        int compareResult = integer01.compareTo(30);
        int compareResult02 = integer01.compareTo(5);
        int compareResult03 = integer01.compareTo(10);
        System.out.println(compareResult);
        System.out.println(compareResult02);
        System.out.println(compareResult03);
    }
}
