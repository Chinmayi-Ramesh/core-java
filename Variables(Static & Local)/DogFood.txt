class DogFood
{

	static	String productName ;
	static	int price ;
	static	String brand ;
	static	String flavour ;
	static	String dogAgeGroup ;
	static	String netWeight ;
	static	String proteinSource ;
	static	String countryOfOrigin ;
	static	String packType ;
		
	public static void main(String []args)
	{
		productName = "Pedigree Adult Dog Food";
		price = 2100;
		brand = "Pedigree";
		flavour = "Chicken & Vegetables";
		dogAgeGroup = "Adult";
		netWeight = "10 Kg";
		proteinSource = "Chicken";
		countryOfOrigin = "India";
		packType = "Dry Food";

		System.out.println("Product name is " + productName);
		System.out.println("Price is " + price);
		System.out.println("Brand is " + brand);
		System.out.println("Flavour is " + flavour);
		System.out.println("Dog Age Group is " + dogAgeGroup);
		System.out.println("Net Weight is " + netWeight);
		System.out.println("Protein Source is " + proteinSource);
		System.out.println("Country of Origin is " + countryOfOrigin);
		System.out.println("Pack Type is " + packType);
	}
}