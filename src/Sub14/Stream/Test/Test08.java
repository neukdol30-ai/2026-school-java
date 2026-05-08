package Sub14.Stream.Test;

import java.util.List;
import java.util.stream.Stream;

public class Test08 {
    static void main() {

        List<String>words=
                List.of("apple","banana","kiwi","grape","avocado");

        Stream<String> stream = words.stream();

        long result = stream.filter(s->s.contains("a")).count();


        System.out.println(result);


    }
}
