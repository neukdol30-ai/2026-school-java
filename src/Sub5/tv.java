package Sub5;

public class tv {
        int size;
        int pixel;
        String brand;
        int volumn;

        void turnOn(){
            System.out.println("turn on");
        }

        void turnOff(){
            System.out.println("turn off");
        }

        void showInfo(){
            System.out.printf("나의 tv 브랜드는 %s, 크기는 %d,화소는 %d, 현재 볼륨은 %d%n",brand, size, pixel, volumn);
        }

        void volumnUp(){
            if(volumn <= 100) {
                volumn = volumn + 10;
            }
            System.out.printf("현재 폴륨은 %d 입니다 %n", volumn);
        }

        void volumnDown(){

            if(volumn >= 0) {
                volumn = volumn - 10;
            }
            System.out.printf("현재 폴륨은 %d 입니다 %n", volumn);
        }
}

