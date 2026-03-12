class SmartWatchOne
{
	public static void main(String[] ref)
	{
		System.out.println("main started");
		String brand = SmartWatch.getBrand();
		System.out.println("the SmartWatch brand is "+brand);
		double price = SmartWatch.getPrice();
		System.out.println("the price of a SmartWatch is "+price);
		String colour= SmartWatch.getColor();
		System.out.println("the color of SmartWatch is "+colour);
		
		
		
	}
}