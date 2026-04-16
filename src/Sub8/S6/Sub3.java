package Sub8.S6;

public class Sub3 {
    static void main() {

        int sum = 0;
        for(int i = 1; i <= 10; i++){
            sum+=i;
        }
        System.out.println(sum);

        for(int i = 0; i < 2; i++){
            System.out.println(i);
            for (int j = 0; j < 3; j++){
                System.out.println(i+"/"+j);
            }
            System.out.println(i);
        }
    }
}
