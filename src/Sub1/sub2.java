package Sub1;

import java.util.Scanner;

public class sub2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 10~99사이중 하나를 입력하시요 : ");
        int num = sc.nextInt();
        int tenNum;
        int oneNum;

        if(num > 99){
            System.out.println("ERROR!! 범위에서 벗어났습니다");
        }else if(num < 10) {
            System.out.println("ERROR!! 정수 미달입니다!");
        }else {
            tenNum = num / 10;
            oneNum = num % 10;
            if (tenNum == oneNum) {
                System.out.println("Yes! 10의 자리와 1의 자리가 같습니다");
            } else {
                System.out.println("No! 10의 자리와 1의 자리가 같지 않습니다");
            }
        }




    }
}
