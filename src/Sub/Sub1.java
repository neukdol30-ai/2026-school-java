package Sub;

import java.util.Scanner;

public class Sub1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] nums = new int[2];

        for(int i = 0; i < nums.length; i++){
            System.out.print("정수 입력 : ");
            nums[i] = sc.nextInt();
        }

        int result = sumResult(nums);
        System.out.println("합계 : " + result);

    }

    static int sumResult(int[] nums){

        int sum = nums[0] + nums[1];
        return sum;

    }

}