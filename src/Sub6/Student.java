package Sub6;

public class Student {
    String name;
    int kor;
    int eng;
    int math;

    int getTotal(){
        return kor + eng + math;
    }

    double getAverage(){
        return getTotal() / 3.0;
    }
}
