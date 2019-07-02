package src.atm.javabankmart;

import java.util.*;
import java.text.*;

public class ConsoleBank{
	static int customerChoice;
	static Scanner myScan = new Scanner(System.in);
	
	// Text colors to be used
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";
	
	public static void main(String[] args){
		displayMainMenu();
	}
	
	static void displayMainMenu() {
		System.out.println("*******************************************");
		System.out.println("*                Main Menu                *");
		System.out.println("*******************************************");
		System.out.println("*                                         *");
		System.out.println("1. New Customer                       	  *");
		System.out.println("2. Display Customers                  	  *");
		System.out.println("3. Exit System                        	  *");
		System.out.println("*                                         *");
		System.out.println("*******************************************");
		
		System.out.println("\n Please enter a choice");
		
		// Will parse an number value from the string when a choice is made
		customerChoice = myScan.nextInt();
		
		// Using a switch statement for customer choice
		switch(customerChoice) {
			case 1 :
				clearScreen();
				newCustomer();
				break;
			case 2 :
				clearScreen();
				displayCustomerDetails();
				break;
			case 3:
				clearScreen();
				System.exit(0);
				break;
			default:
				break;
		}
	}
	
	static void newCustomer() {
		System.out.println("Please enter Your name : ");
		String customerName = myScan.nextLine();
		
		System.out.print("\nPlease enter Your address : ");
		String customerAddress = myScan.nextLine();
	}
	
	static void displayCustomerDetails() {
		boolean returnMainmenu = false;
		
		System.out.println("*******************************************");
		System.out.println("*           Customer Details              *");
		System.out.println("*******************************************");
		System.out.println("*                                         *");
		System.out.println("1. Display Customer Details               *");
		System.out.println("2. Return to Main Menu                	  *");
		System.out.println("*                                         *");
		System.out.println("*******************************************");
		
		displayMainMenu();
	}
	
	static void clearScreen() {
		try {
			if (System.getProperty("os.name").contains("Windows"))
	            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	        else
	            Runtime.getRuntime().exec("clear");
		} catch(Exception ex) {
			System.out.println("Exception: " + ex.toString());
		}
	}
}