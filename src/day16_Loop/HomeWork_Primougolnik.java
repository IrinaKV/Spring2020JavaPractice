package day16_Loop;

import java.util.Scanner;

public class HomeWork_Primougolnik {
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            String start = scan.next();
            String end = scan.next();

            if(start.equals("A")&& end.equals("A")){
                System.out.println("A found");

            }if(start.equals("A")&& end.equals("B")){
                System.out.println("right: B found");
            }
            if(start.equals("A")&& end.equals("C")){
                System.out.println("right > down: C found");
            }
            if(start.equals("A")&& end.equals("D")){
                System.out.println("right > down > left: D found");
            }
            if(start.equals("B")&& end.equals("B")){
                System.out.println("B found");
            }
            if(start.equals("B")&& end.equals("C")){

                System.out.println("down: C found");

            }if(start.equals("B")&& end.equals("D")){

                System.out.println("down > left: D found");

            }if(start.equals("B")&& end.equals("A")){

                System.out.println("down > left > up: A found");

            }if(start.equals("C")&& end.equals("C")){

                System.out.println("C found");

            }if(start.equals("C")&& end.equals("D")){

                System.out.println("left: D found");

            }if(start.equals("C")&& end.equals("A")){

                System.out.println("left > up: A found");

            }if(start.equals("C")&& end.equals("B")){

                System.out.println("left > up > right: B found");

            } if(start.equals("D")&& end.equals("D")){

                System.out.println("D found");
            }
            if(start.equals("D")&& end.equals("A")){

                System.out.println("up: A found");

            }if(start.equals("D")&& end.equals("B")){

                System.out.println("up > right: B found");

            }if(start.equals("D")&& end.equals("C")){

                System.out.println("up > right > down: C found");
            }

    }
}





