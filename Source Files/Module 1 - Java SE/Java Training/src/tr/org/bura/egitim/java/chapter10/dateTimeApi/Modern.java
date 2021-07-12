package tr.org.bura.egitim.java.chapter10.dateTimeApi;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAmount;

public class Modern {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2021, 1,7);
        System.out.println(date);

        //LocalDateTime
        LocalDateTime currentDate = LocalDateTime.now();
        LocalDateTime currentDateAtOtherZone = LocalDateTime.now(ZoneId.of("Europe/London"));
        System.out.println(currentDate);
        System.out.println(currentDateAtOtherZone);

        //ZonedDateTime
        ZonedDateTime currentDateTimeAtTokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateTimeAtTokyo);

        //OffsetDateTime
        OffsetDateTime currentDateTimeAtTurkeyWithOffset = OffsetDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println(currentDateTimeAtTurkeyWithOffset);



        //Period
        LocalDate startDate = LocalDate.of(2021, 2,15);
        LocalDate endDate = LocalDate.now();
        Period period = Period.between(startDate, endDate);
        System.out.println(period.getDays() + " days passed from : " + startDate + " until: " + endDate);
        System.out.println(period.getMonths() + " months passed from : " + startDate + " until: " + endDate);
        System.out.println( period.toString());

        //DateTimeFormatter
        LocalDateTime nonFormattedDate = LocalDateTime.now();
        OffsetDateTime nonFormattedDateWithOffset = nonFormattedDate.atOffset(ZoneId.of("Europe/Istanbul").getRules().getOffset(nonFormattedDate));
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
        System.out.println(dateTimeFormatter1.format(nonFormattedDateWithOffset));

        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println(dateTimeFormatter2.format(nonFormattedDate));
    }
}
