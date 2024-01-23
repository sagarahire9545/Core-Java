
public class PracticeSet1 {

	public static void main(String[] args) {
		
		String str1="   programmer@   gmail   .com    ";
		
		int i=str1.indexOf("@");
		String uname=str1.substring(0,i);
		String domain=str1.substring(i+1,str1.length());
		
//		str1=str1.trim();
//		str1=str1.replaceAll("\\s+","");
//		
//		System.out.println(str1);
		
		System.out.println("Username:" +uname);
		System.out.println("Domain:"+domain);
		
		
	}

}
