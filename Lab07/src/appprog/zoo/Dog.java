package appprog.zoo;

/**
 *
 * @author George
 */
public class Dog extends Animal {
    public Dog(){
        super("Dog","Snack");
    }
    @Override
    public void  eat(){
        super.eat();
    }
    @Override
    public void makeNoise() {
        System.out.println(super.type+" is barking");
    }

    @Override
    protected void show() {
        eat();
        makeNoise();
    }
}
