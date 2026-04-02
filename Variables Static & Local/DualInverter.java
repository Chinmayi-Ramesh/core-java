class DualInverter
{
	static String productName ;
	static	int price ;
	static	String brand ;
	static	String capacity ;
	static	String coolingPower ;
	static	String specialFeatures ;
	static	String productDimension ;
	static	String model ;
	static	String energyEfficiency ;
	static	String colour ;
	
	public static void main(String []args)
	{
		productName = "Inverter A C";
		price = 43000;
		brand = "LG";
		capacity = "1.5 tons";
		coolingPower ="5 kilowatts";
		specialFeatures ="Auto Clean, Fast Cooling, Inverter Compressor, Remote Controlled, WiFi Enabled";
		productDimension = "21D x 99.8W x 34.5H Centimeters";
		model ="US-Q19PWZE3";
		energyEfficiency = "High Efficiency";
		colour ="White";		
				
		System.out.println("Product name is "+productName);
		System.out.println(" price "+price);
		System.out.println("brand is "+brand);
		System.out.println("capacity "+capacity);
		System.out.println("cooling power"+coolingPower);
		System.out.println("Special features"+specialFeatures);
		System.out.println("product dimension"+productDimension);
		System.out.println("model is "+model);
		System.out.println("energy efficiency "+energyEfficiency);
		System.out.println("colour "+colour);
	}
}