
class Overrider {

	public void dog() {
		
		System.out.println("hai");
	}
}
	
 class Overload extends Overrider{
	 
	 public void dog() {
			
			System.out.println("bye");
	 }
 }
 public class Override {
	public static void main(String[] args) {
		Overrider b=new Overrider();
		b.dog();//hai
		Overload a=new Overload();
		a.dog();//bye

		Overrider c=new Overload();
		c.dog();//bye
		Overload d=(Overload) c;
		d.dog();//bye
	}
	
 }
	
	

