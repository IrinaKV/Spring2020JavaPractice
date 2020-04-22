package day25_RecapMethod;

public class ReturnStatment {
    public static void main(String[] args) {
        method2();
        System.out.println("Hello");
    }

    public static void method1(){
        if(10>9){
            return;
        }
        System.out.println("Hello Cybertek");
    }


    public static void method2(){
        if(10>9){
           System.exit(0);
        }
        System.out.println("Hello Cybertek");
    }

}
