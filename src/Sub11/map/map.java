package Sub11.map;

import java.util.*;


public class map {
    static void main() {
        HashMap<String,String> map = new LinkedHashMap<>();
        map.put("baby","아기");
        map.put("apple", "사과");
        map.put("apple", "능금");
        map.put("mellon", "멜론");
        map.put("orange", "오렌지");

//        System.out.println(map.get("apple"));
//        System.out.println(map.get("baby"));
//        System.out.println(map.get("mellon"));
//        System.out.println(map.get("orange"));
//        System.out.println();

        for(String key : map.keySet()){
            System.out.println(key);
        }

        System.out.println();

        Iterator<String> iterator = map.keySet().iterator();
        while(iterator.hasNext()){
            System.out.println(map.get(iterator.next()));
        }

        System.out.println();

        for(Map.Entry<String,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+"/"+entry.getValue());
        }

        System.out.println();

        Iterator<Map.Entry<String,String>> entryIterator = map.entrySet().iterator();
        while(entryIterator.hasNext()){
            Map.Entry<String,String> entry = entryIterator.next();
           //System.out.println(entryIterator.next().getKey()+"/"+entryIterator.next().getValue());
            System.out.println(entry.getKey()+"/"+entry.getValue());
        }


    }
}
