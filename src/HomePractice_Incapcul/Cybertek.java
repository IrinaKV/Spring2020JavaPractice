package HomePractice_Incapcul;

import java.util.ArrayList;
import java.util.Arrays;

public class Cybertek {
    public static void main(String[] args) {
        BankAccount Sarah= new BankAccount();
        Sarah.setAccountHolder("Sarah Abdujappar");
        Sarah.setAccountNumber(127577464333l);
        System.out.println("Name" + Sarah.getAccountHolder());
        System.out.println("Account number: " + Sarah.getAccountNumber());
        System.out.println("AvaleableBalance"+ Sarah.getAvaleableBalance());

        Sarah.deposit(2000);
        Sarah.ShowBalance();
        Sarah.withDraw(2500);
        Sarah.ShowBalance();
        Sarah.deposit(10000);
        Sarah.ShowBalance();

        BankAccount Serkan = new BankAccount();
        Serkan.getAccountInfo();
        Serkan.setAccountHolder("Serkan Suusy");
        Serkan.setAccountNumber(12757746435l);

        Serkan.deposit(10000);
        Serkan.ShowBalance();
        Serkan.withDraw(300);
        Serkan.ShowBalance();

        BankAccount[] accounts = {Sarah, Serkan};
        ArrayList<BankAccount> Accounts = new ArrayList<>();
        Accounts.addAll(Arrays.asList(accounts));
    }
}
