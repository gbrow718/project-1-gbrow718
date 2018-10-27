import java.util.Scanner;

public class Location {
	public static void main(String[] args) {
		String addressEntered = "";
		double deliveryCharge;
		
		//Using char to enter venue
		System.out.println("Enter the venue address (V: Vacation Venue / B: Bella's Beach / G: Griffin's Grove):");
		Scanner input = new Scanner(System.in);
		char address = input.next().charAt(0);
		
		//Delivery charge and name applied
		if (address == 'V') {
			deliveryCharge = 0;
			addressEntered = "Vacation Venue";
			System.out.println("Your delivery charge for " + addressEntered + " is $" + deliveryCharge + ".");
		}
		
		//Delivery charge and name applied
		else if (address == 'B') {
			deliveryCharge = 10.00;
			addressEntered = "Bella's Beach";
			System.out.println("Your delivery charge for " + addressEntered + " is $" + deliveryCharge + ".");
		}
		
		//Delivery charge and name applied
		else if (address == 'G') {
			deliveryCharge = 20.00;
			addressEntered = "Griffin's Grove";
			System.out.println("Your delivery charge for " + addressEntered + " is $" + deliveryCharge + ".");
		}
		
		//Error case
		else {
			System.out.println("The venue you entered is invalid, try again.");
			System.exit(1);
		}
		
	}
}
