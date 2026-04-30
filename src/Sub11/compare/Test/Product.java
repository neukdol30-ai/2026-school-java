package Sub11.compare.Test;

public class Product implements Comparable<Product> {
    private String name;
    private int price;

    public Product(String id, int price) {
        this.name = id;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        int result = this.name.compareTo(o.name);

        if(result==0){
            return Integer.compare(o.price,this.price);
        }
        return result;

//        if (this.age > o.age) {
//            return -1;
//        } else if (this.age < o.age) {
//            return 1;
//        } else {
//            return 0;
//        }
    }
}
