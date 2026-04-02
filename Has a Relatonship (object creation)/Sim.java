class Sim {

    int simId;
    String provider;
    String plan;
    boolean isActive;

    public void getSimDetails() {
        System.out.println("Sim Id: " + simId);
        System.out.println("Provider: " + provider);
        System.out.println("Plan: " + plan);
        System.out.println("Is Active: " + isActive);
    }
}