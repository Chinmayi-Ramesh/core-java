class Gym {

    int gymId;
    String name;
    String location;
    boolean isOpen;
    Trainer trainer;

    public void getGymDetails() {
        System.out.println("Gym Details");

        System.out.println("Gym Id: " + gymId);
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Is Open: " + isOpen);
        trainer.getTrainerDetails();
    }
}