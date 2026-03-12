class CafeSeven{
	
	static String cafeName = "tea";
	static	String teaNames[] = {"Amrut tea ", "Ginger tea ", "Lemon tea ","Black tea", "Elachi tea", "masala chai"};
	static	String coffeeNames[] = {"black coffee ", " Cappuccino", "Iced Coffees", "cold coffee", "Espresso", "Latte", "mocha", "mocha breve", "Americano","Cortado", " Flat White"};
	static	String snacks[]  = {"burger","sandwich","Samosa","Spiced Nuts","Garlic Bread Toast", "pav bhaji","masala bun","rusk","french fries","pizza"," roasted nuts"};
	
	
	public static void main(String args[])
	{
// method intilization		
		teaNames();
		coffeeNames();
		snacks();
		
	}
	//method declaration
	static void teaNames()
	{
		System.out.println("Available tea are ");
		for(String tea : teaNames){
			System.out.println(tea);
		}
	}
	static void coffeeNames()
	{
		System.out.println("Available coffees are ");
		for(String coffee:coffeeNames){
			System.out.println(coffee);
		}
		
	}
	
	static void snacks(){
		System.out.println("Available snacks are ");
		for(String snack:snacks)
		{
			System.out.println(snack);
		}
		
	}
}