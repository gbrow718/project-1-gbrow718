import java.util.Scanner;
public class Boats extends RentalItems {
	public static void main (String[] args) {
		double totalCost;
		int daysRented;
		double itemCost;
		int numRiders;
		int numLifeJackets;
		int sizeLifeJackets;
		int numPaddles;
		String typePaddles;
		double deliveryCharge = 0;
		
		//For choosing if you're ordering a type of boat or not
		int yesNoPB;
		int yesNoSK;
		int yesNoTK;
		int yesNoTPC;

		//Boat choices and total price variables
		String[] boatChoices = new String[4];
		boatChoices[0] = "paddleboard";
		double paddleboardPrice = 0;
		boatChoices[1] = "singleKayak";
		double singleKayakPrice = 0;
		boatChoices[2] = "tandemKayak";
		double tandemKayakPrice = 0;
		boatChoices[3] = "threePersonCanoe";
		double threePersonCanoePrice = 0;
		
		//Input venue for delivery charge and other constraints
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

		//Beginning of paddleboard input
		System.out.println("Would you like to rent a paddleboard boat? (1 (yes) or 2 (no)):");
		yesNoPB = input.nextInt();
		
		if (yesNoPB == 1) {
			System.out.println("How many paddleboards are you renting?");
			numRiders = input.nextInt();
			numLifeJackets = numRiders;
			
			System.out.println("How many days are you renting paddleboards for?");
			daysRented = input.nextInt();
			
			for (int i = 0; i < numRiders; i++) {
				System.out.println("What size life jacket for rider #" + i + "? (From 1 to 6):");
				sizeLifeJackets = input.nextInt();
			}
			
			numPaddles = numRiders;
			for (int i = 0; i < numPaddles; i++) {
				System.out.println("What type of paddle for paddle #" + i + "?");
				typePaddles = input.next();
			}
			
			//Discount terms
			if (daysRented > 2) {
				paddleboardPrice = ((65.00 * daysRented * numRiders) * 0.9);
				paddleboardPrice = paddleboardPrice + (paddleboardPrice * 0.06);
				paddleboardPrice = paddleboardPrice + deliveryCharge;
			}
			
			else {
				paddleboardPrice = (65.00 * daysRented * numRiders);
				paddleboardPrice = paddleboardPrice + (paddleboardPrice * 0.06);
				paddleboardPrice = paddleboardPrice + deliveryCharge;
			}
			
			System.out.println("With " + numRiders + " riders for " + daysRented + " days, your total cost for paddleboards will be $" + paddleboardPrice + "." );
		}
		
		else if (yesNoPB == 2) {
			System.out.println("You are not ordering any paddleboards.");
		}
		
		else {
			System.out.println("Invalid answer, please try again.");
			System.exit(1);
		}
		
		//Beginning of single kayak input
		System.out.println("Would you like to rent a single-person kayak? (1 (yes) or 2 (no)):");
		yesNoSK = input.nextInt();
				
		if (yesNoSK == 1) {
			System.out.println("How many single-person kayaks are you renting?");
			numRiders = input.nextInt();
			numLifeJackets = numRiders;
					
			System.out.println("How many days are you renting single-person kayaks for?");
			daysRented = input.nextInt();
					
			for (int i = 0; i < numRiders; i++) {
				System.out.println("What size life jacket for rider #" + i + "? (From 1 to 6):");
				sizeLifeJackets = input.nextInt();
			}
					
			numPaddles = numRiders;
			for (int i = 0; i < numPaddles; i++) {
				System.out.println("What type of paddle for paddle #" + i + "?");
				typePaddles = input.next();
			}
				
			//Discount terms
			if (daysRented > 2) {
				singleKayakPrice = ((45.00 * daysRented * numRiders) * 0.9);
				singleKayakPrice = singleKayakPrice + (singleKayakPrice * 0.06);
				singleKayakPrice = singleKayakPrice + deliveryCharge;
			}
			
			else {
				singleKayakPrice = (45.00 * daysRented * numRiders);
				singleKayakPrice = singleKayakPrice + (singleKayakPrice * 0.06);
				singleKayakPrice = singleKayakPrice + deliveryCharge;
			}
			
			System.out.println("With " + numRiders + " riders for " + daysRented + " days, your total cost for single-person kayaks will be $" + singleKayakPrice + "." );
		}
				
		else if (yesNoSK == 2) {
					System.out.println("You are not ordering any single-person kayaks.");
		}
				
		else {
			System.out.println("Invalid answer, please try again.");
			System.exit(1);
		}
		
		//Beginning of tandem kayak input
		System.out.println("Would you like to rent a tandem kayak? (1 (yes) or 2 (no)):");
		yesNoTK = input.nextInt();
						
		if (yesNoTK == 1) {
			System.out.println("How many tandem kayaks are you renting? There must be two riders ber kayak!");
			numRiders = input.nextInt();
			numLifeJackets = numRiders * 2; //Two riders per boat
							
			System.out.println("How many days are you renting tandem kayaks for?");
			daysRented = input.nextInt();
							
			for (int i = 0; i < numLifeJackets; i++) {
				System.out.println("What size life jacket for rider #" + i + "? (From 1 to 6):");
				sizeLifeJackets = input.nextInt();
			}
							
			numPaddles = numLifeJackets;
			for (int i = 0; i < numPaddles; i++) {
				System.out.println("What type of paddle for paddle #" + i + "?");
				typePaddles = input.next();
			}
					
			//Discount terms
			if (daysRented > 2) {
				tandemKayakPrice = ((65.00 * daysRented * numRiders) * 0.9);
				tandemKayakPrice = tandemKayakPrice + (tandemKayakPrice * 0.06);
				tandemKayakPrice = tandemKayakPrice + deliveryCharge;
			}
			
			else {
				tandemKayakPrice = (65.00 * daysRented * numRiders);
				tandemKayakPrice = tandemKayakPrice + (tandemKayakPrice * 0.06);
				tandemKayakPrice = tandemKayakPrice + deliveryCharge;
			}
			
			System.out.println("With " + numRiders + " boats for " + daysRented + " days, your total cost for tandem kayaks will be $" + tandemKayakPrice + "." );
		}
						
		else if (yesNoTK == 2) {
			System.out.println("You are not ordering any tandem kayaks.");
		}
						
		else {
			System.out.println("Invalid answer, please try again.");
			System.exit(1);
		}
		
		//Beginning of three person canoe input
		System.out.println("Would you like to rent a three person canoe? (1 (yes) or 2 (no)):");
		yesNoTPC = input.nextInt();
								
		if (yesNoTPC == 1) {
			System.out.println("How many three person canoes are you renting? There must be three riders per canoe!");
			numRiders = input.nextInt();
			numLifeJackets = numRiders * 3; //Three riders per boat
									
			System.out.println("How many days are you renting three person canoes for?");
			daysRented = input.nextInt();
									
			for (int i = 0; i < numLifeJackets; i++) {
				System.out.println("What size life jacket for rider #" + i + "? (From 1 to 6):");
				sizeLifeJackets = input.nextInt();
			}
									
			numPaddles = numLifeJackets;
			for (int i = 0; i < numPaddles; i++) {
				System.out.println("What type of paddle for paddle #" + i + "?");
				typePaddles = input.next();
			}
				
			//Discount terms
			if (daysRented > 2) {
				threePersonCanoePrice = ((75.00 * daysRented * numRiders) * 0.9);
				threePersonCanoePrice = threePersonCanoePrice + (threePersonCanoePrice * 0.06);
				threePersonCanoePrice = threePersonCanoePrice + deliveryCharge;
			}
			
			else {
				threePersonCanoePrice = (75.00 * daysRented * numRiders);
				threePersonCanoePrice = threePersonCanoePrice + (threePersonCanoePrice * 0.06);
				threePersonCanoePrice = threePersonCanoePrice + deliveryCharge;
			}
			
			System.out.println("With " + numRiders + " boats for " + daysRented + " days, your total cost for three person canoes will be $" + threePersonCanoePrice + "." );
			System.out.println("");
		}
								
		else if (yesNoTPC == 2) {
			System.out.println("You are not ordering any three person canoes.");
			System.out.println("");	
		}
								
		else {
			System.out.println("Invalid answer, please try again.");
			System.exit(1);
		}
		
		//Total prices printed
		System.out.println("Receipt:");
		System.out.println("--------------------------------------------------------------");
		System.out.println("Your total cost for paddleboards will be $" + paddleboardPrice + "." );
		System.out.println("Your total cost for single-person kayaks will be $" + singleKayakPrice + "." );
		System.out.println("Your total cost for tandem kayaks will be $" + tandemKayakPrice + "." );
		System.out.println("Your total cost for three person canoes will be $" + threePersonCanoePrice + "." );
		System.out.println("Your total cost for all boats is $" + (paddleboardPrice + singleKayakPrice + tandemKayakPrice + threePersonCanoePrice) + ".");
		
	}
}
