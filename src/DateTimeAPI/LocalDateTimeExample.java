package DateTimeAPI;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime time = LocalDateTime.now();
        LocalTime localTime = time.toLocalTime();
        LocalDate localDate = time.toLocalDate();
        System.out.println("time is : " + time);
        System.out.println("localTime is :" + localTime);
        System.out.println("localDate is " + localDate);
        System.out.println("time added one year is : " + time.plusYears(3));
        System.out.println("time removed tree mounts is : " + time.minusMonths(4));
        LocalDateTime dateTime = LocalDateTime.of(1993 , 10 , 22 ,12,30,13);
        System.out.println("is before birthdate : " + time.isBefore(dateTime));
        System.out.println("is after birthdate : " + time.isAfter(dateTime));
        System.out.println("year of the datetime : " + dateTime.getYear());
        System.out.println("date of year : " + dateTime.getDayOfYear());
    }
}
