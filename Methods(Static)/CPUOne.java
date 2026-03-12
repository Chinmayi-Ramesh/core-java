class CPUOne
{
	public static void main(String[] ref)
	{
		System.out.println("main started");
		String brand = CPU.getBrand();
		System.out.println("the CPU brand is "+brand);
		double price = CPU.getPrice();
		System.out.println("the price of a CPU is "+price);
		String colour= CPU.getColor();
		System.out.println("the color of CPU is "+colour);
		
		
		
	}
}