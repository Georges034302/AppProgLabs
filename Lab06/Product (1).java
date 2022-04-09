import java.text.*;

public class Product {
    private String name;
    private int stock;
    private double price;

    public Product(String name, int stock, double price) {
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public boolean isEmpty() {
        return stock == 0;
    }

    public boolean has(int n) {
        return stock >= n;
    }

    public boolean nameContains(String substring) {
        return name.toLowerCase().contains(substring.toLowerCase());
    }

    public double sell(int number) {
        stock -= number;
        return number * price;
    }

    public void restock(int n) {
        stock += n;
    }

    @Override
    public String toString() {
        return name + " - " + stock + " at $" + formatted(price);
    }

    private String formatted(double amount) {
        return new DecimalFormat("###,##0.00").format(amount);
    }
}
