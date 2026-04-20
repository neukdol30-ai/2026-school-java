package Sub9.lang.object.equals;

public class EqualsTest02 {
    static void main() {
        UserV2 user01 = new UserV2("id-001");
        UserV2 user02 = new UserV2("id-001");

        System.out.println((user01 == user02));
        System.out.println(user01.equals(user02));

    }
}
