package Sub11.compare;

public class User implements Comparable<User> {
    private String id;
    private int age;

    public User(String id, int age) {
        this.id = id;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(User o) {
        int result = this.id.compareTo(o.id);

        if(result==0){
            return Integer.compare(o.age,this.age);
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
