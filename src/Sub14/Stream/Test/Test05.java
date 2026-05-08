package Sub14.Stream.Test;

import java.util.List;
import java.util.stream.Stream;

public class Test05 {
    static void main() {

        List<String>names=
                List.of("Kim","Lee","Park","Choi");

        Stream<String> stream = names.stream();

        List<Integer> result = stream.map(String::length).toList();

        System.out.println(result);
    }
}
