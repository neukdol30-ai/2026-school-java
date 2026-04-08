package Sub1;

import java.util.Scanner;

public class sub3b {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("돈의 액수를 입력하시오 : ");
        int money = sc.nextInt();
        int nowMoney = 0;
        int [] won = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};

        for(int i = 0; i < won.length; i++){
            if(money / won[i] == 0){
            }else if(money / won[i] != 0){
                System.out.printf("%d원권의 갯수는%d%n",won[i],(money / won[i]));
                money = money % won[i];
            }
        }
    }
}
