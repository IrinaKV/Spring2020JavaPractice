package HomeWork04_21;

import java.util.Scanner;

public class method154 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPalindrome(num);
    }

    public static void isPalindrome(int num){
        //WRITE YOUR CODE HERE
      String reversNum = "";
      String num1 = "" + num;
        for (int i = num1.length()-1; i >=0; i--) {
            reversNum += num1.charAt(i);

        }
        if(reversNum.equals(num1)){
            System.out.println(true);
        } else System.out.println(false);

    }

}
