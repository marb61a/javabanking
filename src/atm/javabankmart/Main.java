package src.atm.javabankmart;

import java.io.FileWriter;
import java.io.IOException;
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
			mainMenu[4] = "*   1. Add New Customer                   *";
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
		
		// Using the customer choice 
		switch(customerChoice) {
			case 1 : 
				addCustomer();
				break;
		}
		
	}
	
	static void addCustomer() {
		System.out.println("Please enter your first name ");
		String firstName = myScan.next();
		System.out.println("Please enter your last name ");
		String lastName = myScan.next();
		System.out.println("Please enter a password ");
		String customerNumber = myScan.next();
		System.out.println("Please enter a date on birth in dd/mm/yyyy form");
		String dateofBirth = myScan.next();
		
		customers.add(new Customer(firstName, lastName, customerNumber, dateofBirth));
		
		FileWriter writer;
		try {
			writer = new FileWriter("output.txt");
			for(Customer customer: customers) {
				writer.write(customer + System.lineSeparator());
			}
			
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
	
}