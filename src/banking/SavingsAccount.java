package banking;

public class SavingsAccount extends BankAccount { // حساب توفير ذو عائد
    public  final static double INTEREST_RATE = 0.1; // ثابت 10%
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public void  addInterest(){
        deposit(getBalance() * INTEREST_RATE);
    }

    @Override
    public String toString() {
        return "Saving Account \nAccount Number\t" + getAccountNumber()
                + "\nAccount Balance\t" + getBalance() +
                "\nInterest Rate\t" + INTEREST_RATE * 100 +" %" ;
    }
}
