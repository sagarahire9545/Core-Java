package static_learning;

class HondaCity
{
	static long price=10;
	
	static double OnRoadPrice(String City)
	{
		switch(City)
		{
		case "Nashik":
			return price+price*0.1;
			
		case "Pune":
			return price+price*0.09;
			
		}
		return price;
	}
}
public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(HondaCity.OnRoadPrice("Nashik"));
		System.out.println(HondaCity.OnRoadPrice("Pune"));
		System.out.println(HondaCity.price);
	}

}
