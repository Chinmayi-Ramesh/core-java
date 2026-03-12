class ZeefiveThree {

    static String platformName = "ZEE5";

    static String kannadaSerials[] = {
        "Jothe Jotheyali","Puttakkana Makkalu","Gattimela","Satya","Seetha Raama",
        "Kannadathi","Lakshmi Baramma","Mangala Gowri Maduve","Nammane Yuvarani","Kamali",
        "Agnisakshi","Kulavadhu","Radha Ramana","Brahmagantu","Sose Tanda Sowbhagya",
        "Yaare Nee Mohini","Subbalakshmi Samsara","Geetha","Srinivasa Kalyana","Bhagyalakshmi",
        "Mahadevi","Janani","Kavyanjali","Arundhati","Krishna Rukmini",
        "Devayani","Sarvamangala Mangalye","Anuraga Sangama","Shantham Papam","Muddulakshmi"
    };

    static String teluguSerials[] = {
        "Karthika Deepam","Intinti Gruhalakshmi","Radhamma Kuthuru","Gupta Nidhi","Krishna Mukunda Murari",
        "Prema Entha Madhuram","Mounaragam","Abhilasha","Nindu Noorella Saavasam","Devatha",
        "Gorintaku","Mangamma Gari Manavaralu","Agnisakshi Telugu","Sravana Sameeralu","Manasu Mamatha",
        "Amma","Chakravakam","Yamaleela","Siri Siri Muvvalu","Mudda Mandaram",
        "Sathamanam Bhavati","Naa Peru Meenakshi","Janaki Kalaganaledu","Trinayani","Raktha Sambandham",
        "Care of Anasuya","Rama Sakkani Seetha","Subha Sankalpam","Meghamala","Naga Bhairavi"
    };

    static String tamilSerials[] = {
        "Kayal","Sundari","Bharathi Kannamma","Pandian Stores","Baakiyalakshmi",
        "Raja Rani","Thamizhum Saraswathiyum","Roja","Chithi","Anbe Sivam",
        "Kalyana Veedu","Kolangal","Metti Oli","Arasi","Vani Rani",
        "Deivamagal","Priyamanaval","Saravanan Meenatchi","Thendral","Sembaruthi",
        "Kaatrukkenna Veli","Anjali","Kana Kaanum Kaalangal","Aval","Lakshmi Vandhachu",
        "Chandralekha","Magal","Thirumathi Hitler","Naam Iruvar Namakku Iruvar","Sakthi"
    };

    static String hindiSerials[] = {
        "Kumkum Bhagya","Kundali Bhagya","Bhagya Lakshmi","Anupamaa","Yeh Rishta Kya Kehlata Hai",
        "Ghum Hai Kisikey Pyaar Meiin","Taarak Mehta Ka Ooltah Chashmah","Naagin","Kasautii Zindagii Kay","Balika Vadhu",
        "Saath Nibhaana Saathiya","Diya Aur Baati Hum","Ishq Mein Marjawan","Bade Achhe Lagte Hain","Pandya Store",
        "Meet","Radha Mohan","Shiv Shakti","Mahabharat","Ramayan",
        "Devon Ke Dev Mahadev","Crime Patrol","CID","Bigg Boss","Dance India Dance",
        "Indian Idol","Super Singer","Kaun Banega Crorepati","The Kapil Sharma Show","Udaan"
    };

    static String englishSerials[] = {
        "Friends","Breaking Bad","Stranger Things","Game of Thrones","The Crown",
        "The Office","The Big Bang Theory","Money Heist","Sherlock","The Witcher",
        "Wednesday","The Boys","House of the Dragon","Peaky Blinders","Dark",
        "Vikings","The Walking Dead","Lost","Prison Break","Greys Anatomy",
        "The Flash","Arrow","Supernatural","How I Met Your Mother","Brooklyn Nine Nine",
        "Suits","Lucifer","The Vampire Diaries","Manifest","The Mandalorian"
    };

    static String malayalamSerials[] = {
        "Kudumbavilakku","Santhwanam","Mounaragam Malayalam","Seetha Kalyanam","Paadatha Painkili",
        "Ammayariyathe","Sasneham","Karuthamuthu","Parasparam","Vanambadi",
        "Chandanamazha","Bhramanam","Sthreepadam","Sumangali Bhava","Manjurukum Kaalam",
        "Ente Mathavu","Neelakkuyil","Kasthooriman","Pranayavarnangal","Chembarathi",
        "Sabarimala Swami Ayyappan","Devi Mahatmyam","Swami Ayyappan","Pournami Thinkal","Sundari Malayalam",
        "Indulekha","Mizhi Randilum","Mizhikal Sakshi","Akkareyanente Maanasam","Nandanam"
    };

    public static void main(String args[]) {

        // Method initialization
        getKannadaSerials();
        getTeluguSerials();
        getTamilSerials();
        getHindiSerials();
        getEnglishSerials();
        getMalayalamSerials();
    }

    // Method declaration

    static void getKannadaSerials() {
        System.out.println("\nAvailable Kannada Serials:");
        for(String serial : kannadaSerials) {
            System.out.println(serial);
        }
    }

    static void getTeluguSerials() {
        System.out.println("\nAvailable Telugu Serials:");
        for(String serial : teluguSerials) {
            System.out.println(serial);
        }
    }

    static void getTamilSerials() {
        System.out.println("\nAvailable Tamil Serials:");
        for(String serial : tamilSerials) {
            System.out.println(serial);
        }
    }

    static void getHindiSerials() {
        System.out.println("\nAvailable Hindi Serials:");
        for(String serial : hindiSerials) {
            System.out.println(serial);
        }
    }

    static void getEnglishSerials() {
        System.out.println("\nAvailable English Serials:");
        for(String serial : englishSerials) {
            System.out.println(serial);
        }
    }

    static void getMalayalamSerials() {
        System.out.println("\nAvailable Malayalam Serials:");
        for(String serial : malayalamSerials) {
            System.out.println(serial);
        }
    }
}