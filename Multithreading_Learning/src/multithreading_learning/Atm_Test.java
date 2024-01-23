package multithreading_learning;

class ATM
{
	public void checkBal(String name) throws InterruptedException
	{
		System.out.println(name+"Checking Balance");
		
		Thread.sleep(1000);
		System.out.println("Balance");
	}
	
	public void Withdraw(String name,int amount)
	{
		System.out.println(name+ "Withdraw money");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(amount);
	}
}

class Customer extends Thread
{
	String name;
	ATM atm;
	int amount;
	
	public Customer(String n, int amt, ATM a) {
		super();
		name = n;
		ATM atm=a;
		amount = amt;
	}
	
	void useATM()
	{
		try {
			atm.checkBal(name);
			atm.Withdraw(name, amount);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void run()
	{
		useATM();
	}
}


public class Atm_Test {

	public static void main(String[] args) 
	{
		ATM a=new ATM();
		
		Customer c1=new Customer("Sagar",1000,a);
		Customer c2=new Customer("Nagesh",2000,a);
		
		c1.start();
		c2.start();

	}

}
