/**
 * A customer has a savings account and a loan account.
 *
 * You can deposit into and withdraw from the savings account,
 * and you can transfer money from the savings to the loan account.
 * You can also view the balance of all accounts.
 */
 import java.util.ArrayList;

public class Customer {
    public static void main(String[] args) {
        new Customer().use();
    }
    //private Account savingsAccount;
    //private Account loanAccount;
    private ArrayList<Account> accounts = new ArrayList<>();

    public Customer() {
        //savingsAccount = new Account("Savings");
        //loanAccount = new Account("Loan");
        accounts.add(new Account("Savings"));
        accounts.add(new Account("Loan"));
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
        System.out.println("Done");
    }

    private String readType(){
        System.out.print("Account type: ");
        return In.nextLine();
    }

    //lookup the account type entered by user in the accounts arraylist - the any-pattern
    private Account account(String type){
        for(Account a:accounts)
            if(a.hasType(type))
                return a;
        return null;
    }

    private char readChoice() {
        System.out.print("Customer menu (d/w/t/v/x): ");
        return In.nextChar();
    }

    private void deposit() {
        Account savings = account(readType());
        if(savings != null){
           savings.deposit(readAmount("deposit"));
        }else{
            System.out.println("No such account");
        }
    }

    private void withdraw() {
        double amount = readAmount("withdraw");
        Account savings = account("Savings");
        if(savings != null){
            if (savings.has(amount))
                savings.withdraw(amount);
            else
                System.out.println("Insufficient funds");
        }else{
            System.out.println("No such account");
        }
    }

    private void transfer() {
        double amount = readAmount("transfer");
        Account savings = account("Savings");
        Account loan = account("Loan");
        if(savings != null){
            if (savings.has(amount)){
                if(loan !=null){
                    savings.transferTo(amount, loan);
                }else{
                    System.out.println("No such account");
                }
            }else{
                System.out.println("Insufficient funds");
            }
        }else{
            System.out.println("No such account");
        }
    }

    private double readAmount(String action) {
        System.out.print("Amount to " + action + ": $");
        return In.nextDouble();
    }

    private void view() {
        // View all accounts:
        //
        // for (Account account : accounts)
        //     System.out.println(account);
        //
        // View selected account:
        Account account = account(readType());
        if(account != null)
            System.out.println(account);
        else
            System.out.println("No such account");
        //System.out.println(loanAccount);
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
