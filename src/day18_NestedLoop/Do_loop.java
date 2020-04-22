package day18_NestedLoop;

public class Do_loop {
    public static void main(String[] args) {
        int t=1;
        do {
            if(t%2 !=0){
                t++;
                continue;
            }
            System.out.println(t +" ");
            t++;

        }while (t<=100);
    }
}
