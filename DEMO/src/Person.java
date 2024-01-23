
public class Person {
	
		
		int sal;
		String name;

		private void PersonDetalied(String prsonname,int dateofbirth,int id ){

		     prsonname="Sagar";
		     dateofbirth=27-05-2000;
		     id=97;

		     
			System.out.printf("Person Detailed:" +prsonname," "  +dateofbirth," " +id);
			System.out.printf("\n");
			


		}
		    void PersonSalary(int personsalary,int workingdays,	int absent){
			
			// personsalary=27000;
			// workingdays=27;
			// absent=2;
			
			System.out.printf("Person DetailedSalary:" +personsalary," "  +workingdays," " +absent);
			System.out.printf("\n");
		
		}



	public static void main(String[] args) {
		
		Person per=new Person();
		per.PersonDetalied("Sagar", 27-05-2000, 04);
		per.PersonSalary(27000, 30, 1);
		

	}
}
	


