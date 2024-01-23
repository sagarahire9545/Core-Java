package method_overriding;

class Tv
{
   public void display()
   {
	   System.out.println("Tv display");
   }
   
   public void changeChannel()
   {
	   System.out.println("Tv change channel");
   }
}

class SmartTv extends Tv
{
	@Override
	   public void display()
	   {
		
		   System.out.println("SmartTv display");
	   }
	@Override  
	   public void changeChannel()
	   {
		   System.out.println("SmartTv change channel");
	   }
	    
	   public void browsing()
	   {
		   System.out.println("SmartTv browsing");
	   }
}

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Tv t=new Tv();
//		t.display();
//         t.changeChannel();
		
		SmartTv t=new SmartTv();
		t.display();
		t.changeChannel();
		t.browsing();
		
		
		
	}

}
