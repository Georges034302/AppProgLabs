import java.text.*;
import javafx.beans.property.*; //import this package to use beans properties

public class Group {
    private String name;
    private int capacity;
    private double price;
    private IntegerProperty sold = new SimpleIntegerProperty();
    private DoubleProperty income = new SimpleDoubleProperty();
    private IntegerProperty left = new SimpleIntegerProperty();
            
    public Group(String name, int capacity, double price) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
        sold.set(0);
        income.bind(sold.multiply(price));
        left.bind(sold.subtract(capacity).multiply(-1));                
    }

    public String getName() { return name; }
    public int getCapacity() { return capacity; }
    public double getPrice() { return price; }
    
    public int getSold() { return sold.get(); }   
    public double getIncome() { return income.get(); }
    public int getLeft() { return left.get(); }
    
    public final ReadOnlyIntegerProperty soldProperty(){return sold;}
    public final ReadOnlyDoubleProperty incomeProperty(){return income;}
    public final ReadOnlyIntegerProperty leftProperty(){return left;}
        
    public boolean canSell(int number){
        return number <= capacity;
    }
    
    public void sell(int number) {
        sold.set(sold.get()+number); 
    }

    @Override
    public String toString() {
        return getLeft() + " " + name + " seats @ $" + formatted(price);
    }

    private String formatted(double money) {
        return new DecimalFormat("###,##0.00").format(money);
    }
}
