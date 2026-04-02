class Remote {

    int remoteId;
    String brand;
    int buttons;
    boolean isWorking;

    public void getRemoteDetails() {
        System.out.println("Remote Details");
        System.out.println("Remote Id: " + remoteId);
        System.out.println("Brand: " + brand);
        System.out.println("Buttons: " + buttons);
        System.out.println("Is Working: " + isWorking);
    }
}