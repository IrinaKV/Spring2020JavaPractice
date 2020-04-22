package day05_Unary_operations;

public class LeapYear {
    public static void main(String[] args) {
        short year =2025;
        //leapYear:year%4 ==0; if return true==> true, false ==> not leapYear
       boolean leapYear = year%4 == 0;
       String result = year+ " is leap year: "+ leapYear;
        System.out.println(result);
    }
}
