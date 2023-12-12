
public class Square extends Shapes
{
    
    private int edge;


    public Square(String name, int edge) 
    {
        super(name);
        this.edge = edge;
        
    }

    @Override
    public void calculateArea() 
        { //Here we will calculate the area of the square.
        
        double squareArea = Math.pow(edge, 2);        
        
            System.out.println("Here is the area of your " + getName() + ": " +  squareArea);
        
        }
    
    
}
