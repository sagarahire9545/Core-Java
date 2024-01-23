
public class StringPractice {

	public static void main(String[] args) {

		String str1="Java";
		String str2=new String("Java Program");
		
		System.out.println(str2);
		
		char c[]= {'A','B','C','D'};
		String str3=new String(c);
		
		System.out.println(c);
		
		byte b[]={65,66,67,68,69};
		String str4=new String(b,2,2);
		System.out.println(str4);
		
		
		String s="Java";
		String a="Java";
		
//		System.out.println(s==a);
		System.out.println(s.equals(a));
		
		
		

	}

}


