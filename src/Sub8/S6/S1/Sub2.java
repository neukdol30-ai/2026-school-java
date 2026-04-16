package Sub8.S6.S1;

import java.util.Scanner;

public class Sub2 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        String food = sc.next();
        int Price = 0;

        while(!food.equals("종료")) {
            if (food.equals("피자")) {
                Price = 20000;
                System.out.println(Price);

            } else if (food.equals("버거")) {
                Price = 8000;
                System.out.println(Price);

            } else if (food.equals("파스타")) {
                Price = 12000;
                System.out.println(Price);

            } else if (food.equals("타코")) {
                Price = 9000;
                System.out.println(Price);
            } else {
                System.out.println("정보 없음");
            }

            int num = sc.nextInt();
            System.out.println(num + "/" + Price * num);

            food = sc.next();
        }





    }
}
