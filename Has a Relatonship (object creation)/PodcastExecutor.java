class PodcastExecutor {
    public static void main(String[] args) {

        
        Podcast p1 = new Podcast();
        p1.podcastId = 1;
        p1.title = "TechTalk";
        p1.host = "Rahul";
        p1.isLive = true;

        Guest g1 = new Guest();
        g1.guestId = 101;
        g1.name = "Elon";
        g1.profession = "Entrepreneur";
        g1.isPopular = true;

        p1.guest = g1;

        
        Podcast p2 = new Podcast();
        p2.podcastId = 2;
        p2.title = "Startup Stories";
        p2.host = "Ankit";
        p2.isLive = true;

        Guest g2 = new Guest();
        g2.guestId = 102;
        g2.name = "Bill Gates";
        g2.profession = "Businessman";
        g2.isPopular = true;

        p2.guest = g2;

        
        Podcast p3 = new Podcast();
        p3.podcastId = 3;
        p3.title = "Health Talks";
        p3.host = "Sneha";
        p3.isLive = false;

        Guest g3 = new Guest();
        g3.guestId = 103;
        g3.name = "Doctor Ravi";
        g3.profession = "Doctor";
        g3.isPopular = true;

        p3.guest = g3;

        
        Podcast p4 = new Podcast();
        p4.podcastId = 4;
        p4.title = "Fitness Freak";
        p4.host = "Kiran";
        p4.isLive = true;

        Guest g4 = new Guest();
        g4.guestId = 104;
        g4.name = "Trainer Arjun";
        g4.profession = "Trainer";
        g4.isPopular = false;

        p4.guest = g4;

        
        Podcast p5 = new Podcast();
        p5.podcastId = 5;
        p5.title = "Movie Buzz";
        p5.host = "Ramesh";
        p5.isLive = true;

        Guest g5 = new Guest();
        g5.guestId = 105;
        g5.name = "Actor Vijay";
        g5.profession = "Actor";
        g5.isPopular = true;

        p5.guest = g5;

        
        Podcast p6 = new Podcast();
        p6.podcastId = 6;
        p6.title = "Tech News";
        p6.host = "Suresh";
        p6.isLive = false;

        Guest g6 = new Guest();
        g6.guestId = 106;
        g6.name = "Engineer Mani";
        g6.profession = "Engineer";
        g6.isPopular = true;

        p6.guest = g6;

        
        Podcast p7 = new Podcast();
        p7.podcastId = 7;
        p7.title = "Business Talk";
        p7.host = "Arjun";
        p7.isLive = true;

        Guest g7 = new Guest();
        g7.guestId = 107;
        g7.name = "Ambani";
        g7.profession = "Businessman";
        g7.isPopular = true;

        p7.guest = g7;

        
        Podcast p8 = new Podcast();
        p8.podcastId = 8;
        p8.title = "Education Hub";
        p8.host = "Divya";
        p8.isLive = true;

        Guest g8 = new Guest();
        g8.guestId = 108;
        g8.name = "Teacher Meena";
        g8.profession = "Teacher";
        g8.isPopular = false;

        p8.guest = g8;

        
        Podcast p9 = new Podcast();
        p9.podcastId = 9;
        p9.title = "Sports Talk";
        p9.host = "Vikas";
        p9.isLive = false;

        Guest g9 = new Guest();
        g9.guestId = 109;
        g9.name = "Virat";
        g9.profession = "Cricketer";
        g9.isPopular = true;

        p9.guest = g9;

        
        Podcast p10 = new Podcast();
        p10.podcastId = 10;
        p10.title = "Music World";
        p10.host = "Anu";
        p10.isLive = true;

        Guest g10 = new Guest();
        g10.guestId = 110;
        g10.name = "Singer Arijit";
        g10.profession = "Singer";
        g10.isPopular = true;

        p10.guest = g10;

        
        Podcast p11 = new Podcast();
        p11.podcastId = 11;
        p11.title = "Daily News";
        p11.host = "Ravi";
        p11.isLive = true;

        Guest g11 = new Guest();
        g11.guestId = 111;
        g11.name = "Reporter";
        g11.profession = "Journalist";
        g11.isPopular = false;

        p11.guest = g11;

        
        Podcast p12 = new Podcast();
        p12.podcastId = 12;
        p12.title = "Coding Talk";
        p12.host = "Karthik";
        p12.isLive = true;

        Guest g12 = new Guest();
        g12.guestId = 112;
        g12.name = "Developer";
        g12.profession = "Software Engineer";
        g12.isPopular = true;

        p12.guest = g12;

        
        Podcast p13 = new Podcast();
        p13.podcastId = 13;
        p13.title = "Travel Stories";
        p13.host = "Meena";
        p13.isLive = false;

        Guest g13 = new Guest();
        g13.guestId = 113;
        g13.name = "Traveler";
        g13.profession = "Blogger";
        g13.isPopular = true;

        p13.guest = g13;

        
        Podcast p14 = new Podcast();
        p14.podcastId = 14;
        p14.title = "Food Talk";
        p14.host = "Ganesh";
        p14.isLive = true;

        Guest g14 = new Guest();
        g14.guestId = 114;
        g14.name = "Chef Kumar";
        g14.profession = "Chef";
        g14.isPopular = true;

        p14.guest = g14;

        
        Podcast p15 = new Podcast();
        p15.podcastId = 15;
        p15.title = "Finance Talk";
        p15.host = "Raghu";
        p15.isLive = true;

        Guest g15 = new Guest();
        g15.guestId = 115;
        g15.name = "Advisor";
        g15.profession = "Finance Expert";
        g15.isPopular = true;

        p15.guest = g15;

        
        Podcast p16 = new Podcast();
        p16.podcastId = 16;
        p16.title = "Motivation";
        p16.host = "Vijay";
        p16.isLive = false;

        Guest g16 = new Guest();
        g16.guestId = 116;
        g16.name = "Speaker";
        g16.profession = "Motivational Speaker";
        g16.isPopular = true;

        p16.guest = g16;

        
        Podcast p17 = new Podcast();
        p17.podcastId = 17;
        p17.title = "Science Talk";
        p17.host = "Deepa";
        p17.isLive = true;

        Guest g17 = new Guest();
        g17.guestId = 117;
        g17.name = "Scientist";
        g17.profession = "Scientist";
        g17.isPopular = true;

        p17.guest = g17;

        
        Podcast p18 = new Podcast();
        p18.podcastId = 18;
        p18.title = "Gaming";
        p18.host = "Ajay";
        p18.isLive = true;

        Guest g18 = new Guest();
        g18.guestId = 118;
        g18.name = "Gamer";
        g18.profession = "Streamer";
        g18.isPopular = true;

        p18.guest = g18;

        
        Podcast p19 = new Podcast();
        p19.podcastId = 19;
        p19.title = "History Talk";
        p19.host = "Sanjay";
        p19.isLive = false;

        Guest g19 = new Guest();
        g19.guestId = 119;
        g19.name = "Historian";
        g19.profession = "Teacher";
        g19.isPopular = false;

        p19.guest = g19;

        
        Podcast p20 = new Podcast();
        p20.podcastId = 20;
        p20.title = "Future Tech";
        p20.host = "Rohit";
        p20.isLive = true;

        Guest g20 = new Guest();
        g20.guestId = 120;
        g20.name = "Innovator";
        g20.profession = "Engineer";
        g20.isPopular = true;

        p20.guest = g20;


        
        p1.getPodcastDetails();
        p2.getPodcastDetails();
        p3.getPodcastDetails();
        p4.getPodcastDetails();
        p5.getPodcastDetails();
        p6.getPodcastDetails();
        p7.getPodcastDetails();
        p8.getPodcastDetails();
        p9.getPodcastDetails();
        p10.getPodcastDetails();
        p11.getPodcastDetails();
        p12.getPodcastDetails();
        p13.getPodcastDetails();
        p14.getPodcastDetails();
        p15.getPodcastDetails();
        p16.getPodcastDetails();
        p17.getPodcastDetails();
        p18.getPodcastDetails();
        p19.getPodcastDetails();
        p20.getPodcastDetails();
    }
}