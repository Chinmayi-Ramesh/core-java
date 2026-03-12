import java.util.Scanner;
class SuperMarketTwo
{
	static String searchBrandByProduct()
	{
		//150 conditions products method return value
		//elements 29
		
		Scanner read=new Scanner(System.in);
		String products[] = {"Shampoo","hairoil","bbcream","foundation","perfumme","jeans","notes","soap","faceWash","toothPaste","phone","headset","speaker","laptop","kettel","fridge","washingMachine","dishWasher","TV","bags","microoven","mixer","cooler","fan","paint","extentionBox","choclates","softdrinks","cheese","panner","milk","curd","ghee","cookingoil","butter","coffee","tea","juices","icecream","pizza","dishsoap","laundrydetergent","grains","spices","soda","water","energydrink","conditioner","hairserum","bodylotion","bodywash","hairspray","hairmask","handwash","bodyserum","faceserum","sunscreen","lipbalm","lipstick","roomfreshner","deodrant","talcumpowder","shoes","belt","watch","kannadabooks","chairs","cooker","pan","toaster","wheatflour","salt","chillipowder","turmeric","noodels","honey","pens","pencil","earser","sharpner","whitener","folder","calculator","powerbank","batteries","mouse","charger","glue","heater","induction","gasstove","cars","bike","tractor","cycle","treadmill","airPurifier","ceilingLight","tableLamp","nightLamp","smartWatch","fitnessBand","bluetoothTracker","router","modem",  "wifiRepeater","securityCamera","videoDoorbell","smartLock","smartPlug","smartSwitch","powerStrip","surgeProtector","voltageStabilizer","inverter", "batteryBackup","solarPanel","solarLamp","torch","emergencyLight","floodLight","streetLight","laserPrinter","inkTankPrinter","scanner", "laminator","paperShredder","barcodeScanner","posMachine","cashDrawer","weighingScale","labelPrinter","projectorScreen","whiteBoard","noticeBoard", "fileCabinet","documentTray","penStand","deskOrganizer","keyboardCover","mousePad","laptopStand","coolingPad","webcam","microphone", "tripod","gimbal","ringLight","actionCamera","dashCamera","memoryCard","cardReader","externalSSD","externalHDD","usbHub"};
		int count=products.length;
		System.out.println("total number of products  "+count);
		System.out.println("list of products available ");
		for(String pro:products)
		{
			System.out.println(pro);
		}
		System.out.println("\n\nselect the product you want to buy\n\n");
		String item = read.next();
		if(item.equals("shampoo"))
		{
			String[] shampooBrands = {"Dove","ClinicPlus","Pantene","Tresemme","HeadAndShoulders", "Sunsilk","Himalaya","Patanjali","MamaEarth","WOW","Loreal","Biotique","Khadi","Indulekha","Matrix", "HerbalEssences","Sebamed","Revlon","Vaseline","Fiama", "Meera","Chik","Nyle","Ayush","Arata","ForestEssentials","Plum","Minimalist","Soulflower" };
			System.out.println();
			for(String brand : shampooBrands)
			{
				
				System.out.println(brand);
				
			}
		}
		if(item.equals("hairoil"))
		{
			String[] hairoilBrands = { "Parachute","Bajaj","Navratna","Indulekha","KeshKing", "Patanjali","Himalaya","Dabur","Khadi","WOW","MamaEarth","Biotique","Emami","Meera","Trichup", "Amla","Ayush","Nihar","CoconutOil","AlmondDrops","Vatika","BlueHeaven","Soulflower","Plum","Arata","ForestEssentials","JustHerbs","Ustraa","ManMatters"};
			System.out.println();
			for(String brand : hairoilBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("bbcream"))
		{
			String[] bbCreamBrands = { "Ponds","Lakme","Garnier","Maybelline","MamaEarth","WOW","Himalaya","Biotique","Plum","FacesCanada","Colorbar","SwissBeauty","BlueHeaven","Mars","Insight","Sugar","Revlon","Nykaa","MissClaire","Elle18","Lotus","MamaEarthGlow","MyGlamm","KayBeauty","Renee","JustHerbs","SwissMiss","Lakme9to5","LakmeAbsolute"};
			System.out.println();
			for(String brand : bbCreamBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("foundation"))
		{
			String[] foundationBrands = { "Lakme","Maybelline","Loreal","MAC","HudaBeauty",  "Revlon","Colorbar","FacesCanada","SwissBeauty","Mars", "Insight","BlueHeaven","Sugar","Nykaa","KayBeauty","Lotus","Biotique","Ponds","WetAndWild","LAColors","Milani","Chambor","BobbiBrown","EsteeLauder" };
			System.out.println();
			for(String brand : foundationBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("perfume"))
		{
			String[] perfumeBrands = { "Fogg","Denver","WildStone","ParkAvenue","Engage","Axe","Skinn","Titan","BellaVita","Plum", "Ustraa","Villain","LayerR","TheManCompany","Beardo", "Guess","CalvinKlein","Dior","Chanel","Versace","Armaf","Lattafa","Ajmal","Rasasi","Yardley", "Zara","BathAndBodyWorks","Davidoff","Jaguar" };
			System.out.println();
			for(String brand : perfumeBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("jeans"))
		{
			String[] jeansBrands = {"Levis","Wrangler","Lee","Pepe","Diesel","Spykar","FlyingMachine","UCB","Roadster","Mufti","Denizen","JackAndJones","CalvinKlein","TommyHilfiger","AllenSolly","PeterEngland","VanHeusen","Killer","NumeroUno","Buffalo","Highlander","Only","VeroModa","Zara","HnM","Forever21","AmericanEagle","TrueReligion","Gant"};
			System.out.println();
			for(String brand : jeansBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("notes"))
		{
			String[] notesBrands = {"Classmate","Navneet","Camlin","Apsara","Oxford","Paperkraft","FactorNotes","Youva","Scholar","Luxor","DOMS","Nataraj","Reynolds","Cello","Flair","A4Tech","Target","Pigeon","Vidya","Bright","Neelgagan","Solo","Oddy","JK","Bilt","ITC","Orient","Papergrid","Cambridge"};
			System.out.println();
			for(String brand : notesBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("soap"))
		{
			String[] soapBrands = {"Lux","Dove","Pears","Lifebuoy","Dettol","Fiama","Vivel","Cinthol","Patanjali","Himalaya","Medimix","Santoor","MysoreSandal","GodrejNo1","Rexona","Liril","Nivea","Palmolive","Khadi","Biotique","Ayush","Johnson","Savlon","Pigeon","Chandrika","Hamam","ParkAvenue","Vasmol","Dermicool"};
			System.out.println();
			for(String brand :soapBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("faceWash"))
		{
			String[] faceWashBrands = {"Ponds","Himalaya","Garnier","CleanAndClear","Nivea","Simple","Cetaphil","Minimalist","Plum","MamaEarth","WOW","Biotique","Lakme","Lotus","Neutrogena","TheDermaCo","Aqualogica","Reequil","MCaffeine","GoodVibes","Pilgrim","DotAndKey","ForestEssentials","Kaya","VLCC","Joy","Everyuth","Khadi","Ayush"};
			System.out.println();
			for(String brand : faceWashBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("toothPaste"))
		{
			String[] toothPasteBrands = {"Colgate","Pepsodent","CloseUp","Sensodyne","DaburRed","Patanjali","Himalaya","Vicco","Meswak","OralB","Anchor","Babool","Neem","DantKanti","Cibaca","Amway","MamaEarth","WOW","Ayush","Biomed","Thermoseal","ColgateMaxFresh","ColgateActiveSalt","PepsodentGermiCheck","CloseUpFireFreeze","SensodyneRepair","DaburBabool","PatanjaliDantKanti","HimalayaHerbal"};
			System.out.println();
			for(String brand : toothPasteBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("phone"))
		{
			String[] phoneBrands = {"Samsung","Apple","OnePlus","Xiaomi","Redmi","Realme","Vivo","Oppo","Motorola","Nokia","Google","Infinix","Tecno","Itel","Asus","Sony","LG","Honor","iQOO","Nothing","Micromax","Lava","Karbonn","Gionee","Panasonic","BlackBerry","HTC","Lenovo","ZTE"};
			System.out.println();
			for(String brand : phoneBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("headset"))
		{
			String[] headsetBrands = {"Boat","JBL","Sony","Sennheiser","Skullcandy","Bose","Noise","Realme","OnePlus","Apple","Samsung","Mi","Zebronics","Portronics","Boult","CrossBeats","Hammer","Infinity","AKG","Beats","Philips","Logitech","HyperX","Razer","CosmicByte","Redgear","Ambrane","pTron","iBall"};
			System.out.println();
			for(String brand : headsetBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("speaker"))
		{
			String[] speakerBrands = {"JBL","Boat","Sony","Bose","Marshall","UltimateEars","HarmanKardon","Philips","Zebronics","Portronics","Mi","Realme","Anker","Tribit","Infinity","Skullcandy","Logitech","iBall","Fenda","Edifier","Creative","Blaupunkt","Panasonic","Samsung","LG","Noise","Ambrane","pTron","CrossBeats"};
			System.out.println();
			for(String brand : speakerBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("laptop"))
		{
			String[] laptopBrands = {"Dell","HP","Lenovo","Asus","Acer","Apple","MSI","Samsung","LG","Microsoft","Razer","Huawei","Xiaomi","Realme","Avita","Infinix","Toshiba","Sony","Fujitsu","Panasonic","Gigabyte","Chuwi","Vaio","iBall","Micromax","HCL","Redmi","Honor","System76"};
			System.out.println();
			for(String brand : laptopBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("kettel"))
		{
			String[] kettleBrands = {"Prestige","Philips","Bajaj","Pigeon","Butterfly","Havells","MorphyRichards","Kent","Crompton","Milton","Orpat","Vega","Wonderchef","Usha","Boss","Nova","Lifelong","Inalsa","Agaro","iBell","Orient","Kenstar","Activa","BlackAndDecker","RussellHobbs","HamiltonBeach","KitchenAid","Salton","Cello"};
		
			System.out.println();
			for(String brand :kettleBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("fridge"))
		{
			String[] fridgeBrands = {"LG","Samsung","Whirlpool","Godrej","Haier","Panasonic","Bosch","Siemens","Hitachi","IFB","Voltas","BlueStar","Electrolux","Kelvinator","Toshiba","Sharp","Midea","Hisense","Daikin","Onida","Videocon","Lloyd","Croma","AmazonBasics","Sansui","BPL","Sanyo","TCL","Xiaomi"};
		
			System.out.println();
			for(String brand : fridgeBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("washingMachine"))
		{
			String[] washingMachineBrands = {"LG","Samsung","Whirlpool","IFB","Bosch","Siemens","Haier","Godrej","Panasonic","Electrolux","Voltas","Onida","Videocon","Lloyd","Toshiba","Sharp","Midea","Hisense","Daikin","BlueStar","Beko","Candy","Croma","AmazonBasics","Sansui","BPL","Sanyo","TCL","Xiaomi"};
			System.out.println();
			for(String brand : washingMachineBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("dishWasher"))
		{
			String[] dishWasherBrands = {"Bosch","Siemens","IFB","LG","Samsung","Whirlpool","Electrolux","Faber","Hafele","Franke","Voltas","Midea","Hisense","Beko","Candy","Smeg","Ariston","Indesit","Zanussi","Teka","Blomberg","Kuppersberg","Neff","Gaggenau","Baumatic","Cata","Panasonic","Toshiba","Sharp"};
			System.out.println();
			for(String brand : dishWasherBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("TV"))
		{
			String[] tvBrands = {"Samsung","LG","Sony","Panasonic","TCL","Xiaomi","OnePlus","Realme","Hisense","Haier","Vu","Philips","Toshiba","Sharp","Sansui","Onida","Videocon","BPL","Sanyo","Micromax","iFFalcon","Blaupunkt","Nokia","Motorola","Thomson","Kodak","Acer","AmazonBasics","Croma"};
			System.out.println();
			for(String brand : tvBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("bags"))
		{
			String[] bagBrands = {"AmericanTourister","Skybags","Safari","Wildcraft","Puma","Adidas","Nike","Reebok","FGear","Gear","Fastrack","Lavie","Baggit","Caprese","TommyHilfiger","CalvinKlein","Gucci","LouisVuitton","Samsonite","VIP","Aristocrat","Carlton","Dell","HP","Lenovo","Asus","Xiaomi","UnderArmour","Decathlon"};
			System.out.println();
			for(String brand : bagBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("microoven"))
		{
			String[] microOvenBrands = {"LG","Samsung","IFB","Whirlpool","Panasonic","Godrej","Bosch","Siemens","Haier","Electrolux","Voltas","Onida","Videocon","Sharp","Toshiba","Midea","Hisense","Daewoo","Kenstar","Bajaj","MorphyRichards","Wonderchef","BlackAndDecker","AmazonBasics","Croma","Lloyd","BPL","Sansui","TCL"};
			System.out.println();
			for(String brand : microOvenBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("mixer"))
		{
			String[] mixerBrands = {"Preethi","Philips","Bajaj","Prestige","Butterfly","Sujata","MaharajaWhiteline","Havells","Bosch","MorphyRichards","Inalsa","Crompton","Usha","Panasonic","Kenstar","Orpat","Lifelong","Pigeon","Wonderchef","Vidiem","Kent","Agaro","iBell","Nutribullet","BlackAndDecker","HamiltonBeach","KitchenAid","Xiaomi","AmazonBasics"};
			System.out.println();
			for(String brand : mixerBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("cooler"))
		{
			String[] coolerBrands = {"Symphony","Bajaj","Crompton","Orient","Usha","Kenstar","Havells","Voltas","BlueStar","MaharajaWhiteline","RamCooler","Khaitan","Polar","Bajoria","Cello","VGuard","Eveready","Singer","Hindware","iBell","CromptonGreaves","Lloyd","Panasonic","LG","Samsung","Daikin","Hitachi","Sharp","Midea"};
			System.out.println();
			for(String brand : coolerBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("fan"))
		{
			String[] fanBrands = {"Crompton","Havells","Usha","Bajaj","Orient","Atomberg","Polycab","VGuard","Panasonic","Luminous","Khaitan","Superfan","RR","Anchor","GM","Syska","Candes","AmazonBasics","iBell","Longway","Racold","BlueStar","Voltas","LG","Samsung","Mitsubishi","Hunter","Westinghouse","Toshiba"};
			System.out.println();
			for(String brand : fanBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("paint"))
		{
			String[] paintBrands = {"AsianPaints","Berger","Nerolac","Dulux","Indigo","Shalimar","Nippon","Jotun","Kansai","Sheenlac","BritishPaints","Snowcem","Esdee","Sirca","Sayerlack","ICA","AkzoNobel","Pidilite","DrFixit","BirlaWhite","JSWPaints","Walplast","Caparol","Mykolor","Valspar","RustOleum","NipponMatex","KCC","BenjaminMoore"};
			System.out.println();
			for(String brand : paintBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("choclates"))
		{
			String[] chocolateBrands = {"DairyMilk","KitKat","Perk","FiveStar","Munch","MilkyBar","Snickers","Mars","Galaxy","FerreroRocher","Lindt","Toblerone","Hersheys","Amul","Nestle","CadburyFuse","Bournville","Temptations","KinderJoy","KinderBueno","SilkOreo","SilkFruitNut","BarOne","Crunch","Alpenliebe","Choclairs","Eclairs","Skittles","Gems"};
			System.out.println();
			for(String brand : chocolateBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("softdrinks"))
		{
			String[] softDrinkBrands = {"CocaCola","Pepsi","Sprite","Fanta","7Up","MountainDew","ThumsUp","Limca","Mirinda","Maaza","Slice","Frooti","AppyFizz","RedBull","Sting","Gatorade","Powerade","MinuteMaid","Tropicana","Real","PaperBoat","Bovonto","GoldSpot","Rasna","Tang","RoohAfza","Jeeru","Lassi","Jaljeera"};
			System.out.println();
			for(String brand : softDrinkBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("cheese"))
		{
			String[] cheeseBrands = {"Amul","Britannia","GoCheese","MotherDairy","MilkyMist","Vijaya","Heritage","Nandini","Verka","Gowardhan","Dlecta","LaughingCow","President","Arla","Anchor","Emborg","ElleAndVire","Philadelphia","Bega","Kerrygold","Babybel","Castello","Tillamook","Saputo","Leprino","BelGioioso","Galbani","Sargento","Frico"};
			System.out.println();
			for(String brand : cheeseBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("panner"))
		{
			String[] paneerBrands = {"Amul","MotherDairy","MilkyMist","Heritage","Nandini","Vijaya","Britannia","Gowardhan","Verka","Paras","Kwality","Aavin","Sudha","Patanjali","Ananda","CountryDelight","Akshaykalpa","Nestle","Hatsun","Dodla","Jersey","Saras","NamasteIndia","Creamline","RelianceFresh","More","BigBasket","FreshToHome","Natureland"};
			System.out.println();
			for(String brand : paneerBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("extentionBox"))
		{
			String[] extensionBoxBrands = {"GM","Anchor","Havells","Philips","Syska","Wipro","Bajaj","Belkin","Portronics","Honeywell","Goldmedal","Legrand","RR","Polycab","VGuard","Eveready","Orient","iBall","Zebronics","TPLink","Tessco","AmazonBasics","Croma","Mi","Realme","Panasonic","Schneider","Luminous","Salzer"};
			System.out.println();
			for(String brand : extensionBoxBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("milk"))
		{
			String[] milkBrands = {"Amul","Nandini","MotherDairy","Heritage","Aavin","Vijaya","MilkyMist","Dodla","Jersey","Saras","Verka","Sudha","Paras","Gowardhan","Nestle","CountryDelight","Akshayakalpa","Hatsun","Kwality","RelianceFresh","More","BigBasket","FreshToHome","NamasteIndia","Creamline","Patanjali","Ananda","Tirumala","Vita"};
			System.out.println();
			for(String brand : milkBrands)
			{
				System.out.println(brand);
			}
		}
		
		if(item.equals("curd"))
		{
			String[] curdBrands = {"Amul","Nandini","MotherDairy","MilkyMist","Heritage","Vijaya","Aavin","Dodla","Jersey","Saras","Verka","Sudha","Paras","Gowardhan","Nestle","CountryDelight","Akshayakalpa","Hatsun","Kwality","RelianceFresh","More","BigBasket","FreshToHome","NamasteIndia","Creamline","Patanjali","Ananda","Tirumala","Vita"};
			System.out.println();
			for(String brand : curdBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("ghee"))
		{
			String[] gheeBrands = {"Amul","Nandini","Aashirvaad","Gowardhan","Patanjali","Britannia","Nestle","MotherDairy","Ananda","Paras","Verka","Sudha","Saras","Aavin","Heritage","Vijaya","MilkyMist","Akshayakalpa","CountryDelight","OrganicIndia","24Mantra","Vedaka","SriSri","Praakritik","Natureland","BharatGhee","GirCow","Kapiva","Isha"};
			System.out.println();
			for(String brand : gheeBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("cookingoil"))
		{
			String[] cookingOilBrands = {"Fortune","Saffola","Dhara","Gemini","Freedom","GoldWinner","Sunrich","NatureFresh","Engine","RuchiGold","Emami","HealthyHeart","Vedaka","24Mantra","OrganicIndia","Patanjali","Aashirvaad","Nutrela","Sundrop","Oleev","Delite","Idhayam","FortuneRiceBran","Figaro","Borges","Leonardo","Oleina","Canola","Priya"};
			System.out.println();
			for(String brand : cookingOilBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("butter"))
		{
			String[] butterBrands = {"Amul","Britannia","MotherDairy","MilkyMist","Verka","Nandini","Gowardhan","Paras","Aavin","Heritage","Vijaya","Sudha","Saras","Nestle","CountryDelight","Akshayakalpa","Hatsun","Kwality","RelianceFresh","More","BigBasket","FreshToHome","NamasteIndia","Creamline","Patanjali","Ananda","Tirumala","Vita","President"};
			System.out.println();
			for(String brand : butterBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("juices"))
		{
			String[] juiceBrands = {"Tropicana","Real","MinuteMaid","BNatural","Patanjali","PaperBoat","Dabur","DelMonte","Safal","Fresca","Appy","AppyFizz","Frooti","Maaza","Slice","RawPressery","Kapiva","Vedic","24Mantra","OrganicIndia","Ceres","OceanSpray","Sunsweet","Welch","Simply","Innocent","Almarai","Keventers","MotherDairy"};
			System.out.println();
			for(String brand : juiceBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("icecream"))
		{
			String[] iceCreamBrands = {"Amul","KwalityWalls","Vadilal","MotherDairy","BaskinRobbins","Naturals","CreamBell","Havmor","Arun","Dinshaw","Ibaco","LondonDairy","HaagenDazs","GelatoItalia","NIC","GrameenKulfi","Apsara","Giani","Polar","Ideal","JoyIceCream","TopNtown","Pabrai","BaskinRobbinsIndia","VadilalGourmet","AmulGold","Cornetto","Magnum","BenAndJerrys"};
			
			System.out.println();
			for(String brand : iceCreamBrands)
			{
				System.out.println(brand);
			}
			
		}

		if(item.equals("pizza"))
		{
			String[] pizzaBrands = {"Dominos","PizzaHut","LaPinoz","OvenStory","MojoPizza","SmokinJoes","USPizza","ChicagoPizza","Sbarro","PapaJohns","LittleCaesars","CaliforniaPizzaKitchen","BlazePizza","MarcosPizza","GodfathersPizza","Telepizza","PizzaExpress","TossinPizza","MojoPizzeria","OvenFresh","Lapizza","Pizzaiolo","PizzaCorner","PizzaFactory","JoeysPizza","LeanCrustPizza","BrikOven","NomadPizza","GustoesPizza"};
			System.out.println();
			for(String brand : pizzaBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("coffee"))
		{
			String[] coffeeBrands = {"Nescafe","Bru","TataCoffee","Continental","Davidoff","Lavazza","Starbucks","BlueTokai","CCD","RageCoffee","SleepyOwl","Bevzilla","CountryBean","Levista","Sunrise","Narasus","Bayars","Cothas","Malgudi","Jacobs","Illy","Segafredo","Peets","EightOClock","Folgers","MaxwellHouse","KickingHorse","TimHortons","GloriaJeans"};
			System.out.println();
			for(String brand : coffeeBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("tea"))
		{
			String[] teaBrands = {"TataTea","BrookeBond","RedLabel","TajMahal","Tetley","Lipton","Society","WaghBakri","Girnar","OrganicIndia","Vahdam","Teabox","Typhoo","Dilmah","Twinings","HarneyAndSons","Bigelow","Yorkshire","PGTips","AhmadTea","Numi","Pukka","Tazo","CelestialSeasonings","Teavana","Goodricke","McLeodRussel","GoldenTips","Assamica"};
			System.out.println();
			for(String brand : teaBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("dishsoap"))
		{
			String[] dishSoapBrands = {"Vim","Pril","Exo","SurfExcel","Rin","Dettol","Patanjali","Nippon","Ezee","Giffy","Odopic","VimBar","VimLiquid","Axion","Palmolive","Finish","Ariel","MrMuscle","Colin","Cif","Pitambari","BornGood","BioD","IFB","Bosch","Presto","AmazonBasics","BetterLife","HerbalStrategi"};
			System.out.println();
			for(String brand : dishSoapBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("laundrydetergent"))
		{
			String[] laundryDetergentBrands = {"Ariel","SurfExcel","Rin","Tide","Wheel","Nirma","Ghadi","Henko","Ujala","Ezee","ArielMatic","SurfExcelMatic","RinMatic","TidePlus","Patanjali","EcoClean","BioD","BornGood","Vanish","Comfort","Genteel","Xtra","MrWhite","ActiveWheel","PowerWash","MoreChoice","RelianceSmart","AmazonBasics","Presto"};
			System.out.println();
			for(String brand : laundryDetergentBrands)
			{
				System.out.println(brand);
			}
			
		}
		if(item.equals("grains"))
		{
			String[] grains = {"Rice","Wheat","Maize","Barley","Oats","Millets","Jowar","Bajra","Ragi","Sorghum","Corn","Quinoa","Amaranth","Buckwheat","BrownRice","Basmati","RedRice","BlackRice","WildRice","PearlMillet","FoxtailMillet","LittleMillet","KodoMillet","BarnyardMillet","ProsoMillet","Teff","Spelt","Farro","Rye"};
			System.out.println();
			for(String brand : grains)
			{
				System.out.println(brand);
			}

		}
		if(item.equals("spices"))
		{
			String[] spices = {"Turmeric","Chilli","Coriander","Cumin","Mustard","Pepper","Cardamom","Cloves","Cinnamon","Nutmeg","Mace","Fenugreek","Fennel","StarAnise","BayLeaf","Asafoetida","GingerPowder","GarlicPowder","Paprika","Oregano","Basil","Thyme","Rosemary","Saffron","Vanilla","Allspice","Caraway","CelerySeed","Sumac"};
			System.out.println();
			for(String brand : spices)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("soda"))
		{
			String[] sodaBrands = {"Sprite","7Up","MountainDew","Limca","SodaWater","Kinley","Bisleri","Schweppes","Perrier","SanPellegrino","TopoChico","CanadaDry","Seagram","Evervess","Catch","Lehar","Himalayan","Aquafina","Bailley","Vedica","RailNeer","Evian","Voss","Fiji","SparklingIce","LaCroix","Bubly","Aha","PolarSeltzer"};
			System.out.println();
			for(String brand : sodaBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("water"))
		{
			String[] waterBrands = {"Bisleri","Kinley","Aquafina","Bailey","RailNeer","Himalayan","Vedica","TataCopper","Catch","Oxyrich","Evian","Voss","Fiji","Perrier","SanPellegrino","TopoChico","NestlePureLife","Smartwater","Dasani","CrystalGeyser","AquafinaPlus","Bonaqua","Aava","LeMinerale","Spritzer","Clear","Kingfisher","McDowells","H2O"};
			System.out.println();
			for(String brand : waterBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("energydrink"))
		{
			String[] energyDrinkBrands = {"RedBull","Monster","Sting","Gatorade","Powerade","GluconD","Enerzal","FastUp","FastAndUp","XS","Bournvita","Horlicks","Boost","Ensure","Complan","Prime","Rockstar","Predator","Cloud9","Tzinga","OceanEnergy","Hell","Burn","Vive","Tornado","Bullet","BigBang","ZipZap","SpeedUp"};
			System.out.println();
			for(String brand : energyDrinkBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("conditioner"))
		{
			String[] conditionerBrands = {"Dove","Pantene","Tresemme","Sunsilk","ClinicPlus","Loreal","Himalaya","Patanjali","MamaEarth","WOW","Biotique","Khadi","Matrix","Schwarzkopf","Sebamed","HerbalEssences","Revlon","Streax","Indulekha","Plum","Arata","Minimalist","ForestEssentials","Soulflower","JustHerbs","Ayush","Meera","Chik","Nyle"};
			System.out.println();
			for(String brand : conditionerBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("hairserum"))
		{
			String[] hairSerumBrands = {"Livon","Streax","Matrix","Loreal","Biotique","WOW","MamaEarth","Khadi","Plum","Arata","Minimalist","Indulekha","Schwarzkopf","Tresemme","BBlunt","Pilgrim","GoodVibes","MCaffeine","Himalaya","Patanjali","Ayush","ForestEssentials","Soulflower","JustHerbs","BareAnatomy","Ustraa","ManMatters","Reequil","CurlUp"};
			System.out.println();
			for(String brand : hairSerumBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("bodywash"))
		{
			String[] bodyWashBrands = {"Dove","Nivea","Pears","Palmolive","Lux","Fiama","Vivel","Himalaya","Patanjali","MamaEarth","WOW","Biotique","StIves","Plum","MCaffeine","TheBodyShop","Cetaphil","Sebamed","Aveeno","Neutrogena","Dettol","Lifebuoy","Khadi","ForestEssentials","Joy","VLCC","Lotus","Yardley","MarksAndSpencer"};
			System.out.println();
			for(String brand: bodyWashBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("hairspray"))
		{
			String[] hairSprayBrands = {"SetWet","Livon","Loreal","Wella","Schwarzkopf","Matrix","Tresemme","BBlunt","Streax","Enliven","Gatsby","ParkAvenue","Beardo","Ustraa","Arata","Plum","MamaEarth","WOW","Indulekha","Biotique","Khadi","ForestEssentials","Sebastian","TIGI","Lanza","Moroccanoil","Osis","Revlon","Aveda"};
			System.out.println();
			for(String brand: hairSprayBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("hairmask"))
		{
			String[] hairMaskBrands = {"Loreal","Matrix","Schwarzkopf","WOW","MamaEarth","Plum","Arata","Biotique","Khadi","Himalaya","Patanjali","Indulekha","Streax","Tresemme","BBlunt","BareAnatomy","Minimalist","Reequil","CurlUp","ForestEssentials","Soulflower","JustHerbs","MCaffeine","Pilgrim","GoodVibes","Sebamed","Aveda","Moroccanoil","Olaplex"};
			System.out.println();
			for(String brand : hairMaskBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("handwash"))
		{
			String[] handWashBrands = {"Dettol","Lifebuoy","Savlon","Pears","Palmolive","Godrej","Himalaya","Patanjali","MamaEarth","WOW","Biotique","Khadi","Fiama","Vivel","Lux","Cinthol","Nivea","Dove","Johnson","ForestEssentials","VLCC","Medimix","Sebamed","Cetaphil","Joy","Lotus","StBotanica","BornGood","TheBodyShop"};
			System.out.println();
			for(String brand : handWashBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("faceserum"))
		{
			String[] faceSerumBrands = {"Minimalist","TheDermaCo","Plum","MamaEarth","WOW","Lakme","Loreal","Ponds","Garnier","Cetaphil","Sebamed","Reequil","Aqualogica","Pilgrim","GoodVibes","MCaffeine","DotAndKey","ForestEssentials","Kaya","VLCC","Lotus","Biotique","Khadi","StBotanica","SwissBeauty","MamaEarthGlow","DrSheths","Deconstruct","Olay"};			
			System.out.println();
			for(String brand : faceSerumBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("sunscreen"))
		{
			String[] sunscreenBrands = {"Lakme","Neutrogena","Lotus","MamaEarth","WOW","Aqualogica","Reequil","TheDermaCo","Minimalist","Plum","Biotique","Himalaya","Patanjali","VLCC","Cetaphil","Sebamed","Fixderma","DrSheths","DotAndKey","ForestEssentials","Kaya","MCaffeine","Olay","Nivea","LaShield","Photostable","UvDouxx","Suncros","Bello"};
			System.out.println();
			for(String brand : sunscreenBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("lipbalm"))
		{
			String[] lipBalmBrands = {"Maybelline","Nivea","Vaseline","Himalaya","Lakme","BabyLips","Biotique","Plum","MamaEarth","WOW","Laneige","BurtBees","Palmer","ChapStick","Neutrogena","Sebamed","ForestEssentials","MCaffeine","DotAndKey","SwissBeauty","BlueHeaven","Sugar","JustHerbs","Khadi","Patanjali","VLCC","Lotus","TheBodyShop","Nykaa"};
			System.out.println();
			for(String brand : lipBalmBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("lipstick"))
		{
			String[] lipstickBrands = {"Lakme","Maybelline","Loreal","MAC","Sugar","SwissBeauty","BlueHeaven","Colorbar","FacesCanada","Nykaa","KayBeauty","MyGlamm","HudaBeauty","Revlon","Plum","MamaEarth","Elle18","Mars","Insight","MissClaire","WetAndWild","LAColors","Chambor","BobbiBrown","EsteeLauder","Clinique","Dior","YSL","CharlotteTilbury"};
			System.out.println();
			for(String brand : lipstickBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("roomfreshner"))
		{
			String[] roomFreshenerBrands = {"GodrejAer","Odonil","AmbiPur","AirWick","AllOut","GoodKnight","HerbalStrategi","Mangalam","CyclePure","Patanjali","IRIS","CamPure","Kamasutra","Glade","Vasu","PearsAroma","Reckitt","FreshO2","Sapna","Roomside","BornGood","Miniso","Muji","TheBodyShop","ForestEssentials","Zoflora","Renuzit","CintholAroma","BellaCasa"};
			System.out.println();
			for(String brand : roomFreshenerBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("deodrant"))
		{
			String[] deodorantBrands = {"Fogg","Denver","ParkAvenue","WildStone","Engage","Axe","SetWet","Nivea","Adidas","Reebok","Skinn","BellaVita","Plum","Yardley","LayerR","TheManCompany","Beardo","Ustraa","Villain","KS","Nike","Puma","Jaguar","Guess","CalvinKlein","Dior","Versace","Armaf","Ajmal"};
			System.out.println();
			for(String brand : deodorantBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("talcumpowder"))
		{
			String[] talcumPowderBrands = {"Ponds","Yardley","Nycil","Cinthol","Gokul","Spinz","ParkAvenue","Engage","WildStone","Fogg","Denver","Nivea","Dove","Johnson","Himalaya","Patanjali","Medimix","Fiama","Vivel","Lux","Eva","Axe","SetWet","KS","BellaVita","Plum","ForestEssentials","Khadi","Biotique"};
			System.out.println();
			for(String brand : talcumPowderBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("shoes"))
		{
			String[] shoesBrands = {"Nike","Adidas","Puma","Reebok","Skechers","Bata","Woodland","Sparx","Campus","RedTape","Fila","NewBalance","Asics","UnderArmour","Converse","Vans","Crocs","LeeCooper","Action","Liberty","Relaxo","Power","Lancer","Columbus","HushPuppies","Clarks","Mochi","Metro","Decathlon"};
			System.out.println();
			for(String brand : shoesBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("Belt"))
		{
			String[] beltBrands = {"AllenSolly","VanHeusen","PeterEngland","LouisPhilippe","ParkAvenue","TommyHilfiger","CalvinKlein","Levis","Wrangler","Lee","Woodland","Fastrack","Puma","Adidas","Nike","Reebok","Wildcraft","Baggit","Lavie","Hidesign","Fossil","Guess","UCB","FlyingMachine","Mufti","Spykar","Roadster","Zara","HnM"};
			System.out.println();
			for(String brand :beltBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("watch"))
		{
			String[] watchBrands = {"Titan","Fastrack","Sonata","Casio","Timex","Fossil","Guess","Diesel","Armani","MichaelKors","Seiko","Citizen","Tissot","Omega","Rolex","Rado","TagHeuer","Hublot","Swatch","DanielWellington","Skagen","Police","TommyHilfiger","CalvinKlein","Edifice","GShock","Fitbit","Garmin","Noise"};
			System.out.println();
			for(String brand : watchBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("kannadabooks"))
		{
			String[] kannadaBooksPublishers = {"SapnaBookHouse","Navakarnataka","AksharaPrakashana","Abhinava","PustakaPrakashana","ManoharaGranthamala","GeethaBookHouse","Samvada","Chandamama","KarnatakaSahityaAkademi","BharatiyaVidyaBhavan","Prasaranga","PrabuddhaKarnataka","SudhaPublications","SahityaBhandara","VishwaKannada","KannadaSahityaParishat","Mayura","Nudi","LankeshPrakashana","Pampa","BasavaPrakashana","Janapada","Bheemasha","Arivu","SamajaPustakalaya","Navodaya","Chintana","Samskruthi"};
			System.out.println();
			for(String brand :kannadaBooksPublishers)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("chairs"))
		{
			String[] chairBrands = {"Nilkamal","Godrej","Ikea","Durian","Featherlite","Cello","Supreme","Wipro","Zuari","Damro","UrbanLadder","Pepperfry","HomeTown","NilkamalFreedom","Boss","GreenSoul","Transteel","Adiko","Aarsun","Evok","RoyalOak","Wakefit","Furnicom","HNI","Steelcase","HermanMiller","GodrejInterio","Asian","NilkamalPremium"};
			System.out.println();
			for(String brand:chairBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("cooker"))
		{
			String[] cookerBrands = {"Prestige","Hawkins","Pigeon","Butterfly","Vinod","Wonderchef","Bajaj","Usha","MorphyRichards","Futura","Tefal","Panasonic","Philips","Kent","Lifelong","Inalsa","Crompton","Bosch","Siemens","KitchenAid","AmazonBasics","Croma","Milton","Cello","WonderchefNutri","Sumeet","Bergner","IBell","Agaro"};
			System.out.println();
			for(String brand : cookerBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("pan"))
		{
			String[] panBrands = {"Prestige","Hawkins","Pigeon","Butterfly","Vinod","Wonderchef","Tefal","Bergner","Milton","Cello","AmazonBasics","Croma","MorphyRichards","Futura","Nirlon","Sumeet","Chefline","Stahl","GreenChef","WonderchefRoyal","KitchenAid","Scanpan","Lodge","Tramontina","Anolon","Circulon","Cuisinart","AllClad","Zwilling"};
			System.out.println();
			for(String brand:panBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("toaster"))
		{
			String[] toasterBrands = {"Philips","Bajaj","Prestige","MorphyRichards","Usha","Havells","Kent","Bosch","Siemens","Panasonic","BlackAndDecker","HamiltonBeach","RussellHobbs","KitchenAid","Cuisinart","Wonderchef","Inalsa","Orpat","Nova","Lifelong","Agaro","AmazonBasics","Croma","Butterfly","Pigeon","Kenstar","Cello","Milton","iBell"};
			System.out.println();
			for(String brand:toasterBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("wheatflour"))
		{
			String[] wheatFlourBrands = {"Aashirvaad","Pillsbury","Fortune","Annapurna","NatureFresh","24Mantra","OrganicIndia","Patanjali","Sharbati","ShaktiBhog","LaxmiBhog","Bhagwati","Rajdhani","Sundrop","NatureLand","Vedaka","AshirwadSelect","Sampoorna","SafeHarvest","JustOrganik","Namdhari","GoodLife","TataSampann","FieldFresh","TrueElements","ConsciousFood","HealthyAlternatives","Graminway","Farm2Table"};
			System.out.println();
			for(String brand:wheatFlourBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("salt"))
		{
			String[] saltBrands = {"TataSalt","Aashirvaad","Annapurna","CaptainCook","Saffola","Patanjali","NatureFresh","Keya","Catch","iShakti","OrganicIndia","24Mantra","Vedaka","GoodLife","Sundrop","Sakthi","Crystal","HimalayanPink","TataLite","AashirvaadLite","Puro","Sprig","UrbanPlatter","Sorich","Nutrova","Farm2Table","Namdhari","ConsciousFood","NatureLand"};
			System.out.println();
			for(String brand : saltBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("chillipowder"))
		{
			String[] chilliPowderBrands = {"Everest","MDH","Badshah","Catch","Aachi","Sakthi","Eastern","MTR","Keya","24Mantra","OrganicIndia","Patanjali","Vedaka","TataSampann","Snapin","Cookme","Priya","MothersRecipe","Pushp","Goldiee","Ramdev","Vahchef","UrbanPlatter","NatureLand","Suhana","iShakti","Sunrise","Ruchi","Annapurna"};
			System.out.println();
			for(String brand : chilliPowderBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("turmeric"))
		{
			String[] turmericBrands = {"TataSampann","Everest","MDH","Catch","Aachi","Sakthi","Eastern","MTR","Keya","24Mantra","OrganicIndia","Patanjali","Vedaka","Annapurna","Ramdev","Goldiee","Pushp","Vahchef","UrbanPlatter","NatureLand","ConsciousFood","Suhana","Snapin","Sunrise","iShakti","Cookme","Priya","MothersRecipe","Saffola"};
			System.out.println();
			for(String brand : turmericBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("noodels"))
		{
			String[] noodlesBrands = {"Maggi","Yippee","TopRamen","Knorr","ChingSecret","WaiWai","Samyang","Nissin","CupNoodles","Ramee","Indomie","Paldo","SaffolaOodles","MTR","Chings","Koka","Nongshim","Ottogi","ItcAashirvaad","Veeba","Bambino","TopRamenCurry","Kraft","BlueDragon","Soba","Hakubaku","AnnieChun","Mamee","LuckyMe"};
			System.out.println();
			for(String brand : noodlesBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("honey"))
		{
			String[] honeyBrands = {"Dabur","Patanjali","Baidyanath","Zandu","24Mantra","OrganicIndia","NatureNectar","Apis","Saffola","Vedaka","Indigenous","Hitkari","KeoKarpin","SriSri","FarmNaturelle","Vanalaya","UnderTheMangoTree","UrbanPlatter","NatureLand","ConsciousFood","HimalayanNatives","Sorich","PureAndSure","JustOrganik","ProNature","TrueElements","Nutrova","Himsrot","Kapiva"};
			System.out.println();
			for(String brand : honeyBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("pens"))
		{
			String[] penBrands = {"Reynolds","Cello","Parker","Pilot","Pentonic","Flair","Hauser","Linc","Classmate","Nataraj","AddGel","Montex","PierreCardin","Waterman","Sheaffer","Cross","Uniball","Zebra","Camlin","Luxor","Rotomac","Bic","FaberCastell","Schneider","Kaco","Baoer","Hero","Scrikss","Stabilo"};
			System.out.println();
			for(String brand : penBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("pencil"))
		{
			String[] pencilBrands = {"Apsara","Nataraj","Camlin","Classmate","FaberCastell","DOMS","Staedtler","Derwent","KohINoor","Lyra","Pentel","Uni","Mitsubishi","Dixon","General","Musgrave","PaperMate","Stabilo","Brustro","Maped","Luxor","Hindustan","NatrajEco","Cello","Reynolds","Scholar","AddGel","Flair","Hauser"};
			System.out.println();
			for(String brand : pencilBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("earser"))
		{
			String[] eraserBrands = {"Apsara","Nataraj","Camlin","DOMS","FaberCastell","Staedtler","Maped","Pentel","Uni","Mitsubishi","Classmate","Luxor","Cello","Reynolds","Flair","Hauser","KohINoor","Lyra","Stabilo","PaperMate","Scholar","AddGel","Brustro","Dixon","General","Musgrave","Derwent","NatrajEco","Hindustan"};
			System.out.println();
			for(String brand : eraserBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("sharpner"))
		{
			String[] sharpenerBrands = {"Apsara","Nataraj","Camlin","DOMS","FaberCastell","Staedtler","Maped","Pentel","Uni","Mitsubishi","Classmate","Luxor","Cello","Reynolds","Flair","Hauser","KohINoor","Lyra","Stabilo","PaperMate","Scholar","AddGel","Brustro","Dixon","General","Musgrave","Derwent","NatrajEco","Hindustan"};
			System.out.println();
			for(String brand : sharpenerBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("whitener"))
		{
			String[] whitenerBrands = {"Camlin","FaberCastell","Pentel","Classmate","Luxor","Cello","Reynolds","Flair","Hauser","AddGel","DOMS","Nataraj","Apsara","PaperMate","Staedtler","Maped","Uni","Mitsubishi","Stabilo","Brustro","Scholar","Kores","Kangaro","Pilot","Bic","Montex","PierreCardin","Schneider","Linc"};
			System.out.println();
			for(String brand : whitenerBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("folder"))
		{
			String[] folderBrands = {"Classmate","Solo","Dataking","ExpandingFile","Luxor","Camlin","Kangaro","Cello","Flair","AddGel","DOMS","Nataraj","Apsara","Scholar","Paperkraft","Neelgagan","Navneet","Oxford","WorldOne","ITC","Target","SoloOffice","Papergrid","AmazonBasics","Croma","Kores","FaberCastell","Maped","Staedtler"};
			System.out.println();
			for(String brand : folderBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("calculator"))
		{
			String[] calculatorBrands = {"Casio","Citizen","Orpat","Sharp","Canon","TexasInstruments","HP","Sony","Panasonic","Aurora","Karce","Flair","Nataraj","Rebell","Maxell","Caltron","Kenko","DJ","Helect","AmazonBasics","Croma","Kadio","Epson","Olympia","Victor","Unitech","Systel","M&G","Plus"};
			System.out.println();
			for(String brand : calculatorBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("powerbank"))
		{
			String[] powerBankBrands = {"Mi","Realme","OnePlus","Samsung","Ambrane","Syska","Portronics","Boat","Anker","Belkin","Philips","Stuffcool","pTron","URBN","Zebronics","Lapcare","Redmi","iBall","Crossbeats","Hammer","Duracell","Panasonic","Sony","AmazonBasics","Croma","Oraimo","Spigen","Baseus","RavPower"};
			System.out.println();
			for(String brand : powerBankBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("batteries"))
		{
			String[] batteryBrands = {"Duracell","Energizer","Eveready","Panasonic","Sony","Philips","AmazonBasics","GP","Varta","Rayovac","Kodak","Maxell","Camelion","Nippo","Toshiba","Mitsubishi","Murata","Exide","Okaya","Luminous","Amaron","Livguard","Su-Kam","Microtek","Hitachi","Yuasa","Saft","Tadiran","EVE"};
			System.out.println();
			for(String brand : batteryBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("mouse"))
		{
			String[] mouseBrands = {"Logitech","Dell","HP","Lenovo","Microsoft","Razer","Corsair","Redragon","Zebronics","Portronics","iBall","Intex","Lapcare","Amkette","Boat","Rapoo","Acer","Asus","CoolerMaster","HyperX","SteelSeries","Glorious","BenQ","Evoluent","Trust","AmazonBasics","Croma","Artis","AntEsports"};
			System.out.println();
			for(String brand : mouseBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("charger"))
		{
			String[] chargerBrands = {"Samsung","Apple","OnePlus","Xiaomi","Realme","Oppo","Vivo","Motorola","Nokia","Sony","Belkin","Anker","Ambrane","Portronics","Boat","Syska","Mi","Redmi","Philips","Stuffcool","pTron","URBN","Zebronics","Lapcare","Spigen","Baseus","RavPower","AmazonBasics","Croma"};
			System.out.println();
			for(String brand : chargerBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("glue"))
		{
			String[] glueBrands = {"Fevicol","Fevistik","Pidilite","Camlin","FaberCastell","DOMS","Apsara","Nataraj","Classmate","UHU","Elmers","Bostik","Scotch","3M","Kores","PidiliteMR","Henkel","Loctite","Araldite","Anabond","FixAll","StickFast","QuickFix","BondTite","Everbuild","Gorilla","Pritt","Camel","Luxor"};
			System.out.println();
			for(String brand : glueBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("heater"))
		{
			String[] heaterBrands = {"Bajaj","Havells","Orient","Usha","Crompton","MorphyRichards","Kenstar","VGuard","Lifelong","Orpat","Philips","Panasonic","BlackAndDecker","RussellHobbs","BlueStar","Voltas","IFB","Bosch","Siemens","AmazonBasics","Croma","Eveready","Warmex","Singer","Khaitan","iBell","Agaro","Nova","Inalsa"};
			System.out.println();
			for(String brand : heaterBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("induction"))
		{
			String[] inductionBrands = {"Prestige","Philips","Bajaj","Pigeon","Butterfly","Usha","Havells","MorphyRichards","Kent","Inalsa","Crompton","Wonderchef","Lifelong","Agaro","iBell","Nova","Orpat","Milton","Cello","AmazonBasics","Croma","Bosch","Siemens","Panasonic","Sharp","Tefal","Kenstar","Vidiem","Borosil"};
			System.out.println();
			for(String brand : inductionBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("gasstove"))
		{
			String[] gasStoveBrands = {"Prestige","Butterfly","Pigeon","Sunflame","Glen","Elica","Hindware","Faber","Crompton","Bajaj","Lifelong","Wonderchef","Milton","Cello","Sujata","Bosch","Siemens","Panasonic","Philips","Kenstar","Usha","Agaro","iBell","Nova","AmazonBasics","Croma","Borosil","Vidiem","MorphyRichards"};
			System.out.println();
			for(String brand : gasStoveBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("cars"))
		{
			String[] carBrands = {"Maruti","Hyundai","Tata","Mahindra","Honda","Toyota","Kia","Skoda","Volkswagen","Renault","Nissan","MG","Jeep","BMW","Audi","Mercedes","Volvo","Jaguar","LandRover","Porsche","Ferrari","Lamborghini","RollsRoyce","Bentley","Mini","Citroen","Peugeot","Fiat","Force"};
			System.out.println();
			for(String brand : carBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("bike"))
		{
			String[] bikeBrands = {"Hero","Honda","Bajaj","TVS","Yamaha","Suzuki","RoyalEnfield","KTM","Jawa","Yezdi","Kawasaki","BMW","HarleyDavidson","Ducati","Aprilia","Triumph","Benelli","MVAgusta","Husqvarna","CFMoto","Norton","MotoGuzzi","Indian","Vespa","Piaggio","LML","Brixton","Ultraviolette","Revolt"};
			
			System.out.println();
			for(String brand : bikeBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("tractor"))
		{
			String[] tractorBrands = {"Mahindra","JohnDeere","Sonalika","TAFE","Eicher","MasseyFerguson","NewHolland","Kubota","Escorts","Farmtrac","Powertrac","Swaraj","VST","ACE","IndoFarm","Force","Captain","Preet","SameDeutz","CaseIH","Valtra","Claas","Fendt","Basak","HMT","Ford","AgroMax","Landini","McCormick"};
			System.out.println();
			for(String brand : tractorBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("cycle"))
		{
			String[] cycleBrands = {"Hero","Hercules","Atlas","Avon","BSA","Firefox","Montra","MachCity","UrbanTerrain","Leader","LaScoot","Btwin","Giant","Trek","Scott","Cannondale","Merida","Specialized","Polygon","Fuji","Marin","SantaCruz","Norco","Raleigh","Schwinn","Decathlon","Cradiac","XDS","Kross"};
			System.out.println();
			for(String brand : cycleBrands)
			{
				System.out.println(brand);
			}				
		}
		if(item.equals("treadmill"))
		{
			String[] treadmillBrands = {"PowerMax","Cockatoo","Fitkit","Durafit","Afton","Fitline","Reebok","NordicTrack","ProForm","Sole","LifeFitness","Matrix","Precor","BH","Bowflex","Horizon","Kettler","Healthgenie","Flexnest","MaxPro","CultFit","Decathlon","ProBodyline","Cosco","Sparnod","Aerofit","Impulse","BodySolid","Technogym"};
			System.out.println();
			for(String brand : treadmillBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("airPurifier"))
		{
			String[] airPurifierBrands = {"Philips","Dyson","Mi","Honeywell","BlueStar","Sharp","Coway","LG","Samsung","Panasonic","Kent","EurekaForbes","Daikin","Voltas","Hitachi","Carrier","TruSens","Amway","Croma","Havells","Toshiba","Boneco","Electrolux","IQAir","Xiaomi","Realme","Hisense","Whirlpool","Bissell"};
			System.out.println();
			for(String brand: airPurifierBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("ceilingLight"))
		{
			String[] ceilingLightBrands = {"Philips","Syska","Wipro","Havells","Bajaj","Orient","Crompton","Surya","Panasonic","Anchor","Goldmedal","GM","Eveready","Halogen","Osram","GE","Legrand","Schneider","Usha","MoserBaer","Murphy","Halonix","Luminous","Fybros","CromptonGreaves","VGuard","Jaquar","Croma","Ikea"};
			System.out.println();
			for(String brand : ceilingLightBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("tableLamp"))
		{
			String[] tableLampBrands = {"Philips","Wipro","Syska","Havells","Bajaj","Orient","Ikea","Homesake","ArtStreet","FlipkartSmartBuy","AmazonBasics","Panasonic","Crompton","Surya","FosLighting","LeArc","Eliante","Hometown","UrbanLadder","Durian","Jaquar","Legrand","GM","Goldmedal","Fybros","Halonix","Eveready","Croma","Pepperfry"};
			System.out.println();
			for(String brand : tableLampBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("nightLamp"))
		{
			String[] nightLampBrands = {"Philips","Wipro","Syska","Mi","Realme","AmazonBasics","FlipkartSmartBuy","Panasonic","Havells","Bajaj","Orient","Crompton","Eveready","Halonix","Fybros","LeArc","Ikea","Homesake","ArtStreet","Croma","GM","Goldmedal","Duracell","Osram","GE","Jaquar","Surya","Murphy","Legrand"};
			System.out.println();
			for(String brand: nightLampBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("smartWatch"))
		{
			String[] smartWatchBrands = {"Apple","Samsung","Noise","Boat","FireBoltt","Fastrack","Titan","Amazfit","Fitbit","Garmin","Huawei","Honor","Realme","Xiaomi","Redmi","OnePlus","Oppo","Vivo","Crossbeats","Pebble","Timex","Casio","Fossil","MichaelKors","Skagen","TagHeuer","Suunto","Polar","Nothing"};
			System.out.println();
			for(String brand : smartWatchBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("fitnessBand"))
		{
			String[] fitnessBandBrands = {"Mi","Realme","Honor","Huawei","Samsung","Fitbit","Garmin","Amazfit","Noise","Boat","OnePlus","Oppo","Vivo","Redmi","Fastrack","Titan","GOQii","Lenovo","Sony","Polar","Suunto","Decathlon","Withings","Casio","Timex","Fitkit","Healthgenie","Crossbeats","FireBoltt"};
			System.out.println();
			for(String brand:fitnessBandBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("bluetoothTracker"))
		{
			String[] bluetoothTrackerBrands = {"Apple","Samsung","Tile","Mi","Realme","OnePlus","Huawei","Honor","Pebblebee","Chipolo","TrackR","Cube","Orbit","Nutale","Eufy","Baseus","Spigen","Belkin","Anker","Portronics","Ambrane","Syska","Boat","Noise","Crossbeats","Zebronics","Stuffcool","Ugreen","Croma"};
			System.out.println();
			for(String brand : bluetoothTrackerBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("router"))
		{
			String[] routerBrands = {"TPLink","DLink","Netgear","Asus","Linksys","Tenda","Xiaomi","Redmi","Cisco","Ubiquiti","Mikrotik","Huawei","Honor","Belkin","Google","Amazon","Netis","Edimax","Zyxel","Arris","Motorola","Buffalo","DrayTek","Synology","H3C","HPE","Cudy","Mercusys","Grandstream"};
			System.out.println();
			for(String brand : routerBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("modem"))
		{
			String[] modemBrands = {"TPLink","DLink","Netgear","Cisco","Motorola","Arris","Huawei","Zyxel","Linksys","Asus","Ubiquiti","Mikrotik","Netis","Tenda","Belkin","Edimax","DrayTek","Buffalo","HPE","ZTE","Nokia","Alcatel","Technicolor","Thomson","Actiontec","Sagemcom","Pace","Comtrend","Hitron"};
			System.out.println();
			for(String brand : modemBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("securityCamera"))
		{
			String[] securityCameraBrands = {"Hikvision","CPPlus","Mi","Imou","Ezviz","Godrej","TPLink","Dahua","Panasonic","Bosch","Honeywell","Samsung","LG","Sony","Axis","Hanwha","Uniview","Zicom","Qubo","Tapo","Realme","Vivotek","Arlo","Eufy","Ring","Blink","Swann","Lorex","Reolink"};
			System.out.println();
			for(String brand : securityCameraBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("videoDoorbell"))
		{
			String[] videoDoorbellBrands = {"Ring","GoogleNest","Arlo","Eufy","Ezviz","Hikvision","CPPlus","Qubo","Mi","Realme","Blink","Wyze","Lorex","Reolink","Amcrest","Swann","Panasonic","Bosch","Honeywell","SkyBell","August","Zmodo","Netatmo","Yale","Ubiquiti","Aqara","Tapo","Imou","Vivotek"};
			System.out.println();
			for(String brand : videoDoorbellBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("smartLock"))
		{
			String[] smartLockBrands = {"Yale","Godrej","August","Schlage","Kwikset","Ultraloq","Samsung","Mi","Qubo","Philips","Bosch","Honeywell","AssaAbloy","Dormakaba","Hikvision","CPPlus","Havells","GodrejLocks","Oakter","LAVNA","Igloohome","Eufy","Aqara","Utec","TTLock","Wyze","Sifely","Kaadas","Xiaomi"};
			System.out.println();
			for (String brand : smartLockBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("smartPlug"))
		{
			String[] smartSwitchBrands = {"Wipro","Havells","Anchor","GM","Goldmedal","Legrand","Schneider","Philips","Mi","Qubo","Oakter","Orient","Crompton","Panasonic","Syska","Fybros","Zemismart","Tuya","Aqara","Sonoff","Lutron","Honeywell","Bosch","ABB","Siemens","Hager","VGuard","Croma","TataPowerEZ"};
			System.out.println();
			for(String brand  : smartSwitchBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("powerStrip"))
		{
			String[] powerStripBrands = {"Belkin","Portronics","Ambrane","Syska","Anchor","GM","Goldmedal","Havells","Philips","Panasonic","Honeywell","APC","TrippLite","Zebronics","Lapcare","AmazonBasics","Stuffcool","URBN","Mi","Realme","Tessco","Croma","Legrand","Schneider","Eveready","Orient","Bajaj","PowerCube","Anker"};
			System.out.println();
			for(String brand : powerStripBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("surgeProtector"))
		{
			String[] surgeProtectorBrands = {"APC","Belkin","TrippLite","Honeywell","Philips","Panasonic","APCBySchneider","Legrand","Schneider","GM","Goldmedal","Anchor","Havells","Orient","Bajaj","Syska","Eveready","Crompton","Lapcare","Zebronics","AmazonBasics","Portronics","Ambrane","URBN","Tessco","VGuard","Luminous","Microtek","Anker"};
			System.out.println();
			for(String brand : surgeProtectorBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("voltageStabilizer"))
		{
			String[] voltageStabilizerBrands = {"VGuard","Microtek","VStar","Aulten","BlueBird","Everest","Mainline","Servokon","Voltas","LG","Samsung","Whirlpool","Daikin","Hitachi","Panasonic","Godrej","Croma","Orient","Bajaj","Havells","Luminous","Su-Kam","Genus","PowerSafe","Macro","Mevish","Vertex","IndoAsian","Logic"};
			System.out.println();
			for(String brand : voltageStabilizerBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("inverter"))
		{
			String[] inverterBrands = {"Luminous","Microtek","VGuard","Exide","Amaron","Su-Kam","Livguard","Genus","Okaya","SF Sonic","APC","Delta","Schneider","Emerson","Huawei","Growatt","SMA","ABB","Victron","Eastman","Base","ZunSolar","Statcon","Waaree","TataPower","Lento","Usha","Kirloskar","Voltron"};
			System.out.println();
			for(String brand : inverterBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("batteryBackup"))
		{
			String[] batteryBackupBrands = {"APC","Luminous","Microtek","Exide","Amaron","VGuard","SuKam","Genus","Okaya","SFsonic","Livguard","Delta","Schneider","Emerson","Eaton","Vertiv","CyberPower","Numeric","Riello","Eastman","Base","Zebronics","Lapcare","Honeywell","Anker","Belkin","Syska","Portronics","Ambrane"};
			System.out.println();
			for(String brand : batteryBackupBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("solarPanel"))
		{
			String[] solarPanelBrands = {"Waaree","TataPowerSolar","AdaniSolar","VikramSolar","LoomSolar","RenewSys","GoldiSolar","Jakson","Microtek","Exide","Luminous","SuKam","Havells","Panasonic","LG","TrinaSolar","JA Solar","CanadianSolar","FirstSolar","JinkoSolar","LONGi","REC","SunPower","ABB","SMA","Growatt","Huawei","Bosch","Siemens"};
			System.out.println();
			for(String brand : solarPanelBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("solarLamp"))
		{
			String[] solarLampBrands = {"Havells","Philips","Wipro","Syska","Bajaj","Orient","Crompton","Panasonic","Surya","Halonix","Eveready","Luminous","Microtek","Waaree","LoomSolar","TataPowerSolar","Goldmedal","GM","Anchor","Fybros","Legrand","Schneider","Usha","VGuard","CromptonGreaves","Murphy","Osram","GE","Ikea"};
			System.out.println();
			for(String brand : solarLampBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("torch"))
		{
			String[] torchBrands = {"Eveready","Duracell","Philips","Syska","Panasonic","Energizer","Maglite","Anker","Wipro","Havells","Bajaj","Orient","Crompton","Mi","Realme","Nitecore","Fenix","Ledlenser","Olight","PrincetonTec","Surefire","Streamlight","Coleman","BlackDecker","Bosch","Stanley","DeWalt","AmazonBasics","Croma"};
			System.out.println();
			for(String brand : torchBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("emergencyLight"))
		{
			String[] emergencyLightBrands = {"Philips","Wipro","Syska","Eveready","Havells","Bajaj","Orient","Crompton","Panasonic","Surya","Halonix","Murphy","Usha","VGuard","Microtek","Luminous","Goldmedal","GM","Anchor","Legrand","Schneider","Fybros","Osram","GE","CromptonGreaves","AmazonBasics","Croma","iBell","Nova"};
			System.out.println();
			for(String brand : emergencyLightBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("floodLight"))
		{
			String[] floodLightBrands = {"Philips","Wipro","Havells","Bajaj","Orient","Crompton","Panasonic","Syska","Surya","Halonix","Osram","GE","Legrand","Schneider","Goldmedal","GM","Anchor","Fybros","Murphy","Eveready","Usha","Jaquar","Hindware","CromptonGreaves","VGuard","Ikea","AmazonBasics","Croma","Bosch"};
			System.out.println();
			for(String brand : floodLightBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("streetLight"))
		{
			String[] streetLightBrands = {"Philips","Wipro","Havells","Bajaj","Orient","Crompton","Panasonic","Surya","Halonix","Osram","GE","Legrand","Schneider","Goldmedal","GM","Anchor","Fybros","Murphy","Eveready","Usha","Jaquar","Hindware","CromptonGreaves","VGuard","Ikea","AmazonBasics","Croma","Bosch","Siemens"};
			System.out.println();
			for(String brand : streetLightBrands)
			{
				System.out.println(brand);
			}
		}	
		if(item.equals("laserPrinter"))
		{
			String[] laserPrinterBrands = {"HP","Canon","Brother","Epson","Samsung","Xerox","Ricoh","Kyocera","Lexmark","Panasonic","Sharp","Toshiba","KonicaMinolta","Oki","Dell","IBM","Fujitsu","Zebra","Pantum","Kodak","Lenovo","LG","Philips","Bosch","Siemens","EpsonWorkForce","HPEnterprise","CanonImage","BrotherHL"};
			System.out.println();
			for(String brand : laserPrinterBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("inkTankPrinter"))
		{
			String[] inkTankPrinterBrands = {"Epson","HP","Canon","Brother","Ricoh","Samsung","Xerox","Panasonic","Sharp","Toshiba","KonicaMinolta","Kyocera","Lexmark","Dell","Kodak","Pantum","Fujitsu","IBM","Lenovo","LG","Philips","Bosch","Siemens","Zebra","Oki","EpsonEcoTank","HPInkTank","CanonPixma","BrotherInk"};
			System.out.println();
			for(String brand : inkTankPrinterBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("scanner"))
		{
			String[] scannerBrands = {"HP","Canon","Epson","Brother","Fujitsu","Ricoh","Xerox","Panasonic","Kodak","Plustek","Mustek","Microtek","Avision","IRIS","Contex","CZUR","Doxie","Visioneer","Ambir","Honeywell","Zebra","IBM","Dell","Lenovo","LG","Philips","Bosch","Siemens","Sharp"};
			System.out.println();
			for(String brand : scannerBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("laminator"))
		{
			String[] laminatorBrands = {"GBC","Fellowes","Ibico","Aurora","Scotch","3M","OfficeMax","Swingline","Royal","AmazonBasics","Croma","Kores","Texet","Pavo","Dahle","QConnect","Rexel","Leitz","Acco","Cosmo","Orpat","TVS","Bindal","Sahara","Nova","iBell","Tamerica","MartinYale","Xyron"};
			System.out.println();
			for(String brand : laminatorBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("paperShredder"))
		{
			String[] paperShredderBrands = {"Fellowes","GBC","Rexel","Aurora","Swingline","Royal","Bonsaii","AmazonBasics","Croma","Kores","Dahle","Leitz","Acco","HSM","Intimus","EBA","Ideal","Formax","MartinYale","Sentinel","Protector","OfficeMax","TVS","Bindal","Sahara","Nova","iBell","Texet","Orpat"};
			System.out.println();
			for(String brand : paperShredderBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("barcodeScanner"))
		{
			String[] barcodeScannerBrands = {"Honeywell","Zebra","Datalogic","Motorola","Symbol","Newland","CipherLab","Sato","Opticon","TSC","TVS","Epson","HP","Posiflex","Sunlux","SocketMobile","Unitech","Godex","Birch","Argox","Wasp","Bluebird","Chainway","Casio","Panasonic","Fujitsu","Dell","IBM","Lenovo"};
			System.out.println();
			for(String brand : barcodeScannerBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("posMachine"))
		{
			String[] posMachineBrands = {"Verifone","Ingenico","PAX","Sunmi","Ezetap","PineLabs","Mswipe","Paytm","Worldline","Atom","PhonePe","Razorpay","Square","Clover","Toast","Lightspeed","Revel","Posiflex","Epson","HP","Dell","IBM","Lenovo","Toshiba","Wincor","Diebold","NCR","Fujitsu","Sharp"};
			System.out.println();
			for(String brand : posMachineBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("cashDrawer"))
		{
			String[] cashDrawerBrands = {"Epson","APG","Posiflex","HP","IBM","StarMicronics","Toshiba","Sharp","Wincor","Diebold","NCR","Fujitsu","Casio","TVS","PartnerTech","Bematech","SNBC","Custom","Gaveta","LogicControls","MMF","Volcora","Royal","SDS","CITAQ","iMin","Sunmi","Bixolon","Seiko"};
			System.out.println();
			for(String brand : cashDrawerBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("weighingScale"))
		{
			String[] weighingScaleBrands = {"Essae","Avery","Contech","Phoenix","Cas","Ishida","MettlerToledo","Adam","Shimadzu","Sartorius","Kern","Citizen","Tanita","Omron","DrTrust","HealthSense","Beurer","Equinox","Hoffmann","Goldtech","Sansui","Prestige","Nova","iBell","Havells","Philips","Bosch","Siemens","Panasonic"};
			System.out.println();
			for(String brand : weighingScaleBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("labelPrinter"))
		{
			String[] labelPrinterBrands = {"Zebra","Brother","Dymo","TSC","Godex","Sato","Epson","HP","Canon","Bixolon","Honeywell","TVS","Argox","Citizen","Seiko","StarMicronics","Toshiba","Postek","Datamax","Intermec","Printronix","Fujitsu","IBM","Dell","Lenovo","Sharp","Panasonic","Xprinter","Rollo"};
			System.out.println();
			for(String brand : labelPrinterBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("projectorScreen"))
		{
			String[] projectorScreenBrands = {"EliteScreens","Grandview","Liberty","DaLite","Stewart","Vividstorm","Celexon","Duronic","Lumene","Screenline","Optoma","BenQ","Epson","ViewSonic","LG","Samsung","Sony","Panasonic","Sharp","Acer","InFocus","Vivitek","NEC","JVC","Hitachi","Canon","HP","Dell","AmazonBasics"};
			System.out.println();
			for(String brand : projectorScreenBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("whiteBoard"))
		{
			String[] whiteBoardBrands = {"Camlin","Luxor","FaberCastell","Apsara","Classmate","Maped","Staedtler","Pilot","Kores","Pidilite","Maggi","3M","Quartet","Uline","OfficeMax","Staples","AmazonBasics","Ikea","Godrej","Nilkamal","Cello","Milton","Tupperware","Prestige","Nova","iBell","Borosil","Hindware","Durable"};
			System.out.println();
			for(String brand : whiteBoardBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("noticeBoard"))
		{
			String[] noticeBoardBrands = {"Camlin","Luxor","FaberCastell","Apsara","Classmate","Maped","Staedtler","Pilot","Kores","Pidilite","3M","Quartet","Uline","OfficeMax","Staples","AmazonBasics","Ikea","Godrej","Nilkamal","Cello","Milton","Prestige","Nova","iBell","Borosil","Hindware","Durable","Navneet","Archies"};
			System.out.println();
			for(String brand : noticeBoardBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("fileCabinet"))
		{
			String[] fileCabinetBrands = {"Godrej","Nilkamal","Featherlite","Durian","Steelcase","HermanMiller","Ikea","GodrejInterio","Spacewood","Zuari","Damro","Evok","HomeTown","UrbanLadder","Pepperfry","NilkamalOffice","WiproFurniture","GodrejStorage","Bush","Sauder","Lorell","HON","Safco","Alera","GlobalIndustrial","Uline","Officemate","V3Furniture","RoyalOak"};
			System.out.println();
			for(String brand : fileCabinetBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("documentTray"))
		{
			String[] documentTrayBrands = {"Camlin","Luxor","Kores","Classmate","FaberCastell","Apsara","Maped","Staedtler","Pidilite","3M","AmazonBasics","Ikea","Godrej","Nilkamal","Cello","Milton","Tupperware","Prestige","Nova","iBell","Borosil","Hindware","Durable","Leitz","Rexel","Fellowes","Uline","Staples","OfficeMax"};
			System.out.println();
			for(String brand : documentTrayBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("penStand"))
		{
			String[] penStandBrands = {"Camlin","Luxor","Classmate","FaberCastell","Apsara","Maped","Staedtler","Pidilite","AmazonBasics","Ikea","Godrej","Nilkamal","Cello","Milton","Tupperware","Prestige","Nova","iBell","Borosil","Hindware","Durable","Leitz","Rexel","Fellowes","Uline","Staples","OfficeMax","Navneet","Archies"};
			System.out.println();
			for(String brand : penStandBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("deskOrganizer"))
		{
			String[] deskOrganizerBrands = {"AmazonBasics","Ikea","Godrej","Nilkamal","Cello","Milton","Tupperware","Prestige","Nova","iBell","Borosil","Hindware","Durable","Leitz","Rexel","Fellowes","Uline","Staples","OfficeMax","Camlin","Luxor","Classmate","FaberCastell","Apsara","Maped","Pidilite","3M","Navneet","Archies"};
			System.out.println();
			for(String brand : deskOrganizerBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("keyboardCover"))
		{
			String[] keyboardCoverBrands = {"Tukzer","CaseLogic","Spigen","Belkin","Logitech","HP","Dell","Lenovo","Asus","Acer","MSI","Razer","Corsair","HyperX","Redgear","AntEsports","Zebronics","Lapcare","AmazonBasics","Croma","Ugreen","Baseus","Portronics","Ambrane","URBN","Stuffcool","CaseU","Kensington","TechGear"};
			System.out.println();
			for(String brand : keyboardCoverBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("mousePad"))
		{
			String[] mousePadBrands = {"Logitech","Razer","Corsair","SteelSeries","HyperX","Redgear","AntEsports","Zebronics","HP","Dell","Lenovo","Asus","Acer","MSI","AmazonBasics","Croma","Lapcare","Belkin","Spigen","Kensington","Ugreen","Baseus","Portronics","Ambrane","URBN","Stuffcool","CosmicByte","CoolerMaster","BenQ"};
			System.out.println();
			for(String brand: mousePadBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("laptopStand"))
		{
			String[] laptopStandBrands = {"AmazonBasics","Croma","Portronics","Ambrane","Zebronics","Lapcare","Ugreen","Baseus","Spigen","Belkin","Kensington","Logitech","HP","Dell","Lenovo","Asus","Acer","MSI","Razer","CoolerMaster","Thermaltake","CosmicByte","AntEsports","Redgear","Stuffcool","URBN","Tukzer","CaseLogic","BoYata"};
			System.out.println();
			for(String brand : laptopStandBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("coolingPad"))
		{
			String[] coolingPadBrands = {"CoolerMaster","Thermaltake","Deepcool","Zebronics","Lapcare","CosmicByte","AntEsports","Redgear","Portronics","Ambrane","AmazonBasics","Croma","Logitech","HP","Dell","Lenovo","Asus","Acer","MSI","Razer","Belkin","Spigen","Ugreen","Baseus","URBN","Stuffcool","Havit","Aicheson","Targus"};
			System.out.println();
			for(String brand : coolingPadBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("webcam"))
		{
			String[] webcamBrands = {"Logitech","Microsoft","Razer","Dell","HP","Lenovo","Asus","Acer","MSI","Samsung","Sony","Panasonic","Philips","Creative","Anker","Ausdom","AverMedia","Elgato","OBSBOT","Insta360","Amcrest","Emeet","Redgear","Zebronics","Portronics","AmazonBasics","Croma","LogiTechBrio","Jabra"};
			System.out.println();
			for(String brand : webcamBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("microphone"))
		{
			String[] microphoneBrands = {"Blue","Rode","Shure","AudioTechnica","Behringer","AKG","Sennheiser","Boya","Maono","HyperX","Razer","Corsair","Elgato","Samson","Zoom","Sony","Panasonic","Philips","JBL","Anker","Creative","Zebronics","Redgear","Portronics","AmazonBasics","Croma","IKMultimedia","Neewer","Lewitt"};
			System.out.println();
			for(String brand : microphoneBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("tripod"))
		{
			String[] tripodBrands = {"Manfrotto","Benro","Joby","Digitek","Targus","AmazonBasics","Croma","Vanguard","Sirui","Fotopro","Neewer","Ulanzi","Zomei","Yunteng","Slik","Velbon","Cullmann","Gitzo","PeakDesign","Zhiyun","FeiyuTech","SmallRig","Rode","Sony","Canon","Nikon","Godox","Coman","Beike"};
			System.out.println();
			for(String brand : tripodBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("ringLight"))
		{
			String[] ringLightBrands = {"Digitek","Neewer","Godox","Philips","Wipro","Syska","Havells","Bajaj","AmazonBasics","Croma","Elgato","Ulanzi","SmallRig","Zhiyun","Rode","Comica","Sony","Canon","Nikon","Panasonic","Osram","GE","Halonix","Surya","Orient","Crompton","Duracell","GodoxLED","Andoer"};
			System.out.println();
			for(String brand : ringLightBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("gimbal"))
		{
			String[] gimbalBrands = {"DJI","Zhiyun","FeiyuTech","Moza","Hohem","Gudsen","Freefly","Pilotfly","Snoppa","ZHIYUNSmooth","DJIRonin","DJIOsmo","Insta360","ZhiyunCrane","ZhiyunSmooth","FeiyuG6","MozaMini","HohemIsteady","ZhiyunWeebill","FeiyuAK","GudsenMoza","SmallRig","Ulanzi","Godox","Benro","Sirui","Comica","Rode","Neewer"};
			System.out.println();
			for(String brand : gimbalBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("actionCamera"))
		{
			String[] actionCameraBrands = {"GoPro","DJI","Insta360","SJCAM","Akaso","Yi","Sony","Panasonic","Nikon","Canon","Garmin","Olympus","Ricoh","Polaroid","Kodak","Drift","Midland","Contour","Xiaomi","Realme","Eken","Apeman","Campark","Apexcam","Victure","Wolfang","Lamax","Rollei","Brinno"};
			System.out.println();
			for(String brand : actionCameraBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("dashCamera"))
		{
			String[] dashCameraBrands = {"70mai","DDPAI","Mi","Qubo","Nexdigitron","Philips","Blaupunkt","Garmin","Kenwood","Pioneer","BlackVue","Thinkware","Viofo","Vantrue","Transcend","Rexing","Aukey","Anker","Navitel","Prestige","TrueCam","Nextbase","AZDOME","Apeman","Campark","ZEdge","Toguard","Cobra","Roadhawk"};
			System.out.println();
			for(String brand : dashCameraBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("memoryCard"))
		{
			String[] memoryCardBrands = {"SanDisk","Samsung","Kingston","Sony","Lexar","PNY","Transcend","Toshiba","ADATA","HP","Strontium","Integral","Patriot","Verbatim","TeamGroup","SiliconPower","Angelbird","Delkin","Wise","ProGrade","Netac","Emtec","RiDATA","Kioxia","Apacer","Fujifilm","Hikvision","Eaget","Kodak"};
			System.out.println();
			for(String brand : memoryCardBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("cardReader"))
		{
			String[] cardReaderBrands = {"SanDisk","Kingston","Transcend","Anker","Belkin","UGreen","Baseus","AmazonBasics","Croma","Portronics","Ambrane","Zebronics","Lapcare","TPLink","ORICO","Sabrent","Vention","StarTech","Logitech","Dell","HP","Lenovo","Asus","Acer","MSI","Sony","Canon","Nikon","Panasonic"};
			System.out.println();
			for(String brand : cardReaderBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("externalSSD"))
		{
			String[] externalSSDBrands = {"Samsung","SanDisk","WesternDigital","Seagate","Crucial","Kingston","ADATA","Transcend","LaCie","Toshiba","HP","Dell","Lenovo","Sony","PNY","Lexar","Sabrent","ORICO","SiliconPower","TeamGroup","Netac","Apacer","Verbatim","GTechnology","OyenDigital","Angelbird","Patriot","Corsair","AdataXPG"};
			System.out.println();
			for(String brand : externalSSDBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("externalHDD"))
		{
			String[] externalHDDBrands = {"WesternDigital","Seagate","Toshiba","Samsung","LaCie","Transcend","ADATA","HP","Dell","Lenovo","Sony","Buffalo","GTechnology","Hitachi","Maxtor","Verbatim","SiliconPower","Apacer","Netac","TrekStor","Iomega","Fujitsu","HGST","Intenso","Freecom","Promise","OyenDigital","Glyph","CalDigit"};
			System.out.println();
			for(String brand : externalHDDBrands)
			{
				System.out.println(brand);
			}
		}
		if(item.equals("usbHub"))
		{
			String[] usbHubBrands = {"Anker","Belkin","UGreen","Baseus","AmazonBasics","Croma","Portronics","Ambrane","Zebronics","Lapcare","ORICO","Sabrent","TPLink","Vention","StarTech","Logitech","Dell","HP","Lenovo","Asus","Acer","MSI","Sony","Philips","Panasonic","Sandberg","Transcend","Sitecom","CableCreation"};
			System.out.println();
			for(String brand : usbHubBrands)
			{
				System.out.println(brand);
			}
		}
		
		
		return "products";
	}
	public static void main(String args[])
	{
		searchBrandByProduct();
		//System.out.println("select the product you want to buy");
		//product = read.next();
	}
}