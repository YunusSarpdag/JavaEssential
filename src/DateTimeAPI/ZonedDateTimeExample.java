package DateTimeAPI;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.chrono.HijrahDate;

public class ZonedDateTimeExample {
    public static void main(String[] args) {
        //ZoneId.getAvailableZoneIds().stream().forEach(System.out::println);
        ZonedDateTime time = ZonedDateTime.now();
        System.out.println("time is " + time);
        ZoneId zoneId = ZoneId.of("Europe/Istanbul");
        System.out.println("istanbul time zone : " +zoneId);
        ZoneId newYorkZoneId = ZoneId.of("America/New_York");
        System.out.println("offset date time is :" + time.toOffsetDateTime());
        System.out.println("epochSecond is : " + time.toEpochSecond());
        ZonedDateTime newYork = ZonedDateTime.now(newYorkZoneId);
        System.out.println("new york time zone : " + newYork);

        HijrahDate hijrahDate = HijrahDate.now();
        System.out.println("hijrahDate is : " + hijrahDate);
    }
}
