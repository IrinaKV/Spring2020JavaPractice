package day09_Ternary_NestedIf;

import java.util.Scanner;

public class AgeGroup_Nested {
    /*


     */
    public static void main(String[] args) {
       /* Scanner scan = new Scanner(System.in);
        System.out.println("Inter your name");
        String fistName = scan.nextLine();
        // mUhtAr
        fistName = fistName.substring(0,1).toUpperCase() + fistName.substring(1).toLowerCase();
        System.out.println(fistName);
        System.out.println("Inter your last name");
        String  lastName = scan.nextLine();
        // kIseLeVA
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();
        System.out.println(fistName + " " + lastName);
        */

       String a1 = " Such a grate day today.";
       int num = a1.indexOf("t");
        System.out.println(num);

        System.out.println("========================");
        String A1 = "Cybertek";
        String A2 = new String("Cybertek");
        System.out.println(A1==A2);//false

        boolean R2 = A1.equals(A2);//true
        System.out.println(R2 );
        System.out.println("java".equals("java"));//true
        System.out.println("JAVa".equalsIgnoreCase("javA"));//true

        String name = "A wiki is a knowledge base website on which users collaboratively modify and structure content directly from a web browser. In a typical wiki, text is written using a simplified markup language and often edited with the help of a rich-text editor. A wiki is run using wiki software";
        boolean total = name.contains("base");
        System.out.println(total);
    }


}
