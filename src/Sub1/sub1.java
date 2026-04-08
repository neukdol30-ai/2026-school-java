package Sub1;

import java.util.Scanner;

public class sub1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("원화를 입력하세요 : ");
        int won = sc.nextInt();
        double dor;

        System.out.printf("%d는 $%.2f 입니다.", won, dor(won));
    }



    static double dor(int won){

        //double dor = (double) won / 1500;
        //return dor;
        return (double) won / 1500;
    }
}
