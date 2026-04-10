package Sub5;

public class circle {
    int radius; //= 10;
    String name;
    double pie = 3.14;


    circle(int radius){
        radius = 100;
    }

    circle(String _name, int _radius){
        radius = _radius;
        name = _name;
    }

    double getArea(){
        return radius * radius * pie;
    }

}
