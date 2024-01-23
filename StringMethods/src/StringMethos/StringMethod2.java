package StringMethos;
public class StringMethod2 {

	public static void main(String[] args) {
		
//		String str=new String("Mr.Sagar Ahire");
//		System.out.println(str.startsWith("Mr."));     //True
//		System.out.println(str.startsWith("Sa"));      //False
//		System.out.println(str.startsWith("Sa",3));    //True
//		
//		System.out.println(str.endsWith("Ahire"));     //true
//		System.out.println(str.startsWith("Sa"));      //false
//		
//		System.out.println(str.charAt(3));    //S
//		
//		System.out.println(str.indexOf("S"));  //3
//		System.out.println(str.indexOf("Ahire"));  //9
//		System.out.println(str.lastIndexOf("i"));  //12
//		
		
	/*	String str2 = new String("abcd123@gmail.com");
		
		System.out.println(str2.startsWith("www")); //false
		System.out.println(str2.startsWith("abcd"));  //true
		
		System.out.println(str2.startsWith("@",7));  //true
		
		System.out.println(str2.endsWith(".com"));   //true
		
		System.out.println(str2.charAt(5));  //2
		
		System.out.println(str2.indexOf("b"));  //1
		System.out.println(str2.indexOf(".com"));  //13
		
		System.out.println(str2.lastIndexOf("c"));
	*/	
		
		String str3=new String("sagarahire831@gmail.com");
		
		System.out.println(str3);
		System.out.println(str3.startsWith("sa"));
		System.out.println(str3.endsWith(".com"));
		System.out.println(str3.startsWith("g",2));
		System.out.println(str3.charAt(5));
		System.out.println(str3.indexOf(3));
		System.out.println(str3.lastIndexOf("."));
		System.out.println(str3.length());
		System.out.println(str3.trim());
		
	}

}
