
public class Pentagon extends Shapes
{

    private double edge;
    private double radius;
    
    public Pentagon(String name, double edge, double radius) 
    {
        super(name);
        this.edge = edge;
        this.radius = radius;
    }

    @Override
    public void calculateArea()
    { //Here we will calculate the area of the pentagon.
        
        double pentagonArea = 5 * ((edge * radius)/2);
        
        System.out.println("Here is the area of your " + getName() + ": " + pentagonArea);
        
    }
    
}
