package Sub1;

import java.util.Scanner;

public class sub3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("돈의 액수를 입력하시오 : ");
        int money = sc.nextInt();
        int nowMoney;

        System.out.println("오만 원 권" + (money / 50000) + "매");
        nowMoney = money % 50000 ;
        System.out.println("일만 원 권" + (nowMoney / 10000) + "매");
        nowMoney = nowMoney % 10000 ;
        System.out.println("오천 원 권" + (nowMoney / 5000) + "매");
        nowMoney = nowMoney % 5000 ;
        System.out.println("천 원 권" + (nowMoney / 1000) + "매");
        nowMoney = nowMoney % 1000 ;
        System.out.println("오백 원 권" + (nowMoney / 500) + "매");
        nowMoney = nowMoney % 500 ;
        System.out.println("백 원 권" + (nowMoney / 100) + "매");
        nowMoney = nowMoney % 100 ;
        System.out.println("오십 원 권" + (nowMoney / 50) + "매");
        nowMoney = nowMoney % 50 ;
        System.out.println("십 원 권" + (nowMoney / 10) + "매");
        nowMoney = nowMoney % 10 ;
        System.out.println("오 원 권" + (nowMoney / 5) + "매");
        nowMoney = nowMoney % 5 ;
        System.out.println("일 원 권" + (nowMoney) + "매");





    }
}
