  

import java.text.*;


public class Account {
    private String type;
    private double balance;

    public Account(String type) {
        this.type = type;
        balance = readBalance();
    }

    private double readBalance() {
        System.out.print("Initial " + type + " balance: $");
        return In.nextDouble();
    }

    public boolean match(String type){
        return this.type.toLowerCase().contains(type.toLowerCase().trim());
    }
    
    public boolean has(double amount) {
        return balance >= amount;
    }
 
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void transferTo(double amount, Account target) {
        balance -= amount;
        target.balance += amount;
    }

    @Override
    public String toString() {
        return type + " account has $" + formatted(balance);
    }

    private String formatted(double amount) {
        return new DecimalFormat("###,##0.00").format(amount);
    }
}
