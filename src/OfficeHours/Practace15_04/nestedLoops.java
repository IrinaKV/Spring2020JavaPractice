package OfficeHours.Practace15_04;

public class nestedLoops {
    public static void main(String[] args) {
        char [][] arr2D = {{'A','b', 'D'},{'L','Y','A','F'},{'S','S','d','I'}};
        for (int j = 0; j < arr2D.length; j++) {
            for (int i = 0; i <arr2D[j].length ; i++) {
                System.out.print(arr2D[j][i] +" ");

            }
        }
        System.out.println();
        System.out.println("______________________________________________");

        char [][] arr12D = {{'A','b', 'D'},{'L','Y','A','F'},{'S','S','d','I'}};
        for(char [] eacharr12D :arr12D){
            for(char eacharr1:eacharr12D){
                System.out.print(eacharr1 +" ");
            }
        }


    }
}
