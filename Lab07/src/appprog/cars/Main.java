package appprog.cars;

import java.util.*;
public class Main
{
    public static void main(String[] args){
        Main m = new Main();
        m.run();
        m.showStatus();
        
    }
    private LinkedList<Car> cars = new LinkedList<>();
    public Main(){
        cars.add(new BMW());
        cars.add(new Audi());
    }

    private void run(){        
        cars.forEach(car -> car.run());        
    }
    
    private void showStatus(){
        cars.forEach(car -> car.showInfo());
    }   
    
}
