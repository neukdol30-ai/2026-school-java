package Sub8.S3;

public class Driver {
    private Car car;
    public void setCar(Car car){
        this.car = car;
    }

    public void driver(){
        System.out.println("운전을시작합니다");
        car.engineOn();
        car.accelerate();
        car.engineOff();
        System.out.println("운전을 종료합니다");
    }
}
