package Sub11.compare.Test;

public class Order implements Comparable<Order>{
    private String name;
    private int price;
    private int quantity;
    private int total;

    public Order(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        total = price * quantity;

    }

    public String getName(){
        return name;
    }

    public int getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }

    public int getTotal(){
        return total;
    }

    @Override
    public String toString() {
        return "Order[" +
                "name = '" + name + '\'' +
                ", price = " + price +
                ", quantity = " + quantity +
                ']' + "\n";
    }

    @Override
    public int compareTo(Order o) {
        int result1 = Integer.compare(o.total,this.total);
        int result2 = Integer.compare(o.quantity, this.quantity);

        if (result1 != 0){
            return result1;
        }

        if(result2 !=0){
            return result2;
        }

        return this.name.compareTo(o.name);
    }
}
