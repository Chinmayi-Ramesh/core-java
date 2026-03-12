class OvenOne
{
	public static void main(String[] ref)
	{
		System.out.println("main started");
		String brand = Oven.getBrand();
		System.out.println("the Oven brand is "+brand);
		double price = Oven.getPrice();
		System.out.println("the price of a Oven is "+price);
		String colour= Oven.getColor();
		System.out.println("the color of Oven is "+colour);
		
		
		
	}
}