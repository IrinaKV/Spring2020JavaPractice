package day17_while_loops;

public class Palinrome {
    public static void main(String[] args) {
        String str = "Java";
        String newReversed ="";
        int index = str.length()-1;

        while (index>= 0){
        newReversed+= str.charAt(index);
            index--;
        }

        boolean palindrom = newReversed.equalsIgnoreCase(str);
        System.out.println(str);
        System.out.println(newReversed);

        System.out.println(palindrom);
    }
}
