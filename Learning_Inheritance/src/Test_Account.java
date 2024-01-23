
class Account {
	private String accNo;
	private String Name;
	private String Add;
	private String Phno;
	private String Dob;
	protected long balance;

	public Account(String accNo, String name, String add, String phno, String dob) {
		super();
		this.accNo = accNo;
		Name = name;
		Add = add;
		Phno = phno;
		Dob = dob;
		this.balance = balance;
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

class SavingAccount extends Account {
	public SavingAccount(String accNo, String name, String add, String phno, String dob) {
		super(accNo, name, add, phno, dob);
		// TODO Auto-generated constructor stub
	}

	public void deposit(long amt) {
		balance += amt;
	}

	public void withdraw(long amt) {
		balance -= amt;
	}
}

class LoanAccount extends Account {

	public LoanAccount(String accNo, String name, String add, String phno, String dob) {
		super(accNo, name, add, phno, dob);
		// TODO Auto-generated constructor stub

	}

	public void EMIpay(long amt) {
		balance -= amt;
	}

	public void repayment(long amt) {
		long balance = 0;
		if (balance == amt)
			balance = 0;
	}

}

public class Test_Account {

	public static void main(String[] args) {

		LoanAccount la = new LoanAccount("98789", "jgj", "jkhdkjhjh", "98754468", "98/87/9999");

		System.out.println(la);
		System.out.println(la.getName());

		la.setName("Anil");
		System.out.println("Name:"+la.getName());
		
		la.setAccNo("1000");
		System.out.println(la.getAccNo());
		
		la.toString();
	}

}
