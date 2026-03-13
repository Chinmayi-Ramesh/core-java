class USBOne
{
	public static void main(String[] ref)
	{
		System.out.println("main started");
		String brand = USB.getBrand();
		System.out.println("the USB brand is "+brand);
		double price = USB.getPrice();
		System.out.println("the price of a USB is "+price);
		String colour= USB.getColor();
		System.out.println("the color of USB is "+colour);
		
		
		
	}
}