package Sub11.Test;

import java.util.HashMap;
import java.util.Scanner;

public class Test07 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        HashMap<String, Double> studentMap = new HashMap<>();
        for(int i = 0; i < 5; i++){
            String name = sc.next();
            double score = sc.nextDouble();

            studentMap.put(name, score);
        }

        System.out.println(studentMap);

        double criteria = sc.nextDouble();

        for(String name : studentMap.keySet()){
           if(studentMap.get(name) >= criteria ){
               System.out.println(name + studentMap.get(name));
           }
        }

    }
}
