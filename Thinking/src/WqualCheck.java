
//To check the both String are equals
public class WqualCheck {

	public static void main(String[] args)
	{
		String s="AMBASAN";
		String s1="ambasan";
		
		if(s.equals(s1))
		{
			System.out.println("Both String are equals");
		}else {
			System.out.println("Different");
		}
		if(s.equalsIgnoreCase(s1))
		{
			System.out.println("Equals");
		}
		else
		{
			System.out.println("Not equals");
		}
	}
	
}
