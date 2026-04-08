package Sub1;

import java.util.Scanner;

public class sub2a {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 10~99사이중 하나를 입력하시요 : ");
        int num = sc.nextInt();

        if(check(num)){
            System.out.println("ERROR!! 범위에서 벗어났습니다");
        }else {
            if (same(num)) {
                System.out.println("Yes! 10의 자리와 1의 자리가 같습니다");
            } else {
                System.out.println("No! 10의 자리와 1의 자리가 같지 않습니다");
            }
        }
    }

    static boolean check(int num){
        return num > 99 || num < 10;
    }

    static boolean same(int num){
        int tenNum = num / 10;
        int oneNum = num % 10;
        return tenNum == oneNum;
    }
}
