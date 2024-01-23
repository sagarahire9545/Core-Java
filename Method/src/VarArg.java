
// Variable arguments is the variable no.of arguments 

public class VarArg
{

	static void show(int ...x) 
	{
		
		for(int a:x) {
			
			System.out.println(a);
			
		}
	}
	
	
	public static void main(String[] args) {
		
		show();//null
		show(10,20,30); //10 20 30
		show(new int[] {2,4,6,8,10}); //2 4 6 8 10
		
	}

}
//10
//20
//30
//2
//4
//6
//8
//10

