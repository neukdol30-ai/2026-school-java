package Sub8.S3;

public class CarMain01 {
    static void main() {
        Driver driver = new Driver();

        Car sonata = new sonata();
        driver.setCar(sonata);
        driver.driver();

        Car k5 = new K5();
        driver.setCar(k5);
        driver.driver();

        Car k7 = new K7();
        driver.setCar(k7);
        driver.driver();

    }
}
