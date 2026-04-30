package Sub11.compare.Test;

public class Student implements Comparable<Student> {
    private String name;
    private int korean;
    private int english;
    private int score;

    public Student(String name, int korean, int english) {
        this.name = name;
        this.korean = korean;
        this.english = english;
        score = korean + english;
    }

    public String getName() {
        return name;
    }

    public int getScore(){
        return score;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", korean=" + korean + ", english=" + english+
                '}';
    }

    @Override
    public int compareTo(Student o) {
        int result = this.name.compareTo(o.name);

        if(result==0){
            return Integer.compare(o.score,this.score);
        }
        return result;

//        if (this.age > o.age) {
//            return -1;
//        } else if (this.age < o.age) {
//            return 1;
//        } else {
//            return 0;
//        }
    }
}
