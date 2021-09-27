package appprog.shapes;

/**
 *
 * @author George
 */
public abstract class Polygon {
    protected String type;

    public Polygon(String type) {
        this.type = type;
    }   
    public abstract double area();
    public abstract int numberOfsides();  
    protected String name(int index){
        return type+" "+index;
    }
}
