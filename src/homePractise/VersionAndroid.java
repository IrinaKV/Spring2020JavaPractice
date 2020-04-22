package homePractise;

import java.util.Scanner;

public class VersionAndroid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double version = input.nextDouble();
        String st = "";

        if(version==1.5){
         st = "Cupcake";
        }else if(version == 1.6){
          st = "Donut";
        }else if ( version == 2.1){
            st = "Eclair";
        }else if(version == 2.2){
            st = "Froyo";
        }else if(version== 2.3){
            st = "Gingerbread";
        }else if(version== 3.1){
            st = "Honeycomb";
        }else if(version== 4.0){
            st = "Ice Cream Sandwich";
        }else if(version>= 4.1 && version<=4.31){
            st = "Jelly Bean";
        }else if(version>= 4.4 && version<=4.44){
            st = "KitKat";
        }else if(version>= 5 && version<=5.11){
            st = "Lollipop";
        }else if(version>= 8.0 && version<=8.1){
            st = "Oreo";
        }else if(version== 9.0) {
            st = "Pie";
        }else st= "Sorry, I don't know this version!";
        System.out.println(st);
    }

}
