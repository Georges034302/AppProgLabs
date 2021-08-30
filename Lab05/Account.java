import java.text.*;
/**
 * Each account has a type (Savings/Loan) and a balance.
 * The initial balance is read in from the user.
 *
 * You can deposit into and withdraw from an account, and
 * transfer money to another account.
 * In all of these, the amount is read in.
 */
public class Account {
    private String type;
    private double balance;    

    public Account(String type){
        this.type = type;
        this.balance = readBalance();
    }

    private double readBalance(){
        System.out.print("Initial "+type+" balance: $");
        return In.nextDouble();
    }

    public boolean has(double amount) {
        return amount <= balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public void transferTo(double amount, Account target) {
        this.balance -= amount;
        target.balance += amount;
    }

    @Override
    public String toString(){
        return this.type+" account has $"+formatted(this.balance);
    }

    private String formatted(double amount){
        return new DecimalFormat("###,##0.00").format(amount);
    }
}
