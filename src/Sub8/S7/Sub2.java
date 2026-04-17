package Sub8.S7;

public class Sub2 {
    static void main() {
        ProductOrder menu01 = new ProductOrder();
        menu01.productName = "두부";
        menu01.price = 2000;
        menu01.quantity = 2;

        ProductOrder menu02 = new ProductOrder();
        menu02.productName = "김치";
        menu02.price = 5000;
        menu02.quantity = 1;

        ProductOrder menu03 = new ProductOrder();
        menu03.productName = "콜라";
        menu03.price = 1500;
        menu03.quantity = 2;

        ProductOrder[]orders = {menu01, menu02, menu03};
        int i = 0;

        for(ProductOrder order : orders){
            System.out.printf("상품명 : "+order.productName);
            System.out.print("  가격 : "+order.quantity);
            System.out.print("  수량  : "+order.price);
            System.out.println();
            i = order.price * order.quantity + i;
        }

        System.out.println("총 결제 금액 : " + i);


    }
}

class ProductOrder{
    String productName;
    int price;
    int quantity;
}
