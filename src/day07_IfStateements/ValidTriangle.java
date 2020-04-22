package day07_IfStateements;

public class ValidTriangle {
    public static void main(String[] args) {

        double angle1 =30.2;
        double angle2 =49.8;
        double angle3 =100;

        short sumOfAngeles = (short)( angle1 + angle2 + angle3);

        boolean validTriangle = sumOfAngeles ==180;
        if(sumOfAngeles ==180) {
            System.out.println(" the shape is a triangle");
        }
        if (sumOfAngeles!= 180){
        System.out.println(" the shape is not a valid triangle");

         }
    }
}
