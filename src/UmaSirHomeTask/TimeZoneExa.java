package UmaSirHomeTask;

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.util.stream.Stream;

public class TimeZoneExa {
    public static void main(String[] args) {
        ZonedDateTime indiaTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime usTime = ZonedDateTime.now(ZoneId.of("America/New_York"));

        System.out.println("India Time: " + indiaTime);
        System.out.println("US Time: " + usTime);
    }
}


