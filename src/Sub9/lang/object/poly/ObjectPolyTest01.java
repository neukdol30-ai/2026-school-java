package Sub9.lang.object.poly;

public class ObjectPolyTest01 {
    static void main() {
        Dog dog = new Dog();
        Car car = new Car();
        action(car);
        action(dog);
    }

    static void action(Object object){
        if(object instanceof Dog dog) {
            dog.move();
        } else if (object instanceof Car car) {
            car.move();
        }
    }
}
