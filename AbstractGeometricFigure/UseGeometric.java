
public class UseGeometric {
	
	public static void main (String[]args) {
		double height,width,area;
		String figure;
		
		GeometricFigure[] var = new GeometricFigure[4];
		var[0] = new Square(8,8, "Square:");
		var[1] = new Square(5,5, "Square:");
		var[2] = new Triangle(6,7, "Triangle:");
		var[3] = new Triangle(3,4, "Traingle:");
		
		for(int i = 0; i <var.length; i++)
		{
			height = var[i].getHeight();
			width = var[i].getWidth();
			figure = var[i].getVar();
			area = var[i].Area(height, width);
			System.out.println( "\n" + figure + "\nHeight: " + height + "\nWidth: " + width + "\nArea: " + area);
			
		}
	}

}
