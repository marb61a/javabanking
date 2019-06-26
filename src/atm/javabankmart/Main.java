package src.atm.javabankmart;

import java.util.*;

public class Main{
	static Scanner myScan = new Scanner(System.in);
	
	// An int for the menu choice selected by the customer 
	static int customerChoice;
	
	// Create an arraylist to hold customer values
	static ArrayList<Customer> customers = new ArrayList<>();
	
	public static void main(String[] args) {
		displayInitialMenu();
	}
	
	static void displayInitialMenu() {
		// Array of strings printed to the main screen to show the initial menu
		String[] mainMenu = new String[9];
			mainMenu[0] = "*******************************************";
			mainMenu[1] = "*                Main Menu                *";
			mainMenu[2] = "*******************************************";
			mainMenu[3] = "*                                         *";
			mainMenu[4] = "*   1. New Customer                       *";
			mainMenu[5] = "*   2. Display Customers                  *";
			mainMenu[6] = "*   3. Exit System                        *";
			mainMenu[7] = "*                                         *";
			mainMenu[8] = "*******************************************";
		
		// Will go through the main menu array and print out as long as there are lines
		for(String line : mainMenu) {
			System.out.println(line);
		}
		
		System.out.print("\nPlease enter your option: ");
		customerChoice = myScan.nextInt();
		
	}
	
	public Main() {}
}