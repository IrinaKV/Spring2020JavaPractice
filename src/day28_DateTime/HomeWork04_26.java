package day28_DateTime;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork04_26 {
    //171
    public static String limit(String text, int maxLength) {
        String newText = "";
        for (int i = 0; i < maxLength; i++) {
            newText += "" + text.charAt(i);
        }
        return newText;
    }

    //172
    public static String at3(String target, String word) {
        return target.substring(0, 3) + word + target.substring(3);

    }

    //173
    public static String biggerS(String a, String b) {
        if (a.length() > b.length()) {
            return a;
        } else return b;
    }

    //174
    public static String removeFirst(String target) {

        return target.substring(1);

    }

    //176
    public int findMax(int[] arr) {
        int max = arr[0];
        for (int eachNum : arr) {
            if (eachNum > max) {
                max = eachNum;
            }

        }
        return max;

    }

    public double findMax(double[] arr) {
        double max = arr[0];
        for (double eachMum : arr) {
            if (eachMum > max) {
                max = eachMum;
            }
        }
        return max;
    }

    //178
    public static int[] mergR(int[] a, int[] b) {
        int[] arr = new int[a.length + b.length];
        int i = 0;
        do {
            arr[i] = a[i];
            i++;
        } while (i < a.length);
        do {
            arr[i] = b[i - a.length];
            i++;
        } while (i >= a.length && i < arr.length);

        return arr;
    }

    //179
    public static String reverse(String input) {
        String revers1 = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            revers1 += "" + input.charAt(i);
        }
        return revers1;
    }

    //189
    public static boolean isError(String line) {
        if (line.substring(0, 5).equals("error")) {
            return true;
        } else return false;
    }

    //170
    public static String clean(String text, String badWord) {
        text = text.replaceAll(badWord, "");

        return text;

    }

    //194
    public static boolean isPalindrome(String check) {
        String revers = "";
        while (check.contains(" ")) {
            check = check.replaceFirst(" ", "");
        }
        for (int i = check.length() - 1; i >= 0; i--) {
            revers += check.charAt(i);
        }

        if (check.equalsIgnoreCase(revers)) {
            return true;
        } else return false;

    }

    //186
    public static String extractNum(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '0':
                    result += "0";
                    break;
                case '1':
                    result += "1";
                    break;
                case '2':
                    result += "2";
                    break;
                case '3':
                    result += "3";
                    break;
                case '4':
                    result += "4";
                    break;
                case '5':
                    result += "5";
                    break;
                case '6':
                    result += "6";
                    break;
                case '7':
                    result += "7";
                    break;
                case '8':
                    result += "8";
                    break;
                case '9':
                    result += "9";
                    break;
            }
        }
        return result;

    }

    //195
    public static boolean isAnagram(String word1, String word2) {

        if (word1.length() == word2.length()) {
            for (int i = 0; i < word1.length(); i++) {
                if (!word2.toLowerCase().contains(word1.charAt(i) + "")) {
                    return false;
                }
            }
            return true;
        } else return false;

    }

    //209
    public static class calc {
        public static int plus(int a, int b) {
            return a + b;
        }

        public static int minus(int a, int b) {
            return a - b;
        }
    }

    //168
    public static String coverString(String main, String coverME) {
        if (!main.contains(coverME)) {
            return "[" + main + "]";
        } else return main.replaceAll(coverME, "[" + coverME + "]");

    }

    //Assessment test #3. 3- Reverse an array
    public static String[] reverse(String[] arr) {
        String[] arr1 = new String[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {

            arr1[j] = arr[i];
            j++;

        }

        return arr1;
    }

    //Assessment test #2. 4 - Appears twice
    public static boolean appearsTwice(String target, String sentence) {
        int count = 0;
        while (sentence.contains(target)) {
            count++;
            sentence = sentence.replaceFirst(target, "");
        }
        if (count == 2) {
            return true;
        } else return false;
    }

    //Assessment test #4. 1 - is sorted
    public static boolean isSort(int[] nums) {
        int[] nums1 = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            nums1[i] = nums[i];
        }
        Arrays.sort(nums);
        if (Arrays.equals(nums1, nums)) {
            return true;
        } else return false;

    }

    //165. Methods with return 10 -thunder blazz
    public static boolean getThunderBlazz(boolean available, boolean gift,
                                          int ingredient1, int ingredient2, int ingredient3) {

        if ((available == false && gift == false && ((ingredient1 == ingredient2 || ingredient2 == ingredient3) ||
                (ingredient1 > 3) || ingredient2 > 3 || ingredient2 > 3))){
            return false;
        }

        else return true;
    }






    public static void main(String[] args) {

        System.out.println(at3("longword","foo"));
        System.out.println(at3("blabla","a"));
        System.out.println(biggerS("apple","orange"));
        System.out.println(Arrays.toString(mergR(new int[]{1, 2, 3},new int[]{4,5,6})));
        System.out.println(reverse("foo"));
        System.out.println(isPalindrome("Nurses Run"));
        System.out.println(extractNum("aa!!%$#.10aa"));
        System.out.println(isAnagram("lise", "vja"));
        System.out.println("1+1 = "+calc.plus(1,1) );
        System.out.println("1-1 = "+calc.minus(1,1) );
        System.out.println(clean ("one two two two  three two","two"));
        System.out.println(Arrays.toString(reverse(new String[]{"mama", "noon", "soon", "wood","horse", "go"})));
        System.out.println(appearsTwice("java", "java, java  is fun!"));
        System.out.println(isSort(new int[] {1,4,3}));
        //Assessment test #5. 1 - Print vowels
       /* Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code be
        String result = "";
        for (int i = 0; i <word.length() ; i++) {
            switch (word.charAt(i)) {
                case 'a':{
                    System.out.print("a");
                    break;
                }
                case 'i':{
                    System.out.print("i");
                    break;
                }case 'e':{
                    System.out.print("e");
                    break;
                }case 'o':{
                    System.out.print("o");
                    break;
                }case 'u':{
                    System.out.print("u");
                    break;
                }
            }

            System.out.print(result);
        }
*/
        System.out.println(getThunderBlazz(false,true,9,7,3));





    }

}
