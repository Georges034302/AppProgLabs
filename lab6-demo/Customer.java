

import java.util.*;

public class Customer {
    public static void main(String[] args) {
        new Customer().use();
    }
    //initialize a field linked list of account type
    private LinkedList<Account> accounts = new LinkedList<>();
    
    
    public Customer() {
        //add new savings account to the list
        //add new loan account to the list
        accounts.add(new Account("Savings Account"));
        accounts.add(new Account("Loan Account"));
    }

    public void use() {
        char choice;
        while ((choice = readChoice()) != 'x') {
            switch (choice) {
                case 'd': deposit(); break;
                case 'w': withdraw(); break;
                case 't': transfer(); break;
                case 'v': view(); break;
                default: help(); break;
            }
        }
    }

    private char readChoice() {
        System.out.print("Customer menu (d/w/t/s/x): ");
        return In.nextChar();
    }

    private double readAmount(String action) {
        System.out.print("Amount to " + action + ": $");
        return In.nextDouble();
    }

    private String readType() {
        System.out.print("Account type: ");
        return In.nextLine();
    }

    //Lookup function: use for each loop to look up an account by type
    //Any pattern for each-loop
    private Account account(String type){
        for(Account a:accounts)
            if(a.match(type))
                return a;
        return null;
    }
       
    private void deposit() {
        //read an account from the list by type
        //if the account exist then deposit a user input amount
        //else output "No such Amount" 
        double amount = readAmount("deposit");
        Account a = account(readType());
        if(a != null){
            a.deposit(amount);
        }else{
            System.out.println("Account does not exist");
        }            
    }

    private void withdraw() {
        //read the amount to withdraw
        //Account search and read SavingsAccount
        //if account has amount then withdraw 
        //else print insufficient funds 
        double amount = readAmount("withdraw");
        Account a = account(readType());
        if(a != null){
           if(a.has(amount))
                a.withdraw(amount);
           else
                System.out.println("Not enough funds!!!");
        }else{
            System.out.println("Account does not exist");
        }  
        
    }

    private void transfer() {
        //read the amount to transfer
        //Account search and read SavingsAccount
        //if account has amount then withdraw from savings to loan in the list
        //else print insufficient funds 
        double amount = readAmount("withdraw");
        Account savings = account(readType());
        Account loan = account(readType());
        if(savings != null && loan!=null){
           if(savings.has(amount))
                savings.transferTo(amount, loan);
           else
                System.out.println("Not enough funds!!!");
        }else{
            System.out.println("Accounts do not exist");
        }  
        
    }

    private void view() {
        //read account by type 
        //if account exists then print account
        //else print account No such account    
        for(Account a:accounts)
            System.out.println(a);
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
