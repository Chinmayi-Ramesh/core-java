class Anklet
{
	String brand;
	double cost;
	String material;
	String colour;
	String type;
	double length;
	boolean isAdjustable;
	String design;
	
	Anklet()
	{
		System.out.println("This is a deault constructor");
	}
	
	Anklet(String brand, double cost, String material, String colour, String type, double length, boolean isAdjustable, String design)
	{
		System.out.println("Anklet parameterized constructor is executing");
		this.brand = brand;
		this.cost = cost;
		this.material = material;
		this.colour  = colour;
		this.type =type;
		this.length = length;
		this.isAdjustable =isAdjustable;
		this.design = design;
		
	}
	
	void display()
	{
		System.out.println("display method is executing");
		System.out.println(brand);
		System.out.println(cost);
		System.out.println(material);
		System.out.println(colour);
		System.out.println(type);
		System.out.println(length);
		System.out.println(isAdjustable);
		System.out.println(design);
		System.out.println("display method competed its execution");
	}
}