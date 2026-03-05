class TableLamp
{
	static String productName ;
	static	int price ;
	static	String brand ;
	static	String material;
	static	String powerSource ;
	static	String bulbType ;
	static	String height ;
	static	String countryOfOrigin; 
	static	String colour ;
	
	
	public static void main(String []args)
	{
		productName = "Decorative Table Lamp";
		price = 1800;
		brand = "Homesake";
		material = "Wood & Fabric";
		powerSource = "Electric";
		bulbType = "LED";
		height = "40 cm";
		countryOfOrigin = "India";
		colour = "Beige";
	

		System.out.println("Product name is " + productName);
		System.out.println("Price is " + price);
		System.out.println("Brand is " + brand);
		System.out.println("Material is " + material);
		System.out.println("Power Source is " + powerSource);
		System.out.println("Bulb Type is " + bulbType);
		System.out.println("Height is " + height);
		System.out.println("Country of Origin is " + countryOfOrigin);
		System.out.println("Colour is " + colour);
	}
}