package abstract_learning;

abstract class Hospital
{
	
	abstract void emergency();
	abstract void appointment();
	abstract void admit();
	abstract void billing();
}

class MyHospital extends Hospital
{
	public MyHospital()
	{
	  System.out.println("MyHospital");	
	}
	@Override
	public void appointment()
	{
		System.out.println("Check appointment");
	}
	
	public void admit()
	{
		System.out.println("admit patient");
	}
	@Override
	public void billing()
	{
		System.out.println("check bill");
	}

	@Override
	void emergency() {
		// TODO Auto-generated method stub
		System.out.println("Emergency");
	}
	
}

public class HospitalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hospital h=new MyHospital();
		h.emergency();
		h.appointment();
		h.admit();
		h.billing();
	}

}
