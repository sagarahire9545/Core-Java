
public class DuplicateChar {

	public static void main(String[] args) {
	
		String s="w3schools";
		
		// String converted into array
		char[] inp=s.toCharArray();
		
		int cnt=0;
		
		System.out.println("Duplicates character is:");
		
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(inp[i]==inp[j])
				System.out.println(inp[j]);
				cnt++;
				break;
			}
		}

	}

}
