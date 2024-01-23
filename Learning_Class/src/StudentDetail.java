class Student
{
	public int roll_no;
	public String name;
	public String course;
	int m1,m2,m3;
	
	public int total()
	{
		return m1+m2+m3;
	}
	public float avarage()
	{
	    return (float) total()/3;	
	}
	public char grade()
	{
		if(avarage()>60)
			return 'A';
		else 
			return 'B';
	}
//	public String Details()
//	{
//		return "\nRoll_no:"+ roll_no+ "\nName:"+name+"\nCourse:"+course;
//	}
	@Override
	public String toString() {
		return "Student [roll_no=" + roll_no + ", name=" + name + ", course=" + course + ", m1=" + m1 + ", m2=" + m2
				+ ", m3=" + m3 + "]";
	}
	
}



public class StudentDetail {

	public static void main(String[] args) {
		
		Student s=new Student();
		s.m1=60;s.m2=78;s.m3=69;
		s.roll_no=04;
		s.name="Akshay";
		s.course="MCA";
		
		System.out.println("Details of student: "+s.toString());
		System.out.println("Total: "+s.total());
		System.out.println("Avaerage: "+s.avarage());
		System.out.println("Grade: "+s.grade());
		
		
		
	}

}
