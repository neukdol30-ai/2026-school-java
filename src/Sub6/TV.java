package Sub6;

public class TV {
    String brand;
    int size;
    int volume;
    void turnON(){
        System.out.println("TV전원을 켭니다");
    }
    void turnOFF(){
        System.out.println("TV전원을 끕니다");
    }
    void volumeUp(){
        if(volume < 101){
            volume++;
        }
        System.out.printf("볼륨 : %d%n", volume);
    }
    void volumeDoun(){
        if(volume >= 0){
            volume--;
        }
        System.out.printf("볼륨 : %d%n", volume);
    }

}
