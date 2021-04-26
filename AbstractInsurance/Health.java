
public class Health extends Insurance {

		public Health(String var, double price) {
			super("Health", price);
			setCost();
		}
		@Override
		void setCost() {
			price = 196;
			
		}
		@Override
		void display() {
			System.out.println( "Type of Insurance is " + getVarHealth());
			System.out.println( "Fee per Month is: " + "$" + getPriceHealth() );
		}

}
