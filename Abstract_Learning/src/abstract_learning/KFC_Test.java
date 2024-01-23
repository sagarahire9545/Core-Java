package abstract_learning;

abstract class KFC
{
	
	 KFC() {
		System.out.println("KFC constructor");
		// TODO Auto-generated constructor stub
	}
	 abstract void billing();
	 abstract void offer();

	void makeItem()
	{
		System.out.println("Making the item");
	}
}

class MyKFC extends KFC
{

	
	public MyKFC() {
		System.out.println("MYKFC CONTSRUCTOR");
		// TODO Auto-generated constructor stub
	}

	@Override
	void billing() {
		// TODO Auto-generated method stub
		System.out.println("MyKFC billing");
	}

	@Override
	void offer() {
		// TODO Auto-generated method stub
		System.out.println("MyKFC OFFER");
	}
	void festivalOffer()
	{
		System.out.println("MyKFCfestival Offer");
	}
	
}

public class KFC_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KFC k;
		k=new MyKFC();  // both constructor are called bcoz both are non-parameterized constructor
		
		k.makeItem();
		k.billing();
		k.offer();
		
		
     
	}

}
