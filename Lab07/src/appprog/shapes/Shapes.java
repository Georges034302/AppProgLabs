package appprog.shapes;


import java.util.LinkedList;
/**
 *
 * @author George
 */
public class Shapes {
    
    public static void main(String[] args){
        new Shapes().show();
    }
    private LinkedList<Polygon> shapes = new LinkedList<>();
    
    public Shapes(){ 
        loadList();
    }
    
    private void loadList(){
        shapes.add(new Triangle(4,2));
        shapes.add(new Triangle(6,4));    
        shapes.add(new Rectangle(4,8));
        shapes.add(new Rectangle(6,5));
        shapes.add(new Square(4));
        shapes.add(new Square(10));
    }
    private void show(){
        int i = 1;
        for(Polygon e:shapes){
            System.out.println(e.name(i)+" area = "+e.area());
            i++;
        }
    }
}
