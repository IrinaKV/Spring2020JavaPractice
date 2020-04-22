package HomeWork04_20;

public class MethodsWithString {
    public static String mergeStrings(String one, String two) {
        String merge = "";
        if(one.length()<= two.length()){
            for (int j = 0; j < one.length(); j++) {
                merge += "" + one.charAt(j) + two.charAt(j);
            }
            merge+=two.substring(one.length());
        }

        if(one.length()> two.length()){
            for (int i = 0; i < two.length(); i++) {
                merge += "" + one.charAt(i) + two.charAt(i);
            }
            merge+=one.substring(two.length());
        }

     return merge;
    }

    public static void main(String[] args) {
        System.out.print(mergeStrings("java", "selenium"));
    }

}
