package Sub14.lamda.start;

import java.util.Random;

public class EX02Main {
    static void helloDice(){
        long startNs = System.nanoTime();
        for(int i = 0; i <=3 ; i++){
            System.out.println(i);
        }
        int random = new Random().nextInt(6)+1;
        System.out.println(random);
        long EndNs = System.nanoTime();
        System.out.println((EndNs - startNs));
    }

    static void helloSum(){
        long startNs = System.nanoTime();
        for(int i = 0; i <=3 ; i++){
            System.out.println(i);
        }
        int random = new Random().nextInt(6)+1;
        System.out.println(random);
        long EndNs = System.nanoTime();
        System.out.println((EndNs - startNs));
    }


    static void main() {
        helloDice();
        helloSum();
    }
}
