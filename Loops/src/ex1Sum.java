
public class ex1Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2345,digit;
		int sum=0;
		
		while(a>0)
		{
			digit=a%10;
			sum=sum+digit;
			a=a/10;
		}
		System.out.println("sum of digit:"+sum);
	}

}
