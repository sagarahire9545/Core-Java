package exception_learning;

class StackOverFlow extends Exception
{

	@Override
	public String toString()
	{
		return "Stack is full...";
	}
	
}
class StackUnderFlow extends Exception
{

	@Override
	public String toString()
	{
		return "Stack is empty...";
	}
	
}
class Stack
{
	private int size;
	private int top=-1;
	private int S[];
	
	// Constructor
	public Stack(int sz)
	{
		size=sz;
		S=new int[sz];
	}
	
	public void push(int x) throws StackOverFlow
	{
		if(top==size-1)
			throw new StackOverFlow();
			top++;
		S[top]=x;
	}
	
	public int pop() throws StackUnderFlow
	{
		int x=-1;
		if(top==-1)
			throw new StackUnderFlow();
			x=S[top];
			top--;
		return x;
	}
}

public class StackExample
{

	public static void main(String[] args)
	{
		try
		{
		Stack st=new Stack(5);
		st.push(20);
		st.push(10);
		st.push(20);
		st.push(10);
		st.push(20);
		st.push(10);
		st.push(20);
		}
		catch(StackOverFlow s)
		{
		    System.out.println(s);	
		}
		

	}

}
