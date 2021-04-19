import java.text.*;
public class Temp
{
    
    
    //Create a Bank system:
    /*
     * Every customer has a saving and loan accounts
     * An account has a type and balance
     * A customer can: deposit, withraw, transfer, view 
     */
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    


    private void help() {
        System.out.println("Menu options");
        System.out.println("d = deposit");
        System.out.println("w = withdraw");
        System.out.println("t = transfer");
        System.out.println("v = view");
        System.out.println("x = exit");
    }
    
    private String formatted(double amount){
        return new DecimalFormat("###,##0.00").format(amount);
    }
    
    public Temp(){}
}
