class Microwave
{
	
	static	String productName ;
	static	int price ;
	static	String brand ;
	static	String capacity ;
	static	String energyConsumption ;
	static	String Manufacturer ;
	static	String productDimension ;
	static	String model ;
	static	String countryOfOrigin ;
	static	String colour ;
	
	
	public static void main(String []args)
	{
		productName = "Microwave";
		price = 12000;
		brand = "Panasonic";
		capacity ="20 litres";
		energyConsumption ="800 Watts";
		Manufacturer ="Panasonic";
		productDimension = "44.3 x 34 x 25.8 Centimeters";
		model ="NN-ST26JMFDG";
		countryOfOrigin = "Thailand";
		colour ="Silver";
		
		
		System.out.println("Product name is "+productName);
		System.out.println(" price "+price);
		System.out.println("brand is "+brand);
		System.out.println("capacity "+capacity);
		System.out.println("energy Consumption"+energyConsumption);
		System.out.println("Manufacturer"+Manufacturer);
		System.out.println("product dimension"+productDimension);
		System.out.println("model is "+model);
		System.out.println("Country of Origin"+countryOfOrigin);
		System.out.println("colour "+colour);
	}
}