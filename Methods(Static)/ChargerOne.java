class ChargerOne
{
	public static void main(String[] ref)
	{
		System.out.println("main started");
		String brand = Charger.getBrand();
		System.out.println("the Charger brand is "+brand);
		double price = Charger.getPrice();
		System.out.println("the price of a Charger is "+price);
		String colour= Charger.getColor();
		System.out.println("the color of Charger is "+colour);
		
		
		
	}
}