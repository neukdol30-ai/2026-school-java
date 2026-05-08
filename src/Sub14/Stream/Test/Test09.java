package Sub14.Stream.Test;

import java.util.List;
import java.util.stream.Stream;

public class Test09 {
    static void main() {

        List<String>names=
                List.of("Kim","Lee","Park","Choi");;

        Stream<String> stream = names.stream();

        List<String> result = stream.map(s->s.substring(0,1)).toList();


        System.out.println(result);


    }
}
