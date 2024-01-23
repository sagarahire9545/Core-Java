package com.inner_class;
//Local inner class example
//a inner class is creating outer class method

class OuterClas {
	int x = 10;

	public void outer_meth() 
	{

		class InnerClass
		{
			int y = 30;

			void inner_meth() {
				int z = x + y;
				System.out.println(z);
			}
		}// end inner class

		InnerClass innerClass = new InnerClass();
		innerClass.inner_meth();
	}
}

public class LocalInnerClass {

	public static void main(String[] args) {
		OuterClas outerClas = new OuterClas();
		outerClas.outer_meth();
	}
}
