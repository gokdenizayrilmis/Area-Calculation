
public class Triangle extends Shapes
{
    
    private double edge1;
    private double edge2;
    private double edge3;

    public Triangle(String name, double edge1, double edge2, double edge3) 
    { 
        super(name);
        this.edge1 = edge1;
        this.edge2 = edge2;
        this.edge3 = edge3;
    }

    @Override
    public void calculateArea() 
    { //Here we will calculate the area of the triangle.
        
        double i = (edge1 + edge2 + edge3) / 2.0;
        double triangleArea = Math.sqrt(i * (i - edge1) * (i - edge2) * (i - edge3));
        System.out.print("Here is the area of your " + getName() + ": " + triangleArea);
        
    }
    
}
