package day28_DateTime;

import java.time.LocalDate;
import java.time.LocalTime;

public class Local_Practace {
    public static void main(String[] args) {
        String [] friends = {"Jon", "Arron", "Danial"};
        LocalDate JonBirthday = LocalDate.of(2020,3,4);
        LocalDate ArronBirthday = LocalDate.of(2020,3,5);
        LocalDate DanialBirthday = LocalDate.of(2020,3,3);
        LocalDate [] bithdays = {JonBirthday,ArronBirthday,DanialBirthday};

        for (int i = 0; i < friends.length ; i++) {
          String name = friends[i];
          LocalDate bd = bithdays[i];
            System.out.println(name + " 's birthday is " + bd);
        }



    }
}
