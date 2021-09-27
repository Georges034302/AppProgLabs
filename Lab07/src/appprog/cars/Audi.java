package appprog.cars;

public class Audi extends Car implements Vehicle
{
   public Audi(){
        super("Audi");
   }

    @Override
    public void run(){
        super.run();
        int time = 1;
        while (time++ <= 10) this.move(time);
        
    }
    
    @Override
    public void move(int time){
        super.pos = (int)super.distance(5,time);
    }
}
