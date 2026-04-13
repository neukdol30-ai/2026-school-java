package Sub7.S5;

public class Circle extends shape {

    int radius;

    @Override
    void area() {
        System.out.println(radius*radius*3.14);
    }
}
