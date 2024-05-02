package banking;

public class CurrentAccount extends  BankAccount{

    public  final  static double OVER_DRAFT_LIMIT = 500 ;
    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public  void  withdraw(double amount){
        if (getBalance() - amount >= OVER_DRAFT_LIMIT){
            super.withdraw(amount);
        }else{
            System.out.println("Invalid amount you exceed the Over Draft Limit");
        }
    }

    @Override
    public String toString() {
        return "Current Account \nAccount Number\t" + getAccountNumber()
                + "\nAccount Balance\t" + getBalance() +
                "\nOver Draft\t" + OVER_DRAFT_LIMIT  ;
    }
}
