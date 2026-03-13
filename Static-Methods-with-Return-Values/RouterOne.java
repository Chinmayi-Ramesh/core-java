class RouterOne
{
	public static void main(String[] ref)
	{
		System.out.println("main started");
		String brand = Router.getBrand();
		System.out.println("the Router brand is "+brand);
		double price = Router.getPrice();
		System.out.println("the price of a Router is "+price);
		String colour= Router.getColor();
		System.out.println("the color of Router is "+colour);
		
		
		
	}
}