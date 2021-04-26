
public class Square extends GeometricFigure {
	
private double area;
	
	public Square(double height, double width, String var) {
		super(var, height ,width);
	}
	public double Area(double height, double width)
	{
		area = (height*width);
		return area;
	}

}
