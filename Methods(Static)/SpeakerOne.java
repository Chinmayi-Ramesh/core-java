class SpeakerOne
{
	public static void main(String[] ref)
	{
		System.out.println("main started");
		String brand = Speaker.getBrand();
		System.out.println("the Speaker brand is "+brand);
		double price = Speaker.getPrice();
		System.out.println("the price of a Speaker is "+price);
		String colour= Speaker.getColor();
		System.out.println("the color of Speaker is "+colour);
		
		
		
	}
}