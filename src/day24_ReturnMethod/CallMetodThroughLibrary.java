package day24_ReturnMethod;

public class CallMetodThroughLibrary {
    public static void main(String[] args) {
      Boolean[] bool = new Boolean[2];
      bool[0] = new Boolean(Boolean.parseBoolean("true"));
      bool[1] = Boolean.valueOf(null);//false
      bool[1]= null;//null
        System.out.println(bool[0] + " " +bool[1]);

    }
}
