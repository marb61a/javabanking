package src.atm.javabankmart;

import java.util.*;
import java.io.*;


public class Menu {
	static Scanner input = new Scanner(System.in);
	static int choice;
	static ArrayList<Customer> customers = new ArrayList<>();
	public static void main(String[] args) {

		displayMainmenu();

	}
	
	

	static void displayMainmenu() {

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

		for (String line : mainMenu)
			System.out.println(line);

		System.out.print("\nPlease enter your option: ");
		choice = input.nextInt();

		switch (choice) {
		case 1:
			newCustomer();
			System.exit(1);
			break;
		case 2:
			displayCustomerDetails();
			break;
		case 3:
			System.exit(0);
			break;

		default:
			break;
		}

	}
	
	static void addCustomer() {
		System.out.println("Please enter your first name ");
		String firstName = input.next();
		System.out.println("Please enter your last name ");
		String lastName = input.next();
		System.out.println("Please enter a password ");
		String customerNumber = input.next();
		System.out.println("Please enter a date on birth in dd/mm/yyyy form");
		String dateofBirth = input.next();
		
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
	
	
	static void newCustomer() {
		boolean returnMainmenu = false;
		String[] customerMenu = new String[8];
		customerMenu[0] = "*******************************************";
		customerMenu[1] = "*              New Customer               *";
		customerMenu[2] = "*******************************************";
		customerMenu[3] = "*                                         *";
		customerMenu[4] = "*   1. Enter Customer Details             *";
		customerMenu[5] = "*   2. Return to Main Menu                *";
		customerMenu[6] = "*                                         *";
		customerMenu[7] = "*******************************************";
		
		for (String line : customerMenu)
			System.out.println(line);
		
		

		do {
			System.out.print("\nPlease enter your option: ");
			choice = input.nextInt();
			
			switch (choice) {
				case 1:
					addCustomer();
					returnMainmenu = true;
					break;
				case 2:
					returnMainmenu = true;
					break;
		
				default:
					break;
			}
		} while(!returnMainmenu);
		
		displayMainmenu();

	}
	
	static void displayCustomerDetails() {
		boolean returnMainmenu = false;
		String[] customerMenu = new String[8];
		customerMenu[0] = "*******************************************";
		customerMenu[1] = "*           Customer Details              *";
		customerMenu[2] = "*******************************************";
		customerMenu[3] = "*                                         *";
		customerMenu[4] = "*   1. Display Customer Details           *";
		customerMenu[5] = "*   2. Return to Main Menu                *";
		customerMenu[6] = "*                                         *";
		customerMenu[7] = "*******************************************";
		
		for (String line : customerMenu)
			System.out.println(line);
		
		

		do {
			System.out.print("\nPlease enter your option: ");
			choice = input.nextInt();
			
			switch (choice) {
				case 1:
					System.out.println(customers);
					break;
				case 2:
					returnMainmenu = true;
					break;
		
				default:
					break;
			}
		} while(!returnMainmenu);
		
		displayMainmenu();

	}

	static void clearScreen() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}



}
