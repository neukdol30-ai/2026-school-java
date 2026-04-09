package Sub3;

import java.util.Arrays;

public class snail {
    static void main() {

        int size = 5;
        int [][] snail = new int [size][size];
        int num = 1;

        int top=0;
        int bottom = size-1;
        int left = 0;
        int right = size -1;

        while (num<=size*size) {
            for(int i = left; i <= right; i++){
                snail[top][i] = num++;
            }
            top++;
            for(int i = top; i <= bottom; i++){
                snail[i][right] = num++;
            }
            right--;
            for(int i = right; i >= left; i--){
                snail[bottom][i] = num++;
            }
            bottom--;
            for(int i = bottom; i >= top; i--){
                snail[i][left] = num++;
            }
            left++;
        }




    }
}
