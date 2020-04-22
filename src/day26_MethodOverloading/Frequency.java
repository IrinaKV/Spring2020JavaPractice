package day26_MethodOverloading;

public class Frequency {
    public static void main(String[] args) {
        String str ="AABBBAADA";
        char ch = 'A';
        char[]arr = str.toCharArray();
        int count =0;
        for(char each :arr){
            if(each == ch){
                count++;
            }
        }
        System.out.println(count);
        String str1 = "ASDSASDDSSSSAFSS";
        char ch1 ='S';

        int num1 = frequency(str1, ch1);
        System.out.println(num1);
    }

    public static int frequency(String str, char ch ){
        char[]arr = str.toCharArray();
        int count =0;
        for(char each :arr){
            if(each == ch){
                count++;
            }
        }
        return count;
    }
}
