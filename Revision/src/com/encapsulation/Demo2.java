package com.encapsulation;

class Mobile {
	private int pin;
	private String model;
	private String owner;
	private double price;

	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mobile(int pin, String model, String owner, double price) {
		super();
		this.pin = pin;
		this.model = model;
		this.owner = owner;
		this.price = price;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}

public class Demo2 {

	public static void main(String[] args) {

		Mobile mobile=new Mobile();
		mobile.setModel("Samsung J21");
		mobile.setOwner("Sagar Ahire");
		mobile.setPin(1234);
		mobile.setPrice(25000);
		
		System.out.println(mobile.getModel()+"\n"+mobile.getOwner()+"\n"+mobile.getPin()+"\n"+mobile.getPrice());
	}

}
