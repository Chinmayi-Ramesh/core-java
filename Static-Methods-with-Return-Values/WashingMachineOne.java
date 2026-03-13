class WashingMachineOne
{
	public static void main(String[] ref)
	{
		System.out.println("main started");
		String brand = WashingMachine.getBrand();
		System.out.println("the WashingMachine brand is "+brand);
		double price = WashingMachine.getPrice();
		System.out.println("the price of a WashingMachine is "+price);
		String colour= WashingMachine.getColor();
		System.out.println("the color of WashingMachine is "+colour);
		
		
		
	}
}