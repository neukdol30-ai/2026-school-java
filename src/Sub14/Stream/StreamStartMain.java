package Sub14.Stream;

import java.util.List;
import java.util.stream.Stream;

public class StreamStartMain {
    static void main() {
    //Stream
    List<String> names = List.of("Apple","Banana","Berry","Tomato");
    Stream<String> stream = names.stream();
    List<String> result = stream
            .filter(s -> s.startsWith("B"))
            .map(s->s.toUpperCase())
            .toList();
    System.out.println(result);
    for (String s : result){
        System.out.println(s);
    }
    //Immutable
    names.stream()
            .filter(s->s.startsWith("B"))
            .map(s->s.toUpperCase())
            .forEach(s-> System.out.println(s));
    names.stream()
            .filter(s->s.startsWith("B"))
            .map(String::toUpperCase)
            .forEach(System.out::println);

    }
}

