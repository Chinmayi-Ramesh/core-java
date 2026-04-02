class Movie {

    int movieId;
    String title;
    String language;
    boolean isHit;
    Actor actor;

    public void getMovieDetails() {
        System.out.println("Movie Details");

        System.out.println("Movie Id: " + movieId);
        System.out.println("Title: " + title);
        System.out.println("Language: " + language);
        System.out.println("Is Hit: " + isHit);
        actor.getActorDetails();
    }
}