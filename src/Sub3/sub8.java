package Sub3;

import java.util.Arrays;
import java.util.Scanner;


public class sub8 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        int[] arr = null;

        if(i < 101 && i >= 1){
            arr = new int[i];
        }else{
            return;
        }

        for(int j = 0; j < arr.length; j++){
            arr[j] = (int)(Math.random()*100+1);
        }

        System.out.println(Arrays.toString(arr));

    }
}
