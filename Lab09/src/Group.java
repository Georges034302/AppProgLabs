import java.text.*;
import javafx.beans.property.*; //import this package to use beans properties

public class Group {
    private String name;
    private int capacity;
    private double price;
    //private int sold;
    //change sold field into Simple Integer Bean Property
    private IntegerProperty sold = new SimpleIntegerProperty();
    //add income field as Simple Double Bean Property
    private DoubleProperty income = new SimpleDoubleProperty();
    //add left field as Simple Integer Bean Property
    private IntegerProperty left = new SimpleIntegerProperty();
        
    public Group(String name, int capacity, double price) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
        //set sold to zero using set method   
        sold.set(0);
        //bind income property to sold multiplied by price
        income.bind(sold.multiply(price));
        //bind left to sold subtract it from capacity and multiply by -1      
        left.bind(sold.subtract(capacity).multiply(-1));
    }

    public String getName() { return name; }
    public int getCapacity() { return capacity; }
    public double getPrice() { return price; }
    //return sold property
    public int getSold() { return sold.get(); }
    //return income property
    public double getIncome() { return income.get(); }
    //return left property
    public int getLeft() { return left.get(); }
    
    //define a ReadOnlyIntegerProperty to get soldProperty
    public final ReadOnlyIntegerProperty soldProperty(){return sold;}
    
    //define a ReadOnlyIntegerProperty to get incomeProperty   
    public final ReadOnlyDoubleProperty incomeProperty(){return income;}
    
    //define a ReadOnlyIntegerProperty to get leftProperty  
    public final ReadOnlyIntegerProperty leftProperty(){return left;}
    
    public boolean canSell(int number){
        return number <= capacity;
    }
    
    public void sell(int number) {
        //set sold property to the old sold + number
        sold.set(sold.get() + number);
    }

    @Override
    public String toString() {
        return getLeft() + " " + name + " seats @ $" + formatted(price);
    }

    private String formatted(double money) {
        return new DecimalFormat("###,##0.00").format(money);
    }
}
