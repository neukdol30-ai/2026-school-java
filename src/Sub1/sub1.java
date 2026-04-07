package Sub1;

import java.util.Scanner;

public class sub1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("원화를 입력하세요 : ");
        int won = sc.nextInt();
        double dor;

        dor = won / 1500;

        //System.out.println(won + "원은 달러 약 $" + dor + "입니다");
        System.out.printf("%d는 $%.2f 입니다.", won, dor);

    }
}
