package appprog.cars;
public class BMW extends Car implements Vehicle
{
    public BMW(){
        super("BMW");
    }

    @Override
    public void run(){
        super.run();
        int time = 1;
        while (time++ <= 10) {
            this.move(time);
        }
        
    }
    
    @Override
    public void move(int time){
        super.pos = (int)super.distance(10,time);
    }
}
