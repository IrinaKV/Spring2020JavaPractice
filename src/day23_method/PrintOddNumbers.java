package day23_method;

import org.w3c.dom.ls.LSOutput;

public class PrintOddNumbers {

    public static void printOddNumber(){
        for (int i = 0; i <=100 ; i++) {
            if(i%2==0){
                continue;
            }
            System.out.print(i +" ");
        }
        System.out.println();

        }

    public static void printEvenNumber() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();

        }

        public static void main(String[] args) {
        printOddNumber();
        printEvenNumber();

    }
}
