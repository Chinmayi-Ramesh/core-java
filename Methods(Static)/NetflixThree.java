class NetflixThree {

    static String appName = "Netflix";

    static String kannadaMovies[] = {
        "Kantara","KGF","KGF2","Charlie 777","Ugramm",
        "Mugulu Nage","Roberrt","Salaga","Love Mocktail","Avane Srimannarayana",
        "Dia","Bhajarangi","RangiTaranga","Googly","Bell Bottom",
        "Raajakumara","Yuvarathnaa","James","Kranti","Vedha",
        "Gaalipata","Simple Agi Ondh Love Story","Kirik Party","Arjun Reddy K","Lucky Man",
        "Garuda Gamana","Sapta Sagaradaache","Hostel Hudugaru","Ondu Motteya Kathe","Natasaarvabhowma"
    };

    static String englishMovies[] = {
        "Titanic","Avatar","Inception","Interstellar","The Dark Knight",
        "Gladiator","The Matrix","The Avengers","Joker","Frozen",
        "Lion King","Harry Potter","The Godfather","Jurassic Park","Spider Man",
        "Iron Man","Captain America","Thor","Black Panther","Deadpool",
        "Doctor Strange","Fast and Furious","Mission Impossible","Top Gun","The Prestige",
        "Fight Club","Forrest Gump","The Social Network","La La Land","Avengers Endgame"
    };

    static String teluguMovies[] = {
        "RRR","Baahubali","Pushpa","Salaar","Kalki",
        "Arjun Reddy","Magadheera","Jersey","Srimanthudu","Pokiri",
        "Maharshi","Athadu","Dookudu","Janatha Garage","Fidaa",
        "Geetha Govindam","Gabbar Singh","Businessman","Leader","Adhurs",
        "Mirchi","Temper","Chatrapathi","Ala Vaikunthapurramuloo","Rangasthalam",
        "Sye","Oopiri","Bharat Ane Nenu","Khaidi","AD"
    };

    static String hindiMovies[] = {
        "Dangal","3 Idiots","PK","Jawan","Pathaan",
        "Bajrangi Bhaijaan","Sholay","DDLJ","K3G","War",
        "Sanju","Andhadhun","Drishyam","Queen","Barfi",
        "Tiger Zinda Hai","Chennai Express","Sultan","Don","Krrish",
        "Ra One","Kick","Ek Tha Tiger","Golmaal","ZNMD",
        "YJHD","Taare Zameen Par","Bhool Bhulaiyaa","Gadar 2","Tanu Weds Manu"
    };

    static String tamilMovies[] = {
        "Vikram","Leo","Jailer","Master","Enthiran",
        "Sivaji","Baasha","Theri","Bigil","Mersal",
        "Kaithi","PS1","PS2","Viswasam","Petta",
        "Asuran","Soorarai Pottru","96","Anniyan","Ghajini",
        "Thuppakki","Kaththi","Darbar","Beast","Varisu",
        "Love Today","Don","Kanchana","Vada Chennai","Jai Bhim"
    };

    static String malayalamMovies[] = {
        "Drishyam","Drishyam 2","Premam","Lucifer","Pulimurugan",
        "Minnal Murali","2018","Bangalore Days","Kumbalangi Nights","Manichitrathazhu",
        "Spadikam","Charlie","Ustad Hotel","Great Indian Kitchen","Jana Gana Mana",
        "Kurup","Ayyappanum Koshiyum","Malik","Take Off","Neram",
        "Classmates","CID Moosa","Oppam","Traffic","Hridayam",
        "Joji","Rorschach","Android Kunjappan","Iyobinte Pusthakam","Thanneer Mathan"
    };

    public static void main(String args[]) {

        
        getKannadaMovies();
        getEnglishMovies();
        getTeluguMovies();
        getHindiMovies();
        getTamilMovies();
        getMalayalamMovies();
    }

    

    static void getKannadaMovies() {
        System.out.println("\nAvailable Kannada Movies:");
        for(String movie : kannadaMovies) {
            System.out.println(movie);
        }
    }

    static void getEnglishMovies() {
        System.out.println("\nAvailable English Movies:");
        for(String movie : englishMovies) {
            System.out.println(movie);
        }
    }

    static void getTeluguMovies() {
        System.out.println("\nAvailable Telugu Movies:");
        for(String movie : teluguMovies) {
            System.out.println(movie);
        }
    }

    static void getHindiMovies() {
        System.out.println("\nAvailable Hindi Movies:");
        for(String movie : hindiMovies) {
            System.out.println(movie);
        }
    }

    static void getTamilMovies() {
        System.out.println("\nAvailable Tamil Movies:");
        for(String movie : tamilMovies) {
            System.out.println(movie);
        }
    }

    static void getMalayalamMovies() {
        System.out.println("\nAvailable Malayalam Movies:");
        for(String movie : malayalamMovies) {
            System.out.println(movie);
        }
    }
}