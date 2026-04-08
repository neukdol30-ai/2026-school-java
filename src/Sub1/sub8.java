package Sub1;

import java.util.Scanner;

public class sub8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("사칙연산 입력 : ");
        int a = sc.nextInt();
        String op = sc.next();
        int b = sc.nextInt();

        double result = 0;

        if(op.equals("+")){
            result = a + b;
        } else if (op.equals("-")) {
            result = a - b;
        } else if (op.equals("*")) {
            result = a * b;
        } else if (op.equals("/")) {
            if (b == 0){
                System.out.println("나눗셈이 성립되지 않습니다.");
                return;
            }
            result = (double) a / b;
        } else {
            System.out.println("ERROR!!");
            return;
        }

        if (result == (int) result) {
            System.out.println("결과 : " + (int) result);
        } else {
            System.out.println("결과 : " + result);
        }
    }
}
