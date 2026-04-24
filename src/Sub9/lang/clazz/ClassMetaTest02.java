package Sub9.lang.clazz;

public class ClassMetaTest02 {
    static void main() throws Exception {
        Class helloClass = Class.forName("Sub9.lang.clazz.hello");
        hello helloz = (hello) helloClass.getDeclaredConstructor().newInstance();
        String result = helloz.hello();
        System.out.println(result);

    }
}
