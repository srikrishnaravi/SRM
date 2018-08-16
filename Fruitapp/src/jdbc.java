import java.util.Scanner;

public class jdbc {
static Scanner a =new Scanner(System.in);

	public static void main(String[] args) {
		
    System.out.println("welcome to  ind air");
    System.out.println("--------------------");
    
	System.out.println("Depart from ");
	System.out.println("1.chn\n2.bom\n3.hyd ");
	System.out.println("enter your choice ");
	int depart =a.nextInt();
	
	if(depart ==1) {
		System.out.println("you have selected chennai ");
		
		System.out.println("enter the destination");
		System.out.println("1.Del\n2.bom\n3.hyd ");
		System.out.println("enter your choice ");
		int depart1 =a.nextInt();
		
		if(depart1==1) {
			System.out.println("travelling frm CHN to DEL");
			System.out.println("enter your of flight ");
			System.out.println("1.INDIGO\n2.SPICE\n3.JET ");
			int depart2 =a.nextInt();
		if(depart2==1) {
			System.out.println("Fare per head for indigo 1000");
			int c=1000;
			System.out.println("total persons travelling");
			int d=a.nextInt();
			 d=c*d;
			System.out.println("Total amt is "+d);
		}
			else if(depart2==2) {
				
				System.out.println("Fare per head spice is 2000");
				int c=2000;
				System.out.println("total persons travelling");
				int d=a.nextInt();
				 d=c*d;
				System.out.println("Total amt is "+d);
			
		}else if(depart2==3) {
			System.out.println("Fare per head jet is 3000");
			int c=3000;
			System.out.println("total persons travelling");
			int d=a.nextInt();
			 d=c*d;
			System.out.println("Total amt is "+d);
		
	}
		
		else{
			System.out.println("select withi the range");
			
		}
		}
		
		else if(depart1==2) {
			System.out.println("travelling frm CHN to BOM");
			System.out.println("enter your of flight ");
			System.out.println("1.INDIGO\n2.SPICE\n3.JET ");
			int depart2 =a.nextInt();
		if(depart2==1) {
			System.out.println("Fare per head for indigo 5000");
			int c=5000;
			System.out.println("total persons travelling");
			int d=a.nextInt();
			 d=c*d;
			System.out.println("Total amt is "+d);
		}
			else if(depart2==2) {
				
				System.out.println("Fare per head spice is 3000");
				int c=3000;
				System.out.println("total persons travelling");
				int d=a.nextInt();
				 d=c*d;
				System.out.println("Total amt is "+d);
			
		}else if(depart2==3) {
			System.out.println("Fare per head jet is 3500");
			int c=3500;
			System.out.println("total persons travelling");
			int d=a.nextInt();
			 d=c*d;
			System.out.println("Total amt is "+d);
	}
		else{
			System.out.println("select withi the range");	
		}
		}
		
		else	if(depart1==3) {
			System.out.println("travelling frm CHN to HYD");
			System.out.println("enter your of flight ");
			System.out.println("1.INDIGO\n2.SPICE\n3.JET ");
			int depart2 =a.nextInt();
		if(depart2==1) {
			System.out.println("Fare per head for indigo 1500");
			int c=1500;
			System.out.println("total persons travelling");
			int d=a.nextInt();
			 d=c*d;
			System.out.println("Total amt is "+d);
		}
			else if(depart2==2) {
				
				System.out.println("Fare per head spice is 2500");
				int c=2500;
				System.out.println("total persons travelling");
				int d=a.nextInt();
				 d=c*d;
				System.out.println("Total amt is "+d);
			
		}else if(depart2==3) {
			System.out.println("Fare per head jet is 3500");
			int c=3500;
			System.out.println("total persons travelling");
			int d=a.nextInt();
			 d=c*d;
			System.out.println("Total amt is "+d);
	}
		else{
			System.out.println("select withi the range");	
		}
		}
	}
	else if(depart==2) {
		System.out.println("you have selected bombay ");
		System.out.println("enter the destination");
		System.out.println("1.Del\n2.bom\n3.hyd ");
		System.out.println("enter your choice ");
		int depart1 =a.nextInt();
		if(depart1==1) {
			System.out.println("travelling frm CHN to DEL");
			System.out.println("enter your of flight ");
			System.out.println("1.INDIGO\n2.SPICE\n3.JET ");
			int depart2 =a.nextInt();
		if(depart2==1) {
			System.out.println("Fare per head for indigo 1000");
			int c=1000;
			System.out.println("total persons travelling");
			int d=a.nextInt();
			 d=c*d;
			System.out.println("Total amt is "+d);
		}
			else if(depart2==2) {
				
				System.out.println("Fare per head spice is 2000");
				int c=2000;
				System.out.println("total persons travelling");
				int d=a.nextInt();
				 d=c*d;
				System.out.println("Total amt is "+d);
			
		}else if(depart2==3) {
			System.out.println("Fare per head jet is 3000");
			int c=3000;
			System.out.println("total persons travelling");
			int d=a.nextInt();
			 d=c*d;
			System.out.println("Total amt is "+d);	
	}
		else{
			System.out.println("select withi the range");	
		}
		}
		else if(depart1==2) {
			System.out.println("travelling frm CHN to BOM");
			System.out.println("enter your of flight ");
			System.out.println("1.INDIGO\n2.SPICE\n3.JET ");
			int depart2 =a.nextInt();
		if(depart2==1) {
			System.out.println("Fare per head for indigo 5000");
			int c=5000;
			System.out.println("total persons travelling");
			int d=a.nextInt();
			 d=c*d;
			System.out.println("Total amt is "+d);
		}
			else if(depart2==2) {
				
				System.out.println("Fare per head spice is 3000");
				int c=3000;
				System.out.println("total persons travelling");
				int d=a.nextInt();
				 d=c*d;
				System.out.println("Total amt is "+d);
			}else if(depart2==3) {
			System.out.println("Fare per head jet is 3500");
			int c=3500;
			System.out.println("total persons travelling");
			int d=a.nextInt();
			 d=c*d;
			System.out.println("Total amt is "+d);
		
	}
		
		else{
			System.out.println("select withi the range");
			
			
		}
		}
		
		else	if(depart1==3) {
			System.out.println("travelling frm CHN to HYD");
			System.out.println("enter your of flight ");
			System.out.println("1.INDIGO\n2.SPICE\n3.JET ");
			int depart2 =a.nextInt();
		if(depart2==1) {
			System.out.println("Fare per head for indigo 1500");
			int c=1500;
			System.out.println("total persons travelling");
			int d=a.nextInt();
			 d=c*d;
			System.out.println("Total amt is "+d);
		}
			else if(depart2==2) {
				
				System.out.println("Fare per head spice is 2500");
				int c=2500;
				System.out.println("total persons travelling");
				int d=a.nextInt();
				 d=c*d;
				System.out.println("Total amt is "+d);
			
		}else if(depart2==3) {
			System.out.println("Fare per head jet is 3500");
			int c=3500;
			System.out.println("total persons travelling");
			int d=a.nextInt();
			 d=c*d;
			System.out.println("Total amt is "+d);
		
	}
		
		else{
			System.out.println("select withi the range");
			
			
		}
		
		}
	
	else if(depart==3) {
		System.out.println("you have selected hyderabad ");
	}
		
	else {
		System.out.println("Please select from the above locations");
	}
	}

}
}
