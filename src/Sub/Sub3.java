package Sub;

import java.util.Scanner;

public class Sub3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int year = sc.nextInt();

        char score = getScore(num);
        String grad = getYear(year);


        System.out.println(score);
        System.out.println(grad);
        System.out.println(getPass(num, grad));
    }

    static char getScore(int num){


        if (num > 90){
            return 'A';
        }
        else if (num > 80){
            return 'B';
        }
        else if (num > 70){
            return 'C';
        }
        else {
            return 'D';
        }
    }

    static String getYear(int year){

        if (year > 15){
            return "high";
        } else{
            return "low";
        }
    }

    static String getPass(int num, String grad){
        if (grad.equals("high")){
            if (num > 80){
                return "pass";
            } else {
                return "false";
            }
        } else {
            if (num > 70){
                return "pass";
            } else {
                return "false";
            }
        }
    }
}
