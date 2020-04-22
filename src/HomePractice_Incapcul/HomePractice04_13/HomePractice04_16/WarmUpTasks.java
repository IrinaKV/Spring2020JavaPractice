package HomePractice_Incapcul.HomePractice04_13.HomePractice04_16;

public class WarmUpTasks {
    public  static void KmToMiles(double km){
        final double km1 = 0.612;
        System.out.println(km +" km is " +km*km1 + " miles");
    }
    public  static void GalonsToLitters(double gallons){
        final double G1 = 3.75;
        System.out.println(gallons +" gallons is: " +gallons*G1 +" litters");
    }

    public  static void Calculation(double a, double b, char action){
        double result = 0;

        /*double result = action=='+'? a+b : action=='-' ? a-b :
                action=='*'? a*b : action=='/'? a/b: action=='%' ? a%b :0;*/
        if(action=='+'){
            result= a+b;
        }else if(action=='-'){
            result = a-b;
        }else if(action=='*'){
            result = a*b;
        }else if(action=='/'){
            result = a/b;
        }else if(action=='%'){
            result = a%b;
        }else {
            System.out.println("Invalid Operator");

        }
        System.out.println("Result is: " +result);
    }

    public static void main(String[] args) {
        KmToMiles(7.0);
        GalonsToLitters(3);
        Calculation(2,4, '%');
    }

}
