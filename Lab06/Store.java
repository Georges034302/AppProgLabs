import java.util.*;

public class Store {
    public static void main(String[] args) {
        new Store().use();
    }
    private CashRegister cashRegister;
    private LinkedList<Product> products = new LinkedList<Product>();

    public Store() {
        cashRegister = new CashRegister();
        products.add(new Product("Whiteboard Marker", 85, 1.50));
        products.add(new Product("Whiteboard Eraser", 45, 5.0));
        products.add(new Product("Black Pen", 100, 1.50));
        products.add(new Product("Red Pen", 100, 1.50));
        products.add(new Product("Blue Pen", 100, 1.50));
    }

    public void use() {
        char choice;
        while ((choice = readChoice()) != 'x') {
            switch (choice) {
            case 's': sell(); break;
            case 'r': restock(); break;
            case 'v': viewStock(); break;
            case 'c': viewCash(); break;
            case 'p': pruneProducts(); break;
            default: help(); break;
            }
        }
        System.out.println("Done");
    }

    private char readChoice() {
        System.out.print("Choice (s/r/v/c/p/x): ");
        return In.nextChar();
    }

    private void sell() {
        LinkedList<Product> products = products(readName());
        if (products.size() == 0)
            System.out.println("No such product");
        else if (products.size() == 1) {
            Product product = products.get(0);
            System.out.println("Selling " + product.getName());
            int number = readNumber();
            if (product.has(number)) {
                double sale = product.sell(number);
                cashRegister.add(sale);
            }
            else
                System.out.println("Not enough stock");
        }
        else {
            System.out.println("Multiple products match:");
            for (Product product : products) {
                System.out.println(product);
            }
        }
    }

    private void restock() {
        String name = readName();
        LinkedList<Product> matches = products(name);
        if (matches.size() == 0) {
            System.out.println("Adding new product");
            products.add(new Product(name, readNumber(), readPrice()));
        }
        else {
            for (Product product : matches) {
                System.out.println("Restocking " + product.getName());
                product.restock(readNumber());
            }
        }
    }

    private void viewStock() {
        for (Product product : products)
            System.out.println(product);
    }

    private void viewCash() {
        System.out.println(cashRegister);
    }

    private void pruneProducts() {
        products.removeAll(emptyProducts());
    }

    private String readName() {
        System.out.print("Name: ");
        return In.nextLine();
    }

    private double readPrice() {
        System.out.print("Price: $");
        return In.nextDouble();
    }

    private int readNumber() {
        System.out.print("Number: ");
        return In.nextInt();
    }

    private LinkedList<Product> products(String substring) {
        LinkedList<Product> matches = new LinkedList<Product>();
        for (Product product : products)
            if (product.nameContains(substring))
                matches.add(product);
        return matches;
    }

    private LinkedList<Product> emptyProducts() {
        LinkedList<Product> empties = new LinkedList<Product>();
        for (Product product : products)
            if (product.isEmpty())
                empties.add(product);
        return empties;
    }

    private void help() {
        System.out.println("Menu options");
        System.out.println("s = sell");
        System.out.println("r = restock");
        System.out.println("v = view stock");
        System.out.println("c = view cash");
        System.out.println("p = prune products");
        System.out.println("x = exit");
    }
}
