package appprog.zoo;

/**
 *
 * @author George
 */
public abstract class Animal {
    protected String type;
    protected String food;
    
    protected abstract void show();
    protected abstract void makeNoise();
    
    protected Animal(String type, String food){
        this.type = type;
        this.food = food;
    }
    protected void eat(){
        System.out.println(type+" is eating "+food);
    }
}
