class Blinkit{

	public static double search(String itemName){
		double price = 0.0;

		if(itemName == "Kurkure"){
			price = 18.00;
			return price;
		}
		else if(itemName == "Jamun"){
			price = 20.00;
			return price;
		}
		else if(itemName == "Lays"){
			price = 25.00;
			return price;
		}
		else if(itemName == "Cookies"){
			price = 30.00;
			return price;
		}
		else if(itemName == "Milk"){
			price = 45.00;
			return price;
		}
		else if(itemName == "Bread"){
			price = 35.00;
			return price;
		}
		else if(itemName == "Butter"){
			price = 55.00;
			return price;
		}
		else if(itemName == "Cheese"){
			price = 80.00;
			return price;
		}
		else if(itemName == "Paneer"){
			price = 90.00;
			return price;
		}
		else if(itemName == "Chocolate"){
			price = 40.00;
			return price;
		}
		else if(itemName == "Biscuits"){
			price = 22.00;
			return price;
		}
		else if(itemName == "IceCream"){
			price = 60.00;
			return price;
		}
		else if(itemName == "Apple"){
			price = 50.00;
			return price;
		}
		else if(itemName == "Banana"){
			price = 20.00;
			return price;
		}
		else if(itemName == "Orange"){
			price = 40.00;
			return price;
		}
		else if(itemName == "Mango"){
			price = 70.00;
			return price;
		}
		else if(itemName == "Grapes"){
			price = 65.00;
			return price;
		}
		else if(itemName == "Pineapple"){
			price = 80.00;
			return price;
		}
		else if(itemName == "Watermelon"){
			price = 90.00;
			return price;
		}
		else if(itemName == "Papaya"){
			price = 55.00;
			return price;
		}
		else if(itemName == "Strawberry"){
			price = 100.00;
			return price;
		}
		else if(itemName == "Pizza"){
			price = 150.00;
			return price;
		}
		else if(itemName == "Burger"){
			price = 120.00;
			return price;
		}
		else if(itemName == "Sandwich"){
			price = 70.00;
			return price;
		}
		else if(itemName == "Pasta"){
			price = 110.00;
			return price;
		}
		else if(itemName == "Noodles"){
			price = 95.00;
			return price;
		}
		else if(itemName == "Momos"){
			price = 85.00;
			return price;
		}
		else if(itemName == "Fries"){
			price = 60.00;
			return price;
		}
		else if(itemName == "Nuggets"){
			price = 130.00;
			return price;
		}
		else if(itemName == "Chicken"){
			price = 220.00;
			return price;
		}
		else if(itemName == "Egg"){
			price = 10.00;
			return price;
		}
		else if(itemName == "Rice"){
			price = 50.00;
			return price;
		}
		else if(itemName == "Biryani"){
			price = 180.00;
			return price;
		}
		else if(itemName == "Dal"){
			price = 80.00;
			return price;
		}
		else if(itemName == "Chapati"){
			price = 40.00;
			return price;
		}
		else if(itemName == "Paratha"){
			price = 50.00;
			return price;
		}
		else if(itemName == "Dosa"){
			price = 60.00;
			return price;
		}
		else if(itemName == "Idli"){
			price = 35.00;
			return price;
		}
		else if(itemName == "Vada"){
			price = 30.00;
			return price;
		}
		else if(itemName == "Upma"){
			price = 45.00;
			return price;
		}
		else if(itemName == "Poha"){
			price = 40.00;
			return price;
		}
		else if(itemName == "Tea"){
			price = 15.00;
			return price;
		}
		else if(itemName == "Coffee"){
			price = 25.00;
			return price;
		}
		else if(itemName == "Juice"){
			price = 50.00;
			return price;
		}
		else if(itemName == "Soda"){
			price = 30.00;
			return price;
		}
		else if(itemName == "Coke"){
			price = 40.00;
			return price;
		}
		else if(itemName == "Pepsi"){
			price = 40.00;
			return price;
		}
		else if(itemName == "Sprite"){
			price = 40.00;
			return price;
		}
		else if(itemName == "Fanta"){
			price = 40.00;
			return price;
		}
		else if(itemName == "Cake"){
			price = 120.00;
			return price;
		}
		else if(itemName == "Pastry"){
			price = 90.00;
			return price;
		}
		else if(itemName == "Donut"){
			price = 70.00;
			return price;
		}
		else if(itemName == "Muffin"){
			price = 65.00;
			return price;
		}
		else if(itemName == "Brownie"){
			price = 80.00;
			return price;
		}
		else if(itemName == "Pancake"){
			price = 100.00;
			return price;
		}
		else if(itemName == "Waffle"){
			price = 110.00;
			return price;
		}
		else if(itemName == "Candy"){
			price = 20.00;
			return price;
		}
		else if(itemName == "Chips"){
			price = 30.00;
			return price;
		}
		else if(itemName == "Popcorn"){
			price = 50.00;
			return price;
		}
		else if(itemName == "Nachos"){
			price = 90.00;
			return price;
		}
		else{
			System.out.println(itemName + " not found");
		}

		return price;
	}
	
