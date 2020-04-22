package day12_Scanner2;

import java.util.Scanner;

public class Ternary_Practice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inter your salary ");
        double salary = scan.nextDouble();
                        scan.nextLine();
        System.out.println("Inter full name ");
        String fullName = scan.nextLine();

        System.out.println("Inter company name ");
        String nameOfCompany = scan.nextLine();

        System.out.println("Inter SSN ");
        int sSN = scan.nextInt();
        scan.nextLine();
        System.out.println("Inter JobTitle ");

        String jobTitle = scan.nextLine();

        System.out.println("My name is " + fullName);
        System.out.println("My SSN is " + sSN);
        System.out.println("I work for company "+ nameOfCompany);
        System.out.println("as a " + jobTitle);
        System.out.println("with salary " + salary);

    }

}
