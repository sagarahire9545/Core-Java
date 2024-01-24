
class Customer
{
	private String custid;
	private String name;
	private String address;
	private String phno;
	
	public String getCustid()
	{
		return custid;
	}
	public String getName()
	{
		return name;
	}
	public String getAdd()
	{
		return address;
	}
	public String getPhno()
	{
		return phno;
	}
	
	public void setAdd(String add)
	{
		address=add;
	}
	
	public void setPhno(String pn)
	{
		phno=pn;
	}
	
	public Customer(String cid,String n)
	{
		custid=cid;
		name=n;
	}
	
	public Customer(String cid,String n,String add,String pn)
	{
		custid=cid;
		name=n;
		address=add;
		phno=pn;
	}
}

public class Customer_Test {

	public static void main(String[] args) {
		
		Customer c=new Customer("5","Smith","NAshik Maharashtra","+919765456789");
		
		System.out.println(c.getCustid());
		System.out.println(c.getName());
		System.out.println(c.getAdd());
		System.out.println(c.getPhno());
		

	}

}
