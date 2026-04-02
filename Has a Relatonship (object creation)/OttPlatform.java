class OttPlatform {

    int platformId;
    String name;
    String language;
    boolean isPremium;
    Subscription subscription;

    public void getOttDetails() {
        System.out.println("Platform Id: " + platformId);
        System.out.println("Name: " + name);
        System.out.println("Language: " + language);
        System.out.println("Is Premium: " + isPremium);
        subscription.getSubscriptionDetails();
    }
}