package map_collection;

public class Account {
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

	public Account(String accNo, String name, String add, String phno, String dob, long balance) {
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
