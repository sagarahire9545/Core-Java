
public class StringArg 
{
	static void showList(String ...S)
	{
		
		for(int i=0;i<S.length;i++)      //0+1=1.Smith
			System.out.println(i+1+"." +S[i]);
		
	}
	
	
	
	public static void main(String[] arg) {
		
		
		
//		showList(5,"Smith","Falknar","Maxwell","ABD","Bravo");
//		****Output***
//		5.Smith
//		6.Falknar
//		7.Maxwell
//		8.ABD
//		9.Bravo
		
		showList("Smith","Falknar","Maxwell","ABD","Bravo");

		
	}

}
