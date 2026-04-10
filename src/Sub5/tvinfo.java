package Sub5;



public class tvinfo {
    static void main() {
        tv myTv = new tv();
        myTv.brand="sumsung";
        myTv.pixel=1440;
        myTv.size=16;

        myTv.turnOn();
        myTv.showInfo();
        myTv.volumnUp();
        myTv.volumnUp();
        myTv.volumnUp();
        myTv.volumnDown();
        myTv.volumnDown();
        myTv.turnOff();
    }
}
