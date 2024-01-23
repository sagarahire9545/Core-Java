
public class IncrementValue {

	static int inc(int l,int m) {
		l++;
		m++;
		
		if(l>m)
			return l;
		else
			return m;
	}

	public static void main(String[] args) {
		
     	int a=30,b=90,c;
//		c=inc(a,b);
//		System.out.println(c);

     	IncrementValue i=new IncrementValue();
     	c=i.inc(a, b);
     	System.out.println(c);
     	
	}

}
