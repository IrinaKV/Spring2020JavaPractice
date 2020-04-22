package day12_Scanner2;

import java.util.Scanner;

public class Ternary_Practise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter status code");
        int statusCode = scan.nextInt();

        String result ="";


        if(statusCode ==200){
            result = "OK";
        }else if(statusCode ==201){
            result = "Created";
        }else if(statusCode ==202){
        result = "Accepted";
        }else {
            result = "Invalid status code";
        }
        System.out.println(result);



        int statusCode2 = scan.nextInt();
        String result2 = statusCode2==200 ? "OK" : statusCode2==201 ? "Created"
                :statusCode2 == 202 ?"Accepted": "Invalid status code";
        System.out.println(result2);
    }
}
