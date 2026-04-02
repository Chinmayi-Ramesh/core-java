class Platform {

    int platformId;
    String name;
    int capacity;
    boolean hasRoof;

    public void getPlatformDetails() {
        System.out.println("Platform Id: " + platformId);
        System.out.println("Name: " + name);
        System.out.println("Capacity: " + capacity);
        System.out.println("Has Roof: " + hasRoof);
    }
}