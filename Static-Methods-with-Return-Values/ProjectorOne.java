class ProjectorOne
{
	public static void main(String[] ref)
	{
		System.out.println("main started");
		String brand = Projector.getBrand();
		System.out.println("the Projector brand is "+brand);
		double price = Projector.getPrice();
		System.out.println("the price of a Projector is "+price);
		String colour= Projector.getColor();
		System.out.println("the color of Projector is "+colour);
		
		
		
	}
}