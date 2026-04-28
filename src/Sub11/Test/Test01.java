package Sub11.Test;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test01 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> nums = new ArrayList<>();

        //while (true){
        //    nums.add(sc.nextInt());
        //    if(nums.contains(-1)){
        //        break;
        //    }
        //}

        while (true) {
            try {
                int num = sc.nextInt();
                if (num == -1) {
                    break;
                }
                nums.add(num);
            }catch (InputMismatchException e){
                sc.next();
            }
        }

        System.out.println(nums);

        int max = nums.get(0);

        for (int i = 1; i < nums.size(); i++){
            if (nums.get(i) > max){
                max = nums.get(i);
            }
        }
        System.out.println(max);



    }
}
