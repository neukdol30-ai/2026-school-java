package Sub9.lang;

import java.util.Random;

public class Test {
    static void main() {

        int sum = 0;
        String[]arr= {"10","20","30","40"};
        for(String arrs:arr){
            sum = sum + Integer.parseInt(arrs);
        }
        System.out.println(sum);

        String[]arr02= {"87","15","92","43","100","29"};
        int a = Integer.parseInt(arr02[0]);
        int b = 0;
        for(int i = 0; i < arr02.length; i++){
            if(a < Integer.parseInt(arr02[i])){
                a = Integer.parseInt(arr02[i]);
            }
        }
        System.out.println(a);

        String str="89.75";
        System.out.println(Math.round(Double.parseDouble(str)));

        System.out.println();

        int num=-16;
        System.out.println(Math.abs(num));
        int num2 = Math.abs(num);
        System.out.println(Math.pow(num2,2));
        System.out.println(Math.sqrt(num2));

        System.out.println();

        double num3=3.141592;
        System.out.println((Math.round(num3*100))/100.0);

        Random random = new Random();
        for(int i = 0; i < 11; i++){
            System.out.print(random.nextInt(46) + " ");
        }

        System.out.println();


    }
}
