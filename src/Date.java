import java.time.LocalDate;

public class Date {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2020,11,26);
        System.out.println(date1);
        LocalDate bithday = LocalDate.of(2020, 12, 25);

        boolean result = date1.isAfter(bithday);
        System.out.println(result);

        boolean result4 = bithday.isLeapYear();
        System.out.println(result4);

        LocalDate date = LocalDate.now();
        System.out.println(date);

        String str = date.toString();
        System.out.println(str.replace("-","\\"));


    }
}
