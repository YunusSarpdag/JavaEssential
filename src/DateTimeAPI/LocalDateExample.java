package DateTimeAPI;

import java.beans.ParameterDescriptor;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(1993 ,10 , 22);
        System.out.println("data is : " + localDate);
        int year = localDate.getYear();
        System.out.println("year is : " + year);
        Month month = localDate.getMonth();
        System.out.println("month is : " + month);
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        System.out.println("day of week : " + dayOfWeek);
        int lengthOfMount = localDate.lengthOfMonth();
        System.out.println("length of month : " + lengthOfMount);
        boolean isLeap = localDate.isLeapYear();
        System.out.println("is leap year : " + isLeap);

        int year1 = localDate.get(ChronoField.YEAR);
        System.out.println("year is : " + year1);

        LocalDate now = LocalDate.now();
        System.out.println("now is : " + now);

        LocalDate parsedDate = LocalDate.parse("1993-10-22");
        System.out.println("parsed date id : "+ parsedDate);


    }
}
