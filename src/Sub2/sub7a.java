package Sub2;

public class sub7a {
    public static void main(String[] args) {
        for (int a = 2; a <= 9; a++) {
            for (int i = 1; i <= 9; i++) {
                int b = a * i;
                if (b % 2 == 0) {
                    System.out.printf("%d x %d = %d%n", a, i, b);
                }
            }
        }
    }
}