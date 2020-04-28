package day29_WrepperClass;

import java.util.ArrayList;
import java.util.Arrays;

public class WarmUpTask {
    /*

    WARMUP TASKS:
    1. write a program that can return the sum of all the digits from a string
            ex:
                input: "a1b2c3"
                output: 6
                    (1+2+3= 6)
                input: "Today's date is 04/27/2020"
                output: 17
                    (0+4+2+7+2+0+2+0=17)
            HINT: on ascii table, the characters between #48 ~ #57 are digits
    2. write a program that can print the list of integers in reversed order
        ex:
            list=> {1,2,3,4,5}
            output: 5 4 3 2 1
    3. write a program that can print out the unique elements from an int array
           HINT: store all the unqie elemenbts of array into a list of integers
           Ex: array==> {1,1,2,3,3,4,5}
               output: {2,4,5}
    4.  write a program that can find the unique elements from an ArrayList of integers and stores into another list called uniques
            ex: list==> {1,1,2,3,3,4,5}
                uniques ==> {2,4,5}
    5. write a program that can combine two String arrays into one arrayList
            ex:
                arr1 = {"A", "B", "C"};
                arr2 = {"D", "E", "F", "G"};
                list ==> {"A", "B", "C", "D", "E", "F", "G"}

     */

    public static void main(String[] args) {
        //WARMUP TASKS:
        //1
        String str = "Today's date is 04/27/2020";
        String result ="";
        char[] ch = str.toCharArray();
        for(char each:ch){
            if(each>=48 && each<=57){
                result += each;
            }

        }
        System.out.println(result);

        //2
        ArrayList<Integer> listNum = new ArrayList<>();
        listNum.add(1);
        listNum.add(2);
        listNum.add(3);
        listNum.add(4);
        listNum.add(5);
        listNum.add(6);
        listNum.add(7);

        for (int i = listNum.size()-1; i >=0 ; i--) {
            System.out.print(listNum.get(i) +" ");
        }
        System.out.println();

        //3
        int[] array = {1,1,2,3,3,4,5};

        for (int j = 0; j <array.length ; j++) {
            int count = 0;
            for (int i = 0; i <array.length ; i++) {

                if(array[i]==array[j]){
                 count++;
                }
            }
            if(count<2){
                System.out.print(array[j] +" ");
            }

        }
        System.out.println();
        //4
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        ArrayList<Integer> listUnique = new ArrayList<>();

        for (int j = 0; j < list.size(); j++) {
            int count = 0;
            for (int i = 0; i < list.size(); i++) {
                if(list.get(i)==list.get(j)){
                    count++;
                }
            }
            if(count<2){
                listUnique.add(list.get(j));

            }
        }
        for(int each:listUnique){
            System.out.print(each +" ");
        }
        System.out.println();
        // 5
        String [] arr1 ={"A", "B", "C"};
        String [] arr2 = {"D", "E", "F", "G"};
        ArrayList<String> list2 = new ArrayList<>();
        for (int i = 0; i <arr1.length+arr2.length ; i++) {
            if(i<arr1.length){
                list2.add(arr1[i]);
            }else list2.add(arr2[i-arr1.length]);

        }
        System.out.println(list2);

        }

    }

