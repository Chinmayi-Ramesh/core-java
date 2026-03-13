class IronBoxOne
{
	public static void main(String[] ref)
	{
		System.out.println("main started");
		String brand = IronBox.getBrand();
		System.out.println("the IronBox brand is "+brand);
		double price = IronBox.getPrice();
		System.out.println("the price of a IronBox is "+price);
		String colour= IronBox.getColor();
		System.out.println("the color of IronBox is "+colour);
		
		
		
	}
}