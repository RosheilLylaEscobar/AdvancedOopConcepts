
public class Triangle extends GeometricFigure {
	
	private double area;
	
	public Triangle(double height, double width, String var) 
	{
		super(var, height, width);
	}
	public double Area(double height, double width)
	{
		area = ((height*width)/2);
		return area;
	}

}
