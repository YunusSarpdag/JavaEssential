package DateTimeAPI;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("DD/MMM/YYYY" , Locale.JAPAN);
        System.out.println(date.format(formatter));
    }
}
