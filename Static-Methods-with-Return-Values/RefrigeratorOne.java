class RefrigeratorOne
{
	public static void main(String[] ref)
	{
		System.out.println("main started");
		String brand = Refrigerator.getBrand();
		System.out.println("the Refrigerator brand is "+brand);
		double price = Refrigerator.getPrice();
		System.out.println("the price of a Refrigerator is "+price);
		String colour= Refrigerator.getColor();
		System.out.println("the color of Refrigerator is "+colour);
		
		
		
	}
}