public class Store {
    public static void main(String[] args) {
        new Store().use();
    }
    private CashRegister cashRegister;
    private Product product;

    public Store() {
        cashRegister = new CashRegister();
        product = new Product("Sticky tape", 200, 2.99);
    }

    public void use() {
        char choice;
        while ((choice = readChoice()) != 'x') {
            switch (choice) {
            case 's': sell(); break;
            case 'r': restock(); break;
            case 'v': viewStock(); break;
            case 'c': viewCash(); break;
            default: help(); break;
            }
            System.out.println("Done");
        }
    }

    private char readChoice() {
        System.out.print("Choice (s/r/v/c/x): ");
        return In.nextChar();
    }

    private void viewCash() {
        System.out.println(cashRegister);
    }

    private void sell() {
        int number = readNumber();
        if (product.has(number)) {
            double sale = product.sell(number);
            cashRegister.add(sale);
        }
        else
            System.out.println("Not enough stock");
    }

    private void restock() {
        product.restock(readNumber());
    }

    private int readNumber() {
        System.out.print("Number: ");
        return In.nextInt();
    }

    private void viewStock() {
        System.out.println(product);
    }

    private void help() {
        System.out.println("Menu options");
        System.out.println("s = sell");
        System.out.println("r = restock");
        System.out.println("v = view stock");
        System.out.println("c = view cash");
        System.out.println("x = exit");
    }
}
