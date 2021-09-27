package appprog.shapes;
/**
 *
 * @author George
 */
public class Rectangle extends Polygon{
    private double width;
    private double height;
 
    public Rectangle(double width, double height) {
        super("Rectangle");
        this.width = width;
        this.height = height; 
    }

    @Override
    public double area() {
        return width*height;
    }

    @Override
    public int numberOfsides() {
        return 4;
    }   

    @Override
    public String name(int index) {
        return super.name(index);
    }
}
