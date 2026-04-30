package Sub11.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Test05 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        ArrayList<Student> student = new ArrayList<>();
        for (int i = 0; i < 4; i++){
            String name = sc.next();
            String department = sc.next();
            int grade = sc.nextInt();
            double average = sc.nextDouble();

            student.add(new Student(name, department, grade, average));
        }

        System.out.println(student);

        HashMap<String, Student> studentMap = new HashMap<>();

        for (Student s : student){
            studentMap.put(s.getName(), s);
        }


        while(true) {
            String name = sc.next();
            if(name.equals("그만")) break;
            System.out.println(studentMap.get(name));
        }
    }
}

class Student {
    String name;
    String department;
    int grade;
    double average;


    public Student(String name, String department, int grade, double average) {
        this.name = name;
        this.department = department;
        this.grade = grade;
        this.average = average;
    }

    String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "이름 : " + name + "\n" +
                "학과 : " + department + "\n" +
                "학번 : " + grade + "\n" +
                "평균학점 : " + average + "\n" +
                "====================" + "\n";
    }
}
