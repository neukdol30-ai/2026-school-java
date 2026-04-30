package Sub11.compare.Test;

import java.util.Arrays;
import java.util.Comparator;

public class Compare08 {
    static void main() {

        Student [] students= {
                new Student("kim",80,90),
                new Student("lee",90,70),
                new Student("park",85,85),
                new Student("choi",90,90)
        };

        Arrays.sort(students, new Comparator08());
        System.out.println(Arrays.toString(students));

    }
}

class Comparator08 implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {

        int result=Integer.compare(o2.getScore(), o1.getScore());

        if(result==0) {
            return o1.getName().compareTo(o2.getName());
        }
        return result;

    }
}
