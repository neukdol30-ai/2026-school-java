package Sub11.Test;

import java.util.HashMap;
import java.util.Scanner;

public class Test08 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> nameList = new HashMap<>();

        while(true){
            String name = sc.next();
            if(name.equals("stop"))break;
            int score = sc.nextInt();

            if(nameList.containsKey(name)){
                int current = nameList.get(name);
                nameList.put(name, score + current);
            }else{
            nameList.put(name, score);
            }
            System.out.println(nameList);
        }

    }
}
