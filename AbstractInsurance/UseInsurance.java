import  java.util.Scanner;

public class UseInsurance {

	public UseInsurance() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Select the type of Insurance:" + "\n 1: Life" + "\n 2: Health");

		
		while (input.hasNext()) {
            int choices = 0;
            if (input.hasNextInt()) {
                choices = input.nextInt();
		
		switch (choices){
		case 1:
			Life LifeInsurance = new Life(null, 0);
			LifeInsurance.display();
			break;
		case 2:
			Health HealthInsurance = new Health(null, 0);
			HealthInsurance.display();
			break;
			
		default:
            System.out.print("Choose from 1 and 2 only");
		}
		
			 
			 
			 
		
	}
	
		}
	}


}
