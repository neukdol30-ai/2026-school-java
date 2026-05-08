package Sub14.Stream.Test;

import java.util.List;
import java.util.stream.Stream;

public class Test03 {
    static void main() {

        List<String> names=
                List.of("kim","lee","park");

        Stream<String> stream= names.stream();

        List<String> result = stream.map(s->s.toUpperCase()).toList();

        System.out.println(result);

    }
}
