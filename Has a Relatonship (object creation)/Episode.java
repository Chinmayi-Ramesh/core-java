class Episode {

    int episodeId;
    String title;
    int duration;
    boolean isReleased;

    public void getEpisodeDetails() {
        System.out.println("Episode Details");
        System.out.println("Episode Id: " + episodeId);
        System.out.println("Title: " + title);
        System.out.println("Duration: " + duration);
        System.out.println("Is Released: " + isReleased);
    }
}