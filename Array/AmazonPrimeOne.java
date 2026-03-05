class AmazonPrimeOne {

    public static void main(String args[]) {

        String appName = "Amazon Prime Video";

        
        String englishComedies[] = {
            "The Office", "Parks and Recreation", "The Marvelous Mrs Maisel", "Fleabag", "The Big Bang Theory",
            "Modern Family", "Schitts Creek", "Brooklyn Nine Nine", "Upload", "Coming 2 America",
            "Borat", "The Dictator", "21 Jump Street", "The Upside", "Brittany Runs a Marathon",
            "Late Night", "The Internship", "Good Omens", "Two and a Half Men", "Young Sheldon",
            "The Hangover", "Superbad", "Step Brothers", "Game Night", "Horrible Bosses",
            "Ted", "Were the Millers", "Central Intelligence", "Booksmart", "The Heat"
        };

        String hindiComedies[] = {
            "Panchayat", "Hera Pheri", "Andaz Apna Apna", "Munna Bhai MBBS", "3 Idiots",
            "Golmaal", "Welcome", "Bhool Bhulaiyaa", "Good Newwz", "Dream Girl",
            "Chhichhore", "Fukrey", "Hindi Medium", "Vicky Donor", "Stree",
            "Bala", "Badhaai Ho", "Bareilly Ki Barfi", "Ludo", "Piku",
            "Sonu Ke Titu Ki Sweety", "Shubh Mangal Saavdhan", "Total Dhamaal", "Dhamaal", "Housefull",
            "Madgaon Express", "Crew", "Munjya", "Fukrey 3", "Bad Newz"
        };

        String teluguComedies[] = {
            "Mathu Vadalara", "Jathi Ratnalu", "Agent Sai", "Pelli Choopulu", "Ee Nagaraniki Emaindi",
            "Brochevarevarura", "F2", "Ami Thumi", "Manmadhudu", "Venky",
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
            "Pammal K Sambandam", "Michael Madana", "Theali", "Kanni Maadam", "Gulu Gulu",
            "Vadhandhi", "Time Enna Boss", "Vellai Pookal", "Manmatha Leelai", "Sila Nerangalil"
        };

        
        String kannadaSeries[] = {
            "Nograj", "Honeymoon", "Loose Connection", "Ekam", "By Mistake",
            "Love You Abhi", "Shuddhi", "Bhinna", "Aarambha", "Namma Metro",
            "Mayabazar", "Satya", "Jothe Jotheyali", "Kasturi Nivasa", "Mahanati",
            "Ranganayaki", "Radha Ramana", "Gattimela", "Lakshmi Baramma", "Kavaludaari",
            "Ratnan Prapancha", "Badava Rascal", "Galipata 2", "Hostel Hudugaru", "Daredevil Mustafa",
            "Toby", "Sapta Sagaradaache", "Aachar Co", "Kousalya", "French Biriyani"
        };

        String malayalamComedies[] = {
            "Aavesham", "Kumbalangi Nights", "Jan E Man", "Jaya Jaya Hey", "Minnal Murali",
            "Premam", "Bangalore Days", "Charlie", "Sudani from Nigeria", "Thaneer Mathan",
            "Adi Kapyare", "Aadu", "Aadu 2", "Kunjiramayanam", "Vellimoonga",
            "Maheshinte Prathikaaram", "Action Hero Biju", "North 24 Kaatham", "Driving Licence", "Pranjiyettan",
            "God Father", "In Harihar Nagar", "Sandhesam", "Kilukkam", "Chithram",
            "Boeing Boeing", "Nadodikkattu", "Mannar Mathai", "Ramji Rao", "Falimy"
        };

        System.out.println("App Name: " + appName);

        // --- 2. PRINTING SECTIONS ---

        System.out.println("\n English Comedies ");
        String The_Office = englishComedies[0]; System.out.println(The_Office);
        String Parks_And_Rec = englishComedies[1]; System.out.println(Parks_And_Rec);
        String Mrs_Maisel = englishComedies[2]; System.out.println(Mrs_Maisel);
        String Fleabag = englishComedies[3]; System.out.println(Fleabag);
        String Big_Bang = englishComedies[4]; System.out.println(Big_Bang);
        String Modern_Family = englishComedies[5]; System.out.println(Modern_Family);
        String Schitts_Creek = englishComedies[6]; System.out.println(Schitts_Creek);
        String Brooklyn_99 = englishComedies[7]; System.out.println(Brooklyn_99);
        String Upload = englishComedies[8]; System.out.println(Upload);
        String Coming_2_America = englishComedies[9]; System.out.println(Coming_2_America);
        String Borat = englishComedies[10]; System.out.println(Borat);
        String Dictator = englishComedies[11]; System.out.println(Dictator);
        String Jump_Street = englishComedies[12]; System.out.println(Jump_Street);
        String Upside = englishComedies[13]; System.out.println(Upside);
        String Marathon = englishComedies[14]; System.out.println(Marathon);
        String Late_Night = englishComedies[15]; System.out.println(Late_Night);
        String Internship = englishComedies[16]; System.out.println(Internship);
        String Good_Omens = englishComedies[17]; System.out.println(Good_Omens);
        String Two_Men = englishComedies[18]; System.out.println(Two_Men);
        String Young_Sheldon = englishComedies[19]; System.out.println(Young_Sheldon);
        String Hangover = englishComedies[20]; System.out.println(Hangover);
        String Superbad = englishComedies[21]; System.out.println(Superbad);
        String Step_Brothers = englishComedies[22]; System.out.println(Step_Brothers);
        String Game_Night = englishComedies[23]; System.out.println(Game_Night);
        String Horrible_Bosses = englishComedies[24]; System.out.println(Horrible_Bosses);
        String Ted = englishComedies[25]; System.out.println(Ted);
        String Millers = englishComedies[26]; System.out.println(Millers);
        String Intelligence = englishComedies[27]; System.out.println(Intelligence);
        String Booksmart = englishComedies[28]; System.out.println(Booksmart);
        String Heat = englishComedies[29]; System.out.println(Heat);

        System.out.println("\n Hindi Comedies ");
        String Panchayat = hindiComedies[0]; System.out.println(Panchayat);
        String Hera_Pheri = hindiComedies[1]; System.out.println(Hera_Pheri);
        String Andaz_Apna = hindiComedies[2]; System.out.println(Andaz_Apna);
        String Munna_Bhai = hindiComedies[3]; System.out.println(Munna_Bhai);
        String Three_Idiots = hindiComedies[4]; System.out.println(Three_Idiots);
        String Golmaal = hindiComedies[5]; System.out.println(Golmaal);
        String Welcome = hindiComedies[6]; System.out.println(Welcome);
        String Bhool_Bhulaiyaa = hindiComedies[7]; System.out.println(Bhool_Bhulaiyaa);
        String Good_Newwz = hindiComedies[8]; System.out.println(Good_Newwz);
        String Dream_Girl = hindiComedies[9]; System.out.println(Dream_Girl);
        String Chhichhore = hindiComedies[10]; System.out.println(Chhichhore);
        String Fukrey = hindiComedies[11]; System.out.println(Fukrey);
        String Hindi_Medium = hindiComedies[12]; System.out.println(Hindi_Medium);
        String Vicky_Donor = hindiComedies[13]; System.out.println(Vicky_Donor);
        String Stree = hindiComedies[14]; System.out.println(Stree);
        String Bala = hindiComedies[15]; System.out.println(Bala);
        String Badhaai_Ho = hindiComedies[16]; System.out.println(Badhaai_Ho);
        String Bareilly = hindiComedies[17]; System.out.println(Bareilly);
        String Ludo = hindiComedies[18]; System.out.println(Ludo);
        String Piku = hindiComedies[19]; System.out.println(Piku);
        String Sonu_Ke_Titu = hindiComedies[20]; System.out.println(Sonu_Ke_Titu);
        String Shubh_Mangal = hindiComedies[21]; System.out.println(Shubh_Mangal);
        String Total_Dhamaal = hindiComedies[22]; System.out.println(Total_Dhamaal);
        String Dhamaal = hindiComedies[23]; System.out.println(Dhamaal);
        String Housefull = hindiComedies[24]; System.out.println(Housefull);
        String Madgaon = hindiComedies[25]; System.out.println(Madgaon);
        String Crew = hindiComedies[26]; System.out.println(Crew);
        String Munjya = hindiComedies[27]; System.out.println(Munjya);
        String Fukrey_3 = hindiComedies[28]; System.out.println(Fukrey_3);
        String Bad_Newz = hindiComedies[29]; System.out.println(Bad_Newz);

        System.out.println("\n Telugu Comedies ");
        String Mathu_Vadalara = teluguComedies[0]; System.out.println(Mathu_Vadalara);
        String Jathi_Ratnalu = teluguComedies[1]; System.out.println(Jathi_Ratnalu);
        String Agent_Sai = teluguComedies[2]; System.out.println(Agent_Sai);
        String Pelli_Choopulu = teluguComedies[3]; System.out.println(Pelli_Choopulu);
        String Ee_Nagaraniki = teluguComedies[4]; System.out.println(Ee_Nagaraniki);
        String Brochevarevarura = teluguComedies[5]; System.out.println(Brochevarevarura);
        String F2 = teluguComedies[6]; System.out.println(F2);
        String Ami_Thumi = teluguComedies[7]; System.out.println(Ami_Thumi);
        String Manmadhudu = teluguComedies[8]; System.out.println(Manmadhudu);
        String Venky = teluguComedies[9]; System.out.println(Venky);
        String Dubai_Seenu = teluguComedies[10]; System.out.println(Dubai_Seenu);
        String Ready = teluguComedies[11]; System.out.println(Ready);
        String King = teluguComedies[12]; System.out.println(King);
        String Dookudu = teluguComedies[13]; System.out.println(Dookudu);
        String Baadshah = teluguComedies[14]; System.out.println(Baadshah);
        String Nuvvu_Naaku = teluguComedies[15]; System.out.println(Nuvvu_Naaku);
        String Malliswari = teluguComedies[16]; System.out.println(Malliswari);
        String Kick = teluguComedies[17]; System.out.println(Kick);
        String Race_Gurram = teluguComedies[18]; System.out.println(Race_Gurram);
        String Ala_Vaikunthapurramuloo = teluguComedies[19]; System.out.println(Ala_Vaikunthapurramuloo);
        String Dj_Tillu = teluguComedies[20]; System.out.println(Dj_Tillu);
        String Tillu_Square = teluguComedies[21]; System.out.println(Tillu_Square);
        String Om_Bheem_Bush = teluguComedies[22]; System.out.println(Om_Bheem_Bush);
        String Hasith_Goli = teluguComedies[23]; System.out.println(Hasith_Goli);
        String Vivaha_Bhojanambu = teluguComedies[24]; System.out.println(Vivaha_Bhojanambu);
        String Middle_Class = teluguComedies[25]; System.out.println(Middle_Class);
        String Pushpaka = teluguComedies[26]; System.out.println(Pushpaka);
        String Skylab = teluguComedies[27]; System.out.println(Skylab);
        String Paagal = teluguComedies[28]; System.out.println(Paagal);
        String Cinema_Bandi = teluguComedies[29]; System.out.println(Cinema_Bandi);

        System.out.println("\n Tamil Comedies ");
        String Panchatanthiram = tamilComedies[0]; System.out.println(Panchatanthiram);
        String Kalakalappu = tamilComedies[1]; System.out.println(Kalakalappu);
        String Vasool_Raja = tamilComedies[2]; System.out.println(Vasool_Raja);
        String Indru_Netru = tamilComedies[3]; System.out.println(Indru_Netru);
        String Soodhu_Kavvum = tamilComedies[4]; System.out.println(Soodhu_Kavvum);
        String Kadhalum = tamilComedies[5]; System.out.println(Kadhalum);
        String Moodar_Koodam = tamilComedies[6]; System.out.println(Moodar_Koodam);
        String Bhaskaran = tamilComedies[7]; System.out.println(Bhaskaran);
        String Varuthapadatha = tamilComedies[8]; System.out.println(Varuthapadatha);
        String Rajini_Murugan = tamilComedies[9]; System.out.println(Rajini_Murugan);
        String Comali = tamilComedies[10]; System.out.println(Comali);
        String Love_Insurance = tamilComedies[11]; System.out.println(Love_Insurance);
        String Doctor = tamilComedies[12]; System.out.println(Doctor);
        String Don = tamilComedies[13]; System.out.println(Don);
        String Thallumaala = tamilComedies[14]; System.out.println(Thallumaala);
        String Vaayai_Moodi = tamilComedies[15]; System.out.println(Vaayai_Moodi);
        String Mandela = tamilComedies[16]; System.out.println(Mandela);
        String Oh_My_Kadavule = tamilComedies[17]; System.out.println(Oh_My_Kadavule);
        String Aandavan = tamilComedies[18]; System.out.println(Aandavan);
        String Kaathuvaakula = tamilComedies[19]; System.out.println(Kaathuvaakula);
        String Pammal = tamilComedies[20]; System.out.println(Pammal);
        String Michael_Madana = tamilComedies[21]; System.out.println(Michael_Madana);
        String Theali = tamilComedies[22]; System.out.println(Theali);
        String Kanni_Maadam = tamilComedies[23]; System.out.println(Kanni_Maadam);
        String Gulu_Gulu = tamilComedies[24]; System.out.println(Gulu_Gulu);
        String Vadhandhi = tamilComedies[25]; System.out.println(Vadhandhi);
        String Time_Enna_Boss = tamilComedies[26]; System.out.println(Time_Enna_Boss);
        String Vellai_Pookal = tamilComedies[27]; System.out.println(Vellai_Pookal);
        String Manmatha_Leelai = tamilComedies[28]; System.out.println(Manmatha_Leelai);
        String Sila_Nerangalil = tamilComedies[29]; System.out.println(Sila_Nerangalil);

        System.out.println("\nKannada Comedies");
        String Nograj = kannadaSeries[0]; System.out.println(Nograj);
        String Honeymoon = kannadaSeries[1]; System.out.println(Honeymoon);
        String Loose_Connection = kannadaSeries[2]; System.out.println(Loose_Connection);
        String Ekam = kannadaSeries[3]; System.out.println(Ekam);
        String By_Mistake = kannadaSeries[4]; System.out.println(By_Mistake);
        String Love_You_Abhi = kannadaSeries[5]; System.out.println(Love_You_Abhi);
        String Shuddhi = kannadaSeries[6]; System.out.println(Shuddhi);
        String Bhinna = kannadaSeries[7]; System.out.println(Bhinna);
        String Aarambha = kannadaSeries[8]; System.out.println(Aarambha);
        String Namma_Metro = kannadaSeries[9]; System.out.println(Namma_Metro);
        String Mayabazar = kannadaSeries[10]; System.out.println(Mayabazar);
        String Satya = kannadaSeries[11]; System.out.println(Satya);
        String Jothe_Jotheyali = kannadaSeries[12]; System.out.println(Jothe_Jotheyali);
        String Kasturi_Nivasa = kannadaSeries[13]; System.out.println(Kasturi_Nivasa);
        String Mahanati = kannadaSeries[14]; System.out.println(Mahanati);
        String Ranganayaki = kannadaSeries[15]; System.out.println(Ranganayaki);
        String Radha_Ramana = kannadaSeries[16]; System.out.println(Radha_Ramana);
        String Gattimela = kannadaSeries[17]; System.out.println(Gattimela);
        String Lakshmi_Baramma = kannadaSeries[18]; System.out.println(Lakshmi_Baramma);
        String Kavaludaari = kannadaSeries[19]; System.out.println(Kavaludaari);
        String Ratnan_Prapancha = kannadaSeries[20]; System.out.println(Ratnan_Prapancha);
        String Badava_Rascal = kannadaSeries[21]; System.out.println(Badava_Rascal);
        String Galipata_2 = kannadaSeries[22]; System.out.println(Galipata_2);
        String Hostel_Hudugaru = kannadaSeries[23]; System.out.println(Hostel_Hudugaru);
        String Mustafa = kannadaSeries[24]; System.out.println(Mustafa);
        String Toby = kannadaSeries[25]; System.out.println(Toby);
        String Sapta = kannadaSeries[26]; System.out.println(Sapta);
        String Aachar = kannadaSeries[27]; System.out.println(Aachar);
        String Kousalya = kannadaSeries[28]; System.out.println(Kousalya);
        String French_Biriyani = kannadaSeries[29]; System.out.println(French_Biriyani);

        System.out.println("\n Malayalam Comedies ");
        String Aavesham = malayalamComedies[0]; System.out.println(Aavesham);
        String Kumbalangi_Nights = malayalamComedies[1]; System.out.println(Kumbalangi_Nights);
        String Jan_E_Man = malayalamComedies[2]; System.out.println(Jan_E_Man);
        String Jaya_Jaya_Hey = malayalamComedies[3]; System.out.println(Jaya_Jaya_Hey);
        String Minnal_Murali = malayalamComedies[4]; System.out.println(Minnal_Murali);
        String Premam = malayalamComedies[5]; System.out.println(Premam);
        String Bangalore_Days = malayalamComedies[6]; System.out.println(Bangalore_Days);
        String Charlie = malayalamComedies[7]; System.out.println(Charlie);
        String Sudani = malayalamComedies[8]; System.out.println(Sudani);
        String Thaneer_Mathan = malayalamComedies[9]; System.out.println(Thaneer_Mathan);
        String Adi_Kapyare = malayalamComedies[10]; System.out.println(Adi_Kapyare);
        String Aadu = malayalamComedies[11]; System.out.println(Aadu);
        String Aadu_2 = malayalamComedies[12]; System.out.println(Aadu_2);
        String Kunjiramayanam = malayalamComedies[13]; System.out.println(Kunjiramayanam);
        String Vellimoonga = malayalamComedies[14]; System.out.println(Vellimoonga);
        String Maheshinte = malayalamComedies[15]; System.out.println(Maheshinte);
        String Action_Hero = malayalamComedies[16]; System.out.println(Action_Hero);
        String North_24 = malayalamComedies[17]; System.out.println(North_24);
        String Driving_Licence = malayalamComedies[18]; System.out.println(Driving_Licence);
        String Pranjiyettan = malayalamComedies[19]; System.out.println(Pranjiyettan);
        String God_Father = malayalamComedies[20]; System.out.println(God_Father);
        String Harihar_Nagar = malayalamComedies[21]; System.out.println(Harihar_Nagar);
        String Sandhesam = malayalamComedies[22]; System.out.println(Sandhesam);
        String Kilukkam = malayalamComedies[23]; System.out.println(Kilukkam);
        String Chithram = malayalamComedies[24]; System.out.println(Chithram);
        String Boeing_Boeing = malayalamComedies[25]; System.out.println(Boeing_Boeing);
        String Nadodikkattu = malayalamComedies[26]; System.out.println(Nadodikkattu);
        String Mannar_Mathai = malayalamComedies[27]; System.out.println(Mannar_Mathai);
        String Ramji_Rao = malayalamComedies[28]; System.out.println(Ramji_Rao);
        String Falimy = malayalamComedies[29]; System.out.println(Falimy);
    }
}