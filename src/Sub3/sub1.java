package Sub3;

public class sub1 {
    static void main() {

        int sum1 = 0;
        int sum2 = 0;

        for(int i = 0; i <= 100; i++){
            if(i % 2 == 0){
            sum1= sum1 + i;
            }
        }

        System.out.println(sum1);

        int j = 0;

        while(j <= 100){
            if(j % 2 == 0) {
                sum2 = sum2 + j;
            }
            j++;
        }

        System.out.println(sum2);
    }
}
