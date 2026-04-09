package Sub3;

import java.util.Scanner;

public class sub3 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int stars = sc.nextInt();

        for(int j = stars; j >= 0; j--) {

            for (int i = 0; i <= j; i++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
