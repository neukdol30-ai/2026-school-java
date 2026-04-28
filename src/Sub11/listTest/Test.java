package Sub11.listTest;

import java.util.ArrayList;

public class Test {
    static void main() {

        ArrayList<String> num1 = new ArrayList<>();
        num1.add("Java");
        num1.add("Spring");
        num1.add("Boot");
       System.out.println(num1);
        System.out.println();

        ArrayList<String> num2 = new ArrayList<>();
        num2.add("A");
        num2.add("B");
        num2.add("C");
        num2.add(1,"X");
        System.out.println(num2);
        System.out.println();

        ArrayList<String> num3 = new ArrayList<>();
        num3.add("A");
        num3.add("B");
        num3.add("C");
        num3.set(0,"Z");
        System.out.println(num3);
        System.out.println();

        ArrayList<String> num4 = new ArrayList<>();
        num4.add("Java");
        num4.add("Spring");
        num4.add("Boot");
        System.out.println(num4.contains("Java"));
        System.out.println();

        ArrayList<String> num5 = new ArrayList<>();
        num5.add("A");
        num5.add("B");
        num5.add("C");
        num5.add("B");
        System.out.println(num5.indexOf("B"));
        System.out.println(num5.lastIndexOf("B"));
        System.out.println();

        ArrayList<String> num6 = new ArrayList<>();
        num6.add("A");
        num6.add("B");
        num6.add("C");
        num6.add("D");
        System.out.println(num6);
        num6.remove(2);
        System.out.println(num6);
        System.out.println();

        ArrayList<String> num7 = new ArrayList<>();
        num7.add("A");
        num7.add("B");
        num7.add("C");
        num7.add("B");
        System.out.println(num7);
        num7.remove("B");
        System.out.println(num7);
        System.out.println();

        ArrayList<Integer> num8 = new ArrayList<>();
        for(int i = 1; i <= 10; i++){
            num8.add(i);
        }
        System.out.println(num8);
        for (int i = num8.size() -1; i >= 0; i--){
            if((num8.get(i) % 2) == 0){
                num8.remove(i);
            }
        }
        System.out.println(num8);
        System.out.println();

        ArrayList<Integer> num9 = new ArrayList<>();
        int sum = 0;
        num9.add(10);
        num9.add(20);
        num9.add(30);
        num9.add(40);
        for(int i = 0; i <num9.size() ; i++){
            sum= sum+num9.get(i);
        }
        System.out.println(sum);
        System.out.println();

        ArrayList<String> num10 = new ArrayList<>();
        ArrayList<String> num10To10 = new ArrayList<>();
        num10.add("A");
        num10.add("B");
        num10.add("A");
        num10.add("C");
        num10.add("B");
        for (int i = 0; i < num10.size(); i++){
            if(!num10To10.contains(num10.get(i))){
                num10To10.add(num10.get(i));
            }
        }
        System.out.println(num10);
        System.out.println(num10To10);


    }
}
