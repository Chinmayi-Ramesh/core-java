class OfficeChair
{
	static String productName ;
	static	int price ;
	static	String brand ;
	static	String material ;
	static	String adjustableHeight ;
	static	String armType ;
	static	String maxLoad ;
	static	String countryOfOrigin;
	static	String colour ;
	

	public static void main(String []args)
	{
		productName = "Ergonomic Office Chair";
		price = 8500;
		brand = "Green Soul";
		material = "Mesh & Metal";
		adjustableHeight = "Yes";
		armType = "Adjustable";
		maxLoad = "120 Kg";
		countryOfOrigin = "India";
		colour = "Black";
		
		
		
		System.out.println("Product name is " + productName);
		System.out.println("Price is " + price);
		System.out.println("Brand is " + brand);
		System.out.println("Material is " + material);
		System.out.println("Adjustable Height " + adjustableHeight);
		System.out.println("Arm Type is " + armType);
		System.out.println("Max Load is " + maxLoad);
		System.out.println("Country of Origin is " + countryOfOrigin);
		System.out.println("Colour is " + colour);
	}
}