package Sub5;

public class CircleTest {
    static void main() {
        circle pizza = new circle("pizza", 5 );
        //pizza.radius = 14;
        pizza.name="pizza";
        double area01 = pizza.getArea();
        System.out.printf("%s의 면적은 %.2f입니다.%n", pizza.name,area01);


    circle donut = new circle(20);
    donut.radius = 5;
    donut.name="donut";
    double area02 = donut.getArea();
        System.out.printf("%s의 면적은 %.2f입니다.%n", donut.name,area02);
}
}
