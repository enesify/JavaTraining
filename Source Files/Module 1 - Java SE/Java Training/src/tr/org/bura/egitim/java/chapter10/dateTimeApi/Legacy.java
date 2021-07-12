package tr.org.bura.egitim.java.chapter10.dateTimeApi;

import java.sql.Time;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Legacy {
    public static void main(String[] args) {
        //get current timestamp as long variable
        System.out.println( System.currentTimeMillis());

        //java.util.Date class
        Date today = new Date();
        System.out.println(today);

        Calendar calendar = new GregorianCalendar();
        calendar.set(2021,Calendar.DECEMBER,21, 23,15,04);
        System.out.println(calendar.getTime());
        System.out.println(calendar.getTimeZone());
    }
}
