class AirConditionerOne
{
	public static void main(String[] ref)
	{
		System.out.println("main started");
		String brand = AirConditioner.getBrand();
		System.out.println("the AirConditioner brand is "+brand);
		double price = AirConditioner.getPrice();
		System.out.println("the price of a AirConditioner is "+price);
		String colour= AirConditioner.getColor();
		System.out.println("the color of AirConditioner is "+colour);
		
		
		
	}
}