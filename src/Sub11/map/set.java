package Sub11.map;

import java.util.*;

public class set {
    static void main() {

        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Spring");
        set.add("Java");
        set.add("Oracle");
        System.out.println(set);
        System.out.println();


        for(String str : set){
            System.out.print(str + "/");
        }
        System.out.println();
        System.out.println();

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println();

        List<Integer> lust = Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3,4);
        Set<Integer> integerSet = new HashSet<>(lust);
        System.out.println(integerSet);
        System.out.println();

        Random random = new Random();
        Set<Integer> lotto = new HashSet<>();
//        for(int i = 0; i < 6; i++){
//            lotto.add(random.nextInt(45)+1);
//        }
        while(lotto.size() < 6){
            lotto.add(random.nextInt(45)+1);
        }
        System.out.println(lotto);
        System.out.println();




    }
}
