package Sub9.lang.object.equals;

public class EqualsTest01 {
    static void main() {
        UserV1 user01 = new UserV1("id-001");
        UserV1 user02 = new UserV1("id-001");
        UserV1 user03 = user01;

        System.out.println(user01 == user02);
        System.out.println(user01 == user03);

        System.out.println(user01);
        System.out.println(user02);
        System.out.println(user03);
    }
}
