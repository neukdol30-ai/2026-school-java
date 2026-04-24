package Sub9.lang.Math;

import java.util.Random;

public class MathTest {
    static void main() {
        System.out.println(Math.max(10,20));
        System.out.println(Math.min(10,20));
        System.out.println(Math.abs(-10));
        System.out.println(Math.ceil(2.1));
        System.out.println(Math.floor(2.9));
        System.out.println(Math.round(2.5));
        System.out.println(Math.sqrt(4));
        System.out.println(Math.random());

        System.out.println();

        Random random = new Random();
        System.out.println(random.nextInt());
        System.out.println(random.nextInt(10));
        System.out.println(random.nextDouble());
        System.out.println(random.nextBoolean());

    }
}
