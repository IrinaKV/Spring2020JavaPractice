package day18_NestedLoop;

public class Do_WhileLoopPractice {

    public static void main(String[] args) {
        int num = 0;
        do {
            if(num%2!=0){
                System.out.print(num +" ");
            }

          num++;
        }while (num<=100);
    }
}
