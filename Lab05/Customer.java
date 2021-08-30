/**
 * A customer has a savings account and a loan account.
 *
 * You can deposit into and withdraw from the savings account,
 * and you can transfer money from the savings to the loan account.
 * You can also view the balance of all accounts.
 */
public class Customer {
    private Account savings;
    private Account loan;

    public static void main(String[] args) {
        new Customer().use();
    }    

    public Customer(){
        this.savings = new Account("Savings");
        this.loan = new Account("Loan");
    }

    private char readChoice(){
        System.out.print("Customer menu (d/w/t/s/x): ");
        return In.nextChar();
    }

    public void use() {
        char c;
        while((c = readChoice()) != 'x'){
            switch(c){
                case 'd': deposit(); break;
                case 'w': withdraw(); break;
                case 't': transfer(); break;
                case 's': show(); break;
                default: help(); break;
            }
        }
        System.out.println("Done");
    }

    private void deposit() {
        savings.deposit(readAmount("deposit"));
    }

    private void withdraw() {
        double amount = readAmount("withdraw");
        if(savings.has(amount))
            savings.withdraw(amount);
        else
            System.out.println("Insufficient funds");
    }

    private void transfer() {
        double amount = readAmount("transfer");
        if(savings.has(amount))
           savings.transferTo(amount,loan);
        else
            System.out.println("Insufficient funds");
    }

    private double readAmount(String action) {
        System.out.print("Amount to "+action+": $");
        return In.nextDouble();
    }

    private void show() {
        System.out.println(savings);
        System.out.println(loan);
    }

    private void help() {
        System.out.println("Menu options");
        System.out.println("d = deposit");
        System.out.println("w = withdraw");
        System.out.println("t = transfer");
        System.out.println("s = show");
        System.out.println("x = exit");
    }
}
