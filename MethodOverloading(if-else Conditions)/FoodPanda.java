class FoodPanda{

	public static double search(String itemName){
		double price = 0.0;

		if(itemName == "ChickenBiryani"){
			price = 220; 
			return price; 
		}
	    else if(itemName == "MuttonBiryani"){
			price = 280; 
			return price; 
			}
		else if(itemName == "VegBiryani"){
            price = 180; 
			return price;
			}
		else if(itemName == "PaneerBiryani"){
			price = 200; 
			return price; 
			}
		else if(itemName == "HyderabadiBiryani"){
			price = 260; 
			return price; 
			}
		else if(itemName == "EggBiryani"){
			price = 190; 
			return price; 
			}
		else if(itemName == "ChickenTikka"){
			price = 240; 
			return price; 
			}
		else if(itemName == "PaneerTikka"){
			price = 210; 
			return price; 
			}
		else if(itemName == "FishTikka"){
			price = 250; 
			return price; 
			}
		else if(itemName == "TandooriChicken"){
			price = 260; 
			return price; 
			}
			else if(itemName == "ButterNaan"){
				price = 40; 
				return price;
				}
		else if(itemName == "GarlicNaan"){
			price = 50; 
			return price; 
			}
		else if(itemName == "ButterRoti"){
			price = 30; 
			return price; 
			}
		else if(itemName == "TandooriRoti"){
			price = 25;
			return price; 
			}
		else if(itemName == "PlainNaan"){ 
		price = 35; 
		return price; 
		}
		else if(itemName == "PaneerButterMasala"){ 
		price = 220; 
		return price; 
		}
		else if(itemName == "ButterChicken"){ 
		price = 260;
		return price; 
		}
		else if(itemName == "ChickenCurry"){
			price = 240; 
			return price; 
			}
		else if(itemName == "MuttonCurry"){
			price = 300; 
			return price; 
			}
		else if(itemName == "DalTadka"){
			price = 160; 
			return price;
			}

		else if(itemName == "DalFry"){
			price = 150; 
			return price; 
			}
		else if(itemName == "JeeraRice"){
			price = 140; 
			return price; 
			}
		else if(itemName == "VegFriedRice"){
			price = 160; 
			return price; 
			}
		else if(itemName == "ChickenFriedRice"){ 
		price = 180; 
		return price;
		}
		else if(itemName == "EggFriedRice"){
			price = 170; 
			return price; 
			}
		else if(itemName == "VegNoodles"){
			price = 150; 
			return price; 
			}
		else if(itemName == "ChickenNoodles"){ 
		price = 170; 
		return price; 
		}
		else if(itemName == "EggNoodles"){
			price = 160; 
			return price;
			}
		else if(itemName == "GobiManchurian"){
			price = 180; 
			return price; 
			}
		else if(itemName == "ChickenManchurian"){
			price = 200; 
			return price; 
			}
			else if(itemName == "PaneerManchurian"){
				price = 190; 
				return price; 
				}
		else if(itemName == "VegSpringRoll"){
			price = 120; 
			return price; 
			}
		else if(itemName == "ChickenSpringRoll"){
			price = 140; 
			return price; 
			}
		else if(itemName == "VegBurger"){
			price = 110; 
			return price; 
			}
		else if(itemName == "ChickenBurger"){
			price = 130; 
			return price; 
			}
		else if(itemName == "VegPizza"){
			price = 220; 
			return price; 
			}
		else if(itemName == "ChickenPizza"){
			price = 250; return price; 
			}
		else if(itemName == "PaneerPizza"){
			price = 240; 
			return price; 
			}
		else if(itemName == "CheesePizza"){
			price = 230; 
			return price;
			}
		else if(itemName == "FrenchFries"){
			price = 100;
			return price; 
		}else if(itemName == "CheeseFries"){
			price = 130; 
			return price; 
			}
		else if(itemName == "ChocolateShake"){
			price = 120; return price; }
		else if(itemName == "StrawberryShake"){
			price = 120; 
			return price; 
			}
		else if(itemName == "VanillaShake"){
			price = 110; 
			return price; 
			}
		else if(itemName == "MangoShake"){
			price = 130; 
			return price; 
			}
		else if(itemName == "ColdCoffee"){
			price = 140; return price; 
			}
		else if(itemName == "LemonJuice"){
			price = 70; 
			return price; 
			}
		else if(itemName == "OrangeJuice"){
			price = 80; 
			return price; 
			}
		else if(itemName == "AppleJuice"){
			price = 90; 
			return price;
			}
		else if(itemName == "WatermelonJuice"){
			price = 85; 
			return price; 
			}

		else if(itemName == "ChocolateCake"){
			price = 160; 
			return price; 
			}
		else if(itemName == "BlackForestCake"){
			price = 180; 
			return price; 
			}
		else if(itemName == "RedVelvetCake"){
			price = 200;
			return price; 
			}
		else if(itemName == "Brownie"){
			price = 120; 
			return price; 
			}
		else if(itemName == "Donut"){
			price = 90; 
			return price; 
			}
		else if(itemName == "CupCake"){
			price = 80; 
			return price; 
			}
		else if(itemName == "Pastry"){
			price = 100; 
			return price; 
			}
		else if(itemName == "IceCreamCup"){
			price = 70; 
			return price;
			}
			
		else if(itemName == "IceCreamCone"){
			price = 60; 
			return price; 
			}

		else{
			System.out.println(itemName + " not found");
		}

		return price;
	}


	public static double search(String itemName,int quantity){
	double price = 0.0;

	if(itemName == "ChickenBiryani"){
		price = 220 * quantity; 
		return price; 
		}
	else if(itemName == "MuttonBiryani"){
		price = 280 * quantity; 
		return price; 
		}
	else if(itemName == "VegBiryani"){
		price = 180 * quantity; 
		return price; 
		}
	else if(itemName == "PaneerBiryani"){
		price = 200 * quantity; 
		return price; 
		}
	else if(itemName == "HyderabadiBiryani"){
		price = 260 * quantity; 
		return price; 
		}
	else if(itemName == "EggBiryani"){
		price = 190 * quantity; 
		return price; 
		}
	else if(itemName == "ChickenTikka"){
		price = 240 * quantity; 
		return price; 
		}
	else if(itemName == "PaneerTikka"){
		price = 210 * quantity;
		return price; 
		}
	else if(itemName == "FishTikka"){
		price = 250 * quantity; 
		return price; 
		}
	else if(itemName == "TandooriChicken"){
		price = 260 * quantity; 
		return price; 
		}else if(itemName == "ButterNaan"){ 
		price = 40 * quantity; 
		return price; 
		}
	else if(itemName == "GarlicNaan"){
		price = 50 * quantity; 
		return price; 
		}
	else if(itemName == "ButterRoti"){
		price = 30 * quantity; 
		return price; 
		}
	else if(itemName == "TandooriRoti"){
		price = 25 * quantity; 
		return price; 
		
		}
	else if(itemName == "PlainNaan"){
		price = 35 * quantity; 
		return price; 
		}
	else if(itemName == "PaneerButterMasala"){
		price = 220 * quantity;
		return price; 
		}else if(itemName == "ButterChicken"){ 
		price = 260 * quantity; 
		return price; 
		}else if(itemName == "ChickenCurry"){ 
		price = 240 * quantity; 
		return price; 
		}
	else if(itemName == "MuttonCurry"){ 
	price = 300 * quantity; 
	return price; 
	}
	else if(itemName == "DalTadka"){
		price = 160 * quantity; 
		return price; 
	}else if(itemName == "DalFry"){ 
	price = 150 * quantity; 
	return price; 
	}
	else if(itemName == "JeeraRice"){
		price = 140 * quantity; 
		return price; 
	}
	else if(itemName == "VegFriedRice"){
		price = 160 * quantity; 
		return price; 
		}
	else if(itemName == "ChickenFriedRice"){
		price = 180 * quantity; 
		return price; 
		}
	else if(itemName == "EggFriedRice"){
		price = 170 * quantity; 
		return price; 
		}
	else if(itemName == "VegNoodles"){
		price = 150 * quantity; 
		return price; 
		}else if(itemName == "ChickenNoodles"){
			price = 170 * quantity; 
			return price; 
		}else if(itemName == "EggNoodles"){
			price = 160 * quantity; 
			return price; 
		}else if(itemName == "GobiManchurian"){
		price = 180 * quantity; 
		return price; 
		}else if(itemName == "ChickenManchurian"){
		price = 200 * quantity; 
		return price; 
		}
		else if(itemName == "PaneerManchurian"){
			price = 190 * quantity; 
			return price; 
		}else if(itemName == "VegSpringRoll"){
			price = 120 * quantity; 
			return price; 
		}else if(itemName == "ChickenSpringRoll"){
			price = 140 * quantity; 
			return price; 
		}else if(itemName == "VegBurger"){ 
		price = 110 * quantity; 
		return price; 
		}else if(itemName == "ChickenBurger"){
			price = 130 * quantity; 
			return price; 
		}else if(itemName == "VegPizza"){
			price = 220 * quantity; 
			return price; 
		}else if(itemName == "ChickenPizza"){
			price = 250 * quantity; 
			return price; 
		}else if(itemName == "PaneerPizza"){
			price = 240 * quantity; 
			return price; 
		}else if(itemName == "CheesePizza"){
			price = 230 * quantity; 
			return price; 
		}else if(itemName == "FrenchFries"){
			price = 100 * quantity; 
			return price; 
		}else if(itemName == "CheeseFries"){
			price = 130 * quantity; 
			return price; 
		}else if(itemName == "ChocolateShake"){
			price = 120 * quantity; 
			return price; 
		}else if(itemName == "StrawberryShake"){
			price = 120 * quantity; 
			return price; 
		}else if(itemName == "VanillaShake"){
			price = 110 * quantity; 
			return price; 
		}else if(itemName == "MangoShake"){
			price = 130 * quantity;
			return price; 
		}else if(itemName == "ColdCoffee"){
			price = 140 * quantity; 
			return price; 
		}else if(itemName == "LemonJuice"){
			price = 70 * quantity; 
			return price; 
		}else if(itemName == "OrangeJuice"){
			price = 80 * quantity; 
			return price; 
		}else if(itemName == "AppleJuice"){
			price = 90 * quantity; 
			return price; 
		}else if(itemName == "WatermelonJuice"){
			price = 85 * quantity; 
			return price; 
		}else if(itemName == "ChocolateCake"){
			price = 160 * quantity; 
			return price; 
		}else if(itemName == "BlackForestCake"){
			price = 180 * quantity; 
			return price;			
		}else if(itemName == "RedVelvetCake"){
			price = 200 * quantity; 
			return price; 
		}else if(itemName == "Brownie"){
			price = 120 * quantity;
			return price; 
		}else if(itemName == "Donut"){
			price = 90 * quantity; 
			return price; 
		}else if(itemName == "CupCake"){
			price = 80 * quantity;
			return price;
		}else if(itemName == "Pastry"){
			price = 100 * quantity; 
			return price; 
		}else if(itemName == "IceCreamCup"){
			price = 70 * quantity; 
			return price; 
		}else if(itemName == "IceCreamCone"){
			price = 60 * quantity; 
			return price; 
		}else{
		System.out.println(itemName + " not found");
	}

	return price;
}
}