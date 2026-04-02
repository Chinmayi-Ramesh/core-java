class UPS
{
	static String productName;
	static	int price ;
	static	String brand ;
	static	String capacity ;
	static	String voltage;
	static	String manufacturer;
	static	String productDimension ;
	static	String model ;
	static	String countryOfOrigin ;
	static	String colour ;
		


	public static void main(String []args)
	{
		
		productName = "UPS";
		price = 17567;
		brand = "APC";
		capacity = "20 liters";
		voltage ="230 Volts";
		manufacturer ="Schneider Electric IT Business India Pvt. Ltd";
		productDimension = "11.4D x 30.1W x 38.2H Centimeters";
		model ="Lead Acid";
		countryOfOrigin = "India";
		colour ="Black";
		
		
		
		
		System.out.println("Product name is "+productName);
		System.out.println(" price "+price);
		System.out.println("brand is "+brand);
		System.out.println("capacity "+capacity);
		System.out.println(" voltage"+ voltage);
		System.out.println("Manufacturer"+manufacturer);
		System.out.println("product dimension"+productDimension);
		System.out.println("model is "+model);
		System.out.println("countryOfOrigin"+countryOfOrigin);
		System.out.println("colour "+colour);
	}
}