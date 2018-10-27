import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class Customer {
	public static void main (String[] args) {
		String[] vacationDates = new String[5];
		char[] addresses = new char[5];
		String addressEntered;
		String phone;
		String firstName;
		String lastName;
		String email;
		
		//Inputting dates
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < vacationDates.length; i++) {
			System.out.println("Enter the vacation dates for entry " + i + " (V: Vacation Venue / B: Bella's Beach / G: Griffin's Grove):");
			vacationDates[i] = input.next();
		}
		
		//Inputting venue names using characters
		for (int i = 0; i < addresses.length; i++) {
			System.out.println("Enter the name of the venues corresponding to the vacation date for entry " + i + ":");
			addresses[i] = input.next().charAt(0);
			if (addresses[i] == 'V') {
				addressEntered = "Vacation Venue";
			}
			
			else if (addresses[i] == 'B') {
				addressEntered = "Bella's Beach";
			}
			
			else if (addresses[i] == 'G') {
				addressEntered = "Griffin's Grove";
			}
			
			else {
				System.out.println("The venue you entered is invalid, try again.");
				System.exit(1);
			}
		}
		
		System.out.println("Enter your first name: ");
		firstName = input.next();
		
		System.out.println("Enter your last name: ");
		lastName = input.next();
		
		System.out.println("Enter your phone number: ");
		phone = input.next();
		
		System.out.println("Enter your email address: ");
		email = input.next();
		
		//Printing out everything
		System.out.println("Hi " + firstName + " " + lastName + ", your entered phone number is " + phone + ", and your email address is " + email + ". Here are your vacation dates: ");
		
		//Loop to print out your dates and venues visited side by side
		for (int j = 0; j < 5; j++) { 
			System.out.println(j + ":");
			System.out.println("You visited " + addresses[j] + " on " + vacationDates[j] + ".");
		}
	}
}
