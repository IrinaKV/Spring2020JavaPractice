package day14_StringClass;

public class StringManipulation {
    public static void main(String[] args) {
        String str = "";
        boolean bool1 = str.isEmpty();//true
        System.out.println(bool1);

        String s1 = "Cat";
        String s2 = new String("Cat");

        System.out.println(s1 == s2);//false different objecks
        System.out.println(s1.equals(s2));// true the same value

    }
}
