package Sub14.Stream.Test;

import java.util.List;
import java.util.stream.Stream;

public class Test06 {
    static void main() {

        List<String>words=
                List.of("Apple","Banana","Berry","Tomato");

        Stream<String> stream = words.stream();

        List<String> result = stream.filter(s->s.startsWith("B")).map(String::toUpperCase).toList();

        System.out.println(result);


    }
}
