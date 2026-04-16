package Sub8.S6;

import java.util.Scanner;

public class Sub4 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int [] array = new int[5];

        for(int i = 0; i<array.length;i++){
            array[i]=sc.nextInt();
        }

        for(int i = array.length-1; i>-1;i--){
            System.out.print(array[i]);
        }

    }



}
