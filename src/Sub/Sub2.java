package Sub;

import java.util.Scanner;

public class Sub2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("초 입력 : ");
        int totalSeconds = sc.nextInt();

        TimeResult time = convertTime(totalSeconds);

        System.out.println("시 : " + time.hour);
        System.out.println("분 : " + time.minute);
        System.out.println("초 : " + time.second);
    }

    static TimeResult convertTime(int totalSeconds){
        int hour = totalSeconds / 3600;
        int minute = totalSeconds / 60 % 60;
        int second = totalSeconds % 60;

        return new TimeResult(hour, minute, second);
    }
}

class TimeResult {
    int hour;
    int minute;
    int second;

    TimeResult(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
}
