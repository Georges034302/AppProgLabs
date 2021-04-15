
package appprog.cars;

import java.util.LinkedList;

/**
 *
 * @author george
 */
public class Main {
    private LinkedList<Car> cars = new LinkedList<>();

    public static void main(String[] args){
        Main m = new Main();
        m.run();
        m.showStatus();
    }
    
    public Main(){
        cars.add(new BMW("BMW"));
        cars.add(new Audi("Audi"));
    }
    
    private void run(){
        cars.forEach(car->car.run());
    }
    
    private void showStatus(){
        cars.forEach(car->car.showInfo());
    }
}
