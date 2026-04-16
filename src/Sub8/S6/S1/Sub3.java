package Sub8.S6.S1;

import java.util.Scanner;

public class Sub3 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int i = 0;
        int sum = 0;
        int aver = 0;
        int count = 0;

        while(true){
            i = sc.nextInt();
            if(i == -1){
                break;
            }
            sum = sum + i;
            count++;

        }

        aver = sum / count;

        System.out.println(sum);
        System.out.println(aver);
    }
}
