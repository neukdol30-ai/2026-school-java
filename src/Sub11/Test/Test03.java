package Sub11.Test;

import java.util.HashMap;
import java.util.Scanner;

public class Test03 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        HashMap<String,Integer> countryList = new HashMap<>();

        while(true){
            String country = sc.next();
            if (country.equals("stop")){break;}
            int count = sc.nextInt();
            countryList.put(country,count);
        }


        while(true){
            String key = sc.next();
            if (key.equals("stop")){break;}
            System.out.println(countryList.get(key));
        }



    }
}
