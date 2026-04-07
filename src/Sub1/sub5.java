package Sub1;

import java.util.Scanner;

public class sub5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("정수 3개 입력 >> ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a + b > c && a + c > b && b + c > a ){
            System.out.println("삼각형이 됩니다");
        }else{
            System.out.println("삼각형이 안됩니다");
        }

    }
}
