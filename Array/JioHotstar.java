class JioHotstar {

public static void main(String[] args) {

    String platform = "JioHotstar Available Series";

    String kannadaTitle = "Kannada Series Are";
    String englishTitle = "English Series Are";
    String teluguTitle = "Telugu Series Are";
    String hindiTitle = "Hindi Series Are";
    String tamilTitle = "Tamil Series Are";
    String malayalamTitle = "Malayalam Series Are";

	String kannadaSeries[] = {
" Humble Politician Nograj",
" Honeymoon",
" Loose Connection",
" Ekam",
" By Mistake",
" Love You Abhi",
" Shuddhi",
" Bhinna",
" Aarambha",
" Namma Metro",
" Mayabazar",
" Satya",
" Jothe Jotheyali",
" Kasturi Nivasa",
" Mahanati",
" Ranganayaki",
" Radha Ramana",
" Gattimela",
" Lakshmi Baramma",
" Kannadathi",
" Geetha",
" Mangala Gowri",
" Paaru",
" Nannarasi Radhe",
" Muddu Lakshmi",
" Nagini",
" Mahadevi",
" Brahmagantu",
" Naagini 2",
" Sevanthi"
};


String englishSeries[] = {
" Game of Thrones",
" Breaking Bad",
" Friends",
" The Office",
" Stranger Things",
" Loki",
" WandaVision",
" The Mandalorian",
" Sherlock",
" Prison Break",
" House of the Dragon",
" The Boys",
" Suits",
" Dark",
" Money Heist",
" Chernobyl",
" Westworld",
" The Crown",
" Peaky Blinders",
" Vikings",
" Lost",
" The Walking Dead",
" How I Met Your Mother",
" Modern Family",
" The Flash",
" Arrow",
" Daredevil",
" The Witcher",
" Squid Game",
" Wednesday"
};


String teluguSeries[] = {
" 9 Hours",
" Parampara",
" Save the Tigers",
" Mansion 24",
" Kudi Yedamaithe",
" Locked",
" Gaalivaana",
" Sin",
" Oka Chinna Family Story",
" ATM",
" Jhansi",
" Dhootha",
" Dayaa",
" Vadhuvu",
" Recce",
" The Baker and the Beauty",
" Unheard",
" Loser",
" Gods of Dharmapuri",
" Mastis",
" Modern Love Hyderabad",
" Vyavastha",
" Kumari Srimathi",
" Aha Naa Pellanta",
" Rana Naidu",
" Mansion",
" High Priestess",
" Pitta Kathalu",
" Telugu Bigg Boss",
" Dance India Dance Telugu"
};

String hindiSeries[] = {
" Special OPS",
" Aarya",
" Criminal Justice",
" The Night Manager",
" City of Dreams",
" Hostages",
" Asur",
" Rudra",
" The Freelancer",
" The Empire",
" Taaza Khabar",
" Escaype Live",
" Out of Love",
" Grahan",
" Human",
" Masoom",
" Roar of the Lion",
" Sarabhai vs Sarabhai",
" Mirzapur",
" The Family Man",
" Breathe",
" Maharani",
" Scam 1992",
" Farzi",
" Panchayat",
" Rocket Boys",
" Undekhi",
" Abhay",
" Delhi Crime",
" Sacred Games"
};


String tamilSeries[] = {
" Suzhal",
" Fall",
" Vilangu",
" November Story",
" Iru Dhuruvam",
" Queen",
" Fingertip",
" Navarasa",
" Auto Shankar",
" Live Telecast",
" Meme Boys",
" Ayali",
" Tamil Bigg Boss",
" Dance Jodi Dance",
" Survivor Tamil",
" Kanaa Kaanum Kaalangal",
" Kana Kanum Kalangal",
" Anantham",
" Paper Rocket",
" Triples",
" Addham",
" Udanpaal",
" Chutney Sambar",
" Inspector Rishi",
" Irai",
" Mathagam",
" The Village",
" My Perfect Husband",
" Mansion Tamil",
" Mansion 24 Tamil"
};

String malayalamSeries[] = {
" Kerala Crime Files",
" Masterpeace",
" Perilloor Premier League",
" 1000 Babies",
" Jai Mahendran",
" Nagendran's Honeymoons",
" Love Under Construction",
" Modern Love Kochi",
" Average Ambili",
" Oru Chiri Iru Chiri",
" Instagraamam",
" Kerala Police Files",
" Marimayam",
" Uppum Mulakum",
" Karikku",
" Samarthya Shastram",
" Manorathangal",
" Indu",
" Pharma",
" Lal Salaam",
" College Days",
" Call Me Dad",
" Ladies Room",
" Pranayini",
" Anuragam",
" Comedy Utsavam",
" Fast and Furious Malayalam",
" Family Stories",
" Kairali Series",
" Flowers TV Series"
};

System.out.println("\nPlatform: " + platform);

System.out.println("\nThe " + kannadaTitle);
System.out.println(kannadaSeries[0] + "\n" +
kannadaSeries[1] + "\n" +
kannadaSeries[2] + "\n" +
kannadaSeries[3] + "\n" +
kannadaSeries[4] + "\n" +
kannadaSeries[5] + "\n" +
kannadaSeries[6] + "\n" +
kannadaSeries[7] + "\n" +
kannadaSeries[8] + "\n" +
kannadaSeries[9] + "\n" +
kannadaSeries[10] + "\n" +
kannadaSeries[11] + "\n" +
kannadaSeries[12] + "\n" +
kannadaSeries[13] + "\n" +
kannadaSeries[14] + "\n" +
kannadaSeries[15] + "\n" +
kannadaSeries[16] + "\n" +
kannadaSeries[17] + "\n" +
kannadaSeries[18] + "\n" +
kannadaSeries[19] + "\n" +
kannadaSeries[20] + "\n" +
kannadaSeries[21] + "\n" +
kannadaSeries[22] + "\n" +
kannadaSeries[23] + "\n" +
kannadaSeries[24] + "\n" +
kannadaSeries[25] + "\n" +
kannadaSeries[26] + "\n" +
kannadaSeries[27] + "\n" +
kannadaSeries[28] + "\n" +
kannadaSeries[29]);

System.out.println("\nThe " + englishTitle);
System.out.println(englishSeries[0] + "\n" +
englishSeries[1] + "\n" +
englishSeries[2] + "\n" +
englishSeries[3] + "\n" +
englishSeries[4] + "\n" +
englishSeries[5] + "\n" +
englishSeries[6] + "\n" +
englishSeries[7] + "\n" +
englishSeries[8] + "\n" +
englishSeries[9] + "\n" +
englishSeries[10] + "\n" +
englishSeries[11] + "\n" +
englishSeries[12] + "\n" +
englishSeries[13] + "\n" +
englishSeries[14] + "\n" +
englishSeries[15] + "\n" +
englishSeries[16] + "\n" +
englishSeries[17] + "\n" +
englishSeries[18] + "\n" +
englishSeries[19] + "\n" +
englishSeries[20] + "\n" +
englishSeries[21] + "\n" +
englishSeries[22] + "\n" +
englishSeries[23] + "\n" +
englishSeries[24] + "\n" +
englishSeries[25] + "\n" +
englishSeries[26] + "\n" +
englishSeries[27] + "\n" +
englishSeries[28] + "\n" +
englishSeries[29]);

System.out.println("\nThe " + teluguTitle);

System.out.println(teluguSeries[0] + "\n" +
teluguSeries[1] + "\n" +
teluguSeries[2] + "\n" +
teluguSeries[3] + "\n" +
teluguSeries[4] + "\n" +
teluguSeries[5] + "\n" +
teluguSeries[6] + "\n" +
teluguSeries[7] + "\n" +
teluguSeries[8] + "\n" +
teluguSeries[9] + "\n" +
teluguSeries[10] + "\n" +
teluguSeries[11] + "\n" +
teluguSeries[12] + "\n" +
teluguSeries[13] + "\n" +
teluguSeries[14] + "\n" +
teluguSeries[15] + "\n" +
teluguSeries[16] + "\n" +
teluguSeries[17] + "\n" +
teluguSeries[18] + "\n" +
teluguSeries[19] + "\n" +
teluguSeries[20] + "\n" +
teluguSeries[21] + "\n" +
teluguSeries[22] + "\n" +
teluguSeries[23] + "\n" +
teluguSeries[24] + "\n" +
teluguSeries[25] + "\n" +
teluguSeries[26] + "\n" +
teluguSeries[27] + "\n" +
teluguSeries[28] + "\n" +
teluguSeries[29]);

System.out.println("\nThe " + hindiTitle);

System.out.println(hindiSeries[0] + "\n" +
hindiSeries[1] + "\n" +
hindiSeries[2] + "\n" +
hindiSeries[3] + "\n" +
hindiSeries[4] + "\n" +
hindiSeries[5] + "\n" +
hindiSeries[6] + "\n" +
hindiSeries[7] + "\n" +
hindiSeries[8] + "\n" +
hindiSeries[9] + "\n" +
hindiSeries[10] + "\n" +
hindiSeries[11] + "\n" +
hindiSeries[12] + "\n" +
hindiSeries[13] + "\n" +
hindiSeries[14] + "\n" +
hindiSeries[15] + "\n" +
hindiSeries[16] + "\n" +
hindiSeries[17] + "\n" +
hindiSeries[18] + "\n" +
hindiSeries[19] + "\n" +
hindiSeries[20] + "\n" +
hindiSeries[21] + "\n" +
hindiSeries[22] + "\n" +
hindiSeries[23] + "\n" +
hindiSeries[24] + "\n" +
hindiSeries[25] + "\n" +
hindiSeries[26] + "\n" +
hindiSeries[27] + "\n" +
hindiSeries[28] + "\n" +
hindiSeries[29]);

System.out.println("\nThe " + tamilTitle);

System.out.println(tamilSeries[0] + "\n" +
tamilSeries[1] + "\n" +
tamilSeries[2] + "\n" +
tamilSeries[3] + "\n" +
tamilSeries[4] + "\n" +
tamilSeries[5] + "\n" +
tamilSeries[6] + "\n" +
tamilSeries[7] + "\n" +
tamilSeries[8] + "\n" +
tamilSeries[9] + "\n" +
tamilSeries[10] + "\n" +
tamilSeries[11] + "\n" +
tamilSeries[12] + "\n" +
tamilSeries[13] + "\n" +
tamilSeries[14] + "\n" +
tamilSeries[15] + "\n" +
tamilSeries[16] + "\n" +
tamilSeries[17] + "\n" +
tamilSeries[18] + "\n" +
tamilSeries[19] + "\n" +
tamilSeries[20] + "\n" +
tamilSeries[21] + "\n" +
tamilSeries[22] + "\n" +
tamilSeries[23] + "\n" +
tamilSeries[24] + "\n" +
tamilSeries[25] + "\n" +
tamilSeries[26] + "\n" +
tamilSeries[27] + "\n" +
tamilSeries[28] + "\n" +
tamilSeries[29]);

System.out.println("\nThe " + malayalamTitle);

System.out.println(malayalamSeries[0] + "\n" +
malayalamSeries[1] + "\n" +
malayalamSeries[2] + "\n" +
malayalamSeries[3] + "\n" +
malayalamSeries[4] + "\n" +
malayalamSeries[5] + "\n" +
malayalamSeries[6] + "\n" +
malayalamSeries[7] + "\n" +
malayalamSeries[8] + "\n" +
malayalamSeries[9] + "\n" +
malayalamSeries[10] + "\n" +
malayalamSeries[11] + "\n" +
malayalamSeries[12] + "\n" +
malayalamSeries[13] + "\n" +
malayalamSeries[14] + "\n" +
malayalamSeries[15] + "\n" +
malayalamSeries[16] + "\n" +
malayalamSeries[17] + "\n" +
malayalamSeries[18] + "\n" +
malayalamSeries[19] + "\n" +
malayalamSeries[20] + "\n" +
malayalamSeries[21] + "\n" +
malayalamSeries[22] + "\n" +
malayalamSeries[23] + "\n" +
malayalamSeries[24] + "\n" +
malayalamSeries[25] + "\n" +
malayalamSeries[26] + "\n" +
malayalamSeries[27] + "\n" +
malayalamSeries[28] + "\n" +
malayalamSeries[29]);
}
}

