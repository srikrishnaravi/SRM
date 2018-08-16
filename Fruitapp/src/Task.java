import java.util.Scanner;

public class Task {
	private static final String Loan = null;
	static Scanner a= new Scanner(System.in);
	static String Bank;
	static String account;
	static int year;
	static double total;
	
	public static void main(String[] args) {
		System.out.println("enter the bank name");
		Bank=a.next();
		switch (Bank) {
		case "ICICI":
			System.out.println("enter the account type Loan or user");
		account =a.next();
		if(account.equalsIgnoreCase("Loan")) {
		System.out.println("enter the account number");
		String L=a.next();
		System.out.println("welcome csk");
		int amt =5000;
        System.out.println("loan amt sanctioned is="+amt);
        double interest =2.5;
        System.out.println("Interest p/m is"+interest+"%");
        System.out.println("no.of years for loan?");
		year =a.nextInt();
	    total= (year *amt*interest)/100;
		total = total+amt;
		System.out.println("your total due is "+total);
		}
			
		else {
			System.out.println("enter the account number");
			String L=a.next();
			System.out.println("welcome csk");
			int amt =5000;
	        System.out.println(" amt deposited"+amt);
	        double interest =1.2;
	        System.out.println("Interest p/m is"+interest+"%");
	        System.out.println("no.of years for loan?");
			year =a.nextInt();
		    total= (year *amt*interest)/100;
			total = total+amt;
			System.out.println("balence "+total);
			
		}
			
			
			
			
		}

		}	
	}
	

