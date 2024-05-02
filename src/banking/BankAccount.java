package banking;

public class BankAccount {
    private String accountNumber;
    private  double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public  void deposit (double amount){ // ايداع
        if (amount > 0) {
            balance +=amount;
        }else{
            System.out.println(amount + " Invalid amount");
        }
    }

    public  void  withdraw(double amount ){ // سحب
        if (amount > 0 && amount <= balance){
           balance -= amount;
        }else{
            System.out.println(amount + " Invalid amount");
        }
    }


}
