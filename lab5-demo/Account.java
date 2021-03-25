import java.text.*;

public class Account
{
    private double balance; //get the balance from user-input
    private String type; //intialize type from parameter
    
    public Account(String type){
        this.type = type;
        this.balance = readBalance();
    }
    
    private double readBalance(){
        System.out.print(type+" initial balance: $");
        return In.nextDouble();
    }
    
    public void deposit(double amount){
        this.balance += amount;
    }
    
    public void withdraw(double amount){
        this.balance -= amount;
    }
    
    public void transferTo(Account other, double amount){
        this.balance -= amount;
        other.balance += amount;
    }
    
    public boolean has(double amount){
        return balance >= amount;
    }
    //toString is inherited from super-class Object
    public String toString(){     
        return (balance >0) ? type+" balance is $"+formatted(balance): "empty";       
    }
    
    private String formatted(double amount){
        return new DecimalFormat("###,##0.00").format(amount);
    }
}//end class
