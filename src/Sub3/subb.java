package Sub3;

import java.util.Scanner;

public class subb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][]arr = new int[3][3];
        int [] sum = new int[arr.length];

        for(int i = 0; i < arr.length; i++ ){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
    }
}
