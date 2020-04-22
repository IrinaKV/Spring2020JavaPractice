package HomeWork04_21;

public class MetodWithString167 {
    public static void main(String[] args) {

        System.out.println( uniqueChars("spoon") ) ;

    }
    public static String uniqueChars1(String str) {
        //TODO: write your below
        String[] str1 = str.split("") ;
        String unique = "";

        for (String eachArr:str1) {

            int count =0;
            for (String eachElement:str1){
                    if(eachElement.equals(eachArr)){
                        count++;
                    }
            }if(count==1){
               unique+= eachArr;
            }
        }
        return unique;

    }
  public static String uniqueChars(String str) {
      //167 task
      String unique = "";

      for (int i = 0; i < str.length(); i++) {
          if (unique.contains("" +str.charAt(i))){
              continue;
          }
          unique+= ""+str.charAt(i);
      }

      return unique;
  }

}
