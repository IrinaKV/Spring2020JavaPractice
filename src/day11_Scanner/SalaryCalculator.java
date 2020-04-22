package day11_Scanner;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your salary:");
        int salary = scan.nextInt();

        System.out.println("Enter the state tax rate:");
        byte stateTax = scan.nextByte();
        double stateTaxPercentage = stateTax/100.0;

        System.out.println("Enter the federal tax rate:");
        byte federalTax = scan.nextByte();
        double federalTaxPercentage = federalTax/100.0;//10/3.0 ==>3.3333

        double totalTax = (federalTaxPercentage + federalTax)* salary;

        double salaryAfterTax = salary - totalTax;
        System.out.println("Your salary after tax is: $" + salaryAfterTax);
        System.out.println("Total Tax is: " + totalTax);


    }
}
