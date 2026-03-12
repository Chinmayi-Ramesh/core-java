class MixerOne
{
	public static void main(String[] ref)
	{
		System.out.println("main started");
		String brand = Mixer.getBrand();
		System.out.println("the Mixer brand is "+brand);
		double price = Mixer.getPrice();
		System.out.println("the price of a Mixer is "+price);
		String colour= Mixer.getColor();
		System.out.println("the color of Mixer is "+colour);
		
		
		
	}
}