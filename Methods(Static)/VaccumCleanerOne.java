class VaccumCleanerOne
{
	public static void main(String[] ref)
	{
		System.out.println("main started");
		String brand = VaccumCleaner.getBrand();
		System.out.println("the VaccumCleaner brand is "+brand);
		double price = VaccumCleaner.getPrice();
		System.out.println("the price of a VaccumCleaner is "+price);
		String colour= VaccumCleaner.getColor();
		System.out.println("the color of VaccumCleaner is "+colour);
		
		
		
	}
}