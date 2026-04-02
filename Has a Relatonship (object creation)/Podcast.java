class Podcast {

    int podcastId;
    String title;
    String host;
    boolean isLive;
    Guest guest;

    public void getPodcastDetails() {
        System.out.println("Podcast Details");

        System.out.println("Podcast Id: " + podcastId);
        System.out.println("Title: " + title);
        System.out.println("Host: " + host);
        System.out.println("Is Live: " + isLive);
        guest.getGuestDetails();
    }
}