package Sub8.S7;

public class Sub3 {
    public String name;
    public static int count;

    public Sub3(String name) {
        this.name = name;
        count++;
    }
}

class CountTest{
    static void main() {
        Sub3 sub31 = new Sub3("data01");
        Sub3 sub32 = new Sub3("data02");
        Sub3 sub33 = new Sub3("data03");
        System.out.println("data01.count = "+sub31.count);
        System.out.println("data01.count = "+sub31.count);
        System.out.println("data01.count = "+sub31.count);
        System.out.println("data01.count = "+sub31.count);
        System.out.println("data02.count = "+sub32.count);
        System.out.println("data03.count = "+sub33.count);
    }
}
