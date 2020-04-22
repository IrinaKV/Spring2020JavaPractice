package day08_IfStatement;

public class equalNumbers {
    public static void main(String[] args) {
      double n1 = 100.5;
      double n2 = 100.5;
      double n3 = 100.5;

      boolean n1Equaln2 = n1==n2 && n1!= n3;
      boolean n1Equaln3 = n1==n3 && n1!= n2;
      boolean n2Equaln3 = n2==n3 && n2!= n1;
      boolean allequal = n1==n2 && n1==n3;
      boolean noneOfThemEqal = n1 != n2 && n1 != n3;

      //boolean noneEqual =n1Equaln2 == false && n1Equaln3 ==false && n2Equaln3 ==false;
      //boolean noneEqual1 = !n1Equaln2 && !n1Equaln3 && n2Equaln3;

      if(n1Equaln2 ){
          System.out.println(n1 + " is equal to " + n2);
      }
      if(n1Equaln3){
          System.out.println(n1 + " is equal to " + n3);
      }
        if(n2Equaln3){
            System.out.println(n2 + " is equal to " + n3);
        }
        if(noneOfThemEqal){
            System.out.println("None of them equal");
        }
        if(allequal){
            System.out.println("All equal");
        }


    }
}
