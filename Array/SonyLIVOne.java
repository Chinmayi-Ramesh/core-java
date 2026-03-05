class SonyLIVOne {

    public static void main(String args[]) {

        String appName = "SonyLIV";

        String languages[] = {
            "English", "Hindi", "Telugu",
            "Tamil", "Kannada", "Malayalam"
        };

        String englishShows[] = {
            "Shark Tank US", "The Good Doctor", "Seinfeld", "Lincoln Rhyme", "For Life",
            "Counterpart", "Mad About You", "Community", "The Goldbergs", "Dawson's Creek",
            "Damages", "Rescue Me", "The Shield", "Justified", "Masters of Sex",
            "Atypical", "The Blacklist", "S.W.A.T.", "Power", "Outlander",
            "The Tudors", "Hannibal", "Unforgettable", "Pan Am", "Made in Jersey",
            "Common Law", "Men at Work", "The Mob Doctor", "Last Resort", "Player"
        };

        String hindiShows[] = {
            "Scam 1992", "Shark Tank India", "Maharani", "Rocket Boys", "Gullak",
            "Kathmandu Connection", "Tanaav", "JL50", "Undekhi", "Avrodh",
            "Jehanabad", "Your Honor", "College Romance", "Girls Hostel", "Pitchers",
            "Aashram", "The Sony Show", "Crime Patrol", "CID", "Taarak Mehta",
            "Indian Idol", "KBC", "The Kapil Sharma Show", "Super Dancer", "MasterChef India",
            "Tenali Rama", "Aladdin", "Baalveer", "Vighnaharta Ganesh", "Mere Sai"
        };

        String teluguShows[] = {
            "Scam 1992 Telugu", "Telugu Indian Idol", "Nenu Student Sir", "Iru Dhuruvam", "Kudirithe Cup Coffee",
            "Meet Cute", "Oke Oka Jeevitham", "Gatham", "Mail", "30 Weds 21",
            "Agent Anand Santosh", "Anya’s Tutorial", "Recce", "Maa Neella Tank", "Hello World",
            "Parampara", "9 Hours", "Loser", "Chaduvulu", "Puli Meka",
            "Kinnerasani", "Gaalivana", "Maya Bazaar", "Vyooham", "Dhootha",
            "Save the Tigers", "Shaitan", "Angry Biryani", "Atm", "Kumari Srimathi"
        };

        String tamilShows[] = {
            "Story of Things", "Tamil Rockerz", "Iru Dhuruvam", "Victim", "Meme Boys",
            "Accidental Farmer", "Kana Kaanum Kaalangal", "Rettai Roja", "Ayali", "Engga Hostel",
            "Kalyanam Mudhal", "Madras Mansion", "Sathya", "Auto Shankar", "Live Telecast",
            "November Story", "Mathagam", "Label", "Cheran’s Journey", "Heartbeat",
            "Vilangu", "Vadhandhi", "Suzhal", "Ayali", "Thalaivettiyaan Paalayam",
            "Anantham", "Five Six Seven Eight", "Putham Pudhu Kaalai", "Kuruthi Kalam", "Time Enna Boss"
        };

        String kannadaShows[] = {
            "Family Pack", "Gili Gili Gilli", "Humble Politician", "Katheyondhu Shuruvagide", "Kannadathi",
            "Gattimela", "Jothe Jotheyali", "Paaru", "Kamali", "Naagini 2",
            "Satya", "Manasaare", "Mathe Vasantha", "Kavyanjali", "Nammane Yuvarani",
            "Ginirama", "Hoo Male", "Yediyuru Siddhalingeshwara", "Shantham Paapam", "Majaa Talkies",
            "Gicchi Gili Gili", "Dancing Champion", "Comedy Khiladigalu", "Sa Re Ga Ma Pa", "Drama Juniors",
            "Mahanayaka", "Punyavathi", "Tripura Sundari", "Kendasampige", "Bhagyalakshmi"
        };

        String malayalamShows[] = {
            "Antakshari", "Eesho", "Appan", "Priyan Ottathilaanu", "Malayankunju",
            "Sundari Gardens", "Wonder Women", "1001 Nunakal", "Purusha Pretham", "Padmini",
            "Nalla Nilavulla Rathri", "Chathuram", "Salute", "Freedom Fight", "Kaanekkaane",
            "Bheeshma Parvam", "Hridayam", "Bro Daddy", "Kurup", "Home",
            "Malik", "Minnal Murali", "The Priest", "Drishyam 2", "Joji",
            "Kuruthi", "Thinkalazhcha Nishchayam", "Nayattu", "Operation Java", "Wolf"
        };

        System.out.println("App name is " + appName);

        System.out.println("\nAvailable Languages:");
        String lang1 = languages[0]; System.out.println(lang1);
        String lang2 = languages[1]; System.out.println(lang2);
        String lang3 = languages[2]; System.out.println(lang3);
        String lang4 = languages[3]; System.out.println(lang4);
        String lang5 = languages[4]; System.out.println(lang5);
        String lang6 = languages[5]; System.out.println(lang6);

        System.out.println("\nEnglish Shows:");
        String SharkTankUS = englishShows[0]; System.out.println(SharkTankUS);
        String GoodDoctor = englishShows[1]; System.out.println(GoodDoctor);
        String Seinfeld = englishShows[2]; System.out.println(Seinfeld);
        String LincolnRhyme = englishShows[3]; System.out.println(LincolnRhyme);
        String ForLife = englishShows[4]; System.out.println(ForLife);
        String Counterpart = englishShows[5]; System.out.println(Counterpart);
        String MadAboutYou = englishShows[6]; System.out.println(MadAboutYou);
        String Community = englishShows[7]; System.out.println(Community);
        String Goldbergs = englishShows[8]; System.out.println(Goldbergs);
        String DawsonsCreek = englishShows[9]; System.out.println(DawsonsCreek);
        String Damages = englishShows[10]; System.out.println(Damages);
        String RescueMe = englishShows[11]; System.out.println(RescueMe);
        String Shield = englishShows[12]; System.out.println(Shield);
        String Justified = englishShows[13]; System.out.println(Justified);
        String MastersOfSex = englishShows[14]; System.out.println(MastersOfSex);
        String Atypical = englishShows[15]; System.out.println(Atypical);
        String Blacklist = englishShows[16]; System.out.println(Blacklist);
        String SWAT = englishShows[17]; System.out.println(SWAT);
        String Power = englishShows[18]; System.out.println(Power);
        String Outlander = englishShows[19]; System.out.println(Outlander);
        String Tudors = englishShows[20]; System.out.println(Tudors);
        String Hannibal = englishShows[21]; System.out.println(Hannibal);
        String Unforgettable = englishShows[22]; System.out.println(Unforgettable);
        String PanAm = englishShows[23]; System.out.println(PanAm);
        String MadeInJersey = englishShows[24]; System.out.println(MadeInJersey);
        String CommonLaw = englishShows[25]; System.out.println(CommonLaw);
        String MenAtWork = englishShows[26]; System.out.println(MenAtWork);
        String MobDoctor = englishShows[27]; System.out.println(MobDoctor);
        String LastResort = englishShows[28]; System.out.println(LastResort);
        String Player = englishShows[29]; System.out.println(Player);

        System.out.println("\nHindi Shows:");
        String Scam1992 = hindiShows[0]; System.out.println(Scam1992);
        String SharkTankIndia = hindiShows[1]; System.out.println(SharkTankIndia);
        String Maharani = hindiShows[2]; System.out.println(Maharani);
        String RocketBoys = hindiShows[3]; System.out.println(RocketBoys);
        String Gullak = hindiShows[4]; System.out.println(Gullak);
        String Kathmandu = hindiShows[5]; System.out.println(Kathmandu);
        String Tanaav = hindiShows[6]; System.out.println(Tanaav);
        String JL50 = hindiShows[7]; System.out.println(JL50);
        String Undekhi = hindiShows[8]; System.out.println(Undekhi);
        String Avrodh = hindiShows[9]; System.out.println(Avrodh);
        String Jehanabad = hindiShows[10]; System.out.println(Jehanabad);
        String YourHonor = hindiShows[11]; System.out.println(YourHonor);
        String CollegeRomance = hindiShows[12]; System.out.println(CollegeRomance);
        String GirlsHostel = hindiShows[13]; System.out.println(GirlsHostel);
        String Pitchers = hindiShows[14]; System.out.println(Pitchers);
        String Aashram = hindiShows[15]; System.out.println(Aashram);
        String SonyShow = hindiShows[16]; System.out.println(SonyShow);
        String CrimePatrol = hindiShows[17]; System.out.println(CrimePatrol);
        String CID = hindiShows[18]; System.out.println(CID);
        String TaarakMehta = hindiShows[19]; System.out.println(TaarakMehta);
        String IndianIdol = hindiShows[20]; System.out.println(IndianIdol);
        String KBC = hindiShows[21]; System.out.println(KBC);
        String KapilSharma = hindiShows[22]; System.out.println(KapilSharma);
        String SuperDancer = hindiShows[23]; System.out.println(SuperDancer);
        String MasterChef = hindiShows[24]; System.out.println(MasterChef);
        String TenaliRama = hindiShows[25]; System.out.println(TenaliRama);
        String Aladdin = hindiShows[26]; System.out.println(Aladdin);
        String Baalveer = hindiShows[27]; System.out.println(Baalveer);
        String Ganesh = hindiShows[28]; System.out.println(Ganesh);
        String MereSai = hindiShows[29]; System.out.println(MereSai);

        System.out.println("\nTelugu Shows:");
        String ScamTelugu = teluguShows[0]; System.out.println(ScamTelugu);
        String TeluguIdol = teluguShows[1]; System.out.println(TeluguIdol);
        String NenuStudent = teluguShows[2]; System.out.println(NenuStudent);
        String IruDhuruvamTel = teluguShows[3]; System.out.println(IruDhuruvamTel);
        String CupCoffee = teluguShows[4]; System.out.println(CupCoffee);
        String MeetCute = teluguShows[5]; System.out.println(MeetCute);
        String OkeOkaJeevitham = teluguShows[6]; System.out.println(OkeOkaJeevitham);
        String Gatham = teluguShows[7]; System.out.println(Gatham);
        String Mail = teluguShows[8]; System.out.println(Mail);
        String Weds21 = teluguShows[9]; System.out.println(Weds21);
        String AgentAnand = teluguShows[10]; System.out.println(AgentAnand);
        String AnyasTutorial = teluguShows[11]; System.out.println(AnyasTutorial);
        String Recce = teluguShows[12]; System.out.println(Recce);
        String NeellaTank = teluguShows[13]; System.out.println(NeellaTank);
        String HelloWorld = teluguShows[14]; System.out.println(HelloWorld);
        String Parampara = teluguShows[15]; System.out.println(Parampara);
        String Hours9 = teluguShows[16]; System.out.println(Hours9);
        String Loser = teluguShows[17]; System.out.println(Loser);
        String Chaduvulu = teluguShows[18]; System.out.println(Chaduvulu);
        String PuliMeka = teluguShows[19]; System.out.println(PuliMeka);
        String Kinnerasani = teluguShows[20]; System.out.println(Kinnerasani);
        String Gaalivana = teluguShows[21]; System.out.println(Gaalivana);
        String MayaBazaar = teluguShows[22]; System.out.println(MayaBazaar);
        String Vyooham = teluguShows[23]; System.out.println(Vyooham);
        String Dhootha = teluguShows[24]; System.out.println(Dhootha);
        String SaveTheTigers = teluguShows[25]; System.out.println(SaveTheTigers);
        String Shaitan = teluguShows[26]; System.out.println(Shaitan);
        String AngryBiryani = teluguShows[27]; System.out.println(AngryBiryani);
        String Atm = teluguShows[28]; System.out.println(Atm);
        String Srimathi = teluguShows[29]; System.out.println(Srimathi);

        System.out.println("\nTamil Shows:");
        String StoryOfThings = tamilShows[0]; System.out.println(StoryOfThings);
        String TamilRockerz = tamilShows[1]; System.out.println(TamilRockerz);
        String IruDhuruvamTam = tamilShows[2]; System.out.println(IruDhuruvamTam);
        String Victim = tamilShows[3]; System.out.println(Victim);
        String MemeBoys = tamilShows[4]; System.out.println(MemeBoys);
        String AccidentalFarmer = tamilShows[5]; System.out.println(AccidentalFarmer);
        String KanaKaanum = tamilShows[6]; System.out.println(KanaKaanum);
        String RettaiRoja = tamilShows[7]; System.out.println(RettaiRoja);
        String AyaliTam = tamilShows[8]; System.out.println(AyaliTam);
        String EnggaHostel = tamilShows[9]; System.out.println(EnggaHostel);
        String KalyanamMudhal = tamilShows[10]; System.out.println(KalyanamMudhal);
        String MadrasMansion = tamilShows[11]; System.out.println(MadrasMansion);
        String Sathya = tamilShows[12]; System.out.println(Sathya);
        String AutoShankar = tamilShows[13]; System.out.println(AutoShankar);
        String LiveTelecast = tamilShows[14]; System.out.println(LiveTelecast);
        String NovStory = tamilShows[15]; System.out.println(NovStory);
        String Mathagam = tamilShows[16]; System.out.println(Mathagam);
        String Label = tamilShows[17]; System.out.println(Label);
        String CheransJourney = tamilShows[18]; System.out.println(CheransJourney);
        String Heartbeat = tamilShows[19]; System.out.println(Heartbeat);
        String Vilangu = tamilShows[20]; System.out.println(Vilangu);
        String Vadhandhi = tamilShows[21]; System.out.println(Vadhandhi);
        String Suzhal = tamilShows[22]; System.out.println(Suzhal);
        String Ayali2 = tamilShows[23]; System.out.println(Ayali2);
        String Thalaivettiyaan = tamilShows[24]; System.out.println(Thalaivettiyaan);
        String Anantham = tamilShows[25]; System.out.println(Anantham);
        String FiveSixSevenEight = tamilShows[26]; System.out.println(FiveSixSevenEight);
        String PuthamPudhu = tamilShows[27]; System.out.println(PuthamPudhu);
        String KuruthiKalam = tamilShows[28]; System.out.println(KuruthiKalam);
        String TimeEnnaBoss = tamilShows[29]; System.out.println(TimeEnnaBoss);

        System.out.println("\nKannada Shows:");
        String FamilyPack = kannadaShows[0]; System.out.println(FamilyPack);
        String GiliGili = kannadaShows[1]; System.out.println(GiliGili);
        String HumblePolitician = kannadaShows[2]; System.out.println(HumblePolitician);
        String Katheyondhu = kannadaShows[3]; System.out.println(Katheyondhu);
        String Kannadathi = kannadaShows[4]; System.out.println(Kannadathi);
        String Gattimela = kannadaShows[5]; System.out.println(Gattimela);
        String JotheJotheyali = kannadaShows[6]; System.out.println(JotheJotheyali);
        String Paaru = kannadaShows[7]; System.out.println(Paaru);
        String Kamali = kannadaShows[8]; System.out.println(Kamali);
        String Naagini2 = kannadaShows[9]; System.out.println(Naagini2);
        String SatyaKan = kannadaShows[10]; System.out.println(SatyaKan);
        String Manasaare = kannadaShows[11]; System.out.println(Manasaare);
        String MatheVasantha = kannadaShows[12]; System.out.println(MatheVasantha);
        String Kavyanjali = kannadaShows[13]; System.out.println(Kavyanjali);
        String NammaneYuvarani = kannadaShows[14]; System.out.println(NammaneYuvarani);
        String Ginirama = kannadaShows[15]; System.out.println(Ginirama);
        String HooMale = kannadaShows[16]; System.out.println(HooMale);
        String Siddhalingeshwara = kannadaShows[17]; System.out.println(Siddhalingeshwara);
        String ShanthamPaapam = kannadaShows[18]; System.out.println(ShanthamPaapam);
        String MajaaTalkies = kannadaShows[19]; System.out.println(MajaaTalkies);
        String GicchiGiliGili = kannadaShows[20]; System.out.println(GicchiGiliGili);
        String DancingChampion = kannadaShows[21]; System.out.println(DancingChampion);
        String ComedyKhiladigalu = kannadaShows[22]; System.out.println(ComedyKhiladigalu);
        String SaReGaMaPa = kannadaShows[23]; System.out.println(SaReGaMaPa);
        String DramaJuniors = kannadaShows[24]; System.out.println(DramaJuniors);
        String Mahanayaka = kannadaShows[25]; System.out.println(Mahanayaka);
        String Punyavathi = kannadaShows[26]; System.out.println(Punyavathi);
        String TripuraSundari = kannadaShows[27]; System.out.println(TripuraSundari);
        String Kendasampige = kannadaShows[28]; System.out.println(Kendasampige);
        String Bhagyalakshmi = kannadaShows[29]; System.out.println(Bhagyalakshmi);

        System.out.println("\nMalayalam Shows:");
        String Antakshari = malayalamShows[0]; System.out.println(Antakshari);
        String Eesho = malayalamShows[1]; System.out.println(Eesho);
        String Appan = malayalamShows[2]; System.out.println(Appan);
        String Priyan = malayalamShows[3]; System.out.println(Priyan);
        String Malayankunju = malayalamShows[4]; System.out.println(Malayankunju);
        String SundariGardens = malayalamShows[5]; System.out.println(SundariGardens);
        String WonderWomen = malayalamShows[6]; System.out.println(WonderWomen);
        String Nunakal1001 = malayalamShows[7]; System.out.println(Nunakal1001);
        String PurushaPretham = malayalamShows[8]; System.out.println(PurushaPretham);
        String Padmini = malayalamShows[9]; System.out.println(Padmini);
        String Rathri = malayalamShows[10]; System.out.println(Rathri);
        String Chathuram = malayalamShows[11]; System.out.println(Chathuram);
        String Salute = malayalamShows[12]; System.out.println(Salute);
        String FreedomFight = malayalamShows[13]; System.out.println(FreedomFight);
        String Kaanekkaane = malayalamShows[14]; System.out.println(Kaanekkaane);
        String BheeshmaParvam = malayalamShows[15]; System.out.println(BheeshmaParvam);
        String Hridayam = malayalamShows[16]; System.out.println(Hridayam);
        String BroDaddy = malayalamShows[17]; System.out.println(BroDaddy);
        String Kurup = malayalamShows[18]; System.out.println(Kurup);
        String Home = malayalamShows[19]; System.out.println(Home);
        String Malik = malayalamShows[20]; System.out.println(Malik);
        String MinnalMurali = malayalamShows[21]; System.out.println(MinnalMurali);
        String Priest = malayalamShows[22]; System.out.println(Priest);
        String Drishyam2 = malayalamShows[23]; System.out.println(Drishyam2);
        String Joji = malayalamShows[24]; System.out.println(Joji);
        String Kuruthi = malayalamShows[25]; System.out.println(Kuruthi);
        String Nishchayam = malayalamShows[26]; System.out.println(Nishchayam);
        String Nayattu = malayalamShows[27]; System.out.println(Nayattu);
        String OperationJava = malayalamShows[28]; System.out.println(OperationJava);
        String Wolf = malayalamShows[29]; System.out.println(Wolf);
    }
}