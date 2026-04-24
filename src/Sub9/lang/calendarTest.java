package Sub9.lang;

public class calendarTest {
    static void main() {

        calendar C1 = new calendar(13,5,2024);
        calendar C2 = C1.changeCalendar(14, 6, 2025);

        System.out.println(C1);
        System.out.println(C2);

    }
}
