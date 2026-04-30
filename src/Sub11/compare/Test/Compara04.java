package Sub11.compare.Test;
import Sub11.compare.User;

import java.util.Arrays;
import java.util.Comparator;

public class Compara04 {
    static void main() {

        User[] users = {
                new User("kim", 30),
                new User("lee", 20),
                new User("park", 25)
        };

        Arrays.sort(users, new AbsComparator04());
        System.out.println(Arrays.toString(users));

    }
}

class AbsComparator04 implements Comparator<User>{
    @Override
    public int compare(User o1, User o2) {

        return Integer.compare(o1.getAge(),o2.getAge());
    }
}
