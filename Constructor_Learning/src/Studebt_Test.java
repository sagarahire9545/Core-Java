
class Subject
{
	private String subId;
	private String name;
	private int maxMarks;
	private int marksObtain;
	
	
	
	  public String getSubId() {
		return subId;
	}

	public void setSubId(String subId) {
		this.subId = subId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMaxMarks() {
		return maxMarks;
	}

	public void setMaxMarks(int maxMarks) {
		this.maxMarks = maxMarks;
	}

	public int getMarksObtain() {
		return marksObtain;
	}

	public void setMarksObtain(int marksObtain) {
		this.marksObtain = marksObtain;
	}
	

	@Override
	public String toString() {
		return "Subject [subId=" + subId + ", name=" + name + ", maxMarks=" + maxMarks + ", marksObtain=" + marksObtain
				+ "]";
	}

	public Subject() {
		super();
	}

	public Subject(String subID,String name,int maxMarks,int marksObtain)
	    {
	        this.subId=subID;
	        this.name=name;
	        this.maxMarks=maxMarks;
	        this.marksObtain=marksObtain;
	    }
	
}

public class Studebt_Test {

	public static void main(String[] args) {
		
//		Subject sub[]=new Subject[3];
//		
//		sub[0]=new Subject("s101","DSA",101,93);
//		sub[1]=new Subject("s102","MATH",91,95);
//		sub[2]=new Subject("s103","CC",111,98);
//		
		Subject s=new Subject();
		System.out.println(s);
		
		s.setMarksObtain(89);
		s.setName("SAgar");
		s.setSubId("5");
		s.setMarksObtain(120);
		
//		s.toString();
		System.out.println(s.getName());
		
//		for( Subject s:sub)
//		{
//			System.out.println(s);
//		}
	}

}
