class SonyLIV {

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
        System.out.println(
            languages[0]+"\n"+languages[1]+"\n"+languages[2]+"\n"+
            languages[3]+"\n"+languages[4]+"\n"+languages[5]
        );

        System.out.println("\nEnglish Shows:");
        System.out.println(
            englishShows[0]+"\n"+englishShows[1]+"\n"+englishShows[2]+"\n"+englishShows[3]+"\n"+englishShows[4]+"\n"+
            englishShows[5]+"\n"+englishShows[6]+"\n"+englishShows[7]+"\n"+englishShows[8]+"\n"+englishShows[9]+"\n"+
            englishShows[10]+"\n"+englishShows[11]+"\n"+englishShows[12]+"\n"+englishShows[13]+"\n"+englishShows[14]+"\n"+
            englishShows[15]+"\n"+englishShows[16]+"\n"+englishShows[17]+"\n"+englishShows[18]+"\n"+englishShows[19]+"\n"+
            englishShows[20]+"\n"+englishShows[21]+"\n"+englishShows[22]+"\n"+englishShows[23]+"\n"+englishShows[24]+"\n"+
            englishShows[25]+"\n"+englishShows[26]+"\n"+englishShows[27]+"\n"+englishShows[28]+"\n"+englishShows[29]
        );

        System.out.println("\nHindi Shows:");
        System.out.println(
            hindiShows[0]+"\n"+hindiShows[1]+"\n"+hindiShows[2]+"\n"+hindiShows[3]+"\n"+hindiShows[4]+"\n"+
            hindiShows[5]+"\n"+hindiShows[6]+"\n"+hindiShows[7]+"\n"+hindiShows[8]+"\n"+hindiShows[9]+"\n"+
            hindiShows[10]+"\n"+hindiShows[11]+"\n"+hindiShows[12]+"\n"+hindiShows[13]+"\n"+hindiShows[14]+"\n"+
            hindiShows[15]+"\n"+hindiShows[16]+"\n"+hindiShows[17]+"\n"+hindiShows[18]+"\n"+hindiShows[19]+"\n"+
            hindiShows[20]+"\n"+hindiShows[21]+"\n"+hindiShows[22]+"\n"+hindiShows[23]+"\n"+hindiShows[24]+"\n"+
            hindiShows[25]+"\n"+hindiShows[26]+"\n"+hindiShows[27]+"\n"+hindiShows[28]+"\n"+hindiShows[29]
        );

        System.out.println("\nTelugu Shows:");
        System.out.println(
            teluguShows[0]+"\n"+teluguShows[1]+"\n"+teluguShows[2]+"\n"+teluguShows[3]+"\n"+teluguShows[4]+"\n"+
            teluguShows[5]+"\n"+teluguShows[6]+"\n"+teluguShows[7]+"\n"+teluguShows[8]+"\n"+teluguShows[9]+"\n"+
            teluguShows[10]+"\n"+teluguShows[11]+"\n"+teluguShows[12]+"\n"+teluguShows[13]+"\n"+teluguShows[14]+"\n"+
            teluguShows[15]+"\n"+teluguShows[16]+"\n"+teluguShows[17]+"\n"+teluguShows[18]+"\n"+teluguShows[19]+"\n"+
            teluguShows[20]+"\n"+teluguShows[21]+"\n"+teluguShows[22]+"\n"+teluguShows[23]+"\n"+teluguShows[24]+"\n"+
            teluguShows[25]+"\n"+teluguShows[26]+"\n"+teluguShows[27]+"\n"+teluguShows[28]+"\n"+teluguShows[29]
        );

        System.out.println("\nTamil Shows:");
        System.out.println(
            tamilShows[0]+"\n"+tamilShows[1]+"\n"+tamilShows[2]+"\n"+tamilShows[3]+"\n"+tamilShows[4]+"\n"+
            tamilShows[5]+"\n"+tamilShows[6]+"\n"+tamilShows[7]+"\n"+tamilShows[8]+"\n"+tamilShows[9]+"\n"+
            tamilShows[10]+"\n"+tamilShows[11]+"\n"+tamilShows[12]+"\n"+tamilShows[13]+"\n"+tamilShows[14]+"\n"+
            tamilShows[15]+"\n"+tamilShows[16]+"\n"+tamilShows[17]+"\n"+tamilShows[18]+"\n"+tamilShows[19]+"\n"+
            tamilShows[20]+"\n"+tamilShows[21]+"\n"+tamilShows[22]+"\n"+tamilShows[23]+"\n"+tamilShows[24]+"\n"+
            tamilShows[25]+"\n"+tamilShows[26]+"\n"+tamilShows[27]+"\n"+tamilShows[28]+"\n"+tamilShows[29]
        );

        System.out.println("\nKannada Shows:");
        System.out.println(
            kannadaShows[0]+"\n"+kannadaShows[1]+"\n"+kannadaShows[2]+"\n"+kannadaShows[3]+"\n"+kannadaShows[4]+"\n"+
            kannadaShows[5]+"\n"+kannadaShows[6]+"\n"+kannadaShows[7]+"\n"+kannadaShows[8]+"\n"+kannadaShows[9]+"\n"+
            kannadaShows[10]+"\n"+kannadaShows[11]+"\n"+kannadaShows[12]+"\n"+kannadaShows[13]+"\n"+kannadaShows[14]+"\n"+
            kannadaShows[15]+"\n"+kannadaShows[16]+"\n"+kannadaShows[17]+"\n"+kannadaShows[18]+"\n"+kannadaShows[19]+"\n"+
            kannadaShows[20]+"\n"+kannadaShows[21]+"\n"+kannadaShows[22]+"\n"+kannadaShows[23]+"\n"+kannadaShows[24]+"\n"+
            kannadaShows[25]+"\n"+kannadaShows[26]+"\n"+kannadaShows[27]+"\n"+kannadaShows[28]+"\n"+kannadaShows[29]
        );

        System.out.println("\nMalayalam Shows:");
        System.out.println(
            malayalamShows[0]+"\n"+malayalamShows[1]+"\n"+malayalamShows[2]+"\n"+malayalamShows[3]+"\n"+malayalamShows[4]+"\n"+
            malayalamShows[5]+"\n"+malayalamShows[6]+"\n"+malayalamShows[7]+"\n"+malayalamShows[8]+"\n"+malayalamShows[9]+"\n"+
            malayalamShows[10]+"\n"+malayalamShows[11]+"\n"+malayalamShows[12]+"\n"+malayalamShows[13]+"\n"+malayalamShows[14]+"\n"+
            malayalamShows[15]+"\n"+malayalamShows[16]+"\n"+malayalamShows[17]+"\n"+malayalamShows[18]+"\n"+malayalamShows[19]+"\n"+
            malayalamShows[20]+"\n"+malayalamShows[21]+"\n"+malayalamShows[22]+"\n"+malayalamShows[23]+"\n"+malayalamShows[24]+"\n"+
            malayalamShows[25]+"\n"+malayalamShows[26]+"\n"+malayalamShows[27]+"\n"+malayalamShows[28]+"\n"+malayalamShows[29]
        );
    }
}