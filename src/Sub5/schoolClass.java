package Sub5;

public class schoolClass {
    String name = "ERROR";
    int grade = 0;
    int kor = 0;
    int eng = 0;
    int math = 0;

    schoolClass(String name, int grade, int kor, int eng, int math){
        this.name = name;
        this.grade = grade;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        System.out.printf("%s, %d학년%n", name, grade);
        System.out.printf("%d, %d, %d%n", kor, eng, math);
        System.out.printf("%d, %.0f%n", total(), average());
    }

    int total(){
        return kor + eng + math;
    }

    double average(){
        return total() / 3.0;
    }
}
