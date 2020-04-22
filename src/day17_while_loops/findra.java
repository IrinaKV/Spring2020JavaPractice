package day17_while_loops;

public class findra {

    public static void main(String[] args) {
        String result ="";
        for (int i = 1; i <=30; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                //System.out.print("FINDRA ");
                result += "FINDRA ";
            } else if (i % 3 == 0) {
                //System.out.print("FIN ");
                result += "FIN ";
            } else if (i % 5 == 0) {
                //System.out.print("DRA ");
                result += "DRA ";
            } else {
                //System.out.print(i+" ");
                result += i + " ";
            }
        }
        System.out.print(result);
    }

}
