package Sub2;

import java.util.Scanner;

public class sub10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int [] scores = new int[6];

        for (int i = 0; i < scores.length; i++ ){
            System.out.print((i+1) + "번 점수 입력 : ");
            scores[i]=sc.nextInt();
        }

        System.out.println("----------------------------------");

        int count=0;

        for (int i = 0; i < scores.length; i++ ){
            if(scores[i] >= 60){
                System.out.println(scores[i]);
                count++;
            }
        }

        System.out.printf("합격자 수 : %d명", count);

    }
}
