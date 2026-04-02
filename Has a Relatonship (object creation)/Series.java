class Series {

    int seriesId;
    String name;
    String genre;
    boolean isTrending;
    Episode episode;

    public void getSeriesDetails() {
        System.out.println("Series Details");

        System.out.println("Series Id: " + seriesId);
        System.out.println("Name: " + name);
        System.out.println("Genre: " + genre);
        System.out.println("Is Trending: " + isTrending);
        episode.getEpisodeDetails();
    }
}