package sagar;
 
// parameterized constructor
class Sky
{

	 Sky(int a)
	{
		 a=10;
		System.out.println("Parent class"+a);
	}
	 Sky(int a,int b) {
			
			// TODO Auto-generated constructor stub
		   b=10;
			b=a+b;
			
			System.out.println("Child class"+b);
		}
}

class Air extends Sky
{

	
	
	Air(int a,int b,int c)
	{
		super(a,b);
		
     	c=a+b;
		System.out.println("GrandChild:"+c);
	}
	
}

public class ParameConst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  
	   Air a1=new Air(5,10,0);
	   

	}

}
