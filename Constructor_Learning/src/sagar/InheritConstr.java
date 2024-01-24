package sagar;
   
//Non-parameterized constructor 
class Parent
{
	public Parent(int x)
	{
		System.out.println("Parent Class");
	}
}

class Child extends Parent
{

	public Child(int x,int y)
	{
		super(x);
		System.out.println("Child Class");
	}
}

class GrandChild extends Child
{
	
	public GrandChild(int x,int y,int z)
	{
		super(x,y);
		System.out.println("GrandChild");
	}
}


public class InheritConstr {

public static void main(String[] args) {

	GrandChild gc=new GrandChild(10,20,30);
	
}

}
