package Sub4;

public class OrderTest {
    static void main() {
        Order user01 = new Order();

        user01.price=30000;
        user01.productName="somthing";
        user01.quantity=5;

        Order user02 = new Order();

        user02.price=2000;
        user02.productName="is";
        user02.quantity=4;

        Order [] orders = new Order[2];
        orders[0]= user01;
        orders[1]= user02;
        for(int i = 0; i < orders.length; i++){
            System.out.println(orders[i].price);
            System.out.println(orders[i].productName);
            System.out.println(orders[i].quantity);
        }
    }
}
