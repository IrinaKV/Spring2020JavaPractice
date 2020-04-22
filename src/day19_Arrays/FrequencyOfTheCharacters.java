package day19_Arrays;

public class FrequencyOfTheCharacters {
    public static void main(String[] args) {
        /*
       write a program that can return the frequency of the characters ina string
		Ex: "AABCBCA" ==> "A3B2C2"
         */
        String str = "AABCBCA";
        String result = "";
        String nonDup = "";


        for (int z = 0; z <=str.length()-1; z++) {
            if(!nonDup.contains((""+ str.charAt(z)))){
                nonDup+= str.charAt(z);
            }

        }


        for (int j = 0; j <=nonDup.length()-1 ; j++) {

            int count =0;

            for (int i = 0; i <=str.length()-1 ; i++) {
                if(nonDup.charAt(j)==str.charAt(i)){
                    count++;
                    result = nonDup.charAt(j)+ ""+count;
                }

            }
            System.out.print(result);
        }



    }
}
