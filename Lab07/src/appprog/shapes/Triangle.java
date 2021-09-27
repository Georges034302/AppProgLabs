package appprog.shapes;
/**
 *
 * @author George
 */
public class Triangle extends Polygon{

    private double height;
    private double base;
    
    public Triangle(double height, double base){
        super("Triangle");
        this.height = height;
        this.base = base;
    }
    @Override
    public double area() {
        return base*height/2.0;
    }
    @Override
    public int numberOfsides() {
        return 3;
    }

    @Override
    public String name(int index) {
        return super.name(index);
    }
}
