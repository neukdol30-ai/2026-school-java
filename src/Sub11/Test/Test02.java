package Sub11.Test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test02 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> grade = new ArrayList<>();

        while(grade.size() < 6){
            grade.add(sc.nextLine());
        }

        System.out.println(grade);

        double sum = 0;

        for(int i = 0; i < grade.size(); i++) {
            String grade2 = grade.get(i);
            sum = switch (grade2) {
                case "A" -> sum + 4.0;
                case "B" -> sum + 3.0;
                case "C" -> sum + 2.0;
                case "D" -> sum + 1.0;
                case "F" -> sum + 0;
                default -> sum;
            };
        }

        System.out.println(sum/6);


    }
}
