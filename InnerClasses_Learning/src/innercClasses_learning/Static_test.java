package innercClasses_learning;

// Static class 

class OuterC
{
	static int x=10;  //static integer
	       int y=20;   //non-static integer


     static class SInner
     {
      public void Diplay()
      {
    	 System.out.println("only print static variable:"+x);
      }
      
  }
//     public void Show() {
//     SInner i=new SInner();
//     i.Diplay();
//     }
  
}

public class Static_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OuterC.SInner os=new OuterC.SInner();
		os.Diplay();
		
//		OuterC t=new OuterC();
//		t.Show();
//		
//		
	}

}