	public static double search(String itemName, int quantity){
		
	double price = 0.0;

	if(itemName == "Kurkure"){
		price = 18.00 * quantity;
		return price;
	}
	else if(itemName == "Jamun"){
		price = 20.00 * quantity;
		return price;
	}
	else if(itemName == "Lays"){
		price = 25.00 * quantity;
		return price;
	}
	else if(itemName == "Cookies"){
		price = 30.00 * quantity;
		return price;
	}
	else if(itemName == "Milk"){
		price = 45.00 * quantity;
		return price;
	}
	else if(itemName == "Bread"){
		price = 35.00 * quantity;
		return price;
	}
	else if(itemName == "Butter"){
		price = 55.00 * quantity;
		return price;
	}
	else if(itemName == "Cheese"){
		price = 80.00 * quantity;
		return price;
	}
	else if(itemName == "Paneer"){
		price = 90.00 * quantity;
		return price;
	}
	else if(itemName == "Chocolate"){
		price = 40.00 * quantity;
		return price;
	}
	else if(itemName == "Biscuits"){
		price = 22.00 * quantity;
		return price;
	}
	else if(itemName == "IceCream"){
		price = 60.00 * quantity;
		return price;
	}
	else if(itemName == "Apple"){
		price = 50.00 * quantity;
		return price;
	}
	else if(itemName == "Banana"){
		price = 20.00 * quantity;
		return price;
	}
	else if(itemName == "Orange"){
		price = 40.00 * quantity;
		return price;
	}
	else if(itemName == "Mango"){
		price = 70.00 * quantity;
		return price;
	}
	else if(itemName == "Grapes"){
		price = 65.00 * quantity;
		return price;
	}
	else if(itemName == "Pineapple"){
		price = 80.00 * quantity;
		return price;
	}
	else if(itemName == "Watermelon"){
		price = 90.00 * quantity;
		return price;
	}
	else if(itemName == "Papaya"){
		price = 55.00 * quantity;
		return price;
	}
	else if(itemName == "Strawberry"){
		price = 100.00 * quantity;
		return price;
	}
	else if(itemName == "Pizza"){
		price = 150.00 * quantity;
		return price;
	}
	else if(itemName == "Burger"){
		price = 120.00 * quantity;
		return price;
	}
	else if(itemName == "Sandwich"){
		price = 70.00 * quantity;
		return price;
	}
	else if(itemName == "Pasta"){
		price = 110.00 * quantity;
		return price;
	}
	else if(itemName == "Noodles"){
		price = 95.00 * quantity;
		return price;
	}
	else if(itemName == "Momos"){
		price = 85.00 * quantity;
		return price;
	}
	else if(itemName == "Fries"){
		price = 60.00 * quantity;
		return price;
	}
	else if(itemName == "Nuggets"){
		price = 130.00 * quantity;
		return price;
	}
	else if(itemName == "Chicken"){
		price = 220.00 * quantity;
		return price;
	}
	else if(itemName == "Egg"){
		price = 10.00 * quantity;
		return price;
	}
	else if(itemName == "Rice"){
		price = 50.00 * quantity;
		return price;
	}
	else if(itemName == "Biryani"){
		price = 180.00 * quantity;
		return price;
	}
	else if(itemName == "Dal"){
		price = 80.00 * quantity;
		return price;
	}
	else if(itemName == "Chapati"){
		price = 40.00 * quantity;
		return price;
	}
	else if(itemName == "Paratha"){
		price = 50.00 * quantity;
		return price;
	}
	else if(itemName == "Dosa"){
		price = 60.00 * quantity;
		return price;
	}
	else if(itemName == "Idli"){
		price = 35.00 * quantity;
		return price;
	}
	else if(itemName == "Vada"){
		price = 30.00 * quantity;
		return price;
	}
	else if(itemName == "Upma"){
		price = 45.00 * quantity;
		return price;
	}
	else if(itemName == "Poha"){
		price = 40.00 * quantity;
		return price;
	}
	else if(itemName == "Tea"){
		price = 15.00 * quantity;
		return price;
	}
	else if(itemName == "Coffee"){
		price = 25.00 * quantity;
		return price;
	}
	else if(itemName == "Juice"){
		price = 50.00 * quantity;
		return price;
	}
	else if(itemName == "Soda"){
		price = 30.00 * quantity;
		return price;
	}
	else if(itemName == "Coke"){
		price = 40.00 * quantity;
		return price;
	}
	else if(itemName == "Pepsi"){
		price = 40.00 * quantity;
		return price;
	}
	else if(itemName == "Sprite"){
		price = 40.00 * quantity;
		return price;
	}
	else if(itemName == "Fanta"){
		price = 40.00 * quantity;
		return price;
	}
	else if(itemName == "Cake"){
		price = 120.00 * quantity;
		return price;
	}
	else if(itemName == "Pastry"){
		price = 90.00 * quantity;
		return price;
	}
	else if(itemName == "Donut"){
		price = 70.00 * quantity;
		return price;
	}
	else if(itemName == "Muffin"){
		price = 65.00 * quantity;
		return price;
	}
	else if(itemName == "Brownie"){
		price = 80.00 * quantity;
		return price;
	}
	else if(itemName == "Pancake"){
		price = 100.00 * quantity;
		return price;
	}
	else if(itemName == "Waffle"){
		price = 110.00 * quantity;
		return price;
	}
	else if(itemName == "Candy"){
		price = 20.00 * quantity;
		return price;
	}
	else if(itemName == "Chips"){
		price = 30.00 * quantity;
		return price;
	}
	else if(itemName == "Popcorn"){
		price = 50.00 * quantity;
		return price;
	}
	else if(itemName == "Nachos"){
		price = 90.00 * quantity;
		return price;
	}
	else{
		System.out.println(itemName + " not found");
	}

	return price;
}
}