package Sub11.compare.Test;

import Sub11.compare.User;

import java.util.Arrays;
import java.util.Comparator;

public class Compara06 {
    static void main() {
        User[] users = {
                new User("kim", 30),
                new User("lee", 20),
                new User("kim", 22),
                new User("park", 25)
        };

        Arrays.sort(users, new Comparator06());
        System.out.println(Arrays.toString(users));

    }
}

class Comparator06 implements Comparator<User>{
    @Override
    public int compare(User o1, User o2) {

        int result=Integer.compare(o1.getAge(),o2.getAge());

        if(result==0) {
            return o1.getId().compareTo(o2.getId());
        }
        return result;
    }
}
