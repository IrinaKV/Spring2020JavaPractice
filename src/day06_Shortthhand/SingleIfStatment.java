package day06_Shortthhand;

public class SingleIfStatment {
    public static void main(String[] args) {
        boolean coldWather = true;
        if (coldWather){
            System.out.println("Ware your hat");
            System.out.println("Ware your jacket");

        }
        boolean coronaDetected = true;
         if(coronaDetected){
             System.out.println("Buy more toilet paper");
         }

         int a =1031;
         if(a%2 == 0){
             System.out.println("the number " + a+ " is even");
         }
         if(a%2!=0){
             System.out.println("the number " + a+ " is odd");
         }
    }
}
