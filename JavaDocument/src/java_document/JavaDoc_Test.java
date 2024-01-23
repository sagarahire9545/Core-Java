package java_document;
/**
 * 
 * @author SAGAR AHIRE
 * @version 95.27
 * @since 2020
 *
 */

/**
 * 
 * @author SAGAR AHIRE
 * Class for Library Book
 */
class Book
{
	/**
	 * {@value 10}
	 */
	static int val=10;
	/**
	 * Parameterized Constructor
	 * @param s
	 * 
	 */
	public Book(String s)
	{
		System.out.println("Book Issued.");
	}
	/**
	 * Issue a book to Student
	 * @param roll roll no of Student 
	 * @throws Exception use for error
	 */
	public void issue(int roll) throws Exception
	{
		System.out.println();
	}
	/**
	 * 
	 * @param s
	 * @return return value for true or false
	 */
	public boolean available(String s)
	{
		return true;
	}
	
	/**
	 *getName is Name of Student
	 * @param id
	 * @return return name 
	 */
	public String getName(int id)
	{
		return "";
	}

}


public class JavaDoc_Test 
{
/**
 * Main method
 * @param args
 */
	public static void main(String[] args) 
	{
		Book b=new Book("Sitara");
		b.available("Yes");
		System.out.println(b.getName(5));

	}

}
