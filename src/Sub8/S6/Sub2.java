package Sub8.S6;

public class Sub2 {
    static void main() {
        int count = 0;


        count++;
        System.out.println(count);

        long start = System.nanoTime();

        while(count<1000){
            count++;
            System.out.println(count);
        }
        long end = System.nanoTime();

        long diff = end - start;

        System.out.println(diff);
        System.out.println(diff/1000000);

    }
}
