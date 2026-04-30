package Sub11.compare.Test;

import java.util.Arrays;
import java.util.Comparator;

public class Compare07 {
    static void main() {

        Product [] products= {
                new Product("A",3000),
                new Product("B",1000),
                new Product("C",2000),
                new Product("D",1000)
        };

        Arrays.sort(products , new Comparator07());
        System.out.println(Arrays.toString(products));

    }
}

class Comparator07 implements Comparator<Product>{
    @Override
    public int compare(Product o1, Product o2) {
        int result=Integer.compare(o1.getPrice(),o2.getPrice());

        if(result==0) {
            return o1.getName().compareTo(o2.getName());
        }
        return result;
    }
}
