package Sub1;

import java.util.Scanner;

public class sub9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("체중입력 : ");
        double kg = sc.nextDouble();
        System.out.print("키 입력 : ");
        double cm = sc.nextDouble();
        double BMI = kg / ((cm * cm)/10000.0);

        System.out.println("현재 체질량 지수 : "+BMI);

        if(BMI < 20){
            System.out.println("저체중");
        }else if(BMI < 25){
            System.out.println("정상체중");
        }else if(BMI < 30){
            System.out.println("과체중");
        } else {
            System.out.println("비만");
        }
    }
}
