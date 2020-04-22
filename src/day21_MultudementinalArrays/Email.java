package day21_MultudementinalArrays;

public class Email {
    public static void main(String[] args) {
        String[] emails = {"Irina.kiseleva@icloud.com", "kiseira@gmail.com"};


        for (String EachEmail : emails) {
            if (EachEmail.endsWith("@gmail.com")) {
                continue;
            }
            System.out.println(EachEmail);


           /* if(!EachEmail.endsWith("@gmail.com")){
                System.out.println(EachEmail);
                   */
        }


    }
}

