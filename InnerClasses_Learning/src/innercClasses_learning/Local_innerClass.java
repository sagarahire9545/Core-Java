package innercClasses_learning;

// Local inner class example
// a inner class is creating outer class method
class Oclass
{
	public void Test_Local()
	{
		class InnerClass
		{
			public void InnerMethod()
			{
				System.out.println("Hey Inner class is here...");
			}
		}
		
		InnerClass ic=new InnerClass();
		ic.InnerMethod();
	}
}

public class Local_innerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Oclass o=new Oclass();
		o.Test_Local();
	}

}

// ******* example tutorials point****************

//public class Outerclass {
//	   // instance method of the outer class 
//	   void my_Method() {
//	      int num = 23;
//
//	      // method-local inner class
//	      class MethodInner_Demo {
//	         public void print() {
//	            System.out.println("This is method inner class "+num);	   
//	         }   
//	      } // end of inner class
//		   
//	      // Accessing the inner class
//	      MethodInner_Demo inner = new MethodInner_Demo();
//	      inner.print();
//	   }
//	   
//	   public static void main(String args[]) {
//	      Outerclass outer = new Outerclass();
//	      outer.my_Method();	   	   
//	   }
//	}