package day03_03_11_2020;

public class SalaryCalculator {
    public static void main(String[] args) {
        byte  weeklyHours = 32;
        double rate = 63, stateTax = 0.04, federalTax = 0.22;
        double countrate = rate * weeklyHours * 48;
        System.out.println("Your salary is: " + countrate +" USD"+ "\n" +
                "Your total tax is: " + (0.22+0.04)* countrate + " USD"+ "\n" +
                "Your salary is: " +rate * weeklyHours * 48 * (1 - 0.22-0.04) + " USD");


    }
}
