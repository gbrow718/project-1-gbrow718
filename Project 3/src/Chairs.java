import java.util.Scanner;
public class Chairs extends RentalItems {
	public static void main (String[] args) {
		float totalCost;
		int daysRented;
		double itemCost;
		double deliveryCharge = 0;
		int numChairs;
		String chairColor;
		
		//Used for checking what kind of chair they're getting, if any
		int yesNoSL;
		int yesNoCL;
		int yesNoFC;
		int yesNoA;
		
		//Array of chair choices with total price set at 0
		String[] chairChoices = new String[4];
		chairChoices[0] = "slingLow";
		double slingLowPrice = 0;
		chairChoices[1] = "chaiseLounge";
		double chaiseLoungePrice = 0;
		chairChoices[2] = "foldingClassic";
		double foldingClassicPrice = 0;
		chairChoices[3] = "adirondack";
		double adirondackPrice = 0;
		
		//Color choices for adirondack chairs only
		String[] chairColorChoices = new String[3];
		chairColorChoices[0] = "blue";
		chairColorChoices[1] = "red";
		chairColorChoices[2] = "green";
		
		//Getting venue to determine delivery charge & other constraints
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
		
		//Beginning of sling low input
		System.out.println("Would you like to rent a sling low chair? (1 (yes) or 2 (no)):");
		yesNoSL = input.nextInt();
		
		if (yesNoSL == 1) {
			System.out.println("How many sling low chairs are you renting?");
			numChairs = input.nextInt();
			
			System.out.println("How many days are you renting sling low chairs for?");
			daysRented = input.nextInt();
			
			//Discount terms
			if (numChairs > 3) { 
				slingLowPrice = ((5.00 * daysRented * numChairs) * 0.9);
				slingLowPrice = slingLowPrice + (slingLowPrice * 0.06);
				slingLowPrice = slingLowPrice + deliveryCharge;
			}
			
			else { 
				slingLowPrice = (5.00 * daysRented * numChairs);
				slingLowPrice = slingLowPrice + (slingLowPrice * 0.06);
				slingLowPrice = slingLowPrice + deliveryCharge;
			}
		}
		
		else if (yesNoSL == 2) {
			System.out.println("You are not renting any sling low chairs.");
		}
		
		else {
			System.out.println("Invalid answer, please try again.");
			System.exit(1);
		}
		
		//Beginning of chaise lounge input
		System.out.println("Would you like to rent a chaise lounge chair? (1 (yes) or 2 (no)):");
		yesNoCL = input.nextInt();
		
		if (yesNoCL == 1) {
			System.out.println("How many chaise lounge chairs are you renting?");
			numChairs = input.nextInt();
			
			System.out.println("How many days are you renting chaise lounge chairs for?");
			daysRented = input.nextInt();
			
			//Discount terms
			if (numChairs > 3) { 
				chaiseLoungePrice = ((5.00 * daysRented * numChairs) * 0.9);
				chaiseLoungePrice = chaiseLoungePrice + (chaiseLoungePrice * 0.06);
				chaiseLoungePrice = chaiseLoungePrice + deliveryCharge;
			}
			
			else { 
				chaiseLoungePrice = (7.00 * daysRented * numChairs);
				chaiseLoungePrice = chaiseLoungePrice + (chaiseLoungePrice * 0.06);
				chaiseLoungePrice = chaiseLoungePrice + deliveryCharge;
			}
		}
		
		else if (yesNoCL == 2) {
			System.out.println("You are not renting any chaise lounge chairs.");
		}
		
		else {
			System.out.println("Invalid answer, please try again.");
			System.exit(1);
		}
		
		//Beginning of folding classic input
		System.out.println("Would you like to rent a folding classic chair? (1 (yes) or 2 (no)):");
		yesNoFC = input.nextInt();
		
		if (yesNoFC == 1) {
			System.out.println("How many folding classic chairs are you renting?");
			numChairs = input.nextInt();
			
			System.out.println("How many days are you renting folding classic chairs for?");
			daysRented = input.nextInt();
			
			//Discount terms
			if (numChairs > 3) { 
				foldingClassicPrice = ((5.00 * daysRented * numChairs) * 0.9);
				foldingClassicPrice = foldingClassicPrice + (foldingClassicPrice * 0.06);
				foldingClassicPrice = foldingClassicPrice + deliveryCharge;
			}
			
			else { 
				foldingClassicPrice = (7.00 * daysRented * numChairs);
				foldingClassicPrice = foldingClassicPrice + (foldingClassicPrice * 0.06);
				foldingClassicPrice = foldingClassicPrice + deliveryCharge;
			}
		}
		
		else if (yesNoFC == 2) {
			System.out.println("You are not renting any chaise lounge chairs.");
		}
		
		else {
			System.out.println("Invalid answer, please try again.");
			System.exit(1);
		}
		
		//Beginning of adirondack input
		System.out.println("Would you like to rent an adirondack chair? (1 (yes) or 2 (no)):");
		yesNoA = input.nextInt();
		
		if (yesNoA == 1) {
			System.out.println("How many adirondack chairs are you renting?");
			numChairs = input.nextInt();
			
			for (int i = 0; i < numChairs; i++) {
				System.out.println("What color chair would you like for chair #" + i + "? (Red, green or blue)");
				chairColor = input.next();
			}
			
			System.out.println("How many days are you renting adirondack chairs for?");
			daysRented = input.nextInt();
			
			//Discount terms
			if (numChairs > 3) { 
				adirondackPrice = ((5.00 * daysRented * numChairs) * 0.9);
				adirondackPrice = adirondackPrice + (adirondackPrice * 0.06);
				adirondackPrice = adirondackPrice + deliveryCharge;
			}
			
			else { 
				adirondackPrice = (7.00 * daysRented * numChairs);
				adirondackPrice = adirondackPrice + (adirondackPrice * 0.06);
				adirondackPrice = adirondackPrice + deliveryCharge;
			}
		}
		
		else if (yesNoA == 2) {
			System.out.println("You are not renting any adirondack chairs.");
		}
		
		else {
			System.out.println("Invalid answer, please try again.");
			System.exit(1);
		}
		
		//Output totals
		System.out.println("Receipt:");
		System.out.println("--------------------------------------------------------------");
		System.out.println("Your total cost for sling low chairs will be $" + slingLowPrice + "." );
		System.out.println("Your total cost for chaise lounge chairs will be $" + chaiseLoungePrice + "." );
		System.out.println("Your total cost for folding classic chairs will be $" + foldingClassicPrice + "." );
		System.out.println("Your total cost for adirondack chairs will be $" + adirondackPrice + "." );
		System.out.println("Your total cost for all chairs will be $" + (slingLowPrice + chaiseLoungePrice + foldingClassicPrice + adirondackPrice) + ".");
	}
}
