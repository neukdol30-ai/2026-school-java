package Sub;

import java.util.Scanner;

public class Sub4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("-메뉴를 고르시오-");
        System.out.println("1. 국밥");
        System.out.println("2. 라면");
        System.out.println("3. 덮밥");
        System.out.println("4. 돈까스");
        System.out.println("5. 김밥");
        System.out.println("--------------------");
        System.out.print("메뉴 선택 : ");
        int sec = sc.nextInt();

        switch(sec){

            case 1:
                System.out.print("가격 10000원");
                break;
            case 2:
                System.out.print("가격 5000");
                break;

            case 3:
                System.out.print("가격 7500");
                break;

            case 4:
                System.out.print("가격 13000");
                break;

            case 5:
                System.out.print("가격 3500");
                break;
            default:
                System.out.print("없는 메뉴");

        }
    }
}
