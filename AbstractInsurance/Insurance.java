
public abstract class Insurance {
	
	public String var;
	public double price;
	

	public Insurance(String var, double price) {
		// TODO Auto-generated constructor stub
		this.var = var;
		this.price = price;
	}
	public String getVarLife()
	{
		return var;
	}
	public String getVarHealth() {
		return var;
	}
	public double getPriceLife()
	{
		return price;
	}
	public double getPriceHealth()
	{
		return price;
	}
	abstract void setCost();
	abstract void display();
	

}
