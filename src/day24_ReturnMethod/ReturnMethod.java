package day24_ReturnMethod;

public class ReturnMethod {

    public static void Reverse(String str){
        String Revers = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            Revers+= str.charAt(i);
            System.out.println(Revers);

        }

    }
    public  static String Revers2(String str){
        String Revers = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            Revers+= str.charAt(i);

        }
        return Revers;

    }

    public static void main(String[] args) {
        String name = Revers2("Cybertek");
        System.out.println(name);
    }


}
