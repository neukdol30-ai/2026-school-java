package Sub6;

public class Car {
    String brand;
    int speed = 0;

    //Car(){
    //    speed=0;
    //}

    void showInfo(){
        System.out.printf("나의 차는 %s이고, 현재속도는%d이다.%n", brand, speed);
    }

    void accelerate(){

        for(int i = 0; i < 4; i++){
            speed = speed + 10;
            System.out.println(speed);
        }

    }
}
