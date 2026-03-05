class cafeSix
{
	public static void main(String args[])
	{
		String cafeName = "tea";
		//String teaNames[] = {"Amrut tea ", "Ginger tea ", "Lemon tea ","Black tea", "Elachi tea", "masala chai"};
		//String coffeeNames[] = {"black coffee ", " Cappuccino", "Iced Coffees", "cold coffee", "Espresso", "Latte", "mocha", "mocha breve", "Americano","Cortado", " Flat White"};
		//String snacks[]  = {"burger","sandwich","Samosa","Spiced Nuts","Garlic Bread Toast", "pav bhaji","masala bun","rusk","french fries","pizza"," roasted nuts"};
		String elachi="elachi tea";
		String amrut = "Amrut chai";
		String ginger = "ginger tea";
		String lemon = "lemon tea";
		String masala="masala tea";
		String teaNames[]={elachi, amrut,ginger,lemon,masala};
		
		for (String tea: teaNames){
			System.out.println(tea);
		}
		
		
		String blackcoffee="black coffee";
		String cappuccino="Cappuccino";
		String iced="Iced Coffees";
		String cold = "Cold Coffees";
		String espresso="Espresso";
		String latte="Latte";
		
		String coffeeNames[]={blackcoffee,cappuccino, iced, cold, espresso, latte};
	
		for(String coffee : coffeeNames)
		{
			System.out.println(coffee);
		}
		
		
		String burger = "burger";
		String sandwich ="sandwich";
		String samosa ="samosa";
		String pavbhajji= "pav bhajji";
		String pizza="pizza";
		String frenchFries= "French fries";
	
		
		String snacks[] = {burger, sandwich, samosa, pavbhajji,pizza, frenchFries};
		for(String snack : snacks)
		{
			System.out.println(snack);
		}
}