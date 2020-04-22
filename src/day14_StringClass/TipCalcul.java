package day14_StringClass;

import java.util.Scanner;

public class TipCalcul {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Split");
        String split = scan.next();

        System.out.println("Number of people");
        int numberOfPeople = scan.nextInt();

        System.out.println("Check amount");
        double checkAmount = scan.nextFloat();

                             scan.nextLine();
        System.out.println("Service Quality");
        String serviceQuality = scan.nextLine();

        double totalToPay = 0;
        double totalTip = 0;
        double totalPerPerson = 0;
        double tipPerPerson = 0;
        String numOfPeople ="";

        if(serviceQuality.equals("Poor")){
            if(numberOfPeople==1 || !split.equals("Yes")){
                numOfPeople = "&";
                totalTip = checkAmount*0.05;
                totalToPay = checkAmount + totalTip;
                totalPerPerson= totalToPay;
                tipPerPerson = totalPerPerson;
            } if(numberOfPeople==2 && split.equals("Yes")){
                numOfPeople = "&&";
                totalTip = checkAmount*0.05;
                totalToPay = checkAmount + totalTip;
                totalPerPerson= totalToPay*0.5;
                tipPerPerson = totalPerPerson*0.5;
            }else if(numberOfPeople==3 && split.equals("Yes")){
                numOfPeople = "&&&";
                totalTip = checkAmount*0.05;
                totalToPay = checkAmount + totalTip;
                totalPerPerson= totalToPay*0.33;
                tipPerPerson = totalPerPerson*0.33;
            }else if(numberOfPeople==4 && split.equals("Yes")){
                numOfPeople = "&&&&";
                totalTip = checkAmount*0.05;
                totalToPay = checkAmount + totalTip;
                totalPerPerson= totalToPay*0.25;
                tipPerPerson = totalPerPerson*0.25;

        }else if(serviceQuality.equals("Fair")){
                if(numberOfPeople==1||!split.equals("Yes")){
                    numOfPeople = "&";
                    totalTip = checkAmount*0.10;
                    totalToPay = checkAmount + totalTip;
                    totalPerPerson= totalToPay;
                    tipPerPerson = totalPerPerson;
                } else if(numberOfPeople==2 && split.equals("Yes")){
                    numOfPeople="&&";
                    totalTip = checkAmount*0.10;
                    totalToPay = checkAmount + totalTip;
                    totalPerPerson= totalToPay*0.5;
                    tipPerPerson = totalPerPerson*0.5;
                }else if(numberOfPeople==3 && split.equals("Yes")){
                    numOfPeople="&&&";
                    totalTip = checkAmount*0.10;
                    totalToPay = checkAmount + totalTip;
                    totalPerPerson= totalToPay*0.33;
                    tipPerPerson = totalPerPerson*0.33;
                }else if(numberOfPeople==4 && split.equals("Yes")){
                    numOfPeople="&&&&";
                    totalTip = checkAmount*0.10;
                    totalToPay = checkAmount + totalTip;
                    totalPerPerson= totalToPay*0.25;
                    tipPerPerson = totalPerPerson*0.25;

        }else if(serviceQuality.equals("Good")){
                    if(numberOfPeople==1||!split.equals("Yes")){
                    numOfPeople = "&";
                    totalTip = checkAmount*0.15;
                    totalToPay = checkAmount + totalTip;
                    totalPerPerson= totalToPay;
                    tipPerPerson = totalPerPerson;
                    }else if(numberOfPeople==2 && split.equals("Yes")){
                    numOfPeople="&&";
                    totalTip = checkAmount*0.15;
                    totalToPay = checkAmount + totalTip;
                    totalPerPerson= totalToPay*0.5;
                    tipPerPerson = totalPerPerson*0.5;

                    }else if(numberOfPeople==3 && split.equals("Yes")){
                    numOfPeople="&&&";
                    totalTip = checkAmount*0.15;
                    totalToPay = checkAmount + totalTip;
                    totalPerPerson= totalToPay*0.33;
                    tipPerPerson = totalPerPerson*0.33;

                    }else if(numberOfPeople==4 && split.equals("Yes")){
                    numOfPeople="&&&&";
                    totalTip = checkAmount*0.15;
                    totalToPay = checkAmount + totalTip;
                    totalPerPerson= totalToPay*0.25;
                    tipPerPerson = totalPerPerson*0.25;
                    }

        }else if(serviceQuality.equals("Great")){
                    if(numberOfPeople==1||!split.equals("Yes")){
                        numOfPeople = "&";
                        totalTip = checkAmount*0.20;
                        totalToPay = checkAmount + totalTip;
                        totalPerPerson= totalToPay;
                        tipPerPerson = totalPerPerson;
                    }else if(numberOfPeople==2 && split.equals("Yes")){
                        numOfPeople="&&";
                        totalTip = checkAmount*0.20;
                        totalToPay = checkAmount + totalTip;
                        totalPerPerson= totalToPay*0.5;
                        tipPerPerson = totalPerPerson*0.5;
                    }else if(numberOfPeople==3 && split.equals("Yes")){
                        numOfPeople="&&&";
                        totalTip = checkAmount*0.20;
                        totalToPay = checkAmount + totalTip;
                        totalPerPerson= totalToPay*0.33;
                        tipPerPerson = totalPerPerson*0.33;
                    }else if(numberOfPeople==4 && split.equals("Yes")){
                        numOfPeople="&&&&";
                        totalTip = checkAmount*0.20;
                        totalToPay = checkAmount + totalTip;
                        totalPerPerson= totalToPay*0.25;
                        tipPerPerson = totalPerPerson*0.25;
                    }
                }else if(serviceQuality.equals("Excellent")){
                    if(numberOfPeople==1||!split.equals("Yes")){
                        numOfPeople = "&";
                        totalTip = checkAmount*0.25;
                        totalToPay = checkAmount + totalTip;
                        totalPerPerson= totalToPay;
                        tipPerPerson = totalPerPerson;
                    }else if(numberOfPeople==2 && split.equals("Yes")){
                        numOfPeople="&&";
                        totalTip = checkAmount*0.25;
                        totalToPay = checkAmount + totalTip;
                        totalPerPerson= totalToPay*0.5;
                        tipPerPerson = totalPerPerson*0.5;
                    }else if(numberOfPeople==3 && split.equals("Yes")){
                        numOfPeople="&&&";
                        totalTip = checkAmount*0.25;
                        totalToPay = checkAmount + totalTip;
                        totalPerPerson= totalToPay*0.33;
                        tipPerPerson = totalPerPerson*0.33;
                    }else if(numberOfPeople==4 && split.equals("Yes")){
                        numOfPeople="&&&&";
                        totalTip = checkAmount*0.25;
                        totalToPay = checkAmount + totalTip;
                        totalPerPerson= totalToPay*0.25;
                        tipPerPerson = totalPerPerson*0.25;
                    }
                }

            }

        }System.out.println("Number of people entered: " + numOfPeople);
        System.out.println("Total to pay: " + totalToPay);
        System.out.println("Total tip: " + totalTip);
        System.out.println("Total per person: "+ totalPerPerson);
        System.out.println("Tip per person: "+ tipPerPerson);




    }
}
