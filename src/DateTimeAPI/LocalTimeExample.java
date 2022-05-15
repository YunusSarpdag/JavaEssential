package DateTimeAPI;

import java.time.LocalTime;

public class LocalTimeExample {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        int hour = localTime.getHour();
        System.out.println("hour :" +hour);
        int minute = localTime.getMinute();
        System.out.println("minute : " +minute);
        int second = localTime.getSecond();
        System.out.println("second : " + second);

        LocalTime parsedLocalTime = LocalTime.parse("23:30:12");
        System.out.println("parsedLocalTime : " + parsedLocalTime);
    }
}
