package HomePractice_Incapcul.HomePractice04_13.HomePractice04_16;

public class method5 {
    public static void printHollowRect(){
        System.out.print("*****");
        System.out.println();

        for (int i = 1; i <= 3; i++) {
            for (int j = 0; j < i; j++) {

            }
            System.out.println("*   *");
        }
        System.out.print("*****");

    }
    public static void main(String[] args) {

        printHollowRect();
    }

}
