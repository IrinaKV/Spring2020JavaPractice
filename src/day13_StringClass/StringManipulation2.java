package day13_StringClass;

public class StringManipulation2 {
    public static void main(String[] args) {
        String str = "Cybertek School is the best";//cutting
        //            01234567890
        String schoolName = str.substring(0,8);
        System.out.println(schoolName);

        String fullName = "Kuzzat Altay";
        //                 01234567891011
        String fistName = fullName.substring(0,6);
        String lastName = fullName.substring(7,11 +1);
        System.out.println(fistName);
        System.out.println(lastName);

        //String fullName = "Kuzzat Altay";
        //                  0123456789....

        String fullName1 ="Irina Kiseleva";

        System.out.println(fullName1.substring(0,5)+ "_" +fullName1.substring(6,14) + "@gmail.com");

        System.out.println(fullName1.substring(0,5).concat("_").concat(fullName1.substring(6,14).concat("@gmail.com")));

        String s2 = "I like my job, to work with you";
        s2 = s2.replace("you", "us");
        System.out.println(s2);

        String r1 = "I like C##, C##, C## and Java";
        r1 = r1.replaceFirst("C##", "Java");
        System.out.println(r1);

        String s = "World";
        int n = s.length();
        System.out.println(s.length()-1);


        String str3 = "I like Java programming";

        //             012345678

        int num1 = str3.indexOf("ing");

        System.out.println(num1);

        String fullName2 = "Irina Kiseleva";
        String fistName2 = fullName2.substring(0,fullName2.indexOf(" "));
        String lastName2 = fullName2.substring(fullName2.indexOf(" ")+1);
        System.out.println(fistName2 + "\n" + lastName2);



    }


}
