package src.atm.javabankmart;

import java.util.*;
import java.text.*;

public class ConsoleBank{
	static int choice;
	
	public static void main(String[] args){
		Scanner myScan = new Scanner(System.in);
		
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
	}
	
}