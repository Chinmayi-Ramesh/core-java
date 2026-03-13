class MonitorOne
{
	public static void main(String[] ref)
	{
		System.out.println("main started");
		String brand = Monitor.getBrand();
		System.out.println("the Monitor brand is "+brand);
		double price = Monitor.getPrice();
		System.out.println("the price of a Monitor is "+price);
		String colour= Monitor.getColor();
		System.out.println("the color of Monitor is "+colour);
		
		
		
	}
}