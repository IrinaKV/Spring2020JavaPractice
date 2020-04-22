package day18_NestedLoop;

public class NestedLoop2 {
    public static void main(String[] args) {
        for (int i = 5; i >=0; i--) {
            int j=0;
            while(j<=i){
                System.out.print("* ");
                j++;
            }
            System.out.println();


        }
        for (char z = 'a'; z <= 'z'; z++) {
            for (char ch = 'a'; ch <= z ; ch++) {
                System.out.print(ch+" ");
            }
            System.out.println();
        }

        for (char z = 'z'; z >= 'a'; z--) {
            for (char ch = 'a'; ch <= z ; ch++) {
                System.out.print(ch+" ");
            }
            System.out.println();
        }


    }
}
