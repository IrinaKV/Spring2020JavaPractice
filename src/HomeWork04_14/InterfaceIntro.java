package HomeWork04_14;

import java.sql.SQLOutput;

public interface InterfaceIntro {
    public abstract void methodA();
    public void methodC();
}
interface Data{

}
abstract class Test2{
    public void methodB(String name){

    }
}
class Test implements InterfaceIntro, Data{
    @Override
    public void methodA(){

        }
     @Override
    public void methodC(){

     }
}