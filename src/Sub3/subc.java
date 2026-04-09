package Sub3;

import java.util.Arrays;

public class subc {
    static void main() {

        int[][] snail = new int [5][5];
        int[] test= new int[5];

        for(int i = 1; i < 6; i++ ){
            snail[0][i-1] = i;
            for (int j = 1; j < 6; j++){
                snail[i-1][4] = i+4;
            }
            for(int k = 6; k >= 2; k--){
                test[7-k] = k;
            }
        }

        System.out.println(Arrays.deepToString(snail));
        System.out.println(Arrays.toString(test));
    }
}


// 11 12 13 14 15
// 21 22 23 24 25
// 31 32 33 34 35
// 41 42 43 44 45
// 51 52 53 54 55

// 1 12345
// 12345 5
// 5432 1
// 2 1234
// 234 4
// 4 234
// 34 2
//33