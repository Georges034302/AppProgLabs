package appprog.cars;
public abstract class Car
{
    protected String type;
    protected int pos;
    
    public Car(String type){
        this.type = type;
        this.pos = 0;
    }
    
    protected int distance(int speed, int time){
        return speed*time;
    }
    
    protected void run(){
        System.out.println(this.type+" is moving...");
    }
    
    protected void showInfo(){
        System.out.println(this.type+" is at position "+this.pos);
    }
}
