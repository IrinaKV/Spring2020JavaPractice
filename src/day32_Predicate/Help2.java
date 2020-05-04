package day32_Predicate;

public class Help2 {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        System.out.println (appearsTwice("laptop", "I would like to buy a new laptop, because my laptop is too old."));
    }

    /**
     * @param target - string that you need to check.
     * @param sentence - string where you need to lookup for target.
     * @return
     */
    public static boolean appearsTwice(String target, String sentence) {
        int count = 0;
        while (sentence.contains(",")){
            sentence = sentence.replaceFirst(",", "");
        }
        String sentence1 []  = sentence.split(" ");
        for (int i = 0; i < sentence1.length; i++){
            if (target.equals(sentence1[i])){
                count++;
            }
        }
        if (count == 2) return true;
        return false;

        // if (count == 2){
        //   return true;
        // }else{
        //   return false
        // }
    }
}




