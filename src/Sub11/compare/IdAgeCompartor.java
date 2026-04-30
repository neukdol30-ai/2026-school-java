package Sub11.compare;

import java.util.Comparator;

public class IdAgeCompartor implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
        int result = o1.getId().compareTo(o2.getId());

        if(result==0){
            return Integer.compare(o1.getAge(),o2.getAge());
        }
        return result;
    }
}
