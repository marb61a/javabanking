package src.atm.javabankmart;

public class TestHarness {
	static String[][] customerData = {{"kevin","Hughes", "ABCDEFG", "01/01/1970"},
			{"Simon","Smith", "ABCDEFG", "01/01/1970"},{"Harry","Hill", "ABCDEFG", "01/01/1970"}}; // test Data
	static Customer cust1;
	
	
	public static void main(String[] args) {
		for (int i = 0; i< customerData.length; i++) {
			cust1 = new Customer(customerData[i][0],customerData[i][1], null, null);
			System.out.println(customerData[i][0]);
			System.out.println(cust1.toString());
			System.out.println(cust1.firstName);
			if (cust1.getFirstName().equals(customerData[i][0]))
				System.out.println("Pass");
			else
				System.out.println("Fail");
		}
		
	
	}

}
