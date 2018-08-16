import java.util.Scanner;

public class Fruitarray {
static Scanner b= new Scanner(System.in);

	static String fruit[]= {null,"orange","apple","mango"};
	static char grade[]= {'a','b','c'};
	
	
	
	public static void main(String[] args) {
		
		System.out.println("1.orange\n2.apple\n3.mango");
		
		System.out.println("enter the choice");
		int choice=b.nextInt();
     if(choice>0&&choice<4) {
    		System.out.println("You selected "+fruit[choice]);
    		System.out.println("1.Grade A\n2.Grade B\n3.Grade C");
    		System.out.println("enter your grade");
    		int select=b.nextInt();
    	     if(choice==1||choice==2||choice==3) {
    	    	 System.out.println("You Selected"+grade[select]);
    	     }
     }
     else {
    	 System.out.println("Your selection invalid");
     }	
	}
	}
	