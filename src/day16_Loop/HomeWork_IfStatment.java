package day16_Loop;

import java.util.Scanner;

public class HomeWork_IfStatment {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String in = s.next();
        float price=0;

        if(in.equals("burger")||in.equals("chicken")){
            price=10.0f;
        }
        if(in.equals("soda")){
            price = 2.0f;
        }
        System.out.println(price);

    }
}

