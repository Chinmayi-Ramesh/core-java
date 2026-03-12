class HeadsetExecuter
{
	public static void main(String[] ref)
	{
		System.out.println("main started");
		String brand = Headset.getBrand();
		System.out.println("the headset brand is "+brand);
		double price = Headset.getPrice();
		System.out.println("the price of a headset is "+price);
		String colour= Headset.getColor();
		System.out.println("the color of headset is "+colour);
		
		
		
	}
}