package javapackage_learning;


enum Dept
{
	IT,Cs,MECH,ELE,CIVIL
}


public class enum_test 
{
	public static void main(String[] args) 
	{
		Dept d=Dept.IT;
			
		switch(d)
		{
		case IT:
			System.out.println("IT Department ");
		case Cs:
			System.out.println("Cs Department");
		case MECH:
			System.out.println("Mach department");
		case ELE:
			System.out.println("ELE Department");
		case CIVIL:
			System.out.println("CIVIL Department");
		}
		
		
		
		
		
		
		/*
		Dept d=Dept.CIVIL;
		
		System.out.println(d.valueOf("ELE"));
		
		System.out.println(d.ordinal()); //index of CIVIL
		System.out.println(d.name());
		
		Dept list[]=Dept.values();
		for(Dept x:list)
			System.out.println(x);
		*/
	}

}
