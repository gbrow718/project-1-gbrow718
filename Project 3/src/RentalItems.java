import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class RentalItems {
	public static void main (String[] args) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		String startDate;
		String endDate;
		
		int numDays;
		int maxRentals = 5;
		int maxItems = 20;
		int numRentals;
		int totalDaysRented = 0;
		double totalTax = 0;
		double totalRentCost = 0;
		int rentalID;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the starting date of your rental: ");
		startDate = input.next();
		
		System.out.println("Enter the ending date of your rental: ");
		endDate = input.next();
		
		System.out.println("Enter the numbers of days you're renting for: ");
		numDays = input.nextInt();
		
		System.out.println("Enter the number of rentals you are ordering: ");
		numRentals = input.nextInt();

		if (numRentals > maxRentals) {
			System.out.println("The maximum number of rentals is " + maxRentals + ", please enter a lower number.");
			System.exit(1);
		}
		
		else {
			System.out.println("Your rental begins on " + startDate + " and ends on " + endDate + ", which is " + numDays + " days.");
			System.out.println("You are ordering " + numRentals + " rentals.");
		}
	}
}
