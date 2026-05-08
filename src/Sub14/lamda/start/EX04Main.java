package Sub14.lamda.start;

import Sub14.Procedure;

import java.util.Random;

public class EX04Main {
    static void hello(Procedure procedure) {
        long startNs = System.nanoTime();
        procedure.run();
        long EndNs = System.nanoTime();
        System.out.println((EndNs - startNs));
    }


//    static class Dice implements Procedure {
//        @Override
//        public void run() {
//            int random = new Random().nextInt(6) + 1;
//            System.out.println(random);
//        }
//    }
//
//    static class Sum implements Procedure{
//        @Override
//        public void run() {
//            for(int i = 0; i <=3 ; i++){
//                System.out.println(i);
//            }
//        }
//    }

    static void main() {
//        Procedure dice = () -> {
//            int random = new Random().nextInt(6) + 1;
//            System.out.println(random);
//        };
//
//        Procedure sum = () -> {
//            for (int i = 0; i <= 3; i++) {
//                System.out.println(i);
//            }
//        };
//
//        hello(dice);
//        hello(sum);

        hello(() -> {
            int random = new Random().nextInt(6) + 1;
            System.out.println(random);
        });

        hello(() -> {
            for (int i = 0; i <= 3; i++) {
                System.out.println(i);
            }
        });

    }
}
