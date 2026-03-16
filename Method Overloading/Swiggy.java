class Swiggy{
	
	public static double search(String foodName){
		double price = 0.0;
		if(foodName.equals("Burger")){
			price = 99.0;
			return price;
		}
		return 0.0;
	}

	public static double search(String foodName, int quantity){
		double price = 99.0 * quantity;
		return price;
	}

	public static void main(String[] args){
		System.out.println("Food Name: Burger");
		System.out.println("Price: " + search("Burger"));
		System.out.println("Quantity: 2");
	}
}