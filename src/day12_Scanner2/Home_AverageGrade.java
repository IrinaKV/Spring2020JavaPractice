package day12_Scanner2;

import java.util.Scanner;
/*
num1=5.0,num2=4.2,num3=4.4,num4=4.8, num5=3.4
 */
public class Home_AverageGrade {
    public static void main(String[] args) {
        String subject1="",  subject2="", subject3="",  subject4="", subject5= "", summary="";
        double grade1=0,  grade2=0, grade3=0,  grade4=0, grade5=0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Grader!");
        System.out.println("Please enter subject name number 1 and score for this subject");

        subject1 = scan.nextLine();
        grade1 = scan.nextDouble();

        System.out.println("Please enter subject name number 2 and score for this subject");

                    scan.nextLine();
        subject2 = scan.nextLine();
        grade2 = scan.nextDouble();


        System.out.println("Please enter subject name number 3 and score for this subject");
        scan.nextLine();
        subject3 = scan.nextLine();
        grade3 = scan.nextDouble();


        System.out.println("Please enter subject name number 4 and score for this subject");
        scan.nextLine();
        subject4 = scan.nextLine();
        grade4 = scan.nextDouble();


        System.out.println( "Please enter subject name number 5 and score for this subject");
        scan.nextLine();
        subject5 = scan.nextLine();
        grade5 = scan.nextDouble();


        summary= subject1 + " - "+grade1 +", "+ subject2 + " - "+grade2 +", " +
                subject3 + " - "+grade3 +", "+ subject4 + " - "+grade4 +", "+
                subject5 + " - "+grade5;
        //average= grade1 +grade2+ grade3 +grade4 +grade5;

        System.out.println("Summary: "+ summary);
        System.out.println("Your average score is: "+ (grade1*0.2 +grade2*0.2+ grade3*0.2 +grade4*0.2 +grade5*0.2));
        System.out.println("Thank you for using Grader!");
        System.out.println("Goodbye!");



    }
}
