
public class Customer
{
    private Account savings;
    private Account loan;
    
    public static void main(String[] args){
        new Customer().menu();        
    }
    
    public Customer(){
       savings = new Account("Savings");
       loan = new Account("Loan");
    }

    private double readAmount(String action){
        System.out.print("Amount to "+action+": $");
        return In.nextDouble();
    }
    private void deposit(){
        savings.deposit(readAmount("deposit"));
    }
    
    private void withdraw(){
        double amount = readAmount("withdraw");
        if(savings.has(amount))
            savings.withdraw(amount);
        else
            System.out.println("Not enough funds!");
    }
    
    private void transfer(){
        double amount = readAmount("transfer");
        if(savings.has(amount))
            savings.transferTo(loan, amount);
        else
            System.out.println("Not enough funds!");
    }
    
    private char readChoice(){
        System.out.print("Choice: ");
        return In.nextChar();
    }
    
    private void menu(){
        char choice;
        while((choice=readChoice())!='x'){
           switch(choice){
               case 'd': deposit();break;
               case 'w': withdraw();break;
               case 't': transfer();break;
               case 'v': view(); break;
               default: help();break;
           }
        }
        System.out.println("Done");
    }
    
    private void view(){
        System.out.println(savings.toString());
        System.out.println(loan);
    }
    
    private void help() {
        System.out.println("Menu options");
        System.out.println("d = deposit");
        System.out.println("w = withdraw");
        System.out.println("t = transfer");
        System.out.println("v = view");
        System.out.println("x = exit");
    }
}
