package Sub1;

import java.util.Scanner;

public class sub4a {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.println("정수 3개 입력");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        System.out.println("중간값 : ");
        if ((a >= b && a <= c) || (a <= b && a >= c)) {
            System.out.print(a);
        } else if ((b >= a && b <= c) || (b <= a && b >= c)) {
            System.out.print(b);
        } else {
            System.out.print(c);
        }

    }
}
