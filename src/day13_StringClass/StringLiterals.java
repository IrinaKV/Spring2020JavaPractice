package day13_StringClass;

public class StringLiterals {
    public static void main(String[] args) {
        String str1 = "Cat";// String Pool
        String str2 = new String("Cat");// java Heap

        System.out.println(str1 + " " +str2);
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        String str3 = "Cat";//String Pool

        System.out.println(str1 == str3);

        String str4 = new String("Cat");
        System.out.println(str2 == str4);

        String s1 = "Java";
        s1 = "JavaScript";//new object is created in memory

        String s2 = "Java";// no new object be created in the memory

        System.out.println(s1==s2);

    }
}
