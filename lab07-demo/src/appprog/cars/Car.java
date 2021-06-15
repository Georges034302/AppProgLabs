package appprog.cars;

/**
 *
 * @author george
 */
public abstract class Car {
        protected String type;
        protected int pos;
        
        public Car(String type){
            this.type = type;
            this.pos = 0;
        }
        
        protected void run(){
            System.out.println(this.type+" is moving...");
        }
        
        protected int distance(int speed, int time){
                return speed * time;
        }
        
        protected abstract void showInfo();
        
}
