package day10_Switch_Scanner;

public class NastwdIf {
    public static void main(String[] args) {
        byte dayOfWeek = 2;
        String st = "";
        if(dayOfWeek>0 && dayOfWeek<=7){
            st = dayOfWeek==1 ? "Monday":dayOfWeek==2 ? "Tuesday":
            dayOfWeek==3 ? "Wednesday":dayOfWeek==4? "Thursday":
            dayOfWeek==5 ? "Friday" : dayOfWeek==6 ? "Saturday":"Sunday";


        }else {
            System.out.println("Invalid day");
        }System.out.println(st);




        /*if(dayOfWeek>0 && dayOfWeek<=7){
            if(dayOfWeek == 1){
              st = "Monday";
            }else if(dayOfWeek ==2){
                st = "Tuesday";
            }else if(dayOfWeek == 3){
                st = "Wednesday";
            }else if(dayOfWeek ==4){
                st = "Thursday";
            }else if(dayOfWeek == 5){
                st = "Friday";
            }else if(dayOfWeek==6){
                st= "Saturday";
            } else{
                st = "Sunday";
            }
        }else {
            System.out.println("Invalid day");
        }
        System.out.println(st);*/
     }

}
