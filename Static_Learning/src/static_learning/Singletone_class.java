
// Sngletone Example

package static_learning;

class CoffeMachine
{
	private float coffeQty;
	private float milkQty;
	private float waterQty;
	private float sugarQty;
	
	static private CoffeMachine my=null;

	private CoffeMachine()
	{
		 coffeQty=1;
		 milkQty=1;
		 waterQty=1;
		 sugarQty=1;
	}
	
	public void fillWater(float qty)
	{
		waterQty=qty;
	}
	public void fillSugar(float qty)
	{
		sugarQty=qty;
	}
	public float getCoffe()
	{
		return 0.23f;
	}
	
	static CoffeMachine getInstance()
	{
		if(my==null)
			my=new CoffeMachine();
		return my;
	}
}

public class Singletone_class {

	public static void main(String[] args)
	{
		CoffeMachine m1=CoffeMachine.getInstance();
		CoffeMachine m2=CoffeMachine.getInstance();
		CoffeMachine m3=CoffeMachine.getInstance();
		
		System.out.println(m1.getCoffe());
		
		System.out.println(m1+" "+m2+" "+m3);
		
		if(m1==m2 && m1==m3)
	    	System.out.println("Same");

	}

}
