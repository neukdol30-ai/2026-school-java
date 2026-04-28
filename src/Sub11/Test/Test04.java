package Sub11.Test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test04 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> rainFall = new ArrayList<>();
        //int count = 0;
        int sum = 0;

        while(true){
            int input = sc.nextInt();
            if (input == 0){break;}
            rainFall.add(input);
            //count++;
            System.out.println(rainFall);
            sum = sum + input;
            System.out.println((double)sum / rainFall.size());

        }
    }
}
