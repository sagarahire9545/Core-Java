package sagar;

class Customer {
	private String name;
	private String Phno;
	private String Bill;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String name, String phno, String bill) {
		super();
		this.name = name;
		Phno = phno;
		Bill = bill;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhno() {
		return Phno;
	}

	public void setPhno(String phno) {
		Phno = phno;
	}

	public String getBill() {
		return Bill;
	}

	public void setBill(String bill) {
		Bill = bill;
	}

	public void payBill() {
		String payBill = null;
		Bill = payBill;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", Phno=" + Phno + ", Bill=" + Bill + "]";
	}

}

class Member extends Customer {
	private int cust_id;
	private String address;

}

public class Test_Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		

		Customer c = new Customer("Sagar", "9876678987", "20000");
		System.out.println(c);

		System.out.println("---------------------------");

		Member mb = new Member();

		c.setName("Akshay");
		c.setPhno("12345678");
		c.setBill("25000");

		System.out.println(c.getName() + "\n" + c.getPhno() + "\n" + c.getBill());

	}

}
