package Sub14.Stream.opation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreateStreamMain {
    static void main() {
        List<String> list = List.of("a", "b", "c");
        Stream<String > stream1 = list.stream();
        stream1.forEach(System.out::println);

        String[] arr = {"a", "b", "c"};
        Stream<String> stream2 = Arrays.stream(arr);
        stream2.forEach(System.out::println);

        Stream<String> stream3 = Stream.of("a", "b", "c");
        stream3.forEach(System.out::println);

        Stream<Integer> stream4 = Stream.iterate(1,n->n+1);
        stream4.limit(10).forEach(System.out::println);

        Stream<Double> stream5 = Stream.generate(Math::random);
        stream5.limit(10).forEach(System.out::println);

    }
}
