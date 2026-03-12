class PrinterOne
{
	public static void main(String[] ref)
	{
		System.out.println("main started");
		String brand = Printer.getBrand();
		System.out.println("the Printer brand is "+brand);
		double price = Printer.getPrice();
		System.out.println("the price of a Printer is "+price);
		String colour= Printer.getColor();
		System.out.println("the color of Printer is "+colour);
		
		
		
	}
}