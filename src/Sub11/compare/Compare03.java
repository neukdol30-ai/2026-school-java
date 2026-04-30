package Sub11.compare;

import java.util.Arrays;

public class Compare03 {
    static void main() {
        User user01 = new User("a", 30);
        User user02 = new User("b", 20);
        User user03 = new User("c", 10);

        // db에서 sort해서 넘어오는 경우도 있고
        // raw 데이터를 서버에서 sort해야 하는 경우도 있다.
        User[] array = {user01, user02, user03};
        System.out.println("기본 데이터");
        System.out.println(Arrays.toString(array));

        System.out.println("Comparble 기본 정렬");
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
