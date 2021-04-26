
public class Life extends Insurance {

		public Life(String var, double price) {
			super("Life", price);
			setCost();
		}

		void setCost() {
			price = 36;
			
		}
		void display() {
			System.out.println("Type of Insurance is " + getVarLife());
			System.out.println("Fee per Month is: " + "$" + getPriceLife() );
		}

}
