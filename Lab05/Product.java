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

    public double sell(int n) {
        stock -= n;
        return n * price;
    }

    public void restock(int n) {
        stock += n;
    }

    public boolean has(int n) {
        return stock >= n;
    }

    @Override
    public String toString() {
        return stock + " " + name + " at $" + formatted(price);
    }

    private String formatted(double amount) {
        return new DecimalFormat("###,##0.00").format(amount);
    }
}
