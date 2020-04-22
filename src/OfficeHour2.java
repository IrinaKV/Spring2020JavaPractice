public class OfficeHour2 {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            if(i%3==0||i%5==0)
            System.out.print(i +" ");

        }
        System.out.println();

        String name = "Buldog";
        String result="";
        for (int i = name.length()-1; i >=0 ; i--) {
            result+=name.charAt(i);
        }
        System.out.println(result);

        if(name.equalsIgnoreCase(result)){
            System.out.println(name + " is palindrome name");
        }else{System.out.println(name + " is not palindrome name");}



    }
}
