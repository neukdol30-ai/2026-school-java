package Sub7.S4;

public class Manager extends employee{

    int bonus;

    @Override
    void showSalary() {
        System.out.println(bonus+salary);
    }
}
