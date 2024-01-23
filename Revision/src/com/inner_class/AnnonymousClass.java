package com.inner_class;

//anonymous inner class 
//no name class

abstract class My{

	void show() {
		System.out.println("Concreate method");
	}
	
	abstract void display();	
}
class OClass{
	
	public void outer_meth() {
		
		int x=10;
		
		My my=new My() {

			@Override
			void display() {    
				System.out.println("Display method....");
			}	
		};
		my.show();
		my.display();
	}
}
public class AnnonymousClass {

	public static void main(String[] args) {

		OClass oc=new OClass();
		oc.outer_meth();
		
	}

}
