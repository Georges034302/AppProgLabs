package lab9;
import java.text.*;
import javafx.beans.property.*; //import this package to use beans properties

public class Group {
    private String name;
    private int capacity;
    private double price;
    //private int sold;
    //change sold field into Simple Integer Bean Property
    
    //add income field as Simple Double Bean Property
    
    //add left field as Simple Integer Bean Property
    
        
    public Group(String name, int capacity, double price) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
        //set sold to zero using set method        
        
        //bind income property to sold multiplied by price
        
        //bind left to sold subtract it from capacity and multiply by -1       
      
    }

    public String getName() { return name; }
    public int getCapacity() { return capacity; }
    public double getPrice() { return price; }
    //return sold property
    public int getSold() { return 0; }
    //return income property
    public double getIncome() { return 0; }
    //return left property
    public int getLeft() { return 0; }
    //define a ReadOnlyIntegerProperty to get soldProperty
    
    //define a ReadOnlyIntegerProperty to get incomeProperty   
    
    //define a ReadOnlyIntegerProperty to get leftProperty   
    
    public boolean canSell(int number){
        return number <= capacity;
    }
    
    public void sell(int number) {
        //set sold property to the old sold + number
        
    }

    @Override
    public String toString() {
        return getLeft() + " " + name + " seats @ $" + formatted(price);
    }

    private String formatted(double money) {
        return new DecimalFormat("###,##0.00").format(money);
    }
}
