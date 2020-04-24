package day28_DateTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeFormating {
    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss a");
        LocalTime time1 = LocalTime.of(23,30);
        System.out.println(time1);
        System.out.println(time1.format(dtf));
    }
}
