package Sub3;

import java.util.Arrays;

public class sub7 {
    static void main() {

        int [] arr = new int[10];
        double sum = 0;

        for(int j = 0; j < arr.length; j++){
            int i = (int)(Math.random()*10+1);
            arr[j] = i;
        }

        System.out.println(Arrays.toString(arr));

        for(int j = 0; j < arr.length; j++){
            sum = sum + arr[j];
        }

        System.out.println((sum / arr.length ));

    }
}
