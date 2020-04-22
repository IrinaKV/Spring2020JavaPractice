package day21_MultudementinalArrays;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        for(int eachElement : nums){
            System.out.println(eachElement);
        }

        String[] student = {"Irina", "Diana", "Yurii", "Eugenii"};
        for (String eachStudent:student){
            System.out.println(eachStudent);
        }
        int[]  arr1 = {1,2,3,4,5,6,7,8,9,10};
        for(int eachNums : arr1){
            if(eachNums<5){
                continue;
            }
            System.out.println(eachNums);
        }

        String sentence ="I like Java";
        String[] str = sentence.split(" ");
        for(String eachWord : str ){
            System.out.println(eachWord);
        }

        for (int i = str.length-1; i >=0 ; i--) {
            System.out.println(str[i]);

        }
    }

}
