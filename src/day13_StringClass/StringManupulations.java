package day13_StringClass;

public class StringManupulations {
    public static void main(String[] args) {
        String str = "Cybertek";
        //            01234567
        char ch1 = str.charAt(6);//e
        System.out.println(ch1);
        System.out.println(ch1 == 7);

        System.out.println(str.length()>34);
        String str2 = "Today is a great day, Java is Fun";
        System.out.println(str2.length()-1);//max index numbers

        String s1 = "Cybertek";
        s1 = s1.concat(" School");
        System.out.println(s1);

        String s2 = "  bbbg   yy nnn  ggvgg bbb bbb     hh.";
        System.out.println(s2.trim());// remove space before and after (not uses)


    }
}
