package appprog.zoo;

/**
 *
 * @author George
 */
public class Cat extends Animal {
    public Cat(){
        super("Cat","Milk");
    }
    @Override
    public void eat(){
        super.eat();
    }

    @Override
    public void makeNoise() {
        System.out.println(super.type+" is growling");
    }

    @Override
    protected void show() {
        eat();
        makeNoise();
    }
}
