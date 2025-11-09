package helperClasses;

public class BankAccountClass {
    Long accountNumber;
    String holderName;
    Double balance;

    public BankAccountClass(Long acountNumber, String holderName, Double balance){
        this.accountNumber = acountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void displayDetail(){
        System.out.println("Account number of " + holderName + " is " + accountNumber + " and the balance in the account is " + balance);
    }
}
