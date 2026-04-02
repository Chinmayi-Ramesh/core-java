class Client {

    int clientId;
    String name;
    String project;
    boolean isActive;

    public void getClientDetails() {
        System.out.println("Client Id: " + clientId);
        System.out.println("Name: " + name);
        System.out.println("Project: " + project);
        System.out.println("Is Active: " + isActive);
    }
}
