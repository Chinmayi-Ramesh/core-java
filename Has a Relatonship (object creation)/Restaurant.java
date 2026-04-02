class Restaurant {

    int restaurantId;
    String name;
    String location;
    boolean isOpen;
    Chef chef;

    public void getRestaurantDetails() {
        System.out.println("Restaurant Details");

        System.out.println("Restaurant Id: " + restaurantId);
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Is Open: " + isOpen);
        chef.getChefDetails();
    }
}