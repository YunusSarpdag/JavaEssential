package DateTimeAPI;

import jdk.jshell.execution.LoaderDelegate;

import java.time.*;

public class InstantExample {
    public static void main(String[] args) {
        Instant instant = Instant.ofEpochSecond(4,1);
        System.out.println("instant is : " + instant);
        Instant now = Instant.now();
        Duration duration = Duration.between(instant , now);
        System.out.println("duration is : " + duration);

        LocalTime time = LocalTime.of(12,30,30);
        LocalTime localTime = LocalTime.now();
        Duration duration1 = Duration.between(time , localTime);

        LocalDate localDate = LocalDate.of(1993,10,22);
        LocalDate nowLocalDate = LocalDate.now();
        // can not use Duration, because localDate is not hold time
        Period period = Period.between(localDate,nowLocalDate);
        System.out.println("period is : " +period);
    }
}
