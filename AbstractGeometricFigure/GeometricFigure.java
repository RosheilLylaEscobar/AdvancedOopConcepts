
public abstract class GeometricFigure {
	
	public double width, height;
	public String var;
	
	public GeometricFigure(String var, double width, double height) {
		// TODO Auto-generated constructor stub
		this.var = var;
		this.width = width;
		this.height = height;
		}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getVar() {
		return var;
	}

	public void setVar(String var) {
		this.var = var;
	}
	public abstract double Area(double height, double width);

}
