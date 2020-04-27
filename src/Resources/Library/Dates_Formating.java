package Resources.Library;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dates_Formating {
    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MMM/dd");

        // year yy, YYYY
        // month MM, MMM, MMMM
        // days dd,
        // day of week EEE, EEEE(full name)
        LocalDate date = LocalDate.now();
        System.out.println(date.format(dtf));
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("EEEE MMM/dd/yy");
        System.out.println(date.format(dtf2));

        Double arr2 [] = {(double)12, 6.8, 5.9, 4.54,(double)89, 90.0} ;
    }
}
