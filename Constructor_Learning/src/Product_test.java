
// **** 48 min lagle krayle****


 class Product
{
	private String itemNo;
	private String name;
	private double price;
	private int qty;
	
	public String getItemNo()
	{
		return itemNo;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public int getQty()
	{
		return qty;
	}
	
	public void setPrice(double price)
	{
		this.price=price;
	}
	
	public void setQty(int qty)
	{
		this.qty=qty;
	}
	
	public Product(String itm)
	{
		itemNo=itm;
	}
	
	public Product(String itm,String name)
	{
		itemNo=itm;
		this.name=name;
	}
	
	public Product(String itm, String name,double price,int qty)
	{
		itemNo=itm;
		this.name=name;
		this.price=price;
		this.qty=qty;
	}

	public Product() {  
		// non-parameterized constructor
		
	}

	

}

public class Product_test {

	public static void main(String[] args) 
	{
//		Product p=new Product(); //null
//		Product p1=new Product("25","Sagar",2500.00,8);
		Product p2=new Product("25","Sagar");
		
		
		// **** Using direct calling get methods****
		System.out.println(p2.getItemNo());
		System.out.println(p2.getName());
//		System.out.println(p1.getPrice());
//		System.out.println(p1.getQty());
//		
		
		
	
		p2.setQty(8);
		p2.setPrice(2500);
		
		System.out.println(p2.getQty());
		System.out.println(p2.getPrice());
	

	}

}
