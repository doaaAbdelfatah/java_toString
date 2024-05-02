package banking;

public class Main {
    public static void main(String[] args) {
        SavingsAccount ba = new SavingsAccount("123456" , 5000);
        ba.deposit(1000);
        System.out.println(ba.getBalance()); // 6000
        ba.withdraw(2000);
        System.out.println(ba.getBalance()); // 4000
        ba.withdraw(5000);
        System.out.println(ba); // 4000
        ba.addInterest();
        System.out.println(SavingsAccount.INTEREST_RATE);
        System.out.println(ba);
        System.out.println("----------------");

        CurrentAccount ca = new CurrentAccount("789999990" , 4000);
        ca.withdraw(2000);

        System.out.println(ca);
        ca.withdraw(1501);
        System.out.println(ca);
    }
}
