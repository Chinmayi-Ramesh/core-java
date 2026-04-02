class HpLaptop
{
	static String productName ;
	static	int price ;
	static	String brand ;
	static	String processor ;
	static	String ram ;
	static	String storage ;
	static	String operatingSystem;
	static	String countryOfOrigin;
	static	String colour ;
		
		
	public static void main(String []args)
	{
		productName = "HP Pavilion Laptop";
		price = 55000;
		brand = "HP";
		processor = "Intel Core i5";
		ram = "8 GB";
		storage = "512 GB SSD";
		operatingSystem = "Windows 11";
		countryOfOrigin = "India";
		colour = "Silver";



		System.out.println("Product name is " + productName);
		System.out.println("Price is " + price);
		System.out.println("Brand is " + brand);
		System.out.println("Processor is " + processor);
		System.out.println("RAM is " + ram);
		System.out.println("Storage is " + storage);
		System.out.println("Operating System is " + operatingSystem);
		System.out.println("Country of Origin is " + countryOfOrigin);
		System.out.println("Colour is " + colour);
	}
}