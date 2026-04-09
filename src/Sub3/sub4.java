package Sub3;

import java.util.Scanner;

public class sub4 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        char alpa = sc.next().charAt(0);

        for (char i = alpa; i >= 'a'; i--){
            for (char j = 'a'; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
