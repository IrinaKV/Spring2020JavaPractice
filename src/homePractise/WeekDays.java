package homePractise;

import java.util.Scanner;

public class WeekDays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day = input.nextInt();
        String st ="";

        if(day == 1){
            st = "It's a Monday!";
        }else if(day == 2){
            st = "It's a Tuesday!";
        }else if(day == 3){
            st = "It's a Wednesday!";
        }else if(day == 4){
            st = "It's a Thursday!";
        }else if(day == 5){
            st = "It's a Friday!";
        }else if(day ==6){
            st = "It's a Saturday!";
        }else if(day ==7){
            st = "It's a Sunday!";
        }else {st= "There is no such a day!";
        }
        System.out.println(st);

    }
}
