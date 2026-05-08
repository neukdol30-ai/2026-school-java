package Sub14.Stream.Test;

import java.util.List;
import java.util.stream.Stream;

public class Test02 {
    static void main() {
        List<String> words=
                List.of("apple","kiwi","banana","fig","grape");

        Stream<String> stream = words.stream();

        List<String> result =
                stream.filter(s->s.length()>=5).toList();

        System.out.println(result);
    }
}
