package static_learning;
//import java.util.*;
import java.sql.Date;

class StudentIn
{
	private String rollNo;
	private static int count=1;
	
	private String generateRollNo()
	{
		Date d=new Date(0);
		@SuppressWarnings("deprecation")
		String rno= "Univ-"+(d.getYear()+1900)+"-"+count;
		count++;
		return rno;
	}
	public StudentIn()
	{
		rollNo=generateRollNo();
	}
	


public String getRollNo()
{
	return rollNo;
}

}
public class Student {

	public static void main(String[] args) {
	
		StudentIn s1=new StudentIn();
		StudentIn s2=new StudentIn();
		StudentIn s3=new StudentIn();
		
		System.out.println(s1.getRollNo());
		System.out.println(s2.getRollNo());
		System.out.println(s3.getRollNo());
	}

}
