package day16_Loop;

public class Continue_Practice {
    public static void main(String[] args) {
        for (char i = 'a'; i <= 'z'; i++) {
            if(i=='c' || i=='x' || i=='z'||i=='y'){
                continue;
            }
            System.out.print(i +" ");
        }
    }
}
