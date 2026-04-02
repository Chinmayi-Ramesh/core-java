class Factory {

    int factoryId;
    String name;
    String location;
    boolean isOpen;
    Machine machine;

    public void getFactoryDetails() {
        System.out.println("Factory Id: " + factoryId);
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Is Open: " + isOpen);
        machine.getMachineDetails();
    }
}