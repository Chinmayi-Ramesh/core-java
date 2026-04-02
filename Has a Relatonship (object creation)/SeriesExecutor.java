class SeriesExecutor {
    public static void main(String[] args) {

        
        Series s1 = new Series();
        s1.seriesId = 1;
        s1.name = "Stranger Things";
        s1.genre = "Sci-Fi";
        s1.isTrending = true;

        Episode e1 = new Episode();
        e1.episodeId = 101;
        e1.title = "Episode 1";
        e1.duration = 45;
        e1.isReleased = true;

        s1.episode = e1;

        
        Series s2 = new Series();
        s2.seriesId = 2;
        s2.name = "Money Heist";
        s2.genre = "Crime";
        s2.isTrending = true;

        Episode e2 = new Episode();
        e2.episodeId = 102;
        e2.title = "Episode 2";
        e2.duration = 50;
        e2.isReleased = true;

        s2.episode = e2;

        
        Series s3 = new Series();
        s3.seriesId = 3;
        s3.name = "Breaking Bad";
        s3.genre = "Drama";
        s3.isTrending = true;

        Episode e3 = new Episode();
        e3.episodeId = 103;
        e3.title = "Episode 3";
        e3.duration = 47;
        e3.isReleased = true;

        s3.episode = e3;

        
        Series s4 = new Series();
        s4.seriesId = 4;
        s4.name = "Dark";
        s4.genre = "Thriller";
        s4.isTrending = false;

        Episode e4 = new Episode();
        e4.episodeId = 104;
        e4.title = "Episode 4";
        e4.duration = 52;
        e4.isReleased = true;

        s4.episode = e4;

        
        Series s5 = new Series();
        s5.seriesId = 5;
        s5.name = "Friends";
        s5.genre = "Comedy";
        s5.isTrending = true;

        Episode e5 = new Episode();
        e5.episodeId = 105;
        e5.title = "Episode 5";
        e5.duration = 30;
        e5.isReleased = true;

        s5.episode = e5;

        
        Series s6 = new Series();
        s6.seriesId = 6;
        s6.name = "Game of Thrones";
        s6.genre = "Fantasy";
        s6.isTrending = true;

        Episode e6 = new Episode();
        e6.episodeId = 106;
        e6.title = "Episode 6";
        e6.duration = 60;
        e6.isReleased = true;

        s6.episode = e6;

        
        Series s7 = new Series();
        s7.seriesId = 7;
        s7.name = "The Boys";
        s7.genre = "Action";
        s7.isTrending = true;

        Episode e7 = new Episode();
        e7.episodeId = 107;
        e7.title = "Episode 7";
        e7.duration = 55;
        e7.isReleased = true;

        s7.episode = e7;

        
        Series s8 = new Series();
        s8.seriesId = 8;
        s8.name = "Loki";
        s8.genre = "Marvel";
        s8.isTrending = true;

        Episode e8 = new Episode();
        e8.episodeId = 108;
        e8.title = "Episode 8";
        e8.duration = 48;
        e8.isReleased = true;

        s8.episode = e8;

        
        Series s9 = new Series();
        s9.seriesId = 9;
        s9.name = "WandaVision";
        s9.genre = "Marvel";
        s9.isTrending = false;

        Episode e9 = new Episode();
        e9.episodeId = 109;
        e9.title = "Episode 9";
        e9.duration = 40;
        e9.isReleased = true;

        s9.episode = e9;

        
        Series s10 = new Series();
        s10.seriesId = 10;
        s10.name = "The Witcher";
        s10.genre = "Fantasy";
        s10.isTrending = true;

        Episode e10 = new Episode();
        e10.episodeId = 110;
        e10.title = "Episode 10";
        e10.duration = 50;
        e10.isReleased = true;

        s10.episode = e10;

        
        Series s11 = new Series();
        s11.seriesId = 11;
        s11.name = "Narcos";
        s11.genre = "Crime";
        s11.isTrending = true;

        Episode e11 = new Episode();
        e11.episodeId = 111;
        e11.title = "Episode 11";
        e11.duration = 49;
        e11.isReleased = true;

        s11.episode = e11;

        
        Series s12 = new Series();
        s12.seriesId = 12;
        s12.name = "Peaky Blinders";
        s12.genre = "Drama";
        s12.isTrending = true;

        Episode e12 = new Episode();
        e12.episodeId = 112;
        e12.title = "Episode 12";
        e12.duration = 52;
        e12.isReleased = true;

        s12.episode = e12;

        
        Series s13 = new Series();
        s13.seriesId = 13;
        s13.name = "Vikings";
        s13.genre = "History";
        s13.isTrending = false;

        Episode e13 = new Episode();
        e13.episodeId = 113;
        e13.title = "Episode 13";
        e13.duration = 53;
        e13.isReleased = true;

        s13.episode = e13;

        
        Series s14 = new Series();
        s14.seriesId = 14;
        s14.name = "Lucifer";
        s14.genre = "Fantasy";
        s14.isTrending = true;

        Episode e14 = new Episode();
        e14.episodeId = 114;
        e14.title = "Episode 14";
        e14.duration = 45;
        e14.isReleased = true;

        s14.episode = e14;

        
        Series s15 = new Series();
        s15.seriesId = 15;
        s15.name = "Arrow";
        s15.genre = "Action";
        s15.isTrending = false;

        Episode e15 = new Episode();
        e15.episodeId = 115;
        e15.title = "Episode 15";
        e15.duration = 44;
        e15.isReleased = true;

        s15.episode = e15;

        
        Series s16 = new Series();
        s16.seriesId = 16;
        s16.name = "Flash";
        s16.genre = "Action";
        s16.isTrending = true;

        Episode e16 = new Episode();
        e16.episodeId = 116;
        e16.title = "Episode 16";
        e16.duration = 42;
        e16.isReleased = true;

        s16.episode = e16;

        
        Series s17 = new Series();
        s17.seriesId = 17;
        s17.name = "Supergirl";
        s17.genre = "Action";
        s17.isTrending = false;

        Episode e17 = new Episode();
        e17.episodeId = 117;
        e17.title = "Episode 17";
        e17.duration = 43;
        e17.isReleased = true;

        s17.episode = e17;

        
        Series s18 = new Series();
        s18.seriesId = 18;
        s18.name = "Black Mirror";
        s18.genre = "Sci-Fi";
        s18.isTrending = true;

        Episode e18 = new Episode();
        e18.episodeId = 118;
        e18.title = "Episode 18";
        e18.duration = 60;
        e18.isReleased = true;

        s18.episode = e18;

        
        Series s19 = new Series();
        s19.seriesId = 19;
        s19.name = "The Office";
        s19.genre = "Comedy";
        s19.isTrending = true;

        Episode e19 = new Episode();
        e19.episodeId = 119;
        e19.title = "Episode 19";
        e19.duration = 30;
        e19.isReleased = true;

        s19.episode = e19;

        
        Series s20 = new Series();
        s20.seriesId = 20;
        s20.name = "House of Dragon";
        s20.genre = "Fantasy";
        s20.isTrending = true;

        Episode e20 = new Episode();
        e20.episodeId = 120;
        e20.title = "Episode 20";
        e20.duration = 55;
        e20.isReleased = true;

        s20.episode = e20;


        
        s1.getSeriesDetails();
        s2.getSeriesDetails();
        s3.getSeriesDetails();
        s4.getSeriesDetails();
        s5.getSeriesDetails();
        s6.getSeriesDetails();
        s7.getSeriesDetails();
        s8.getSeriesDetails();
        s9.getSeriesDetails();
        s10.getSeriesDetails();
        s11.getSeriesDetails();
        s12.getSeriesDetails();
        s13.getSeriesDetails();
        s14.getSeriesDetails();
        s15.getSeriesDetails();
        s16.getSeriesDetails();
        s17.getSeriesDetails();
        s18.getSeriesDetails();
        s19.getSeriesDetails();
        s20.getSeriesDetails();
    }
}