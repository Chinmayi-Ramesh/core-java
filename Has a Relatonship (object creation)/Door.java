class Door {

    int doorId;
    String material;
    String color;
    boolean isOpen;
    Lock lock;

    public void getDoorDetails() {
        System.out.println("Door Id: " + doorId);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Is Open: " + isOpen);
        lock.getLockDetails();
    }
}