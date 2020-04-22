package OfficeHours;

public class do_while_loop {
    public static void main(String[] args) {

        int j =0;
        do{  if(j%15==0) {
            System.out.println(j + " ");
        }
            j++;
        }while (j<=100);
        System.out.println("++++++++++++++++++++++++++++++");


        int i =5;
        while (i<10){

            for(int z =10; z<=50 ;z+=10){

            System.out.print(z +" ");
            }
            System.out.println();
            i++;
        }

        System.out.println("-------------------------------");
        for (int n = 0; n <=6; n++) {
            for (int k = n; k >=0; k--) {

                System.out.print("*" +" ");
            }
            System.out.println();
        }




    }
}
