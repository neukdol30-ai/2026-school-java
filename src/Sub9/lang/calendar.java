package Sub9.lang;

public class calendar {
    private final int day;
    private final int month;
    private final int year;

    public calendar(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }


    public calendar changeCalendar (int day, int month, int year) {
        return new calendar(day, month, year);
    }

    @Override
    public String toString() {
        return year + "년 " + month + "월 " + day + "일";
    }
}
