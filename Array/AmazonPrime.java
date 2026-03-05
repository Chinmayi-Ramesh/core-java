class AmazonPrime {

    public static void main(String args[]) {

        String appName = "Amazon Prime Video";

        String languages[] = {
            "English", "Hindi", "Telugu",
            "Tamil", "Kannada", "Malayalam"
        };

        String englishComedies[] = {
            "The Office", "Parks and Recreation", "The Marvelous Mrs. Maisel", "Fleabag", "The Big Bang Theory",
            "Modern Family", "Schitt's Creek", "Brooklyn Nine-Nine", "Upload", "Coming 2 America",
            "Borat", "The Dictator", "21 Jump Street", "The Upside", "Brittany Runs a Marathon",
            "Late Night", "The Internship", "Good Omens", "Two and a Half Men", "Young Sheldon",
            "The Hangover", "Superbad", "Step Brothers", "Game Night", "Horrible Bosses",
            "Ted", "We're the Millers", "Central Intelligence", "Booksmart", "The Heat"
        };

        String hindiComedies[] = {
            "Panchayat", "Hera Pheri", "Andaz Apna Apna", "Munna Bhai M.B.B.S.", "3 Idiots",
            "Golmaal", "Welcome", "Bhool Bhulaiyaa", "Good Newwz", "Dream Girl",
            "Chhichhore", "Fukrey", "Hindi Medium", "Vicky Donor", "Stree",
            "Bala", "Badhaai Ho", "Bareilly Ki Barfi", "Ludo", "Piku",
            "Sonu Ke Titu Ki Sweety", "Shubh Mangal Saavdhan", "Total Dhamaal", "Dhamaal", "Housefull",
            "Madgaon Express", "Crew", "Munjya", "Fukrey 3", "Bad Newz"
        };

        String teluguComedies[] = {
            "Mathu Vadalara", "Jathi Ratnalu", "Agent Sai Srinivasa Athreya", "Pelli Choopulu", "Ee Nagaraniki Emaindi",
            "Brochevarevarura", "F2: Fun and Frustration", "Ami Thumi", "Manmadhudu", "Venky",
            "Dubai Seenu", "Ready", "King", "Dookudu", "Baadshah",
            "Nuvvu Naaku Nachav", "Malliswari", "Kick", "Race Gurram", "Ala Vaikunthapurramuloo",
            "Dj Tillu", "Tillu Square", "Om Bheem Bush", "Hasith Goli", "Vivaha Bhojanambu",
            "Middle Class Melodies", "Pushpaka Vimanam", "Skylab", "Paagal", "Cinema Bandi"
        };

        String tamilComedies[] = {
            "Panchatanthiram", "Kalakalappu", "Vasool Raja MBBS", "Indru Netru Naalai", "Soodhu Kavvum",
            "Kadhalum Kadandhu Pogum", "Moodar Koodam", "Boss Engira Bhaskaran", "Varuthapadatha Valibar Sangam", "Rajini Murugan",
            "Comali", "Love Insurance", "Doctor", "Don", "Thallumaala",
            "Vaayai Moodi Pesavum", "Mandela", "Oh My Kadavule", "Aandavan Kattalai", "Kaathuvaakula Rendu Kaadhal",
            "Pammal K. Sambandam", "Michael Madana Kama Rajan", "Theali", "Kanni Maadam", "Gulu Gulu",
            "Vadhandhi", "Time Enna Boss", "Vellai Pookal", "Manmatha Leelai", "Sila Nerangalil Sila Manidhargal"
        };

        String kannadaComedies[] = {
            "French Biriyani", "Mayabazar 2016", "Kirik Party", "Humble Politician Nograj", "Avane Srimannarayana",
            "First Rank Raju", "Raajakumara", "Victory", "Adhyaksha", "Govindaya Namaha",
            "Rambo", "Bell Bottom", "Ondu Motteya Kathe", "Sarkari Hi. Pra. Shaale", "Gultoo",
            "Doddmane Hudga", "Chamak", "Ayogya", "Natasaarvabhouma", "Geetha Bangle Stores",
            "Kavaludaari", "Ratnan Prapancha", "Badava Rascal", "Galipata 2", "Hostel Hudugaru Bekagiddare",
            "Daredevil Mustafa", "Toby", "Sapta Sagaradaache Ello", "Aachar & Co", "Kousalya Supraja Rama"
        };

        String malayalamComedies[] = {
            "Aavesham", "Kumbalangi Nights", "Jan.E.Man", "Jaya Jaya Jaya Jaya Hey", "Minnal Murali",
            "Premam", "Bangalore Days", "Charlie", "Sudani from Nigeria", "Thaneer Mathan Dinangal",
            "Adi Kapyare Kootamani", "Aadu", "Aadu 2", "Kunjiramayanam", "Vellimoonga",
            "Maheshinte Prathikaaram", "Action Hero Biju", "North 24 Kaatham", "Driving Licence", "Pranjiyettan & the Saint",
            "God Father", "In Harihar Nagar", "Sandhesam", "Kilukkam", "Chithram",
            "Boeing Boeing", "Nadodikkattu", "Mannar Mathai Speaking", "Ramji Rao Speaking", "Falimy"
        };

        System.out.println("App name is " + appName);

        System.out.println("\nAvailable Languages:");
        System.out.println(
            languages[0]+"\n"+languages[1]+"\n"+languages[2]+"\n"+
            languages[3]+"\n"+languages[4]+"\n"+languages[5]
        );

        System.out.println("\nEnglish Comedies:");
        System.out.println(
            englishComedies[0]+"\n"+englishComedies[1]+"\n"+englishComedies[2]+"\n"+englishComedies[3]+"\n"+englishComedies[4]+"\n"+
            englishComedies[5]+"\n"+englishComedies[6]+"\n"+englishComedies[7]+"\n"+englishComedies[8]+"\n"+englishComedies[9]+"\n"+
            englishComedies[10]+"\n"+englishComedies[11]+"\n"+englishComedies[12]+"\n"+englishComedies[13]+"\n"+englishComedies[14]+"\n"+
            englishComedies[15]+"\n"+englishComedies[16]+"\n"+englishComedies[17]+"\n"+englishComedies[18]+"\n"+englishComedies[19]+"\n"+
            englishComedies[20]+"\n"+englishComedies[21]+"\n"+englishComedies[22]+"\n"+englishComedies[23]+"\n"+englishComedies[24]+"\n"+
            englishComedies[25]+"\n"+englishComedies[26]+"\n"+englishComedies[27]+"\n"+englishComedies[28]+"\n"+englishComedies[29]
        );

        System.out.println("\nHindi Comedies:");
        System.out.println(
            hindiComedies[0]+"\n"+hindiComedies[1]+"\n"+hindiComedies[2]+"\n"+hindiComedies[3]+"\n"+hindiComedies[4]+"\n"+
            hindiComedies[5]+"\n"+hindiComedies[6]+"\n"+hindiComedies[7]+"\n"+hindiComedies[8]+"\n"+hindiComedies[9]+"\n"+
            hindiComedies[10]+"\n"+hindiComedies[11]+"\n"+hindiComedies[12]+"\n"+hindiComedies[13]+"\n"+hindiComedies[14]+"\n"+
            hindiComedies[15]+"\n"+hindiComedies[16]+"\n"+hindiComedies[17]+"\n"+hindiComedies[18]+"\n"+hindiComedies[19]+"\n"+
            hindiComedies[20]+"\n"+hindiComedies[21]+"\n"+hindiComedies[22]+"\n"+hindiComedies[23]+"\n"+hindiComedies[24]+"\n"+
            hindiComedies[25]+"\n"+hindiComedies[26]+"\n"+hindiComedies[27]+"\n"+hindiComedies[28]+"\n"+hindiComedies[29]
        );

        System.out.println("\nTelugu Comedies:");
        System.out.println(
            teluguComedies[0]+"\n"+teluguComedies[1]+"\n"+teluguComedies[2]+"\n"+teluguComedies[3]+"\n"+teluguComedies[4]+"\n"+
            teluguComedies[5]+"\n"+teluguComedies[6]+"\n"+teluguComedies[7]+"\n"+teluguComedies[8]+"\n"+teluguComedies[9]+"\n"+
            teluguComedies[10]+"\n"+teluguComedies[11]+"\n"+teluguComedies[12]+"\n"+teluguComedies[13]+"\n"+teluguComedies[14]+"\n"+
            teluguComedies[15]+"\n"+teluguComedies[16]+"\n"+teluguComedies[17]+"\n"+teluguComedies[18]+"\n"+teluguComedies[19]+"\n"+
            teluguComedies[20]+"\n"+teluguComedies[21]+"\n"+teluguComedies[22]+"\n"+teluguComedies[23]+"\n"+teluguComedies[24]+"\n"+
            teluguComedies[25]+"\n"+teluguComedies[26]+"\n"+teluguComedies[27]+"\n"+teluguComedies[28]+"\n"+teluguComedies[29]
        );

        System.out.println("\nTamil Comedies:");
        System.out.println(
            tamilComedies[0]+"\n"+tamilComedies[1]+"\n"+tamilComedies[2]+"\n"+tamilComedies[3]+"\n"+tamilComedies[4]+"\n"+
            tamilComedies[5]+"\n"+tamilComedies[6]+"\n"+tamilComedies[7]+"\n"+tamilComedies[8]+"\n"+tamilComedies[9]+"\n"+
            tamilComedies[10]+"\n"+tamilComedies[11]+"\n"+tamilComedies[12]+"\n"+tamilComedies[13]+"\n"+tamilComedies[14]+"\n"+
            tamilComedies[15]+"\n"+tamilComedies[16]+"\n"+tamilComedies[17]+"\n"+tamilComedies[18]+"\n"+tamilComedies[19]+"\n"+
            tamilComedies[20]+"\n"+tamilComedies[21]+"\n"+tamilComedies[22]+"\n"+tamilComedies[23]+"\n"+tamilComedies[24]+"\n"+
            tamilComedies[25]+"\n"+tamilComedies[26]+"\n"+tamilComedies[27]+"\n"+tamilComedies[28]+"\n"+tamilComedies[29]
        );

        System.out.println("\nKannada Comedies:");
        System.out.println(
            kannadaComedies[0]+"\n"+kannadaComedies[1]+"\n"+kannadaComedies[2]+"\n"+kannadaComedies[3]+"\n"+kannadaComedies[4]+"\n"+
            kannadaComedies[5]+"\n"+kannadaComedies[6]+"\n"+kannadaComedies[7]+"\n"+kannadaComedies[8]+"\n"+kannadaComedies[9]+"\n"+
            kannadaComedies[10]+"\n"+kannadaComedies[11]+"\n"+kannadaComedies[12]+"\n"+kannadaComedies[13]+"\n"+kannadaComedies[14]+"\n"+
            kannadaComedies[15]+"\n"+kannadaComedies[16]+"\n"+kannadaComedies[17]+"\n"+kannadaComedies[18]+"\n"+kannadaComedies[19]+"\n"+
            kannadaComedies[20]+"\n"+kannadaComedies[21]+"\n"+kannadaComedies[22]+"\n"+kannadaComedies[23]+"\n"+kannadaComedies[24]+"\n"+
            kannadaComedies[25]+"\n"+kannadaComedies[26]+"\n"+kannadaComedies[27]+"\n"+kannadaComedies[28]+"\n"+kannadaComedies[29]
        );

        System.out.println("\nMalayalam Comedies:");
        System.out.println(
            malayalamComedies[0]+"\n"+malayalamComedies[1]+"\n"+malayalamComedies[2]+"\n"+malayalamComedies[3]+"\n"+malayalamComedies[4]+"\n"+
            malayalamComedies[5]+"\n"+malayalamComedies[6]+"\n"+malayalamComedies[7]+"\n"+malayalamComedies[8]+"\n"+malayalamComedies[9]+"\n"+
            malayalamComedies[10]+"\n"+malayalamComedies[11]+"\n"+malayalamComedies[12]+"\n"+malayalamComedies[13]+"\n"+malayalamComedies[14]+"\n"+
            malayalamComedies[15]+"\n"+malayalamComedies[16]+"\n"+malayalamComedies[17]+"\n"+malayalamComedies[18]+"\n"+malayalamComedies[19]+"\n"+
            malayalamComedies[20]+"\n"+malayalamComedies[21]+"\n"+malayalamComedies[22]+"\n"+malayalamComedies[23]+"\n"+malayalamComedies[24]+"\n"+
            malayalamComedies[25]+"\n"+malayalamComedies[26]+"\n"+malayalamComedies[27]+"\n"+malayalamComedies[28]+"\n"+malayalamComedies[29]
        );

    }
}