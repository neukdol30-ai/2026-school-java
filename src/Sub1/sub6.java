package Sub1;

import java.util.Scanner;

public class sub6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println(" 1~99 사이의 정수를 입력하시오 >>");
        int num = sc.nextInt();
        int ten = num / 10;
        int one = num % 10;


        if (one == 3 || ten == 3) {
            System.out.print("박수");
            if (one == 3 && ten == 3) {
                System.out.println("짝짝");
            } else {
                System.out.println("짝");
            }
        }else if(num > 99 || num < 1){
            System.out.println("범위 벗어남!");

        }else{
            System.out.println(num);
        }
    }
}
