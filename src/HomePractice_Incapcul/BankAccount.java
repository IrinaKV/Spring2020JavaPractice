package HomePractice_Incapcul;

public class BankAccount {
    private String AccountHolder;
    private  long AccountNumber;
    private  double AvaleableBalance;

    public double getAvaleableBalance() {
        return AvaleableBalance;
    }

    public long getAccountNumber() {
        return AccountNumber;
    }

    public String getAccountHolder() {
        return AccountHolder;
    }

    public void setAccountHolder(String AccountHolder) {
        this.AccountHolder = AccountHolder;
    }

    public void setAccountNumber(long AccountNumber) {
        this.AccountNumber = AccountNumber;
    }

    public void setAvaleableBalance(double AvaleableBalance) {
        this.AvaleableBalance = AvaleableBalance;
    }
    //Actions
      //deposit
    public void deposit(double amount){
        AvaleableBalance+= amount;
    }
    // withdraw
    public void withDraw(double amount){


        if(AvaleableBalance<=0){
            System.out.println("your account balance is less or equal to 0");
        }else if(amount> AvaleableBalance){
            AvaleableBalance -= amount;
            AvaleableBalance-= 35;
        }else{
            AvaleableBalance-=amount;
        }
    }
        /*if(AvaleableBalance<=0){
            System.out.println("your account balance is less or equal to 0");
            return;
        }
        if(amount> AvaleableBalance){
            AvaleableBalance-= 35;
        }
        AvaleableBalance -= amount;
    }*/
    // checking balance:
    public void ShowBalance(){
        System.out.println("Available balance: " + AvaleableBalance);

    }
    public void getAccountInfo(){
        System.out.println("Name: " + getAccountHolder());
        System.out.println("Account number: " + getAccountNumber());
        System.out.println("AvaleableBalance: "+ getAvaleableBalance());
    }
}
