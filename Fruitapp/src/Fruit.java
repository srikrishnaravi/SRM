import java.util.Scanner;
public class Fruit {
static Scanner a =new Scanner(System.in);
	static String Fruitname;
	static int quantity;
	static String grade;
public static void main(String[] args) {
	System.out.println("enter the fruit name");
	Fruitname=a.next();
	
	switch (Fruitname) {
	case "apple":
		
		System.out.println("you selected apple");
		System.out.println("enter the grade");
		grade=a.next();
	switch (grade) 
	{
	case "a":
		System.out.println("you have selected a ");
		System.out.println("enter the quantity:");
		quantity=a.nextInt();
		int total=quantity*150;
		System.out.println("Total amount to be paid:"+total);
		break;
		case "b":
		System.out.println("you have selected a ");
		System.out.println("enter the quantity:");
		quantity=a.nextInt();
		int total1=quantity*100;
		System.out.println("Total amount to be paid:"+total1);
		break;default:
			System.out.println("sorry we dont have other grade apples");
		break;
	}
	break;
	case  "orange":
	System.out.println("you  selected orange");
	System.out.println("enter the grade");
	grade=a.next();
switch (grade) 
{
case "a":
	System.out.println("you have selected a ");
	System.out.println("enter the quantity:");
	quantity=a.nextInt();
	int total=quantity*100;
	System.out.println("Total amount to be paid:"+total);
	break;
case "b":
	System.out.println("you have selected a ");
	System.out.println("enter the quantity:");
	quantity=a.nextInt();
	int total1=quantity*50;
	System.out.println("Total amount to be paid:"+total1);
	break;	
default:System.out.println("sorry we dont have other grade Orange");
	break;
}
		break;
	default:
		System.out.println("select apple or orange");
		break;	
}		
}
}