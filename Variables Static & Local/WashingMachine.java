class WashingMachine
{
	static String productName ;
	static	int price ;
	static	String brand ;
	static	int capacity ;
	static	String washType ;
	static	String inverterMotor ;
	static	String energyRating ;
	static	String countryOfOrigin ;
	static	String colour;
	static	String warranty;

	public static void main(String []args)
	{
		productName = "LG Front Load Washing Machine";
		price = 32000;
		brand = "LG";
		capacity = 7;
		washType = "Front Load";
		inverterMotor = "Yes";
		energyRating = "5 Star";
		countryOfOrigin = "India";
		colour = "White";
		warranty = "10 Years Motor Warranty";
		

		System.out.println("Product name is " + productName);
		System.out.println("Price is " + price);
		System.out.println("Brand is " + brand);
		System.out.println("Capacity is " + capacity + " Kg");
		System.out.println("Wash Type is " + washType);
		System.out.println("Inverter Motor " + inverterMotor);
		System.out.println("Energy Rating is " + energyRating);
		System.out.println("Country of Origin is " + countryOfOrigin);
		System.out.println("Colour is " + colour);
		System.out.println("Warranty is " + warranty);
	}
}