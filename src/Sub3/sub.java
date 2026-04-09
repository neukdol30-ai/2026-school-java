package Sub3;


import java.util.Arrays;
import java.util.Scanner;

public class sub {
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
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }


    }
}
