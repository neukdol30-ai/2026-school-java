package Sub8.S6;

public class Sub1 {
    static void main() {

        int speed = 2;

        if (speed <= 1){
            System.out.println("street");
        }else if(speed <= 10){
            System.out.println("cycle");
        }else if(speed <= 100){
            System.out.println("car");
        }else{
            System.out.println("plain");
        }

        int a = 10;
        int b = 20;
        int big;

        big = a > b ? a : b;
        System.out.println(big);

    }
}
