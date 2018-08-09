package java_date;

import org.junit.Test;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.TimeZone;

import static java.time.DayOfWeek.TUESDAY;
import static java.time.temporal.ChronoUnit.MINUTES;
import static java.time.temporal.TemporalAdjusters.next;
import static java.util.Calendar.SEPTEMBER;

public class JavaDate {

    @Test
    public void localDate() {
        LocalDate current = LocalDate.now();
        current.plusMonths(1);
        current.minusDays(1).minusMonths(1);
        LocalDate date = LocalDate.of(2013, Month.SEPTEMBER, 12);

        if (current.isAfter(date)) {
            final String result = date.toString();
            System.out.println(result);
        } else System.out.println(current);

        final boolean leap = date.isLeapYear();
        final boolean leap_ = date.isAfter(date);
        System.out.println(leap);
        System.out.println(leap_);

        final int monthLen = date.lengthOfMonth();
        final int yearLen = date.lengthOfYear();
        System.out.println(monthLen);
        System.out.println(yearLen);
    }

    @Test
    public void localTime() {
        LocalTime current = LocalTime.now();
        LocalTime time = LocalTime.of(13, 30);

        if (current.isAfter(time)) {
            final String result = time.toString();
            System.out.println(result);
        } else System.out.println(current);

        time = time.plusHours(4).minusMinutes(1).withNano(0);
        System.out.println(time);

        time = time.truncatedTo(ChronoUnit.SECONDS);
        System.out.println(time);

    }

    @Test
    public void localTimeDate() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.of(2013, SEPTEMBER, 12, 13, 30);
        System.out.println(dt1);
        System.out.println(dt2);

        dt1 = dt1.plusDays(2).minusHours(1);
        dt1 = dt1.with(next(TUESDAY));

        dt2 = dt2.truncatedTo(MINUTES);
        System.out.println(dt2);
    }

    @Test
    public void localTimeZone() {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        System.out.println(timeZone);
        timeZone.getOffset(-05);
    }

    @Test
    public void timeDuration() {
        Duration duration = Duration.ofHours(6);
        System.out.println(duration);

        duration = duration.multipliedBy(3);
        System.out.println(duration);

        duration = duration.plusMinutes(30);
        System.out.println(duration);
//
//        LocalDateTime dt =
    }

    @Test
    public void timeDuration_() {
        LocalDate current = LocalDate.now();
        LocalDate date = LocalDate.of(2013, Month.SEPTEMBER, 12);
        int monthLen = date.lengthOfMonth();

    }
}
