package Sub2;

public class sub7 {
    public static void main(String[] args){

        int a = 2;
        int b = 0;

        for(int j = 1; j <= 8; j ++ ) {
            for (int i = 1; i <= 9; i++) {
                b = a * i;
                if(b % 2 == 0) {
                    System.out.printf("%d x %d = %d%n", a, i, b);
                }
            }
            a++;
        }

    }
}
