package day28_DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormating {
    public static void main(String[] args) {


        LocalDateTime dateTime = LocalDateTime.of(2015,12,25,12,34,45);
        System.out.println(dateTime);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yy hh:mm a, EE");
        System.out.println(dateTime.format(dtf));

    }

}
