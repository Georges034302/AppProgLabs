package appprog.shapes;
/**
 *
 * @author George
 */
public class Square extends Polygon{
    private double side;
    
    public Square(double side){
        super("Square");
        this.side = side;
    }

    @Override
    public double area() {
        return Math.pow(side, 2);
    }

    @Override
    public int numberOfsides() {
        return 2;
    }
    
    @Override
    public String name(int index){
        return super.name(index);
    }
}
