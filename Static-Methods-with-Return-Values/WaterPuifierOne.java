class WaterPuifierOne
{
	public static void main(String[] ref)
	{
		System.out.println("main started");
		String brand = WaterPuifier.getBrand();
		System.out.println("the WaterPuifier brand is "+brand);
		double price = WaterPuifier.getPrice();
		System.out.println("the price of a WaterPuifier is "+price);
		String colour= WaterPuifier.getColor();
		System.out.println("the color of WaterPuifier is "+colour);
		
		
		
	}
}