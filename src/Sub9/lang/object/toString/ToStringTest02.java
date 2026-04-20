package Sub9.lang.object.toString;

public class ToStringTest02 {
    static void main() {
        Car car = new Car("기아");
        Dog dog = new Dog("골리", 13);

        System.out.println(car.toString());
        System.out.println(dog.toString());

        ObjectPrinter.print(car);
        ObjectPrinter.print(dog);


    }
}
