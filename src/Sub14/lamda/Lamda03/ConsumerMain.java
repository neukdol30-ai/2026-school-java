package Sub14.lamda.Lamda03;

import java.util.function.Consumer;

public class ConsumerMain {
    static void main() {
        Consumer<String> consumer01 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        consumer01.accept("hello01");

        Consumer<String> consumer02 = s-> System.out.println(s);
        consumer02.accept("hello02");
    }
}
