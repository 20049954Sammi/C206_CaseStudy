
public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int option = 0;
		while(option != 6) {
			
	
			manu();
			option = Helper.readInt("Enter option: "); 
			
			if(option == 1) {
				stall();
				
			}else if(option == 2) {
				
			}else if(option == 3) {
				
			}else if(option == 4) {
				
			}else if(option == 5) {
				
			}else if(option == 6) {
				System.out.println("Thank you!!");

			}else {
				System.out.println("Wrong option, please try agian!!");
			}
			
			
			
			
		}

	}
	
	public static void manu() {
		Helper.line(30, "-");
		System.out.println("Canteen Automation System");
		Helper.line(30, "-");
		
		System.out.println("1. Manage stall" );
		System.out.println("2. Manage food items " );
		System.out.println("3. Manage purchase orders  " );
		System.out.println("4. Manage promotion offers " );
		System.out.println("5. Manage orders by customer" );
		System.out.println("6. Quit" );
		
		System.out.println("" );
	}
	
	public static void stall() {
		Helper.line(30, "-");
		System.out.println("Manage stall");
		Helper.line(30, "-");
		
		System.out.println("1. Add a new stall" );
		System.out.println("2. View an existing stall " );
		System.out.println("3. Delete an existing stall" );
		System.out.println("" );
		
		int option = Helper.readInt("Enter option: "); 
		
		
	}

}
