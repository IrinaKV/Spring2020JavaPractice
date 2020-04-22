package day18_NestedLoop;

public class DiviedTeoNumbers {
    public static void main(String[] args) {

        int a = 15;
        int b=0;
        int count =0;
        if(b==0){
            System.out.println("diviser cannot be zero");
            System.exit(0);
        }

        while (a>=b){
            a = a-b;
            count++;
        }
        if(2==0){
        System.out.println("The result is "+ count);
        }else{
            System.out.println("The result is "+ count + " with a remaider Of "+a);
        }


    }

}
