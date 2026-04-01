class Zomato{

	public static double search(String itemName){
		double price = 0.0;

		if(itemName == "VegBiryani"){
			price = 140.00;
			return price;
		}
		else if(itemName == "ChickenBiryani"){
			price = 220.00;
			return price;
		}
		else if(itemName == "PaneerButterMasala"){
			price = 180.00;
			return price;
		}
		else if(itemName == "ButterChicken"){
			price = 240.00;
			return price;
		}
		else if(itemName == "VegFriedRice"){
			price = 120.00;
			return price;
		}
		else if(itemName == "ChickenFriedRice"){
			price = 160.00;
			return price;
		}
		else if(itemName == "VegNoodles"){
			price = 110.00;
			return price;
		}
		else if(itemName == "ChickenNoodles"){
			price = 150.00;
			return price;
		}
		else if(itemName == "SpringRoll"){
			price = 90.00;
			return price;
		}
		else if(itemName == "ChilliChicken"){
			price = 190.00;
			return price;
		}
		else if(itemName == "TandooriChicken"){
			price = 260.00;
			return price;
		}
		else if(itemName == "Chicken65"){
			price = 200.00;
			return price;
		}
		else if(itemName == "VegManchurian"){
			price = 130.00;
			return price;
		}
		else if(itemName == "GobiManchurian"){
			price = 120.00;
			return price;
		}
		else if(itemName == "ChickenManchurian"){
			price = 170.00;
			return price;
		}
		else if(itemName == "MushroomMasala"){
			price = 160.00;
			return price;
		}
		else if(itemName == "DalTadka"){
			price = 110.00;
			return price;
		}
		else if(itemName == "JeeraRice"){
			price = 100.00;
			return price;
		}
		else if(itemName == "PlainRice"){
			price = 80.00;
			return price;
		}
		else if(itemName == "CurdRice"){
			price = 90.00;
			return price;
		}
		else if(itemName == "TomatoSoup"){
			price = 70.00;
			return price;
		}
		else if(itemName == "SweetCornSoup"){
			price = 75.00;
			return price;
		}
		else if(itemName == "HotAndSourSoup"){
			price = 80.00;
			return price;
		}
		else if(itemName == "VegPizza"){
			price = 160.00;
			return price;
		}
		else if(itemName == "ChickenPizza"){
			price = 210.00;
			return price;
		}
		else if(itemName == "VegBurger"){
			price = 90.00;
			return price;
		}
		else if(itemName == "ChickenBurger"){
			price = 130.00;
			return price;
		}
		else if(itemName == "FrenchFries"){
			price = 80.00;
			return price;
		}
		else if(itemName == "GarlicBread"){
			price = 95.00;
			return price;
		}
		else if(itemName == "VegSandwich"){
			price = 85.00;
			return price;
		}
		else if(itemName == "ChickenSandwich"){
			price = 120.00;
			return price;
		}
		else if(itemName == "CheeseSandwich"){
			price = 100.00;
			return price;
		}
		else if(itemName == "ColdCoffee"){
			price = 110.00;
			return price;
		}
		else if(itemName == "LemonJuice"){
			price = 50.00;
			return price;
		}
		else if(itemName == "MangoShake"){
			price = 120.00;
			return price;
		}
		else if(itemName == "StrawberryShake"){
			price = 130.00;
			return price;
		}
		else if(itemName == "ChocolateShake"){
			price = 140.00;
			return price;
		}
		else if(itemName == "VanillaIceCream"){
			price = 70.00;
			return price;
		}
		else if(itemName == "ChocolateIceCream"){
			price = 80.00;
			return price;
		}
		else if(itemName == "ButterscotchIceCream"){
			price = 85.00;
			return price;
		}
		else{
			System.out.println(itemName + " not found");
		}

		return price;
	}

	public static double search(String itemName,int quantity){
	double price = 0.0;

	if(itemName == "VegBiryani"){
		price = 140.00 * quantity;
		return price;
	}
	else if(itemName == "ChickenBiryani"){
		price = 220.00 * quantity;
		return price;
	}
	else if(itemName == "PaneerButterMasala"){
		price = 180.00 * quantity;
		return price;
	}
	else if(itemName == "ButterChicken"){
		price = 240.00 * quantity;
		return price;
	}
	else if(itemName == "VegFriedRice"){
		price = 120.00 * quantity;
		return price;
	}
	else if(itemName == "ChickenFriedRice"){
		price = 160.00 * quantity;
		return price;
	}
	else if(itemName == "VegNoodles"){
		price = 110.00 * quantity;
		return price;
	}
	else if(itemName == "ChickenNoodles"){
		price = 150.00 * quantity;
		return price;
	}
	else if(itemName == "SpringRoll"){
		price = 90.00 * quantity;
		return price;
	}
	else if(itemName == "ChilliChicken"){
		price = 190.00 * quantity;
		return price;
	}
	else if(itemName == "TandooriChicken"){
		price = 260.00 * quantity;
		return price;
	}
	else if(itemName == "Chicken65"){
		price = 200.00 * quantity;
		return price;
	}
	else if(itemName == "VegManchurian"){
		price = 130.00 * quantity;
		return price;
	}
	else if(itemName == "GobiManchurian"){
		price = 120.00 * quantity;
		return price;
	}
	else if(itemName == "ChickenManchurian"){
		price = 170.00 * quantity;
		return price;
	}
	else if(itemName == "MushroomMasala"){
		price = 160.00 * quantity;
		return price;
	}
	else if(itemName == "DalTadka"){
		price = 110.00 * quantity;
		return price;
	}
	else if(itemName == "JeeraRice"){
		price = 100.00 * quantity;
		return price;
	}
	else if(itemName == "PlainRice"){
		price = 80.00 * quantity;
		return price;
	}
	else if(itemName == "CurdRice"){
		price = 90.00 * quantity;
		return price;
	}
	else if(itemName == "TomatoSoup"){
		price = 70.00 * quantity;
		return price;
	}
	else if(itemName == "SweetCornSoup"){
		price = 75.00 * quantity;
		return price;
	}
	else if(itemName == "HotAndSourSoup"){
		price = 80.00 * quantity;
		return price;
	}
	else if(itemName == "VegPizza"){
		price = 160.00 * quantity;
		return price;
	}
	else if(itemName == "ChickenPizza"){
		price = 210.00 * quantity;
		return price;
	}
	else if(itemName == "VegBurger"){
		price = 90.00 * quantity;
		return price;
	}
	else if(itemName == "ChickenBurger"){
		price = 130.00 * quantity;
		return price;
	}
	else if(itemName == "FrenchFries"){
		price = 80.00 * quantity;
		return price;
	}
	else if(itemName == "GarlicBread"){
		price = 95.00 * quantity;
		return price;
	}
	else if(itemName == "VegSandwich"){
		price = 85.00 * quantity;
		return price;
	}
	else if(itemName == "ChickenSandwich"){
		price = 120.00 * quantity;
		return price;
	}
	else if(itemName == "CheeseSandwich"){
		price = 100.00 * quantity;
		return price;
	}
	else if(itemName == "ColdCoffee"){
		price = 110.00 * quantity;
		return price;
	}
	else if(itemName == "LemonJuice"){
		price = 50.00 * quantity;
		return price;
	}
	else if(itemName == "MangoShake"){
		price = 120.00 * quantity;
		return price;
	}
	else if(itemName == "StrawberryShake"){
		price = 130.00 * quantity;
		return price;
	}
	else if(itemName == "ChocolateShake"){
		price = 140.00 * quantity;
		return price;
	}
	else if(itemName == "VanillaIceCream"){
		price = 70.00 * quantity;
		return price;
	}
	else if(itemName == "ChocolateIceCream"){
		price = 80.00 * quantity;
		return price;
	}
	else if(itemName == "ButterscotchIceCream"){
		price = 85.00 * quantity;
		return price;
	}
	else{
		System.out.println(itemName + " not found");
	}

	return price;
}
}