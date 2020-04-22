package day08_IfStatement;

public class MultiBranchIf {
    public static void main(String[] args) {
        double n1 = 100.5;
        double n2 = 100.5;
        double n3 = 101.5;

        boolean n1Equaln2 = n1==n2 && n1!= n3;
        boolean n1Equaln3 = n1==n3 && n1!= n2;
        boolean n2Equaln3 = n2==n3 && n2!= n1;
        boolean allequal = n1==n2 && n1==n3;
        boolean noneOfThemEqal = n1 != n2 && n1 != n3;
        String result = " ";
        if(n1Equaln2){
            //System.out.println("n1 is equal to n2");
            result = "n1 is equal to n2";
        }
        else if(n1Equaln3){
           // System.out.println("n1 is equal to n3");
            result= "n1 is equal to n3";
        }
        else if(n2Equaln3){
            //System.out.println("n2 is equal to n3");
            result = "n2 is equal to n3";
        }else if(allequal){
            //System.out.println("all is equal");
            result ="all is equal";
        } else {
            //System.out.println("all number is different");
            result= "all number is different";
        }
        System.out.println(result);
    }

}
