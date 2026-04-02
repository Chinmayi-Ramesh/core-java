class Subscription {

    int subId;
    String type;
    int price;
    boolean isActive;

    public void getSubscriptionDetails() {
        System.out.println("Sub Id: " + subId);
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
        System.out.println("Is Active: " + isActive);
    }
}