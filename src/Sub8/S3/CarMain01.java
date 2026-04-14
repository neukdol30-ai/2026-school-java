package Sub8.S3;

public class CarMain01 {
    static void main() {

        Driver driver = new Driver();
        sonata sonata = new sonata();
        driver.setsonatacar(sonata);
        driver.drive();

        K5 k5 = new K5();
        driver.setsonatacar(null);
        driver.drive();
    }
}
