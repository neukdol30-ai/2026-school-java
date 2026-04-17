package Sub8.S7;

public class Sub1 {
    static void main() {
        Student student01 = new Student();
        student01.name = "sjef";
        student01.age = 34;
        student01.grade = 132;

        Student student02 = new Student();
        student02.name = "asdf";
        student02.age = 13;
        student02.grade = 42;

        Student student03 = new Student();
        student03.name = "wor";
        student03.age = 31;
        student03.grade = 45;

        Student [] students = new Student[3];
        students[0] = student01;
        students[1] = student02;
        students[2] = student03;
        for(Student student:students){
            System.out.println(student.name);
            System.out.println(student.age);
            System.out.println(student.grade);
            System.out.println();
        }
    }
}

class Student {
    String name;
    int age;
    int grade;
}

