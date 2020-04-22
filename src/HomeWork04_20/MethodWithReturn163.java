package HomeWork04_20;

public class MethodWithReturn163 {
    public static boolean validateTask(boolean notEmpty,int taskId,int currentId){
        if(notEmpty==true && taskId == currentId +1){
            return true;
        }else return false;

    }

    public static void main(String[] args) {
   validateTask(false,3,2);
    }

}
