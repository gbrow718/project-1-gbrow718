package project1;
import java.text.DecimalFormat;
import java.util.Scanner;
public class InterestRate {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //Allowing for user input
		
		System.out.println("How many years until you plan on retiring? ");
		int years = input.nextInt(); //Input years until retirement
		
		if (years <= 0) { //If the years for saving is 0 or less
			System.out.println("Cannot calculate with a nonvalid number of years, try again.");
		}
		
		else if (years >= 100) { //If the years for saving is over 100
			System.out.println("Cannot calculate with 100 or more years until retirement, try again.");
		}
		
		System.out.println("How much money can you allocate to save? "); 
		double savings = input.nextInt(); //Input the amount that can be saved
		input.close(); //Ending all inputs for the program
		
		if (savings == 0) { //Checking for invalid savings of $0
			System.out.println("How are you supposed to save money if you have none? Try again!");
		}
		
		else if (savings < 0) { //Checking for invalid savings of less than $0
			System.out.println("If you're in debt, you should sort that out before you start saving for retirement.. try again.");
		}
		
		double totalAmount = 0; //Used to store the total amount to be displayed
		
		for (int i = 1; i < years; i++) {
			totalAmount = totalAmount + savings; //Adding the annual savings
			totalAmount = totalAmount * 1.05; //Applying interest rate AFTER applying the additional savings
		}
		
		DecimalFormat df = new DecimalFormat(); //Following two lines allow for formatting of decimal places and commas
		df.setMaximumFractionDigits(2);
		System.out.println("In " + years + " years, you will have saved $" + df.format(totalAmount) + "."); //Outputting results
	}
}
