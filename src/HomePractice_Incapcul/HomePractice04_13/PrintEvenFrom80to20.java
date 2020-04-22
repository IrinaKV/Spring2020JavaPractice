package HomePractice_Incapcul.HomePractice04_13;

public class PrintEvenFrom80to20 {
    public static void main(String[] args) {
      //80 78 76 74 72 70 68 66 64 62 60...22 20
        String result = "";
        for (int i = 80; i >=20; i--) {
            if(i%2!=0){
                continue;
            }

            result+= i +" ";
        }
        result =result.substring(0, result.length()-1);
        System.out.println(result);
        System.out.println("=================================");

    }
}
