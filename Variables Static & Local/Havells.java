class Havells
{
	static String productName;
	static	int price ;
	static	String brand ;
	static	String itemModelNumber;
	static	String countryOfOrigin ;
	static	String productDimension ;
	static	String model ;
	static	String energyEfficiency ;
	static	String colour ;
		
	public static void main(String []args)
	{
		productName = "Havells Blaze Dry Iron";
		price = 3000;
		brand = "Havells";
		itemModelNumber="GHGDICPK125";
		countryOfOrigin ="India";
		productDimension = "46L x 30W Centimeters";
		model ="Blaze";
		energyEfficiency = "High";
		colour ="Black";
		
		
		System.out.println("Product name is "+productName);
		System.out.println(" price "+price);
		System.out.println("brand is "+brand);
		System.out.println("Item Model Number"+itemModelNumber);
		System.out.println("country Of Origin"+countryOfOrigin);
		System.out.println("product dimension"+productDimension);
		System.out.println("model is "+model); 
		System.out.println("energy efficiency "+energyEfficiency);
		System.out.println("colour "+colour);
	}
}