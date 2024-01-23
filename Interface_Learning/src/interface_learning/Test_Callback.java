package interface_learning;

interface Member
{
	public void callback();
}

class Store
{
	Member members[]=new Member[10];
	int count=0;
	
	void rigister(Member m)
	{
		members[count++]=m;
	}
	
	void inviteSell()
	{
		for(int i=0;i<count;i++)
		{
			members[i].callback();
		}
	}
	
}
class Customer implements Member
{
	String name;

	public Customer(String n) {
		super();
		this.name = n;
	}

	@Override
	public void callback() {
		// TODO Auto-generated method stub
		System.out.println("Ok I will visit:"+name);
	}
	
}


public class Test_Callback 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Store s=new Store();
	
		Customer c1=new Customer("Rushi");
		Customer c2=new Customer("Smith");
		s.rigister(c1);
		s.rigister(c2);
	    s.inviteSell();
	}

}
