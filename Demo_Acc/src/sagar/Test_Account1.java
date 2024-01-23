package sagar;

class Account
{

	private String accNo;
	private String Name;
	private String Add;
	private String Phno;
	private String Dob;
	protected long balance;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(String accNo, String name, String add, String phno, String dob) {
		super();
		this.accNo = accNo;
		this.Name = name;
		this.Add = add;
		this.Phno = phno;
		Dob = dob;
		//this.balance = balance;
	}
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAdd() {
		return Add;
	}
	public void setAdd(String add) {
		Add = add;
	}
	public String getPhno() {
		return Phno;
	}
	public void setPhno(String phno) {
		Phno = phno;
	}
	public String getDob() {
		return Dob;
	}
	public void setDob(String dob) {
		Dob = dob;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", Name=" + Name + ", Add=" + Add + ", Phno=" + Phno + ", Dob=" + Dob
				+ ", balance=" + balance + "]";
	}
		
}
class SavingAcc extends Account
{
	 public void deposit(long amt)
	    {
	        balance+=amt;
	    }
	    public void withdraw(long amt)
	    {
	        balance-=amt;
	    }
}

class LoanAcc extends SavingAcc
{
	public void EMIpay(long amt)
	{
		balance-=amt;
	}
	public void repayment(long amt)
	{
		if(balance==amt)
            balance=0;
	}
	@Override
	public String toString() {
		return "LoanAcc [balance=" + balance + "]";
	}
}

public class Test_Account1 {

	public static void main(String[] args) 
	{
		Account ac=new Account("123456","sagar","nashik","9876678765","12/12/9000");
		System.out.println(ac);
        System.out.println("-------------------------------------");
        
		ac.setAccNo("12345");
		ac.setName("Sagar");
		ac.setPhno("98765678");
		ac.setAdd("jalgoan");
		ac.setDob("27/07/1999");
		ac.setBalance(2000);
		System.out.println(ac);
		System.out.println("-------------------------------\n");
		
		System.out.println(ac.getAccNo()+"\n"+ac.getAdd()+"\n"+ac.getBalance()+"\n"+ac.getDob()+"\n"+ac.getName()+"\n"+ac.getPhno());
		System.out.println("----------------------------");
		
	   
		
		LoanAcc lc=new LoanAcc();
		
		lc.deposit(2000);
		System.out.println(lc);
		
		lc.withdraw(1000);
		System.out.println(lc);
		
		lc.EMIpay(300);
		System.out.println(lc);
		
		lc.repayment(100);
		System.out.println(lc);
		
	}

}
