class SuperMarket 
{

    public static String[] searchBrandByProduct(String productName)
	{ 


        if (productName == "biscuit") {
            String brands[] = {"Britannia","Parle","Sunfeast","GoodDay","Marie","HideSeek","LittleHearts","MilkBikis","50-50",
                               "NiceTime","Bourbon","Monaco","KrackJack","Tiger","Treat","DarkFantasy","Oreo","JimJam",
                               "NutriChoice","MilkCream","ButterDelite","ChocoFills","CashewCookies","AlmondCookies",
                               "CreamCracker","Salted","WheatDigestive","MultiGrain","HoneyOat","ChocoChip",  "FruitCookies","ElaichiCookies","CoconutCookies","ButterCookies","SugarFree"};
            return brands;
        }

        if (productName == "shampoo") {
            String brands[] = {"ClinicPlus","Dove","Pantene","HeadShoulders","Sunsilk","Tresemme","Loreal","Garnier",
                               "Himalaya","Meera","Chik","Vatika","Biotique","Khadi","Mamaearth","WOW","Matrix",
                               "Schwarzkopf","Nivea","Fiama","Indulekha","Sebamed","Revlon","Ayush","Patanjali",
                               "HerbalEssence","StBotanica","KhadiNeem","KhadiAmla","WOWOnion","MamaearthOnion",
                               "DoveIntense","PanteneProV","ClinicStrong","TresemmeKeratin","MeeraHerbal","ChikEgg"};
            return brands;
        }

        if (productName == "soap") {
            String brands[] = {"Lux","Pears","Lifebuoy","Dettol","Santoor","Cinthol","MysoreSandal","Dove","Vivel",
                               "Medimix","Hamam","Fiama","ParkAvenue","GodrejNo1","Chandrika","Khadi","Biotique",
                               "Ayush","Neem","Turmeric","AloeVera","Patanjali","Savlon","DettolCool","LifebuoyRed",
                               "LuxRose","LuxJasmine","PearsSoft","PearsPure","CintholCool","SantoorWhite",
                               "SantoorRed","MedimixAyurvedic","HamamNeem","FiamaGel","VivelAloe","GodrejNeem"};
            return brands;
        }

        if (productName == "rice") {
            String brands[] = {"IndiaGate","Daawat","Kohinoor","Fortune","BBRoyal","Patanjali","Aashirvaad","Unity",
                               "LalQilla","Tilda","ShriLalMahal","Surya","Sunstar","DoubleHorse","Royal","Crown",
                               "Supreme","GoldWinner","Annapurna","SriSri","24Mantra","OrganicIndia","NatureFresh",
                               "BBPopular","SafeHarvest","Akshaya","IndiaGateClassic","DaawatRozana","KohinoorGold",
                               "FortuneBiryani","UnityBasmati","LalQillaMajestic","TildaClassic","RoyalHarvest",
                               "SunstarGold","DoubleHorseMatta","AkshayaPremium"};
            return brands;
        }

        if (productName == "milk") {
            String brands[] = {"Amul","Nandini","Heritage","Aavin","MotherDairy","Milma","Dodla","Gokul","Vijaya",
                               "Sanchi","Dynamix","Kwality","Verka","Paras","Ananda","CountryDelight",
                               "Akshayakalpa","PrideOfCows","NestleAPlus","Britannia","BBRoyal","BBHome",
                               "NamasteIndia","Shreeja","Gowardhan","Sudha","Saras","Patanjali","Arokya",
                               "Tirumala","Cavin","MilkyMist","Vita","Vijetha","Ksheer","Madhusudan","Anmol"};
            return brands;
        }

        if (productName == "oil") {
            String brands[] = {"Fortune","GoldWinner","Saffola","Dhara","Freedom","Sunpure","Gemini","NatureFresh",
                               "Patanjali","Engine","Ruchi","Emami","Figaro","Oleev","Nutrela","24Mantra",
                               "BBRoyal","Annapurna","Safal","Idhayam","CocoSoul","OrganicIndia","SaffolaGold",
                               "FortuneRiceBran","FortuneSunlite","GeminiPure","FreedomRefined","DharaRefined",
                               "GoldWinnerRefined","PatanjaliMustard","NatureFreshActi","SunpureGroundnut",
                               "RuchiGold","EngineMustard","EmamiHealthy","FigaroOlive","OleevActive"};
            return brands;
        }
		if (productName == "milk") {
			String brands[] = {"Amul","Nandini","Heritage","Aavin","MotherDairy","Milma","Dodla","Gokul","Vijaya",
                       "Sanchi","Dynamix","Kwality","Verka","Paras","Ananda","CountryDelight",
                       "Akshayakalpa","PrideOfCows","NestleAPlus","Britannia","BBRoyal","BBHome",
                       "NamasteIndia","Shreeja","Gowardhan","Sudha","Saras","Patanjali","Arokya",
                       "Tirumala","Cavin","MilkyMist","Vita","Vijetha","Ksheer","Madhusudan","Anmol"};
			return brands;
		}

		if (productName == "oil") {
			String brands[] = {"Fortune","GoldWinner","Saffola","Dhara","Freedom","Sunpure","Gemini","NatureFresh",
							   "Patanjali","Engine","Ruchi","Emami","Figaro","Oleev","Nutrela","24Mantra",
							   "BBRoyal","Annapurna","Safal","Idhayam","CocoSoul","OrganicIndia","SaffolaGold",
							   "FortuneRiceBran","FortuneSunlite","GeminiPure","FreedomRefined","DharaRefined",
							   "GoldWinnerRefined","PatanjaliMustard","NatureFreshActi","SunpureGroundnut",
							   "RuchiGold","EngineMustard","EmamiHealthy","FigaroOlive","OleevActive"};
			return brands;
		}

		if (productName == "bread") {
			String brands[] = {"Britannia","Modern","HarvestGold","Elite","Wibs","EnglishOven","Nilgiris"};
			return brands;
		}

		if (productName == "butter") {
			String brands[] = {"Amul","Nandini","Britannia","MilkyMist","Govardhan","MotherDairy"};
			return brands;
		}

		if (productName == "cheese") {
			String brands[] = {"Amul","Britannia","Go","MilkyMist","Dlecta","LaCasa"};
			return brands;
		}

		if (productName == "curd") {
			String brands[] = {"Amul","Nandini","MilkyMist","Heritage","MotherDairy","Aavin"};
			return brands;
		}

		if (productName == "tea") {
			String brands[] = {"TataTea","RedLabel","TajMahal","Lipton","Society","WaghBakri"};
			return brands;
		}

		if (productName == "coffee") {
			String brands[] = {"Bru","Nescafe","Continental","Levista","Sunrise","Davidoff"};
			return brands;
		}

		if (productName == "detergent") {
			String brands[] = {"SurfExcel","Ariel","Tide","Rin","Ghadi","Wheel"};
			return brands;
		}

		if (productName == "toothpaste") {
			String brands[] = {"Colgate","Pepsodent","Sensodyne","CloseUp","DaburRed","Patanjali"};
			return brands;
		}
		if (productName == "milk") {
			String brands[] = {
				"Amul","Nandini","Heritage","Aavin","MotherDairy","Milma","Dodla","Gokul","Vijaya",
				"Sanchi","Dynamix","Kwality","Verka","Paras","Ananda","CountryDelight",
				"Akshayakalpa","PrideOfCows","NestleAPlus","Britannia","BBRoyal","BBHome",
				"NamasteIndia","Shreeja","Gowardhan","Sudha","Saras","Patanjali","Arokya"
			};
			return brands;
		}

		if (productName == "oil") {
			String brands[] = {
				"Fortune","GoldWinner","Saffola","Dhara","Freedom","Sunpure","Gemini","NatureFresh",
				"Patanjali","Engine","Ruchi","Emami","Figaro","Oleev","Nutrela","24Mantra",
				"BBRoyal","Annapurna","Safal","Idhayam","CocoSoul","OrganicIndia","SaffolaGold",
				"FortuneRiceBran","FortuneSunlite","GeminiPure","FreedomRefined","DharaRefined",
				"GoldWinnerRefined"
			};
			return brands;
		}

		if (productName == "bread") {
			String brands[] = {
				"Britannia","Modern","HarvestGold","Elite","Wibs","EnglishOven","Nilgiris",
				"Bonn","PerfectBread","DailyBread","LetsBake","LaBaguette","HotBread",
				"BBBakery","BakeHouse","SafeHarvest","UrbanPlatter","NatureFresh",
				"Spencers","RelianceSelect","MoreChoice","StarSelect","FreshBake",
				"GoldenLoaf","BakeKing","HealthyLoaf","WholeGrain","GrainFields"
			};
			return brands;
		}

		if (productName == "butter") {
			String brands[] = {
				"Amul","Nandini","Britannia","MilkyMist","Govardhan","MotherDairy","Verka",
				"Paras","Aavin","Vita","GowardhanPure","BBRoyal","BBHome","CountryDelight",
				"Ananda","Heritage","Milma","Dodla","Gokul","Vijaya","Sanchi",
				"Dynamix","Kwality","Saras","Sudha","Patanjali","Akshayakalpa","PrideOfCows"
			};
			return brands;
		}

		if (productName == "tea") {
			String brands[] = {
				"TataTea","RedLabel","TajMahal","Lipton","Society","WaghBakri","BrookeBond",
				"Tetley","Twinings","Girnar","Vahdam","Teabox","OrganicIndia","24Mantra",
				"Assamica","Goodricke","McLeodRussel","Typhoo","Dilmah","Namhah",
				"GoldenTips","Chaayos","Teacurry","Dorje","Aromica","TeaTrunk","Ripple","Chamong"
			};
			return brands;
		}

		if (productName == "coffee") {
			String brands[] = {
				"Bru","Nescafe","Continental","Levista","Sunrise","Davidoff","BlueTokai",
				"Rage","SleepyOwl","ThirdWave","SevenBeans","BlackBaza","Vahdam",
				"CountryBean","Bevzilla","ColombianBrew","TataCoffee","Bayars",
				"Narasu","Cothas","Leo","VSMani","Panduranga","Malgudi","FlyingSquirrel",
				"Kapikottai","Araku","Slay"
			};
			return brands;
		}

		if (productName == "detergentpowder") {
			String brands[] = {
				"SurfExcel","Ariel","Tide","Rin","Ghadi","Wheel","Henko","Fena",
				"ActiveWheel","Nirma","Ujala","Ezee","MoreChoice","BBRoyal","Safewash",
				"EasyWash","PowerWash","CleanMate","Xpert","MaxClean","FreshWash",
				"WhitePlus","UltraWash","ShineWash","PureWash","Sparkle","SuperClean","WashMate"
			};
			return brands;
		}

		if (productName == "toothpaste") {
			String brands[] = {
				"Colgate","Pepsodent","Sensodyne","CloseUp","DaburRed","Patanjali",
				"Meswak","Babool","Vicco","OralB","Aimil","Himalaya","Ayush",
				"ColgateHerbal","ColgateActive","ColgateSalt","PepsodentGermicheck",
				"SensodyneRapid","SensodyneFresh","CloseUpRed","Anchor","Forhans",
				"Herbodent","Zandu","NeemActive","FreshGel","WhiteSmile","SparkleDent"
			};
			return brands;
		}

		if (productName == "chips") {
			String brands[] = {
				"Lays","Bingo","UncleChips","Pringles","TooYumm","Haldirams","Balaji",
				"Kurkure","TagZ","Ruffles","Crax","TakaTak","MadAngles","BlueDiamond",
				"Cornitos","Doritos","PopCorners","Beanitos","Garden","Bikaji",
				"YellowDiamond","Simply7","EatReal","OpenSecret","Snackible","MaxProtein",
				"RiteBite","MrMakhana"
			};
			return brands;
		}
		if (productName == "curd") {
			String brands[] = {
				"Amul","Nandini","Heritage","Aavin","MotherDairy","Milma","Dodla","Gokul","Vijaya",
				"Sanchi","Dynamix","Kwality","Verka","Paras","Ananda","CountryDelight",
				"Akshayakalpa","PrideOfCows","Nestle","Britannia","BBRoyal","BBHome",
				"NamasteIndia","Shreeja","Gowardhan","Sudha","Saras","Patanjali","Arokya"
			};
			return brands;
		}

		if (productName == "cheese") {
			String brands[] = {
				"Amul","Britannia","Go","MilkyMist","Dlecta","LaCasa","MotherDairy","Verka",
				"Paras","Aavin","Nandini","Heritage","BBRoyal","BBHome","CountryDelight",
				"Akshayakalpa","PrideOfCows","Gowardhan","Kwality","Saras","Sudha",
				"Dynamix","Vita","Milma","Dodla","Gokul","Vijaya","Ananda","Patanjali"
			};
			return brands;
		}

		if (productName == "jam") {
			String brands[] = {
				"Kissan","Mapro","Saffola","MotherDairy","Stute","Veeba","Hersheys",
				"BBRoyal","BBHome","UrbanPlatter","24Mantra","OrganicIndia","Patanjali",
				"Anveshan","Farmley","Wingreens","DelMonte","Britannia","RelianceSelect",
				"Spencers","MoreChoice","StarSelect","Fresho","Tops","Priya","MTR",
				"Aachi","Smith","Dabur"
			};
			return brands;
		}

		if (productName == "honey") {
			String brands[] = {
				"Dabur","Patanjali","24Mantra","Saffola","Hitkari","Apis","Indigenous",
				"NatureNectar","Zandu","OrganicIndia","BBRoyal","BBHome","FarmNaturelle",
				"Anveshan","Baidyanath","Kapiva","Gir","RelianceSelect","Spencers",
				"MoreChoice","StarSelect","UrbanPlatter","VedaOils","PureAndSure",
				"ProNature","TrueElements","Himalayan","ForestEssentials","Ayurvedix"
			};
			return brands;
		}

		if (productName == "noodle") {
    String brands[] = {
        "Maggi","Yippee","TopRamen","Knorr","Chings","WaiWai","Nissin",
        "Indomie","Samyang","Koka","Itsuki","Nongshim","Paldo","Prima",
        "BBRoyal","BBHome","Patanjali","24Mantra","UrbanPlatter","SlurrpFarm",
        "RelianceSelect","Spencers","MoreChoice","StarSelect","Fresho",
        "Safal","OrganicIndia","Tops","Anil"
    };
    return brands;
}

		if (productName == "pasta") {
			String brands[] = {
				"Borges","DelMonte","Barilla","Disano","Maggi","DiSano","LaPasta",
				"SanRemo","Durum","BBRoyal","BBHome","UrbanPlatter","24Mantra",
				"OrganicIndia","Patanjali","RelianceSelect","Spencers","MoreChoice",
				"StarSelect","Fresho","TataSampann","Bambino","Delicia","Milano",
				"Veeba","Tops","Anil","Priya","MTR"
			};
			return brands;
		}

		if (productName == "icecream") {
			String brands[] = {
				"Amul","Vadilal","KwalityWalls","MotherDairy","Arun","CreamBell",
				"Havmor","Ibaco","Naturals","BaskinRobbins","HaagenDazs","GelatoItalia",
				"LondonDairy","Giani","Apsara","Dinshaw","NIC","PolarBear",
				"TopNTop","Scoops","TenderCoconut","Milano","Gowardhan","BBRoyal",
				"BBHome","RelianceSelect","Spencers","MoreChoice","StarSelect"
			};
			return brands;
		}

		if (productName == "detergentliquid") {
			String brands[] = {
				"SurfExcel","Ariel","Tide","Rin","Henko","Ezee","Ujala",
				"MoreChoice","BBRoyal","BBHome","RelianceSelect","Spencers","StarSelect",
				"Ghadi","Wheel","Fena","Nirma","PowerWash","EasyWash","CleanMate",
				"Xpert","FreshWash","WhitePlus","UltraWash","PureWash","Sparkle",
				"SuperClean","WashMate","MaxClean"
			};
			return brands;
		}

		if (productName == "floorcleaner") {
			String brands[] = {
				"Lizol","Harpic","Domex","Dettol","Vim","MrMuscle","Colin",
				"BBRoyal","BBHome","RelianceSelect","Spencers","MoreChoice","StarSelect",
				"Safai","CleanMate","PowerClean","FreshFloor","PureFloor","ShinePlus",
				"UltraClean","MaxClean","Sparkle","SuperFresh","HygienePlus","ProClean",
				"EcoClean","NatureClean","AyurClean","BioFresh"
			};
			return brands;
		}

		if (productName == "toiletcleaner") {
			String brands[] = {
				"Harpic","Domex","Lizol","Vim","Sanifresh","Dettol","MrMuscle",
				"BBRoyal","BBHome","RelianceSelect","Spencers","MoreChoice","StarSelect",
				"CleanMate","PowerClean","FreshClean","PureClean","UltraClean",
				"MaxClean","Sparkle","SuperClean","HygienePlus","ProClean","EcoClean",
				"NatureClean","AyurClean","BioFresh","SafeClean","QuickClean"
			};
			return brands;
		}
		if (productName == "facewash") {
			String brands[] = {
				"Garnier","Ponds","CleanAndClear","Himalaya","Nivea","Simple","Cetaphil",
				"Neutrogena","Mamaearth","WOW","Biotique","Plum","TheDermaCo",
				"Minimalist","Lakme","Lotus","VLCC","Khadi","AromaMagic","Joy",
				"Everyuth","Reequil","Olay","GoodVibes","MCaffeine","ForestEssentials",
				"WOWMen","Beardo","Ustraa"
			};
			return brands;
		}

		if (productName == "bodylotion") {
			String brands[] = {
				"Vaseline","Nivea","Dove","Ponds","Joy","Parachute","Himalaya",
				"WOW","Mamaearth","Biotique","Plum","Cetaphil","Neutrogena",
				"Aveeno","MCaffeine","TheDermaCo","Minimalist","Lakme","Lotus",
				"VLCC","Khadi","AromaMagic","ForestEssentials","StIves","Olay",
				"Johnson","Palmers","Vivel","Fiama"
			};
			return brands;
		}

		if (productName == "hairoil") {
			String brands[] = {
				"Parachute","Indulekha","DaburAmla","Bajaj","Navratna","KeshKing",
				"Mamaearth","WOW","Biotique","Khadi","Patanjali","Himalaya",
				"ForestEssentials","Soulflower","Avimee","Emami","Ayur","Trichup",
				"Meera","Nihar","Sesa","CocoSoul","Anveshan","IndusValley",
				"ReyNaturals","Plum","StBotanica","KamaAyurveda","Vedix"
			};
			return brands;
		}

		if (productName == "toothbrush") {
			String brands[] = {
				"Colgate","OralB","Sensodyne","Pepsodent","CloseUp","Anchor",
				"DrBatra","Forhans","ColgateSlim","OralBPro","Perfora","Cibaca",
				"Dabur","Patanjali","Meswak","Himalaya","Ayush","WOW",
				"BBRoyal","RelianceSelect","MoreChoice","StarSelect","Spencers",
				"Vega","DenTek","Equate","Jordan","Systema","Pierrot"
			};
			return brands;
		}

		if (productName == "turmericpowder") {
			String brands[] = {
				"MDH","Everest","Sakthi","Aachi","24Mantra","TataSampann",
				"Patanjali","OrganicIndia","BBRoyal","Eastern","Catch","Badshah",
				"MTR","Priya","Anil","Keya","Vahdam","Snapin","SimplyOrganic",
				"Spencers","RelianceSelect","MoreChoice","StarSelect","Fresho",
				"GRB","Idhayam","Annai","Shan","Nilons"
			};
			return brands;
		}

		if (productName == "chillipowder") {
			String brands[] = {
				"MDH","Everest","Aachi","Sakthi","Eastern","24Mantra","TataSampann",
				"Patanjali","BBRoyal","Catch","Badshah","MTR","Priya","Anil",
				"Keya","Vahdam","Snapin","SimplyOrganic","Shan","Nilons",
				"Spencers","RelianceSelect","MoreChoice","StarSelect","Fresho",
				"GRB","Annai","Idhayam","Vasudev"
			};
			return brands;
		}

		if (productName == "pickle") {
			String brands[] = {
				"Priya","MTR","MotherRecipe","Aachi","Patanjali","Bedekar",
				"Nilons","Tops","Veeba","UrbanPlatter","24Mantra","OrganicIndia",
				"BBRoyal","Eastern","GRB","Vimal","Bikaji","Haldirams",
				"Spencers","RelianceSelect","MoreChoice","StarSelect","Fresho",
				"Homemade","Pravin","Shan","Anil","Idhayam","Suhana"
			};
			return brands;
		}

		if (productName == "apple") {
			String brands[] = {
				"Washington","Kashmir","Shimla","RoyalGala","Fuji","RedDelicious",
				"GoldenDelicious","GrannySmith","PinkLady","Ambrosia","Jazz",
				"Envy","Honeycrisp","Braeburn","Cameo","Empire","Jonagold",
				"BBRoyal","Fresho","RelianceFresh","MoreChoice","StarSelect",
				"Spencers","Namdhari","LocalFarm","OrganicFarm","HillFresh","FreshKart"
			};
			return brands;
		}

		if (productName == "banana") {
			String brands[] = {
				"Robusta","Yelakki","Nendran","RedBanana","Poovan","Rasthali",
				"Monthan","Karpuravalli","Morris","BBRoyal","Fresho",
				"RelianceFresh","MoreChoice","StarSelect","Spencers","LocalFarm",
				"OrganicFarm","HillFresh","FreshKart","Namdhari","GreenGrow",
				"AgroFresh","FarmBest","VillageFresh","DailyFresh","PureHarvest",
				"EcoFarm","GoldenFarm","NatureFarm"
			};
			return brands;
		}

		if (productName == "babyfood") {
			String brands[] = {
				"Cerelac","Nestum","SlurrpFarm","EarlyFoods","Timios","Happa",
				"Gerber","Heinz","LittleMunchies","YummyInMyTummy","BebeBurp",
				"Babynat","Nutricia","Danone","BBRoyal","RelianceSelect",
				"MoreChoice","StarSelect","Spencers","OrganicTattva","24Mantra",
				"OrganicIndia","FirstBite","MyLittleMoppet","Wholesome","TinyOrganics",
				"HappyBaby","Sprout","EarthsBest"
			};
			return brands;
		}

		if (productName == "babydiaper") {
			String brands[] = {
				"Pampers","Huggies","MamyPoko","LittleAngel","Supples","MeeMee",
				"Sebamed","Chicco","Drypers","BellaBaby","RascalFriends",
				"BamboNature","BBRoyal","RelianceSelect","MoreChoice","StarSelect",
				"Spencers","SoftTouch","Snuggs","Teddyy","Friends","CuddleCare",
				"Babyhug","LuvLap","Pigeon","Farlin","Mothercare","Jo","TinyCare"
			};
			return brands;
		}

		if (productName == "petfood") {
			String brands[] = {
				"Pedigree","Drools","RoyalCanin","Purepet","MeatUp","Farmina",
				"Acana","Orijen","TasteOfTheWild","Iams","Whiskas","Sheba",
				"BBRoyal","RelianceSelect","MoreChoice","StarSelect","Spencers",
				"HimalayaPet","CanineCreek","ArdenGrange","JerHigh","KennelKitchen",
				"SmartHeart","ChipChops","Dogaholic","WoofWoof","PetStrong",
				"NatureBridge","Nulo"
			};
			return brands;
		}

		if (productName == "stationery") {
			String brands[] = {
				"Classmate","Navneet","Camlin","Cello","Nataraj","Apsara",
				"Reynolds","Flair","Luxor","Parker","Pilot","FaberCastell",
				"Staedtler","Paperkraft","Kokuyo","Pentonic","BBRoyal",
				"RelianceSelect","MoreChoice","StarSelect","Spencers","Scholar",
				"Axiom","AddGel","Uniball","Sharpie","Maped","Montex","Hauser"
			};
			return brands;
		}

		if (productName == "battery") {
			String brands[] = {
				"Duracell","Eveready","Panasonic","Energizer","GP","Syska",
				"Philips","Maxell","Toshiba","Sony","Camelion","Kodak",
				"BBRoyal","RelianceSelect","MoreChoice","StarSelect","Spencers",
				"Usha","Havells","Wipro","Bajaj","Anchor","Orient",
				"PowerPlus","UltraCell","Rayovac","Ansmann","Varta","Nippo"
			};
			return brands;
		}	
		if (productName == "rusk") {
			String brands[] = {
				"Britannia","Parle","Elite","PriyaGold","Patanjali","BakeMate",
				"Bonn","Wibs","EnglishOven","Nilgiris","BBRoyal","RelianceSelect",
				"MoreChoice","StarSelect","Spencers","HarvestGold","Modern",
				"Anmol","Dukes","Cremica","TataSoulfull","Sunfeast","MrsBector",
				"BiskFarm","KhongGuan","Haldirams","Bikaji","FreshBake"
			};
			return brands;
		}

		if (productName == "khari") {
			String brands[] = {
				"Britannia","Elite","BakeMate","Patanjali","PriyaGold","Bonn",
				"Nilgiris","BBRoyal","RelianceSelect","MoreChoice","StarSelect",
				"Spencers","HarvestGold","Modern","EnglishOven","MrsBector",
				"Sunfeast","Cremica","Anmol","Dukes","BiskFarm","KhongGuan",
				"Haldirams","Bikaji","FreshBake","UrbanBakery","DailyBake",
				"GoldenBake","HomeBake"
			};
			return brands;
		}

		if (productName == "bun") {
			String brands[] = {
				"Britannia","Modern","HarvestGold","Nilgiris","Wibs","EnglishOven",
				"Bonn","Elite","BBRoyal","RelianceSelect","MoreChoice","StarSelect",
				"Spencers","MrsBector","Sunfeast","Cremica","Anmol","Dukes",
				"BiskFarm","KhongGuan","FreshBake","UrbanBakery","DailyBake",
				"GoldenBake","HomeBake","PerfectBake","SoftBake","QuickBake","BakeHouse"
			};
			return brands;
		}

		if (productName == "muffin") {
			String brands[] = {
				"Britannia","Elite","Winkies","HarvestGold","Nilgiris","EnglishOven",
				"Bonn","BBRoyal","RelianceSelect","MoreChoice","StarSelect",
				"Spencers","MrsBector","Sunfeast","Cremica","Anmol","Dukes",
				"BiskFarm","KhongGuan","FreshBake","UrbanBakery","DailyBake",
				"GoldenBake","HomeBake","PerfectBake","SoftBake","QuickBake","BakeHouse","CakeZone"
			};
			return brands;
		}

		if (productName == "mouthwash") {
			String brands[] = {
				"Listerine","Colgate","Sensodyne","CloseUp","OralB","Dabur",
				"Patanjali","Himalaya","Ayush","TheraBreath","Plax","ACT",
				"Perfora","DrBatra","BBRoyal","RelianceSelect","MoreChoice",
				"StarSelect","Spencers","Dentyl","Freshol","ListerMint",
				"Everfresh","CleanDent","Sparkle","WhiteSmile","PureBreath","MintCare","Oraclean"
			};
			return brands;
		}

		if (productName == "facecream") {
			String brands[] = {
				"Ponds","Nivea","Lakme","Lotus","Olay","Garnier","Himalaya",
				"Mamaearth","WOW","Biotique","Plum","TheDermaCo","Minimalist",
				"Cetaphil","Neutrogena","VLCC","Khadi","Joy","Everyuth","AromaMagic",
				"ForestEssentials","Reequil","MCaffeine","GoodVibes","Vaseline",
				"Johnson","StIves","Palmers","Aveeno"
			};
			return brands;
		}

		if (productName == "hairgel") {
			String brands[] = {
				"SetWet","Gatsby","Livon","ParkAvenue","Ustraa","Beardo",
				"ManMatters","WOW","Mamaearth","LOreal","Schwarzkopf","Streax",
				"Dabur","Patanjali","Himalaya","Brylcreem","KeshKing","IndusValley",
				"Khadi","Biotique","Plum","MCaffeine","TheManCompany","Cantu",
				"AmericanCrew","ToniGuy","Matrix","Revlon","Arata"
			};
			return brands;
		}

		if (productName == "hairconditioner") {
			String brands[] = {
				"Dove","Sunsilk","Pantene","Tresemme","LOreal","Matrix",
				"Schwarzkopf","WOW","Mamaearth","Biotique","Plum","Khadi",
				"Himalaya","Patanjali","IndusValley","StBotanica","Reequil",
				"MCaffeine","TheDermaCo","Minimalist","Aaranyaa","ForestEssentials",
				"Cantu","SheaMoisture","OGX","Aussie","BBlunt","Arata","Anveya"
			};
			return brands;
		}

		if (productName == "handwash") {
			String brands[] = {
				"Dettol","Savlon","Lifebuoy","Godrej","Himalaya","Dove",
				"Pears","Palmolive","Lux","Fiama","Vivel","Khadi","Patanjali",
				"BBRoyal","RelianceSelect","MoreChoice","StarSelect","Spencers",
				"BioFresh","NatureCare","PureHands","CleanTouch","SafeWash",
				"HygienePlus","GermFree","FreshHands","AromaCare","SoftWash","CarePlus"
			};
			return brands;
		}

		if (productName == "fabricsoftener") {
			String brands[] = {
				"Comfort","Ezee","Softouch","Ujala","Godrej","BBRoyal",
				"RelianceSelect","MoreChoice","StarSelect","Spencers","SurfExcel",
				"Ariel","Vanish","Safewash","FreshSoft","PureSoft","UltraSoft",
				"MaxSoft","GentleCare","Fluffy","SmoothCare","SoftPlus","CareSoft",
				"EcoSoft","NatureSoft","FreshCare","ShineSoft","EasySoft","ProSoft"
			};
			return brands;
		}

		if (productName == "dishwashbar") {
			String brands[] = {
				"Vim","Exo","Pril","Giffy","Axion","BBRoyal","RelianceSelect",
				"MoreChoice","StarSelect","Spencers","Viva","Pitambari",
				"Squeaky","BornGood","HerbalClean","NatureWash","EcoDish",
				"PureWash","Sparkle","UltraClean","MaxClean","SuperWash",
				"ShineBar","QuickWash","Greencare","DishCare","CleanMate","ProWash","SafeDish"
			};
			return brands;
		}

		if (productName == "phenyl") {
			String brands[] = {
				"Lizol","Domex","Harpic","Dettol","Vim","BBRoyal",
				"RelianceSelect","MoreChoice","StarSelect","Spencers","WhitePhenyl",
				"BlackPhenyl","PineFresh","RoseFresh","LemonFresh","JasmineFresh",
				"PowerClean","UltraClean","MaxClean","SuperFresh","ShinePlus",
				"EcoClean","NatureClean","BioFresh","SafeClean","QuickClean","ProClean","HygienePlus","FloorFresh"
			};
			return brands;
		}

		if (productName == "toothpick") {
			String brands[] = {
				"Patanjali","BBRoyal","RelianceSelect","MoreChoice","StarSelect",
				"Spencers","SafePick","PureWood","EcoPick","NaturePick","WoodCare",
				"CleanPick","FreshPick","HygienePick","ClassicPick","GoldPick",
				"SmartPick","QuickPick","DailyPick","HomePick","KitchenPick",
				"ChefPick","FinePick","BambooPick","GreenPick","UltraPick","MaxPick","ProPick","SelectPick"
			};
			return brands;
		}

		if (productName == "cotton") {
			String brands[] = {
				"Johnson","Bella","Carefree","BBRoyal","RelianceSelect","MoreChoice",
				"StarSelect","Spencers","SoftTouch","PureCot","NatureCot","CleanCot",
				"FreshCot","HygieneCot","GentleCot","UltraCot","MaxCot","ProCot",
				"DailyCot","HomeCot","EcoCot","GreenCot","SafeCot","BabyCot",
				"SilkyCot","SmoothCot","FineCot","WhiteCot","ComfortCot"
			};
			return brands;
		}

		if (productName == "tissuepaper") {
			String brands[] = {
				"Origami","Presto","Scott","BBRoyal","RelianceSelect","MoreChoice",
				"StarSelect","Spencers","SoftCare","PureSoft","UltraSoft","MaxSoft",
				"GentleSoft","FreshSoft","CleanSoft","EcoSoft","NatureSoft","GreenSoft",
				"SilkySoft","SmoothSoft","DailySoft","HomeSoft","SafeSoft","BabySoft",
				"ComfortSoft","PremiumSoft","WhiteSoft","FineSoft","ProSoft"
			};
			return brands;
		}

		if (productName == "papernapkin") {
			String brands[] = {
				"Origami","Presto","BBRoyal","RelianceSelect","MoreChoice","StarSelect",
				"Spencers","SoftCare","PureSoft","UltraSoft","MaxSoft","GentleSoft",
				"FreshSoft","CleanSoft","EcoSoft","NatureSoft","GreenSoft","SilkySoft",
				"SmoothSoft","DailySoft","HomeSoft","SafeSoft","BabySoft","ComfortSoft",
				"PremiumSoft","WhiteSoft","FineSoft","ProSoft","TableSoft"
			};
			return brands;
		}

		if (productName == "aluminiumfoil") {
			String brands[] = {
				"Hindalco","FreshWrap","BBRoyal","RelianceSelect","MoreChoice",
				"StarSelect","Spencers","Presto","Origami","SafeWrap","PureWrap",
				"UltraWrap","MaxWrap","EcoWrap","NatureWrap","GreenWrap","ChefWrap",
				"KitchenWrap","HomeWrap","QuickWrap","DailyWrap","StrongWrap",
				"HeavyWrap","LightWrap","SmartWrap","EasyWrap","FoodWrap","ProWrap","SealWrap"
			};
			return brands;
		}

		if (productName == "clingwrap") {
			String brands[] = {
				"FreshWrap","BBRoyal","RelianceSelect","MoreChoice","StarSelect",
				"Spencers","Presto","Origami","SafeWrap","PureWrap","UltraWrap",
				"MaxWrap","EcoWrap","NatureWrap","GreenWrap","ChefWrap","KitchenWrap",
				"HomeWrap","QuickWrap","DailyWrap","StrongWrap","LightWrap","SmartWrap",
				"EasyWrap","FoodWrap","ProWrap","SealWrap","TightWrap","ClearWrap"
			};
			return brands;
		}

		if (productName == "garbagebag") {
			String brands[] = {
				"GarbageCare","CleanMate","BBRoyal","RelianceSelect","MoreChoice",
				"StarSelect","Spencers","FreshBag","PureBag","UltraBag","MaxBag",
				"EcoBag","NatureBag","GreenBag","StrongBag","HeavyBag","LightBag",
				"DailyBag","HomeBag","SafeBag","KitchenBag","SmartBag","EasyBag",
				"ProBag","SealBag","WasteBag","TrashBag","CareBag","CleanBag"
			};
			return brands;
		}

		if (productName == "matchbox") {
			String brands[] = {
				"Ship","Camel","Lion","Pyramid","Anchor","BBRoyal","RelianceSelect",
				"MoreChoice","StarSelect","Spencers","ClassicMatch","SafetyMatch",
				"PowerMatch","EcoMatch","GreenMatch","QuickMatch","EasyMatch",
				"HomeMatch","DailyMatch","StrongMatch","UltraMatch","MaxMatch",
				"ProMatch","SafeMatch","KitchenMatch","FireMatch","LightMatch","GoldMatch","PremiumMatch"
			};
			return brands;
		}	
		if (productName == "incensestick") {
			String brands[] = {
				"Cycle","Mangaldeep","ZedBlack","Moksh","Darshan","Hem","Satya",
				"Patanjali","Aastha","Balaji","Bhagwati","Flute","Goloka",
				"MysoreSandal","BharatDarshan","Kalpana","DevDarshan","Sugandhi",
				"Spiritual","Vedic","Aroma","Puja","Temple","Heritage","Classic",
				"Royal","Premium","Divine","PureAgarbatti"
			};
			return brands;
		}

		if (productName == "camphor") {
			String brands[] = {
				"Mangalam","Patanjali","Puja","Aastha","Cycle","ZedBlack","Balaji",
				"Bhagwati","DevDarshan","Spiritual","Vedic","Temple","Heritage",
				"Classic","Premium","Pure","Crystal","Natural","Divine","Sacred",
				"Aroma","Holy","Trust","Care","Gold","Royal","Eco","Green","Fresh"
			};
			return brands;
		}

		if (productName == "corianderpowder") {
			String brands[] = {
				"MDH","Everest","Aachi","Sakthi","Eastern","24Mantra","TataSampann",
				"Patanjali","Catch","Badshah","MTR","Priya","Anil","Keya","Vahdam",
				"Snapin","Nilons","Shan","BBRoyal","RelianceSelect","MoreChoice",
				"StarSelect","Spencers","Fresho","GRB","Annai","Idhayam","OrganicIndia","SimplyFresh"
			};
			return brands;
		}

		if (productName == "cuminseeds") {
			String brands[] = {
				"MDH","Everest","Catch","Badshah","Aachi","Sakthi","Eastern",
				"24Mantra","TataSampann","Patanjali","Keya","Vahdam","Snapin",
				"Nilons","Shan","BBRoyal","RelianceSelect","MoreChoice","StarSelect",
				"Spencers","Fresho","GRB","Annai","Idhayam","OrganicIndia","SimplyFresh",
				"HerbalFresh","PureSpice","SpiceKing"
			};
			return brands;
		}

		if (productName == "mustardseeds") {
			String brands[] = {
				"MDH","Everest","Catch","Badshah","Aachi","Sakthi","Eastern",
				"24Mantra","TataSampann","Patanjali","Keya","Vahdam","Snapin",
				"Nilons","Shan","BBRoyal","RelianceSelect","MoreChoice","StarSelect",
				"Spencers","Fresho","GRB","Annai","Idhayam","OrganicIndia","SimplyFresh",
				"HerbalFresh","PureSpice","SpiceKing"
			};
			return brands;
		}

		if (productName == "fenugreekseeds") {
			String brands[] = {
				"MDH","Everest","Catch","Badshah","Aachi","Sakthi","Eastern",
				"24Mantra","TataSampann","Patanjali","Keya","Vahdam","Snapin",
				"Nilons","Shan","BBRoyal","RelianceSelect","MoreChoice","StarSelect",
				"Spencers","Fresho","GRB","Annai","Idhayam","OrganicIndia","SimplyFresh",
				"HerbalFresh","PureSpice","SpiceKing"
			};
			return brands;
		}

		if (productName == "asafoetida") {
			String brands[] = {
				"LG","Vandevi","Aachi","Sakthi","Eastern","Catch","Badshah",
				"MDH","Everest","Patanjali","24Mantra","TataSampann","Keya",
				"Vahdam","Snapin","Nilons","BBRoyal","RelianceSelect","MoreChoice",
				"StarSelect","Spencers","Fresho","GRB","Annai","Idhayam","OrganicIndia",
				"PureSpice","HerbalFresh","SpiceKing"
			};
			return brands;
		}

		if (productName == "bakingpowder") {
			String brands[] = {
				"Weikfield","DrOetker","Pillsbury","Keya","UrbanPlatter","BBRoyal",
				"RelianceSelect","MoreChoice","StarSelect","Spencers","BlueBird",
				"Angel","DelMonte","TataSampann","24Mantra","Patanjali","NatureLand",
				"PureAndSure","OrganicIndia","SimplyFresh","HomeBake","ChefMate",
				"BakeKing","PerfectBake","EasyBake","QuickBake","ProBake","FreshBake","GoldenBake"
			};
			return brands;
		}

		if (productName == "bakingsoda") {
			String brands[] = {
				"Weikfield","ArmAndHammer","Keya","UrbanPlatter","BBRoyal",
				"RelianceSelect","MoreChoice","StarSelect","Spencers","BlueBird",
				"Angel","Pillsbury","DrOetker","TataSampann","24Mantra","Patanjali",
				"NatureLand","PureAndSure","OrganicIndia","SimplyFresh","HomeBake",
				"ChefMate","BakeKing","PerfectBake","EasyBake","QuickBake","ProBake","FreshBake","GoldenBake"
			};
			return brands;
		}

		if (productName == "custardpowder") {
			String brands[] = {
				"Weikfield","BrownAndPolson","FosterClarks","BlueBird","BBRoyal",
				"RelianceSelect","MoreChoice","StarSelect","Spencers","Angel",
				"Pillsbury","DrOetker","UrbanPlatter","TataSampann","24Mantra",
				"Patanjali","NatureLand","PureAndSure","OrganicIndia","SimplyFresh",
				"HomeBake","ChefMate","BakeKing","PerfectBake","EasyBake","QuickBake",
				"ProBake","FreshBake","GoldenBake"
			};
			return brands;
		}

		if (productName == "jelly") {
			String brands[] = {
				"Weikfield","DrOetker","FosterClarks","BrownAndPolson","BBRoyal",
				"RelianceSelect","MoreChoice","StarSelect","Spencers","UrbanPlatter",
				"Tops","DelMonte","Kissan","Patanjali","24Mantra","NatureLand",
				"PureAndSure","OrganicIndia","SimplyFresh","HomeBake","ChefMate",
				"BakeKing","PerfectBake","EasyBake","QuickBake","ProBake","FreshBake","GoldenBake","FruitFresh"
			};
			return brands;
		}

		if (productName == "sauce") {
			String brands[] = {
				"Kissan","Maggi","Heinz","DelMonte","Veeba","Tops","Ching's",
				"BBRoyal","RelianceSelect","MoreChoice","StarSelect","Spencers",
				"Patanjali","24Mantra","OrganicIndia","UrbanPlatter","Wingreens",
				"SmithAndJones","MTR","Priya","Aachi","Eastern","Keya","Vahdam",
				"Snapin","Nilons","Fresho","GRB","Annai"
			};
			return brands;
		}

		if (productName == "ketchup") {
			String brands[] = {
				"Kissan","Maggi","Heinz","DelMonte","Veeba","Tops","Ching's",
				"BBRoyal","RelianceSelect","MoreChoice","StarSelect","Spencers",
				"Patanjali","24Mantra","OrganicIndia","UrbanPlatter","Wingreens",
				"SmithAndJones","MTR","Priya","Aachi","Eastern","Keya","Vahdam",
				"Snapin","Nilons","Fresho","GRB","Annai"
			};
			return brands;
		}

		if (productName == "mayonnaise") {
			String brands[] = {
				"Veeba","DelMonte","Heinz","FunFoods","DrOetker","BBRoyal",
				"RelianceSelect","MoreChoice","StarSelect","Spencers","UrbanPlatter",
				"Wingreens","Patanjali","24Mantra","OrganicIndia","SmithAndJones",
				"Tops","Keya","Vahdam","Snapin","Nilons","Fresho","GRB","Annai",
				"ChefMate","HomeBake","PerfectBake","EasyBake","QuickBake"
			};
			return brands;
		}

		if (productName == "vinegar") {
			String brands[] = {
				"Weikfield","Heinz","DelMonte","UrbanPlatter","BBRoyal",
				"RelianceSelect","MoreChoice","StarSelect","Spencers","Keya",
				"Vahdam","Snapin","Nilons","Patanjali","24Mantra","OrganicIndia",
				"NatureLand","PureAndSure","SimplyFresh","ChefMate","HomeBake",
				"PerfectBake","EasyBake","QuickBake","ProBake","FreshBake","GoldenBake","EcoFresh","PureDrop"
			};
			return brands;
		}

		if (productName == "soysauce") {
			String brands[] = {
				"Ching's","Kikkoman","LeeKumKee","Maggi","Weikfield","BBRoyal",
				"RelianceSelect","MoreChoice","StarSelect","Spencers","UrbanPlatter",
				"DelMonte","Veeba","Tops","Keya","Vahdam","Snapin","Nilons",
				"Patanjali","24Mantra","OrganicIndia","NatureLand","PureAndSure",
				"SimplyFresh","ChefMate","HomeBake","PerfectBake","EasyBake","QuickBake"
			};
			return brands;
		}

		if (productName == "chutney") {
			String brands[] = {
				"MotherRecipe","MTR","Priya","Aachi","Patanjali","24Mantra",
				"OrganicIndia","BBRoyal","RelianceSelect","MoreChoice","StarSelect",
				"Spencers","UrbanPlatter","Wingreens","SmithAndJones","Eastern",
				"Keya","Vahdam","Snapin","Nilons","Fresho","GRB","Annai","Idhayam",
				"Tops","Veeba","DelMonte","HomeMade","PureTaste"
			};
			return brands;
		}

		if (productName == "frozenpeas") {
			String brands[] = {
				"Safal","ITCFrozen","McCain","GodrejYummiez","BBRoyal","RelianceSelect",
				"MoreChoice","StarSelect","Spencers","Fresho","NatureFresh","UrbanPlatter",
				"24Mantra","OrganicIndia","PureAndSure","SimplyFresh","FarmFresh",
				"GreenGrow","AgroFresh","DailyFresh","QuickFreeze","FreshFarm",
				"CoolVeg","FrozenGold","EcoFarm","NatureFarm","VegFresh","PureVeg","FarmBest"
			};
			return brands;
		}

		if (productName == "frozencorn") {
			String brands[] = {
				"Safal","ITCFrozen","McCain","GodrejYummiez","BBRoyal","RelianceSelect",
				"MoreChoice","StarSelect","Spencers","Fresho","NatureFresh","UrbanPlatter",
				"24Mantra","OrganicIndia","PureAndSure","SimplyFresh","FarmFresh",
				"GreenGrow","AgroFresh","DailyFresh","QuickFreeze","FreshFarm",
				"CoolVeg","FrozenGold","EcoFarm","NatureFarm","VegFresh","PureVeg","FarmBest"
			};
			return brands;
		}	
		if (productName == "rice") {
			String brands[] = {
				"IndiaGate","Daawat","Kohinoor","Fortune","BBRoyal","Patanjali",
				"24Mantra","TataSampann","SriLalitha","Royal","Unity","LalQilla",
				"Aeroplane","Charminar","DoubleHorse","SonaMasoori","Ponni",
				"OrganicIndia","PureAndSure","MoreChoice","RelianceSelect",
				"StarSelect","Spencers","Fresho","NatureFresh","HealthyHarvest",
				"FarmBest","GreenGrow","DailyFresh"
			};
			return brands;
		}

		if (productName == "wheatflour") {
			String brands[] = {
				"Aashirvaad","Fortune","Pillsbury","BBRoyal","Patanjali","24Mantra",
				"TataSampann","Annapurna","Sharbati","OrganicIndia","PureAndSure",
				"MoreChoice","RelianceSelect","StarSelect","Spencers","Fresho",
				"NatureFresh","HealthyHarvest","FarmBest","GreenGrow","DailyFresh",
				"GoldenHarvest","NutriChoice","HomeFresh","FreshMill","GrainMaster",
				"EcoFarm","PureGrains","HarvestGold"
			};
			return brands;
		}

		if (productName == "sugar") {
			String brands[] = {
				"Madhur","Trust","Dhampure","Patanjali","BBRoyal","24Mantra",
				"OrganicIndia","PureAndSure","MoreChoice","RelianceSelect",
				"StarSelect","Spencers","Fresho","NatureFresh","HealthyHarvest",
				"FarmBest","GreenGrow","DailyFresh","SweetCare","GoldenCrystal",
				"PureSweet","EcoSugar","FreshCrystal","HomeSweet","NutriSweet",
				"NaturalGold","CleanSweet","PureHarvest","SugarLite"
			};
			return brands;
		}

		if (productName == "salt") {
			String brands[] = {
				"TataSalt","Aashirvaad","Annapurna","Patanjali","BBRoyal","24Mantra",
				"OrganicIndia","PureAndSure","MoreChoice","RelianceSelect",
				"StarSelect","Spencers","Fresho","NatureFresh","HealthyHarvest",
				"FarmBest","GreenGrow","DailyFresh","RockSalt","HimalayanPink",
				"CrystalPure","EcoSalt","SeaFresh","NaturalGold","PureHarvest",
				"CleanSalt","HomeEssentials","NutriSalt","VitalSalt"
			};
			return brands;
		}

		if (productName == "tea") {
			String brands[] = {
				"TataTea","RedLabel","TajMahal","Tetley","Lipton","WaghBakri",
				"Society","Girnar","BrookeBond","Patanjali","OrganicIndia",
				"BBRoyal","24Mantra","MoreChoice","RelianceSelect","StarSelect",
				"Spencers","Fresho","NatureFresh","HealthyHarvest","AssamGold",
				"Darjeeling","Nilgiri","HerbalCare","GreenLeaf","EcoTea",
				"PureBrew","DailyBrew","FreshCup"
			};
			return brands;
		}

		if (productName == "coffee") {
			String brands[] = {
				"Nescafe","Bru","Continental","TataCoffee","BlueTokai","Davidoff",
				"CountryBean","SleepyOwl","Rage","Patanjali","OrganicIndia",
				"BBRoyal","24Mantra","MoreChoice","RelianceSelect","StarSelect",
				"Spencers","Fresho","NatureFresh","HealthyHarvest","CoorgGold",
				"Araku","Beanly","TrueBrew","EcoCoffee","PureRoast","DailyRoast",
				"FreshBeans","BoldBrew"
			};
			return brands;
		}

		if (productName == "biscuits") {
			String brands[] = {
				"Britannia","Parle","Sunfeast","MarieGold","GoodDay","HideAndSeek",
				"Oreo","Bourbon","LittleHearts","Patanjali","BBRoyal","MoreChoice",
				"RelianceSelect","StarSelect","Spencers","Fresho","NatureFresh",
				"HealthyHarvest","NutriChoice","DigestivePlus","MilkTreat",
				"ChocoFun","ButterCrunch","CreamyBite","GoldenBake","HomeFresh",
				"DailySnack","PureTreat","SnackTime"
			};
			return brands;
		}

		if (productName == "noodles") {
			String brands[] = {
				"Maggi","Yippee","TopRamen","Ching's","Knorr","WaiWai","Patanjali",
				"BBRoyal","MoreChoice","RelianceSelect","StarSelect","Spencers",
				"Fresho","NatureFresh","HealthyHarvest","WholeWheat","RiceNoodles",
				"VeggieBowl","NutriNoodles","QuickBite","HotServe","DailyMeal",
				"PureTaste","EcoFood","HomeStyle","FreshCook","InstantJoy",
				"SnackBowl","MealTime"
			};
			return brands;
		}

		if (productName == "pasta") {
			String brands[] = {
				"DelMonte","Maggi","Barilla","Borges","Disano","TataSampann",
				"BBRoyal","MoreChoice","RelianceSelect","StarSelect","Spencers",
				"Fresho","NatureFresh","HealthyHarvest","WholeWheat","DurumGold",
				"Italiano","ClassicBite","NutriPasta","QuickCook","DailyMeal",
				"PureTaste","EcoFood","HomeStyle","FreshCook","GoldenGrain",
				"ChefChoice","MealTime","PastaPro"
			};
			return brands;
		}

		if (productName == "cornflakes") {
			String brands[] = {
				"Kelloggs","Bagrrys","Saffola","Nestle","Patanjali","BBRoyal",
				"24Mantra","OrganicIndia","PureAndSure","MoreChoice",
				"RelianceSelect","StarSelect","Spencers","Fresho","NatureFresh",
				"HealthyHarvest","NutriStart","MorningBowl","GoldenCorn",
				"EcoFlakes","PureCrunch","HomeBreakfast","DailyBite",
				"FreshStart","PowerFlakes","CrunchyLite","FitBowl","CerealPlus"
			};
			return brands;
		}

		if (productName == "oats") {
			String brands[] = {
				"Quaker","Saffola","Bagrrys","Kelloggs","Patanjali","BBRoyal",
				"24Mantra","OrganicIndia","PureAndSure","MoreChoice",
				"RelianceSelect","StarSelect","Spencers","Fresho","NatureFresh",
				"HealthyHarvest","NutriStart","MorningBowl","GoldenOats",
				"EcoGrain","PureCrunch","HomeBreakfast","DailyBite",
				"FreshStart","PowerOats","FitBowl","CrunchyLite","OatPlus"
			};
			return brands;
		}

		if (productName == "honey") {
			String brands[] = {
				"Dabur","Patanjali","OrganicIndia","24Mantra","BBRoyal",
				"PureAndSure","MoreChoice","RelianceSelect","StarSelect",
				"Spencers","Fresho","NatureFresh","HealthyHarvest","FarmBest",
				"GreenGrow","DailyFresh","ForestGold","WildHoney","PureNectar",
				"EcoHoney","NaturalDrop","HomeHarvest","GoldenHive","NutriHoney",
				"FreshBee","CleanSweet","PureHarvest","HoneyCare","VitalHoney"
			};
			return brands;
		}

		if (productName == "jam") {
			String brands[] = {
				"Kissan","Mapro","MotherDairy","DelMonte","BBRoyal","MoreChoice",
				"RelianceSelect","StarSelect","Spencers","Fresho","NatureFresh",
				"HealthyHarvest","FruitSpread","BerryBlast","GoldenJam",
				"EcoFruit","PureSpread","HomeFresh","DailyToast","FreshBite",
				"NutriJam","SweetCare","ClassicFruit","MorningDelight",
				"PureHarvest","CleanFruit","FruitGold","JamJoy","SpreadTime"
			};
			return brands;
		}

		if (productName == "peanutbutter") {
			String brands[] = {
				"Sundrop","Pintola","MyFitness","DiSano","YogaBar","BBRoyal",
				"MoreChoice","RelianceSelect","StarSelect","Spencers","Fresho",
				"NatureFresh","HealthyHarvest","NutriButter","ProteinPlus",
				"CrunchyGold","EcoNut","PureSpread","HomeFitness","DailyPower",
				"FitFuel","FreshBite","CleanNut","NaturalProtein","PowerSpread",
				"MuscleFuel","PureHarvest","NutriCare","EnergyBoost"
			};
			return brands;
		}

		if (productName == "chocolate") {
			String brands[] = {
				"Cadbury","Nestle","Amul","Ferrero","Mars","Lindt","Hersheys",
				"Galaxy","Toblerone","Patanjali","BBRoyal","MoreChoice",
				"RelianceSelect","StarSelect","Spencers","Fresho","NatureFresh",
				"HealthyHarvest","DarkDelight","MilkMagic","ChocoTreat",
				"SweetBite","GoldenCocoa","EcoChoco","PureCocoa","HomeDelight",
				"DailyTreat","ChocoJoy","CocoaCraft"
			};
			return brands;
		}

		if (productName == "icecream") {
			String brands[] = {
				"Amul","MotherDairy","KwalityWalls","Vadilal","Havmor","Arun",
				"CreamBell","Naturals","BaskinRobbins","BBRoyal","MoreChoice",
				"RelianceSelect","StarSelect","Spencers","Fresho","NatureFresh",
				"HealthyHarvest","FrozenDelight","CreamyTreat","ChocoFreeze",
				"VanillaGold","EcoCream","PureMilk","HomeDessert","DailyScoop",
				"SweetFreeze","CoolBite","IceJoy","FrozenMagic"
			};
			return brands;
		}

		if (productName == "curd") {
			String brands[] = {
				"Amul","Nandini","MotherDairy","Heritage","Milma","Dodla",
				"Vijaya","Aavin","BBRoyal","MoreChoice","RelianceSelect",
				"StarSelect","Spencers","Fresho","NatureFresh","HealthyHarvest",
				"FarmBest","GreenGrow","DailyFresh","PureMilk","EcoDairy",
				"HomeMade","FreshCulture","NaturalSet","CleanDairy","NutriCurd",
				"PureHarvest","DairyGold","VitalDairy"
			};
			return brands;
		}

		if (productName == "paneer") {
			String brands[] = {
				"Amul","MotherDairy","Nandini","MilkyMist","Heritage","Vijaya",
				"Aavin","BBRoyal","MoreChoice","RelianceSelect","StarSelect",
				"Spencers","Fresho","NatureFresh","HealthyHarvest","FarmBest",
				"GreenGrow","DailyFresh","PureMilk","EcoDairy","HomeMade",
				"FreshBlock","NaturalPaneer","CleanDairy","NutriPaneer",
				"PureHarvest","DairyGold","ProteinFresh","VitalDairy"
			};
			return brands;
		}

		if (productName == "cheese") {
			String brands[] = {
				"Amul","Britannia","MotherDairy","GoCheese","MilkyMist",
				"LaughingCow","BBRoyal","MoreChoice","RelianceSelect",
				"StarSelect","Spencers","Fresho","NatureFresh","HealthyHarvest",
				"PureMilk","EcoDairy","HomeMade","FreshSlice","NaturalCheese",
				"CleanDairy","NutriCheese","PureHarvest","DairyGold",
				"CreamyDelight","CheeseCraft","GoldenSlice","DailyDairy",
				"ProteinPlus","VitalDairy"
			};
			return brands;
		}

		if (productName == "butter") {
			String brands[] = {
				"Amul","Britannia","MotherDairy","MilkyMist","Nandini","Aavin",
				"BBRoyal","MoreChoice","RelianceSelect","StarSelect","Spencers",
				"Fresho","NatureFresh","HealthyHarvest","PureMilk","EcoDairy",
				"HomeMade","FreshCream","NaturalButter","CleanDairy",
				"NutriButter","PureHarvest","DairyGold","GoldenChurn",
				"DailyDairy","CreamyRich","FarmFresh","VitalDairy","ButterCraft"
			};
			return brands;
		}
		if (productName == "ghee") {
			String brands[] = {
				"Amul","Nandini","Aashirvaad","MotherDairy","Gowardhan","Patel",
				"Vijaya","Aavin","Milma","BBRoyal","MoreChoice","RelianceSelect",
				"StarSelect","Spencers","Fresho","NatureFresh","HealthyHarvest",
				"FarmBest","GreenGrow","DailyFresh","PureMilk","EcoDairy",
				"HomeMade","NaturalGhee","CleanDairy","NutriGhee","PureHarvest",
				"DairyGold","VitalDairy"
			};
			return brands;
		}

		if (productName == "bread") {
			String brands[] = {
				"Britannia","Modern","HarvestGold","EnglishOven","Bonn","Elite",
				"Lords","Nilgiris","BBRoyal","MoreChoice","RelianceSelect",
				"StarSelect","Spencers","Fresho","NatureFresh","HealthyHarvest",
				"DailyBread","WholeWheat","BrownBake","FreshLoaf","HomeBake",
				"GoldenCrust","PureBake","NutriBread","SoftSlice","BakeHouse",
				"FarmFresh","BreadCraft","VitalBake"
			};
			return brands;
		}

		if (productName == "butter") {
			String brands[] = {
				"Amul","Britannia","MotherDairy","MilkyMist","Nandini","Aavin",
				"BBRoyal","MoreChoice","RelianceSelect","StarSelect","Spencers",
				"Fresho","NatureFresh","HealthyHarvest","PureMilk","EcoDairy",
				"HomeMade","FreshCream","NaturalButter","CleanDairy","NutriButter",
				"PureHarvest","DairyGold","GoldenChurn","DailyDairy","CreamyRich",
				"FarmFresh","VitalDairy","ButterCraft"
			};
			return brands;
		}

		if (productName == "softdrink") {
			String brands[] = {
				"CocaCola","Pepsi","Sprite","Fanta","ThumsUp","Limca","7Up",
				"Mirinda","MountainDew","AppyFizz","Maaza","Slice","Frooti",
				"RedBull","Sting","PaperBoat","BNatural","MinuteMaid",
				"BBRoyal","RelianceSelect","StarSelect","Spencers","Fresho",
				"NatureFresh","CoolFizz","FreshSip","DailyDrink","PureFizz",
				"DrinkCraft"
			};
			return brands;
		}

		if (productName == "fruitjuice") {
			String brands[] = {
				"Tropicana","Real","MinuteMaid","BNatural","PaperBoat","DelMonte",
				"Dabur","Patanjali","Frooti","Slice","Maaza","BBRoyal",
				"MoreChoice","RelianceSelect","StarSelect","Spencers","Fresho",
				"NatureFresh","HealthyHarvest","FruitDrop","PureJuice",
				"FreshSip","DailyDrink","NutriJuice","EcoDrink","HomePress",
				"NaturalSip","JuiceCraft","VitalDrink"
			};
			return brands;
		}

		if (productName == "chips") {
			String brands[] = {
				"Lays","Bingo","UncleChips","TooYumm","Pringles","Haldirams",
				"Balaji","Kurkure","Doritos","BBRoyal","MoreChoice",
				"RelianceSelect","StarSelect","Spencers","Fresho","NatureFresh",
				"HealthyHarvest","CrunchyBite","SnackTime","GoldenCrunch",
				"PureSnack","EcoSnack","HomeStyle","DailySnack","NutriChips",
				"FreshCrunch","SnackCraft","TastyTreat","VitalSnack"
			};
			return brands;
		}

		if (productName == "namkeen") {
			String brands[] = {
				"Haldirams","Bikaji","Balaji","MTR","Aachi","Priya","Garden",
				"ShreeRatnam","BBRoyal","MoreChoice","RelianceSelect",
				"StarSelect","Spencers","Fresho","NatureFresh","HealthyHarvest",
				"SnackTime","GoldenSnack","PureSnack","EcoSnack","HomeStyle",
				"DailySnack","CrunchyMix","NutriNamkeen","FreshBite",
				"SnackCraft","TastyTreat","VitalSnack","ClassicMix"
			};
			return brands;
		}

		if (productName == "toothpaste") {
			String brands[] = {
				"Colgate","Pepsodent","CloseUp","Sensodyne","DaburRed","Meswak",
				"Patanjali","Himalaya","Vicco","OralB","BBRoyal","MoreChoice",
				"RelianceSelect","StarSelect","Spencers","FreshMint",
				"NatureCare","HealthySmile","PureWhite","EcoCare","HomeDental",
				"DailyClean","HerbalFresh","StrongTeeth","CleanBite",
				"DentalPlus","SmileCare","VitalDental","ToothCraft"
			};
			return brands;
		}

		if (productName == "toothbrush") {
			String brands[] = {
				"Colgate","OralB","Sensodyne","Pepsodent","CloseUp","Listerine",
				"Patanjali","Himalaya","BBRoyal","MoreChoice","RelianceSelect",
				"StarSelect","Spencers","FreshMint","NatureCare","HealthySmile",
				"PureWhite","EcoCare","HomeDental","DailyClean","SoftBristle",
				"StrongClean","DentalPlus","SmileCare","GentleTouch",
				"CleanBite","VitalDental","BrushCraft","ToothCare"
			};
			return brands;
		}

		if (productName == "detergentpowder") {
			String brands[] = {
				"SurfExcel","Ariel","Tide","Rin","Wheel","Ghadi","Nirma",
				"Fena","Henko","BBRoyal","MoreChoice","RelianceSelect",
				"StarSelect","Spencers","CleanMate","PowerWash","FreshWash",
				"PureWash","EcoWash","HomeWash","DailyWash","BrightClean",
				"WhitePlus","Sparkle","UltraWash","MaxClean","WashCraft",
				"VitalWash","ClothCare"
			};
			return brands;
		}

		if (productName == "dishwashliquid") {
			String brands[] = {
				"Vim","Pril","Exo","Giffy","Vissco","BBRoyal","MoreChoice",
				"RelianceSelect","StarSelect","Spencers","Fresho","NatureFresh",
				"HealthyHarvest","CleanDish","PowerClean","FreshWash","PureWash",
				"EcoWash","HomeClean","DailyClean","Sparkle","UltraClean",
				"MaxClean","ShinePlus","DishCare","WashCraft","SafeClean",
				"HygienePlus","KitchenCare"
			};
			return brands;
		}

		if (productName == "mosquitorepellent") {
			String brands[] = {
				"GoodKnight","AllOut","Mortein","Maxo","Hit","Dabur",
				"Patanjali","BBRoyal","MoreChoice","RelianceSelect",
				"StarSelect","Spencers","SafeHome","EcoGuard","NatureShield",
				"HealthyHome","PureGuard","DailyProtect","FreshAir",
				"HerbalShield","CleanHome","InsectCare","HomeShield",
				"MosquitoGuard","VitalProtect","SafeLiving","ShieldPlus",
				"RepelCare","HomeCare"
			};
			return brands;
		}

		if (productName == "tissuepaper") {
			String brands[] = {
				"Origami","Paseo","Presto","Scott","Kleenex","BBRoyal",
				"MoreChoice","RelianceSelect","StarSelect","Spencers","Fresho",
				"NatureFresh","SoftTouch","PureSoft","EcoPaper","HomeEssentials",
				"DailyCare","FreshFeel","GentleTouch","CleanWipe","UltraSoft",
				"MaxSoft","ComfortCare","HygienePlus","PaperCraft",
				"SmoothCare","SafeWipe","TissueCare","VitalSoft"
			};
			return brands;
		}

		if (productName == "matchbox") {
			String brands[] = {
				"Ship","Camel","Cycle","Lion","Anchor","Star","Flame",
				"Spark","Safety","BBRoyal","MoreChoice","RelianceSelect",
				"StarSelect","Spencers","SafeStrike","QuickLight","EasyFire",
				"PureFlame","EcoLight","HomeEssentials","DailyUse","StrongStrike",
				"CleanBurn","FireCraft","LightEase","SureFire","BrightSpark",
				"FlamePlus","MatchCare"
			};
			return brands;
		}
		if (productName == "incensestick") {
			String brands[] = {
				"Cycle","Mangaldeep","ZedBlack","Moksh","Balaji","Patanjali",
				"Hem","Goloka","Phool","BBRoyal","MoreChoice","RelianceSelect",
				"StarSelect","Spencers","Fresho","NatureFresh","DivineAura",
				"PureFragrance","EcoAgarbatti","HomeEssentials","DailyPooja",
				"SpiritualTouch","SacredFlame","AromaPlus","CalmMind",
				"FreshVibes","PeaceCare","PoojaCraft","VitalAroma"
			};
			return brands;
		}

		if (productName == "camphor") {
			String brands[] = {
				"Mangaldeep","Patanjali","Cycle","ZedBlack","Balaji",
				"BBRoyal","MoreChoice","RelianceSelect","StarSelect","Spencers",
				"Fresho","NatureFresh","PureCamphor","EcoPooja","HomeEssentials",
				"DailyPooja","DivineCare","SacredTouch","CleanBurn",
				"FreshFlame","CalmMind","SpiritualCare","AromaPlus",
				"PeaceCare","PoojaCraft","PureHarvest","VitalAroma",
				"HolyEssence","DevotionCare"
			};
			return brands;
		}

		if (productName == "turmericpowder") {
			String brands[] = {
				"Aashirvaad","TataSampann","MTR","Aachi","Everest","MDH",
				"Catch","Eastern","Sakthi","BBRoyal","MoreChoice",
				"RelianceSelect","StarSelect","Spencers","Fresho","NatureFresh",
				"OrganicIndia","24Mantra","Patanjali","PureSpice","EcoSpice",
				"HomeKitchen","DailyMasala","GoldenSpice","FreshGrind",
				"SpiceCraft","HealthyHarvest","FarmBest","VitalSpice"
			};
			return brands;
		}

		if (productName == "chillipowder") {
			String brands[] = {
				"Everest","MDH","Aachi","MTR","Sakthi","Catch",
				"Eastern","TataSampann","BBRoyal","MoreChoice",
				"RelianceSelect","StarSelect","Spencers","Fresho","NatureFresh",
				"OrganicIndia","24Mantra","Patanjali","PureSpice","EcoSpice",
				"HomeKitchen","DailyMasala","HotRed","FreshGrind",
				"SpiceCraft","HealthyHarvest","FarmBest","FireTaste","VitalSpice"
			};
			return brands;
		}

		if (productName == "corianderpowder") {
			String brands[] = {
				"Aashirvaad","Everest","MDH","MTR","Aachi","Catch",
				"Eastern","TataSampann","BBRoyal","MoreChoice",
				"RelianceSelect","StarSelect","Spencers","Fresho","NatureFresh",
				"OrganicIndia","24Mantra","Patanjali","PureSpice","EcoSpice",
				"HomeKitchen","DailyMasala","FreshGrind","SpiceCraft",
				"HealthyHarvest","FarmBest","AromaRich","NaturalTaste","VitalSpice"
			};
			return brands;
		}

		if (productName == "garammasala") {
			String brands[] = {
				"Everest","MDH","Catch","MTR","Aachi","Eastern",
				"TataSampann","BBRoyal","MoreChoice","RelianceSelect",
				"StarSelect","Spencers","Fresho","NatureFresh","OrganicIndia",
				"24Mantra","Patanjali","PureSpice","EcoSpice","HomeKitchen",
				"DailyMasala","RoyalBlend","FreshGrind","SpiceCraft",
				"HealthyHarvest","FarmBest","AromaMix","NaturalBlend","VitalSpice"
			};
			return brands;
		}

		if (productName == "pepperpowder") {
			String brands[] = {
				"Catch","Everest","MDH","MTR","Aachi","Eastern",
				"TataSampann","BBRoyal","MoreChoice","RelianceSelect",
				"StarSelect","Spencers","Fresho","NatureFresh","OrganicIndia",
				"24Mantra","Patanjali","PureSpice","EcoSpice","HomeKitchen",
				"DailyMasala","FreshGrind","SpiceCraft","HealthyHarvest",
				"FarmBest","StrongAroma","NaturalHeat","BoldTaste","VitalSpice"
			};
			return brands;
		}

		if (productName == "cuminseeds") {
			String brands[] = {
				"Everest","MDH","Catch","Aachi","MTR","Eastern",
				"TataSampann","BBRoyal","MoreChoice","RelianceSelect",
				"StarSelect","Spencers","Fresho","NatureFresh","OrganicIndia",
				"24Mantra","Patanjali","PureSeed","EcoSpice","HomeKitchen",
				"DailyMasala","FreshGrain","SpiceCraft","HealthyHarvest",
				"FarmBest","NaturalSeed","BoldAroma","SeedCare","VitalSpice"
			};
			return brands;
		}

		if (productName == "mustardseeds") {
			String brands[] = {
				"Everest","MDH","Catch","Aachi","MTR","Eastern",
				"TataSampann","BBRoyal","MoreChoice","RelianceSelect",
				"StarSelect","Spencers","Fresho","NatureFresh","OrganicIndia",
				"24Mantra","Patanjali","PureSeed","EcoSpice","HomeKitchen",
				"DailyMasala","FreshGrain","SpiceCraft","HealthyHarvest",
				"FarmBest","NaturalSeed","StrongTaste","SeedCare","VitalSpice"
			};
			return brands;
		}

		if (productName == "bakingpowder") {
			String brands[] = {
				"Weikfield","DoubleActing","UrbanPlatter","BBRoyal","MoreChoice",
				"RelianceSelect","StarSelect","Spencers","Fresho","NatureFresh",
				"HealthyHarvest","PureBake","EcoBake","HomeBaking","DailyBake",
				"FreshRise","BakerChoice","GoldenBake","SoftRise","CakeCare",
				"BakingCraft","NutriBake","EasyBake","BakePro","RisePlus",
				"ChefBake","PerfectRise","BakeMate","VitalBake"
			};
			return brands;
		}

		if (productName == "bakingsoda") {
			String brands[] = {
				"Weikfield","Tata","UrbanPlatter","BBRoyal","MoreChoice",
				"RelianceSelect","StarSelect","Spencers","Fresho","NatureFresh",
				"HealthyHarvest","PureBake","EcoBake","HomeBaking","DailyBake",
				"CleanCook","BakerChoice","SoftRise","KitchenCare","BakeCraft",
				"NutriBake","EasyBake","BakePro","ChefBake","PerfectBake",
				"PureHarvest","FreshCook","BakeMate","VitalBake"
			};
			return brands;
		}

		if (productName == "custardpowder") {
			String brands[] = {
				"Weikfield","BrownPolson","Rafhan","BBRoyal","MoreChoice",
				"RelianceSelect","StarSelect","Spencers","Fresho","NatureFresh",
				"HealthyHarvest","SweetTreat","PureDessert","EcoDessert",
				"HomeKitchen","DailyDessert","FreshCream","DessertCraft",
				"VanillaDelight","CustardCare","NutriSweet","EasyCook",
				"DessertPro","ChefChoice","GoldenDessert","SweetBite",
				"DessertJoy","CreamyMix","VitalSweet"
			};
			return brands;
		}

		if (productName == "jelly") {
			String brands[] = {
				"Weikfield","Mapro","UrbanPlatter","BBRoyal","MoreChoice",
				"RelianceSelect","StarSelect","Spencers","Fresho","NatureFresh",
				"HealthyHarvest","SweetTreat","FruitGel","PureDessert",
				"EcoDessert","HomeKitchen","DailyDessert","FreshFruit",
				"DessertCraft","NutriSweet","EasyCook","DessertPro",
				"ChefChoice","GoldenDessert","SweetBite","DessertJoy",
				"JellyFun","FruitDelight","VitalSweet"
			};
			return brands;
		}

		if (productName == "sauce") {
			String brands[] = {
				"Maggi","Kissan","Veeba","DelMonte","Heinz","Chings",
				"BBRoyal","MoreChoice","RelianceSelect","StarSelect","Spencers",
				"Fresho","NatureFresh","HealthyHarvest","PureTaste","EcoFood",
				"HomeKitchen","DailyMeal","FreshDip","SauceCraft","NutriSauce",
				"EasyCook","ChefChoice","GoldenTaste","FlavorPlus","FoodJoy",
				"PureHarvest","TasteCare","VitalSauce"
			};
			return brands;
		}

		if (productName == "ketchup") {
			String brands[] = {
				"Maggi","Kissan","Heinz","DelMonte","Veeba","Chings",
				"BBRoyal","MoreChoice","RelianceSelect","StarSelect","Spencers",
				"Fresho","NatureFresh","HealthyHarvest","PureTaste","EcoFood",
				"HomeKitchen","DailyMeal","FreshDip","SauceCraft","NutriSauce",
				"EasyCook","ChefChoice","GoldenTaste","FlavorPlus","FoodJoy",
				"PureHarvest","TasteCare","VitalSauce"
			};
			return brands;
		}

		if (productName == "mayonnaise") {
			String brands[] = {
				"Veeba","DelMonte","DrOetker","FunFoods","Heinz","UrbanPlatter",
				"BBRoyal","MoreChoice","RelianceSelect","StarSelect","Spencers",
				"Fresho","NatureFresh","HealthyHarvest","CreamyDip","PureTaste",
				"EcoFood","HomeKitchen","DailyMeal","FreshSpread","DipCraft",
				"NutriDip","EasyCook","ChefChoice","GoldenTaste","FoodJoy",
				"PureHarvest","TasteCare","VitalDip"
			};
			return brands;
		}

		if (productName == "pickle") {
			String brands[] = {
				"Priya","MotherRecipe","MTR","Aachi","Eastern","Patanjali",
				"BBRoyal","MoreChoice","RelianceSelect","StarSelect","Spencers",
				"Fresho","NatureFresh","HealthyHarvest","PureTaste","EcoFood",
				"HomeKitchen","DailyMeal","TraditionalTaste","PickleCraft",
				"NutriPickle","EasyCook","ChefChoice","GoldenTaste","FlavorPlus",
				"FoodJoy","PureHarvest","TasteCare","VitalPickle"
			};
			return brands;
		}

		if (productName == "chutney") {
			String brands[] = {
				"MTR","Aachi","Eastern","Priya","Patanjali","UrbanPlatter",
				"BBRoyal","MoreChoice","RelianceSelect","StarSelect","Spencers",
				"Fresho","NatureFresh","HealthyHarvest","PureTaste","EcoFood",
				"HomeKitchen","DailyMeal","FreshGrind","ChutneyCraft",
				"NutriChutney","EasyCook","ChefChoice","GoldenTaste","FlavorPlus",
				"FoodJoy","PureHarvest","TasteCare","VitalChutney"
			};
			return brands;
		}
		if (productName == "frozenpeas") {
			String brands[] = {
				"Safal","Fresho","BBRoyal","RelianceSelect","MoreChoice","Spencers",
				"GodrejYummiez","ITCFrozen","McCain","Sumeru","Prasuma","AlKabeer",
				"DailyFresh","NatureFresh","HealthyHarvest","FarmBest","GreenGrow",
				"PureVeg","EcoFarm","HomeHarvest","FreshField","VeggieDelight",
				"CoolFresh","NutriVeg","FrozenFarm","HarvestGold","VegCraft",
				"VitalVeg","ArcticFresh"
			};
			return brands;
		}

		if (productName == "frozencorn") {
			String brands[] = {
				"Safal","Fresho","BBRoyal","RelianceSelect","MoreChoice","Spencers",
				"McCain","GodrejYummiez","ITCFrozen","Sumeru","Prasuma","AlKabeer",
				"DailyFresh","NatureFresh","HealthyHarvest","FarmBest","GreenGrow",
				"PureVeg","EcoFarm","HomeHarvest","FreshField","VeggieDelight",
				"CoolFresh","NutriVeg","FrozenFarm","HarvestGold","VegCraft",
				"VitalVeg","ArcticFresh"
			};
			return brands;
		}

		if (productName == "frozenparatha") {
			String brands[] = {
				"ITC","Haldirams","McCain","IDFresh","Tasties","Prasuma",
				"AlKabeer","GodrejYummiez","Sumeru","Safal","BBRoyal",
				"RelianceSelect","MoreChoice","Spencers","DailyFresh",
				"NatureFresh","HealthyHarvest","HomeKitchen","PureTaste",
				"EcoFood","FreshBake","MealTime","QuickServe","GoldenGrain",
				"ParathaCraft","NutriMeal","FamilyPack","FrozenDelight","VitalMeal"
			};
			return brands;
		}

		if (productName == "frozensnack") {
			String brands[] = {
				"McCain","Haldirams","ITC","GodrejYummiez","Prasuma","AlKabeer",
				"Sumeru","Safal","IDFresh","BBRoyal","RelianceSelect","MoreChoice",
				"Spencers","DailyFresh","NatureFresh","HealthyHarvest","PureTaste",
				"EcoFood","HomeKitchen","SnackTime","QuickBite","CrispyTreat",
				"GoldenSnack","NutriSnack","FrozenFun","SnackCraft","FamilyPack",
				"FreshFry","VitalSnack"
			};
			return brands;
		}

		if (productName == "tofu") {
			String brands[] = {
				"Nutrela","UrbanPlatter","BBRoyal","Fresho","RelianceSelect",
				"MoreChoice","Spencers","OrganicIndia","24Mantra","Patanjali",
				"Vezlay","HelloTempayy","GoodDot","SoyFresh","DailyFresh",
				"NatureFresh","HealthyHarvest","PurePlant","EcoFood","HomeKitchen",
				"ProteinPlus","PlantPower","NutriVeg","FreshBlock","TofuCraft",
				"VitalProtein","GreenBite","PlantCare","PureHarvest"
			};
			return brands;
		}

		if (productName == "soyachunks") {
			String brands[] = {
				"Nutrela","Patanjali","BBRoyal","RelianceSelect","MoreChoice",
				"Spencers","24Mantra","OrganicIndia","Saffola","Vezlay",
				"GoodDot","UrbanPlatter","DailyFresh","NatureFresh",
				"HealthyHarvest","PurePlant","EcoFood","HomeKitchen",
				"ProteinPlus","PlantPower","NutriVeg","FreshBite","SoyCraft",
				"VitalProtein","GreenBite","PlantCare","PureHarvest","FitMeal","PowerVeg"
			};
			return brands;
		}

		if (productName == "soyabeans") {
			String brands[] = {
				"Nutrela","Patanjali","24Mantra","OrganicIndia","BBRoyal",
				"RelianceSelect","MoreChoice","Spencers","UrbanPlatter",
				"DailyFresh","NatureFresh","HealthyHarvest","PurePlant",
				"EcoFood","HomeKitchen","ProteinPlus","PlantPower","NutriVeg",
				"FreshGrain","SoyCraft","VitalProtein","GreenBite","PlantCare",
				"PureHarvest","FitMeal","PowerVeg","GrainMaster","FarmBest","EcoGrains"
			};
			return brands;
		}

		if (productName == "dryfruits") {
			String brands[] = {
				"Farmley","Happilo","Nutraj","BBRoyal","RelianceSelect",
				"MoreChoice","Spencers","UrbanPlatter","24Mantra","OrganicIndia",
				"DailyFresh","NatureFresh","HealthyHarvest","PureNut","EcoFarm",
				"HomeHarvest","NutriBite","FreshPack","DryFruitKing","NutCraft",
				"VitalNuts","GoldenNut","SnackCare","PureHarvest","FitSnack",
				"PowerNut","FarmBest","GreenGrow","NatureBite"
			};
			return brands;
		}

		if (productName == "cashew") {
			String brands[] = {
				"Farmley","Happilo","Nutraj","BBRoyal","RelianceSelect",
				"MoreChoice","Spencers","UrbanPlatter","24Mantra","OrganicIndia",
				"DailyFresh","NatureFresh","HealthyHarvest","PureNut","EcoFarm",
				"HomeHarvest","NutriBite","FreshPack","CashewKing","NutCraft",
				"VitalNuts","GoldenNut","SnackCare","PureHarvest","FitSnack",
				"PowerNut","FarmBest","GreenGrow","NatureBite"
			};
			return brands;
		}

		if (productName == "almond") {
			String brands[] = {
				"Farmley","Happilo","Nutraj","BBRoyal","RelianceSelect",
				"MoreChoice","Spencers","UrbanPlatter","24Mantra","OrganicIndia",
				"DailyFresh","NatureFresh","HealthyHarvest","PureNut","EcoFarm",
				"HomeHarvest","NutriBite","FreshPack","AlmondKing","NutCraft",
				"VitalNuts","GoldenNut","SnackCare","PureHarvest","FitSnack",
				"PowerNut","FarmBest","GreenGrow","NatureBite"
			};
			return brands;
		}

		if (productName == "raisin") {
			String brands[] = {
				"Farmley","Happilo","Nutraj","BBRoyal","RelianceSelect",
				"MoreChoice","Spencers","UrbanPlatter","24Mantra","OrganicIndia",
				"DailyFresh","NatureFresh","HealthyHarvest","PureNut","EcoFarm",
				"HomeHarvest","NutriBite","FreshPack","RaisinKing","NutCraft",
				"VitalNuts","GoldenNut","SnackCare","PureHarvest","FitSnack",
				"PowerNut","FarmBest","GreenGrow","NatureBite"
			};
			return brands;
		}

		if (productName == "pistachio") {
			String brands[] = {
				"Farmley","Happilo","Nutraj","BBRoyal","RelianceSelect",
				"MoreChoice","Spencers","UrbanPlatter","24Mantra","OrganicIndia",
				"DailyFresh","NatureFresh","HealthyHarvest","PureNut","EcoFarm",
				"HomeHarvest","NutriBite","FreshPack","PistaKing","NutCraft",
				"VitalNuts","GoldenNut","SnackCare","PureHarvest","FitSnack",
				"PowerNut","FarmBest","GreenGrow","NatureBite"
			};
			return brands;
		}

		if (productName == "walnut") {
			String brands[] = {
				"Farmley","Happilo","Nutraj","BBRoyal","RelianceSelect",
				"MoreChoice","Spencers","UrbanPlatter","24Mantra","OrganicIndia",
				"DailyFresh","NatureFresh","HealthyHarvest","PureNut","EcoFarm",
				"HomeHarvest","NutriBite","FreshPack","WalnutKing","NutCraft",
				"VitalNuts","GoldenNut","SnackCare","PureHarvest","FitSnack",
				"PowerNut","FarmBest","GreenGrow","NatureBite"
			};
			return brands;
		}

		if (productName == "date") {
			String brands[] = {
				"LionDates","Happilo","Farmley","BBRoyal","RelianceSelect",
				"MoreChoice","Spencers","UrbanPlatter","24Mantra","OrganicIndia",
				"DailyFresh","NatureFresh","HealthyHarvest","PureFruit","EcoFarm",
				"HomeHarvest","NutriBite","FreshPack","DateKing","FruitCraft",
				"VitalFruit","GoldenDate","SnackCare","PureHarvest","FitSnack",
				"PowerFruit","FarmBest","GreenGrow","NatureBite"
			};
			return brands;
		}

		if (productName == "fig") {
			String brands[] = {
				"Happilo","Farmley","Nutraj","BBRoyal","RelianceSelect",
				"MoreChoice","Spencers","UrbanPlatter","24Mantra","OrganicIndia",
				"DailyFresh","NatureFresh","HealthyHarvest","PureFruit","EcoFarm",
				"HomeHarvest","NutriBite","FreshPack","FigKing","FruitCraft",
				"VitalFruit","GoldenFig","SnackCare","PureHarvest","FitSnack",
				"PowerFruit","FarmBest","GreenGrow","NatureBite"
			};
			return brands;
		}

		if (productName == "apple") {
			String brands[] = {
				"Washington","Kinnaur","Fresho","BBRoyal","RelianceSelect",
				"MoreChoice","Spencers","Safal","DailyFresh","NatureFresh",
				"HealthyHarvest","FarmBest","GreenGrow","PureFruit","EcoFarm",
				"HomeHarvest","FreshField","FruitDelight","AppleKing","OrchardFresh",
				"VitalFruit","GoldenApple","SeasonBest","PureHarvest","JuicyBite",
				"FruitCraft","GardenPick","NatureBite","FarmSelect"
			};
			return brands;
		}

		if (productName == "banana") {
			String brands[] = {
				"Yelakki","Robusta","Fresho","BBRoyal","RelianceSelect",
				"MoreChoice","Spencers","Safal","DailyFresh","NatureFresh",
				"HealthyHarvest","FarmBest","GreenGrow","PureFruit","EcoFarm",
				"HomeHarvest","FreshField","FruitDelight","BananaKing","OrchardFresh",
				"VitalFruit","GoldenBanana","SeasonBest","PureHarvest","JuicyBite",
				"FruitCraft","GardenPick","NatureBite","FarmSelect"
			};
			return brands;
		}

		if (productName == "orange") {
			String brands[] = {
				"Nagpur","Fresho","BBRoyal","RelianceSelect","MoreChoice",
				"Spencers","Safal","DailyFresh","NatureFresh","HealthyHarvest",
				"FarmBest","GreenGrow","PureFruit","EcoFarm","HomeHarvest",
				"FreshField","FruitDelight","OrangeKing","OrchardFresh",
				"VitalFruit","GoldenOrange","SeasonBest","PureHarvest","JuicyBite",
				"FruitCraft","GardenPick","NatureBite","FarmSelect","CitrusFresh"
			};
			return brands;
		}

		if (productName == "mango") {
			String brands[] = {
				"Alphonso","Banganapalli","Dasheri","Fresho","BBRoyal",
				"RelianceSelect","MoreChoice","Spencers","Safal","DailyFresh",
				"NatureFresh","HealthyHarvest","FarmBest","GreenGrow","PureFruit",
				"EcoFarm","HomeHarvest","FreshField","FruitDelight","MangoKing",
				"OrchardFresh","VitalFruit","GoldenMango","SeasonBest","PureHarvest",
				"JuicyBite","FruitCraft","GardenPick","NatureBite"
			};
			return brands;
		}

		if (productName == "grape") {
			String brands[] = {
				"Thompson","Fresho","BBRoyal","RelianceSelect","MoreChoice",
				"Spencers","Safal","DailyFresh","NatureFresh","HealthyHarvest",
				"FarmBest","GreenGrow","PureFruit","EcoFarm","HomeHarvest",
				"FreshField","FruitDelight","GrapeKing","OrchardFresh",
				"VitalFruit","GoldenGrape","SeasonBest","PureHarvest","JuicyBite",
				"FruitCraft","GardenPick","NatureBite","FarmSelect","VineFresh"
			};
			return brands;
		}

		if (productName == "pineapple") {
			String brands[] = {
				"Queen","Fresho","BBRoyal","RelianceSelect","MoreChoice",
				"Spencers","Safal","DailyFresh","NatureFresh","HealthyHarvest",
				"FarmBest","GreenGrow","PureFruit","EcoFarm","HomeHarvest",
				"FreshField","FruitDelight","PineKing","OrchardFresh",
				"VitalFruit","GoldenPine","SeasonBest","PureHarvest","JuicyBite",
				"FruitCraft","GardenPick","NatureBite","FarmSelect","TropicFresh"
			};
			return brands;
		}

		if (productName == "papaya") {
			String brands[] = {
				"RedLady","Fresho","BBRoyal","RelianceSelect","MoreChoice",
				"Spencers","Safal","DailyFresh","NatureFresh","HealthyHarvest",
				"FarmBest","GreenGrow","PureFruit","EcoFarm","HomeHarvest",
				"FreshField","FruitDelight","PapayaKing","OrchardFresh",
				"VitalFruit","GoldenPapaya","SeasonBest","PureHarvest","JuicyBite",
				"FruitCraft","GardenPick","NatureBite","FarmSelect","TropicFresh"
			};
			return brands;
		}

		if (productName == "watermelon") {
			String brands[] = {
				"SugarBaby","Fresho","BBRoyal","RelianceSelect","MoreChoice",
				"Spencers","Safal","DailyFresh","NatureFresh","HealthyHarvest",
				"FarmBest","GreenGrow","PureFruit","EcoFarm","HomeHarvest",
				"FreshField","FruitDelight","MelonKing","OrchardFresh",
				"VitalFruit","GoldenMelon","SeasonBest","PureHarvest","JuicyBite",
				"FruitCraft","GardenPick","NatureBite","FarmSelect","SummerFresh"
			};
			return brands;
		}

		if (productName == "tomato") {
			String brands[] = {
				"Fresho","BBRoyal","RelianceSelect","MoreChoice","Spencers",
				"Safal","DailyFresh","NatureFresh","HealthyHarvest","FarmBest",
				"GreenGrow","PureVeg","EcoFarm","HomeHarvest","FreshField",
				"VeggieDelight","TomatoKing","GardenFresh","VitalVeg","GoldenRed",
				"SeasonBest","PureHarvest","JuicyVeg","VegCraft","NatureBite",
				"FarmSelect","FreshPick","DailyVeg","HarvestPro"
			};
			return brands;
		}

		if (productName == "potato") {
			String brands[] = {
				"Fresho","BBRoyal","RelianceSelect","MoreChoice","Spencers",
				"Safal","DailyFresh","NatureFresh","HealthyHarvest","FarmBest",
				"GreenGrow","PureVeg","EcoFarm","HomeHarvest","FreshField",
				"VeggieDelight","PotatoKing","GardenFresh","VitalVeg","GoldenSpud",
				"SeasonBest","PureHarvest","JuicyVeg","VegCraft","NatureBite",
				"FarmSelect","FreshPick","DailyVeg","HarvestPro"
			};
			return brands;
		}

		if (productName == "onion") {
			String brands[] = {
				"Fresho","BBRoyal","RelianceSelect","MoreChoice","Spencers",
				"Safal","DailyFresh","NatureFresh","HealthyHarvest","FarmBest",
				"GreenGrow","PureVeg","EcoFarm","HomeHarvest","FreshField",
				"VeggieDelight","OnionKing","GardenFresh","VitalVeg","GoldenBulb",
				"SeasonBest","PureHarvest","JuicyVeg","VegCraft","NatureBite",
				"FarmSelect","FreshPick","DailyVeg","HarvestPro"
			};
			return brands;
		}

		if (productName == "carrot") {
			String brands[] = {
				"Fresho","BBRoyal","RelianceSelect","MoreChoice","Spencers",
				"Safal","DailyFresh","NatureFresh","HealthyHarvest","FarmBest",
				"GreenGrow","PureVeg","EcoFarm","HomeHarvest","FreshField",
				"VeggieDelight","CarrotKing","GardenFresh","VitalVeg","GoldenRoot",
				"SeasonBest","PureHarvest","JuicyVeg","VegCraft","NatureBite",
				"FarmSelect","FreshPick","DailyVeg","HarvestPro"
			};
			return brands;
		}
		if (productName == "carrot") {
			String brands[] = {
				"Fresho","BBRoyal","RelianceSelect","MoreChoice","Spencers",
				"Safal","DailyFresh","NatureFresh","HealthyHarvest","FarmBest",
				"GreenGrow","PureVeg","EcoFarm","HomeHarvest","FreshField",
				"VeggieDelight","CarrotKing","GardenFresh","VitalVeg","GoldenRoot",
				"SeasonBest","PureHarvest","JuicyVeg","VegCraft","NatureBite",
				"FarmSelect","FreshPick","DailyVeg","HarvestPro"
			};
			return brands;
		}
		if (productName == "perfume") {
			String brands[] = {
				"Dior", "Chanel", "Gucci", "Calvin Klein", "Versace", "Armani", "Burberry", "Hugo Boss",
"Yardley", "Fogg", "Wild Stone", "Park Avenue", "Nivea", "Axe", "Engage", "Denver",
"Adidas", "Nike", "Revlon", "Titan Skinn", "Bella Vita", "Rasasi", "Ajmal", "Lattafa",
"Davidoff", "Jaguar", "Ferrari", "Mont Blanc", "Bvlgari", "Guess", "Zara",
"Victoria's Secret", "Elizabeth Arden", "Paco Rabanne", "Tommy Hilfiger",
"United Colors of Benetton", "The Body Shop"
			};
			return brands;
		}
		if (productName == "facePowder") {
			String brands[] = {
				"Lakme", "L'Oreal Paris", "Garnier", "Pond's", "Mamaearth", "Plum",
"Minimalist", "The Derma Co", "Wow Skin Science", "Himalaya",
"Biotique", "Nivea", "Olay", "Neutrogena", "Cetaphil",
"Dot & Key", "Pilgrim", "Good Vibes", "Swiss Beauty",
"Maybelline", "Revlon", "Nykaa Naturals", "Lotus Herbals",
"Faces Canada", "Sugar Cosmetics", "Iba Halal Care",
"Oriflame", "Avon", "Kaya", "The Body Shop"
			};
			return brands;
		}
		
		if (productName == "serum") {
			String brands[] = {
				"Lakme", "L'Oreal Paris", "Garnier", "Pond's", "Mamaearth", "Plum",
"Minimalist", "The Derma Co", "Wow Skin Science", "Himalaya",
"Biotique", "Nivea", "Olay", "Neutrogena", "Cetaphil",
"Dot & Key", "Pilgrim", "Good Vibes", "Swiss Beauty",
"Maybelline", "Revlon", "Nykaa Naturals", "Lotus Herbals",
"Faces Canada", "Sugar Cosmetics", "Iba Halal Care",
"Oriflame", "Avon", "Kaya", "The Body Shop"
			};
			return brands;
		}
		if(productName == "bodylotion"){
		
		String[] bodyLotionBrands = {
"Vaseline", "Nivea", "Dove", "Pond's", "Himalaya",
"Parachute Advansed", "Joy", "Boroplus", "Garnier",
"Johnson's", "Mamaearth", "Wow Skin Science", "Biotique",
"Lotus Herbals", "Olay", "Neutrogena", "Cetaphil",
"The Body Shop", "Plum", "Minimalist",
"Vaseline Intensive Care", "Nivea Soft",
"Vaseline Cocoa Glow", "Dove Nourishing Secrets",
"Vaseline Aloe Fresh", "Yardley London", "Fiama",
"Patanjali", "Santoor", "Palmolive", "Lacto Calamine",
"Bella Vita", "Oriflame", "Avon", "Khadi Natural",
"VLCC", "Forest Essentials"
        };
		
		return bodyLotionBrands;
		}
		
		
		return null;
		
		}
    }


  

