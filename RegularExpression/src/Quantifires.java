
public class Quantifires {

	public static void main(String[] args) {
		
		String str1="abcd";
		System.out.println(str1.matches(".*"));     //  .* is present 0 or more than character/digits 
		
		System.out.println(str1.matches("[a-z]*"));   //searching character a to z multiple time not other.
		
		
	}

}
