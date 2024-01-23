package com.encapsulation;

class Account {

	private int acc_no;
	private String name;
	private double amount;

	public int getAcc_no() {
		return acc_no;
	}

	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}

public class Demo1 {

	public static void main(String[] args) {

		Account account = new Account();
		account.setAcc_no(121);
		account.setName("SagarAhire");
		account.setAmount(12000.0);

		System.out.println(account.getAcc_no());
		System.out.println(account.getName());
		System.out.println(account.getAmount());
	}

}
