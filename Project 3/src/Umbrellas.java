import java.util.Scanner;
public class Umbrellas extends RentalItems {
	public static void main (String[] args) {
		float totalCost;
		int daysRented;
		double itemCost;
		double deliveryCharge = 0;
		int numUmbrellas;
		
		//Used for choosing an umbrella
		int yesNoCS;
		int yesNoS;
		int yesNoF;
		int yesNoT;
		
		//Umbrella choices and prices for totals
		String[] umbrellaChoices = new String[4];
		umbrellaChoices[0] = "chairSide";
		double chairsidePrice = 0;
		umbrellaChoices[1] = "single";
		double singlePrice = 0;
		umbrellaChoices[2] = "family";
		double familyPrice = 0;
		umbrellaChoices[3] = "tent";
		double tentPrice = 0;
		
		//Venue for logic checks
		Scanner input = new Scanner(System.in);
		System.out.println("Which venue are you renting from? (V: Vacation Venue / B: Bella's Beach / G: Griffin's Grove):");
		char address = input.next().charAt(0);
		
		if (address == 'V') {
			deliveryCharge = 0;
		}
		
		else if (address == 'B') {
			deliveryCharge = 10.00;
		}
		
		else if (address == 'G') {
			deliveryCharge = 20.00;
		}
		
		else {
			System.out.println("The venue you entered is invalid, try again.");
			System.exit(1);
		}
		
		//Beginning of chairside input
		System.out.println("Would you like to rent a chaiside umbrella? (1 (yes) or 2 (no)):");
		yesNoCS = input.nextInt();
		
		if (yesNoCS == 1) {
			System.out.println("How many chairside umbrellas are you renting?");
			numUmbrellas = input.nextInt();
			
			System.out.println("How many days are you renting chairside umbrellas for?");
			daysRented = input.nextInt();
			
			chairsidePrice = ((5.00 * daysRented * numUmbrellas) * 0.9);
			chairsidePrice = chairsidePrice + (chairsidePrice * 0.06);
			chairsidePrice = chairsidePrice + deliveryCharge;

		}
		
		else if (yesNoCS == 2) {
			System.out.println("You are not renting any chairside umbrellas.");
		}
		
		else {
			System.out.println("Invalid answer, please try again.");
			System.exit(1);
		}
		
		//Beginning of single input
		System.out.println("Would you like to rent a single umbrella? (1 (yes) or 2 (no)):");
		yesNoS = input.nextInt();
		
		if (yesNoS == 1) {
			System.out.println("How many single umbrellas are you renting?");
			numUmbrellas = input.nextInt();
			
			System.out.println("How many days are you renting single umbrellas for?");
			daysRented = input.nextInt();
			
			singlePrice = ((10.00 * daysRented * numUmbrellas) * 0.9);
			singlePrice = singlePrice + (singlePrice * 0.06);
			singlePrice = singlePrice + deliveryCharge;

		}
		
		else if (yesNoS == 2) {
			System.out.println("You are not renting any single umbrellas.");
		}
		
		else {
			System.out.println("Invalid answer, please try again.");
			System.exit(1);
		}
		
		//Beginning of family input
		System.out.println("Would you like to rent a family umbrella? (1 (yes) or 2 (no)):");
		yesNoF = input.nextInt();
		
		if (yesNoF == 1) {
			System.out.println("How many family umbrellas are you renting?");
			numUmbrellas = input.nextInt();
			
			System.out.println("How many days are you renting family umbrellas for?");
			daysRented = input.nextInt();
			
			familyPrice = ((15.00 * daysRented * numUmbrellas) * 0.9);
			familyPrice = familyPrice + (familyPrice * 0.06);
			familyPrice = familyPrice + deliveryCharge;

		}
		
		else if (yesNoF == 2) {
			System.out.println("You are not renting any family umbrellas.");
		}
		
		else {
			System.out.println("Invalid answer, please try again.");
			System.exit(1);
		}
		
		//Beginning of tent input
		System.out.println("Would you like to rent a tent umbrella? (1 (yes) or 2 (no)):");
		yesNoT = input.nextInt();
		
		if (yesNoT == 1) {
			System.out.println("How many tent umbrellas are you renting?");
			numUmbrellas = input.nextInt();
			
			System.out.println("How many days are you renting tent umbrellas for?");
			daysRented = input.nextInt();
			
			tentPrice = ((20.00 * daysRented * numUmbrellas) * 0.9);
			tentPrice = tentPrice + (tentPrice * 0.06);
			tentPrice = tentPrice + deliveryCharge;
		}
		
		else if (yesNoT == 2) {
			System.out.println("You are not renting any tent umbrellas.");
		}
		
		else {
			System.out.println("Invalid answer, please try again.");
			System.exit(1);
		}
		
		//Total prices
		System.out.println("Receipt:");
		System.out.println("--------------------------------------------------------------");
		System.out.println("Your total cost for chairside umbrellas will be $" + chairsidePrice + "." );
		System.out.println("Your total cost for single umbrellas will be $" + singlePrice + "." );
		System.out.println("Your total cost for family umbrellas will be $" + familyPrice + "." );
		System.out.println("Your total cost for tent umbrellas will be $" + tentPrice + "." );
		System.out.println("Your total cost for all umbrellas will be $" + (chairsidePrice + singlePrice + familyPrice + tentPrice) + ".");
	}
}
