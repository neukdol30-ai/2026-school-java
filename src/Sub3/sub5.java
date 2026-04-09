package Sub3;

import java.util.Scanner;

public class sub5 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int [] a = new int[10];

        for (int i = 0; i < a.length; i++ ){
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < a.length; i++ ){
            if(a[i] % 3 == 0){
                System.out.println(a[i]);
            }
        }
    }
}

