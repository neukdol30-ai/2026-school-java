package Sub3;

import java.util.Arrays;
import java.util.Scanner;

public class sub2 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][3];

        for(int i = 0; i < arr.length; i++ ){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(Arrays.deepToString(arr));

        for(int i = 0; i < arr.length; i++ ){
            for(int j = 0; j < arr[i].length; j++){
                System.out.println(arr[i][j]);
            }
        }


    }
}

