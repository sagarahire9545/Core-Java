
class Student
{
	private int rollNo;
	private String name;
	private String dept;
	private String subjects;
	
	public int getRollNo()
	{
		return rollNo;
	}
	
	public String getName()
	{
		return name;
		
	}
	public String getDept()
	{
		return dept;
	}
	
	public String getSubjects()
	{
		return subjects;
	}
	
     public void setDept(String d)
    {
	  this.dept=d;
    }

       public void setSubjects(String sub)
      {
    	this.subjects=sub;
      }
       
       public Student(int rollNo,String name,String dept,String Sub)
       {
    	   this.rollNo=rollNo;
    	   this.name=name;
    	   this.dept=dept;
    	   this.subjects=Sub;
       }
       
//       public String toString()
//       {
//    	   return "Roll_No:"+rollNo+"Name:"+name+"Dept:"+dept+"Subjects:"+subjects;
//       }

 

public class StudDetails {

	public static void main(String[] args) 
	{
		
//      Student s[]=new Student[3];
      
//      s[0]=new Student(4,"Smith","Mechanical","Math");
//      s[1]=new Student(5,"Amit","Science","Chemistry");
//      s[2]=new Student(6,"Bhosale","Civil","Electonic");
      
      
//      for(Student stud:s)
//    	  
//         System.out.println(stud);
		
		Student st=new Student(4,"Smith","Mechanical","Math");
		
		
		System.out.println(st.getRollNo());
		System.out.println(st.getName());
		System.out.println(st.getDept());
		System.out.println(st.getSubjects());
	}

}
}
