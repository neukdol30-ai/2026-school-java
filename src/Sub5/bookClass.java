package Sub5;

public class bookClass {
    String author;
    String title;
    int price;
    double tax;

    bookClass(String _title){

    }

    bookClass(String title, String _author, int _price){
        this.title = title;
        author = _author;
        price = _price;
        tax = (double) _price / 100 * 8;
        System.out.printf("%s, %s, %d, %.0f %n", title, author, price, tax);
    }
}
