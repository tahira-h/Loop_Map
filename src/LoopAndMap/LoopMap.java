package LoopAndMap;
import java.util.*;

public class LoopMap {
	public static void main(String[] args) {
//		Ask the user for 5 numbers		// scanner&'for'loop
//		Stores them(5 numbers) in an array list	//ArrayList
//		Finds the sum, product, largest, and smallest of those numbers
		
		Scanner input = new Scanner(System.in);
		
		ArrayList arrLi = new ArrayList();
		
		// data_type variable_name
		int sum = 1;
		int product = 2;
		int small = 0; 
		int large = 0;
		
		// for loop, ask 'for' 5 numbers
		for(int i=0; i<5; i++); {
			System.out.println();
			int userNumber = input.nextInt();		// nextInt() is for an Integer
			arrLi.add(userNumber);
			// Find the sum (Assignment operator 'addition')
			sum += userNumber;
			// Find the product	(Assignment operator 'multiply')
			product *= userNumber;
			// Find the smallest (small) (if,else)
			if(userNumber < small) {
				small = userNumber;
			}
			else {
				System.out.println("That number is too large!");
			}
			//Find the largest (large)	(if,else)
			if(userNumber > large) {
				large = userNumber;
			}
			else {
				System.out.println("That number is too small.");
			}
			//print 'for' results
			System.out.println("Sum: " + sum + "\n"
			+ "Product: " + product + "\n" 
			+ "Smallest: " + small + "\n"
			+ "Largest: " + large);
		}
		
		
// 2. You are a car dealer. Create a hash map of vehicles.
//		The model is the Key, the make is the Value.
//		Ask the customer what car (model) they are looking for. Use the Hash Map to determine if you have that vehicle, and what make it is.
//		(e.g. "Oh, you're looking for a Civic? Our Honda selection is right over here...")
		
		// HashMap<>
		HashMap<String, String> productVehicle = new HashMap();
		
		// vehicle list
		productVehicle.put("Toyota", "Prius");
		productVehicle.put("Kia", "Niro");
		productVehicle.put("Hyundai", "Elantra");
		productVehicle.put("Nissan", "Leaf");
		
		// Scanner
		Scanner clientInput = new Scanner(System.in);
		System.out.println("What vehicle model are you looking for? ");
		String interestedVehicle = clientInput.nextLine();       // nextLine() is for strings
		
		// if/else statement
		if (productVehicle.containsKey(interestedVehicle)){			// containsKey() {Key:Value}
			System.out.println("Our " + interestedVehicle + " : " + productVehicle.get(interestedVehicle) + " is this way");
		}
		else {
			System.out.println("We are currently out of that model. I can check our system to see when it will be available.");
		};
		
// End of main()
	}
	
// End of LoopMap
}
