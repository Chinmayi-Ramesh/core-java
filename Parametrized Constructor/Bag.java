class Bag
{
    String brand;
    String type;
    String color;
    double price;
    double weight;
    String material;
    int numberOfCompartments;
	
	Bag()
	{
		System.out.println("This is a default constructor");
	}
	
	Bag(String brand, String type, String color, double price, double weight, String material, int numberOfCompartments)
	{
		System.out.println("This is a parameterized constructor of Bag class");
		this.brand = brand;
		this.type =type ;
		this.color = color;
		this.price = price;
		this.weight = weight;
		this.material = material;
		this.numberOfCompartments = numberOfCompartments;
	}
	void display()
	{
		System.out.println(brand);
		System.out.println(type);
		System.out.println(color);
		System.out.println(price);
		System.out.println(weight);
		System.out.println(material);
		System.out.println(numberOfCompartments);
	}
}