package com.inner_class;
//Example of Nested inner class
//Outer class inside a class is called inner class
class OuterClass{
	
	int x=10;
	
	class InnerClass{
		int y=20;
		
		public void inner_meth() {
			int z=x+y;
			System.out.println(z);
		}
	}//end inner class
	
	public void outer_meth() {
		InnerClass innerClass=new InnerClass();
		innerClass.inner_meth();
	}
	
}

public class NestedInnerClassDemo {

	public static void main(String[] args) {

		OuterClass outerClass=new OuterClass();
		outerClass.outer_meth();
//		
//		OuterClass.InnerClass oi=new OuterClass().new InnerClass();
//		oi.inner_meth();
		
	}

}
