import java.util.Scanner;

public class Car {
static Scanner a=new Scanner(System.in);

	static String carname;
	static String model;
	
	public static void main(String[] args) {
		
		System.out.println("welcome to car garage");
		System.out.println("select the choice of car");
		
		carname=a.next();
		
		switch (carname) {
	    case "toyota":
		
	    	System.out.println("toyota is perfect");
	    	System.out.println("do you want to buy this model?");
	    	model =a.next();
	    	int price = 2000;
	    	System.out.println("do you want power steering"
	    			+ "enter y or n");
	    	String b= a.next();
	    	if(b.equalsIgnoreCase("y") ) {
	    		price=price+250;
	    	System.out.println("the total price is "+price);
	    	}
	    	else {
	    		System.out.println("the total price is "+price);
	    	}
	    	break;
	    	
	    	
	    case "benz":
			
	    	System.out.println("benz is perfect");
	    	System.out.println("do you want to buy this model?+ \"enter y or n\"");
	    	model =a.next();
	    	if(model.equalsIgnoreCase("y")) {
	    		
	    		int price1 = 5000;
		    	System.out.println("do you want power steering"
		    			+ "enter y or n");
		    	
		    	String d= a.next();
		    	if(d.equalsIgnoreCase("y") ) {
		    		price1=price1+550;
		    	System.out.println("the total price is "+price1);
		    	}
		    	else {
		    		System.out.println("the total price is "+price1);
		    	}
	    	}
		    	else {
		    		
		    		System.err.print("error in selectoion");
		    	}
	    		
	    	
	    	
	    		    	break;
	    	
	    	
		}	
	}
	}