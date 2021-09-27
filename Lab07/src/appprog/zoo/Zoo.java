package appprog.zoo;

import java.util.LinkedList;

/**
 *
 * @author George
 */
public class Zoo {
    private LinkedList<Animal> animals = new LinkedList<>();
    
    public static void main(String[] args){
        (new Zoo()).manage();
    }
    public Zoo(){
        animals.add(new Cat());
        animals.add(new Dog());
    }
    private void manage(){
        for(Animal a: animals){
            a.show();
        }
    }
}
