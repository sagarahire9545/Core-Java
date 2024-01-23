package com.abstract_class;

 abstract class TV {

	public void display() {
		System.out.println("TV Display");
	}

	abstract void change_channel(); // abstract method
}

class SmartTV extends TV {
	
	@Override
	void change_channel() {
		System.out.println("smart_tv change channel");
	}
	
	void browser() {
		System.out.println("Browsing in smart TV");
	}

}

public class Demo1 {

	public static void main(String[] args) {
		
		SmartTV tv=new SmartTV();
		tv.display();
		tv.change_channel();
		tv.browser();

	}

}
