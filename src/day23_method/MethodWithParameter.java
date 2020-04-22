package day23_method;

public class MethodWithParameter {

    public static void EligibleToBuyAlcogole(byte age){
        if(age>=21){
            System.out.println("Eligible to buy alcohol");
        }else{
            System.out.println("Eligible to buy milk");
        }

    }

    public static void main(String[] args) {
        EligibleToBuyAlcogole((byte) 45);
    }

}
