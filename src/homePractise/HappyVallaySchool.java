package homePractise;

import java.util.Scanner;

public class HappyVallaySchool {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter age:");

        int age = input.nextInt();
        String st = "";
        if((age>=0 && age<2)||age>18){
            st = "ineligible";
        }else if(age>= 2 && age<3){
            st = "toddler";
        }else if(age>= 3 && age<=5){
            st = "early childhood";
        }else if(age>= 6 && age<=7){
            st = "young reader";
        }else if(age>= 8 && age<=10){
            st = "elementary";
        }else if(age>= 11 && age<=12){
            st = "middle";
        }else if(age>= 13 && age<14){
            st = "impossible";
        }else if(age>= 14 && age<=16){
            st = "high school";
        }
        else if(age>= 17 && age<=18){
            st = "scholar";
        }
        System.out.println(st);
    }
}
