package day25_RecapMethod;

public class Friquency {
    public static void main(String[] args) {

        int count = Friquency("javaYjavaIOJava", "java");
        System.out.println(count);
        String  str1 = "AAA";
        String str2 = "A";
        //int count = 0;

            while (str1.contains(str2)) {
                count++;
                str1 = str1.replaceFirst(str2, "");
            }
            System.out.println(str1);
            System.out.println(count);
        }
        public static int Friquency(String str1, String str2){
            int count = 0;

            while (str1.contains(str2)) {
                count++;
                str1 = str1.replaceFirst(str2, "");
            }
            return count;

        }
    }

