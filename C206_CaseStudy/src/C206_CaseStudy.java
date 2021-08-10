
import java.time.LocalDate;
import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Stall
		Stall [] stallArray = new Stall [10];
		stallArray[0] = (new Stall(1, "Chicken Rice Stall", LocalDate.parse("2018-12-12")));
		stallArray[1] = (new Stall(2, "Western Food Stall", LocalDate.parse("2018-10-05")));
			
		//
		
		int option = 0;
		while(option != 6) {
			
	
			manu();
			option = Helper.readInt("Enter option: "); 
			
			if(option == 1) {
				stall(stallArray);
				
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
	
	public static void stall(Stall []  stallList) {
		Helper.line(30, "-");
		System.out.println("Manage stall");
		Helper.line(30, "-");
		
		System.out.println("1. Add a new stall" );
		System.out.println("2. View an existing stall " );
		System.out.println("3. Delete an existing stall" );
		System.out.println("" );
		
		int option = Helper.readInt("Enter option: "); 
		
		if(option == 1) {
			Stall newStall = inputStall();
			addStall(stallList, newStall);
			
		}else if(option == 2) {
			viewAllStall(stallList);
			
		}else if(option == 3) {
			deleteStall(stallList);

		}else {
			System.out.println("Wrong option, please try agian!!");

		}
	}
	
	//Add stall
	public static Stall inputStall() {
		Helper.line(30, "-");
		System.out.println("Add Stall");
		Helper.line(30, "-");
		
		int StallID = Helper.readInt("Enter Stall ID > ");
		String StallName = Helper.readString("Enter Stall Name > ");
		LocalDate operationDate = LocalDate.parse(Helper.readString("Enter Operation Date > "));

		Stall newStall= new Stall(StallID, StallName, operationDate);
		return newStall;
		
	}
	public static void addStall(Stall [] stallList, Stall newStall) {
		
		for(int i = 0; i < stallList.length; i++) {
			if(stallList[i].equals(null)) {
				stallList[i] = newStall;
				System.out.println("New Stall Added");
				break; 
			}else {
				System.out.println("Stall Added Unsuccessful, total stalls in the cafeteria are full !!! ");
			}
		}
	}
	
	//View stall
	public static String seachAllSatll(Stall [] stallList) {
		String output = "";
		
		for (int i = 0; i < stallList.length; i++) {
			if(stallList[i] != null){
				output += stallList[i].toString();
			}
		}
		return output;		
	}
	
	public static void viewAllStall(Stall [] stallList) {
		Helper.line(30, "-");
		System.out.println("View stall");
		Helper.line(30, "-");
		
		String output = String.format("%-10s %-20s %-20s\n", "Stall ID", "Stall Name",
				"Stall Operation Date");
		 output += seachAllSatll(stallList);	
		System.out.println(output);
	}
	
	//Delete stall
	public static boolean doDeleteStall(Stall [] stallList, int StallID) {
		boolean isReturned = false;

		for (int i = 0; i < stallList.length; i++) {
			if (StallID == stallList[i].getStallId()){
				stallList[i] = null; 
				isReturned = true;
			}
		}
		return isReturned;
		
	}

	public static void deleteStall(Stall [] camcorderList) {
		viewAllStall(camcorderList);
		int StallID = Helper.readInt("Enter asset tag > ");
		Boolean isReturned = doDeleteStall(camcorderList, StallID);
		
		if (isReturned == false) {
			System.out.println("Invalid asset Stall ID");
		} else {
			System.out.println("Stall with " + StallID + " Delete!!!");
		}
	}
	

}
