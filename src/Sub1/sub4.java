package Sub1;

import java.util.Scanner;
import java.util.Arrays;

public class sub4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int []nums = new int[3];

        System.out.println("정수 3개 입력");

        for (int i = 0; i < nums.length; i++){
            System.out.println("정수" + (i+1) + "번");
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);
        System.out.println(nums[1]);

    }
}
