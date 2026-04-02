class Freelancer {

    int freelancerId;
    String name;
    String skill;
    boolean isAvailable;
    Client client;

    public void getFreelancerDetails() {
        System.out.println("Freelancer Id: " + freelancerId);
        System.out.println("Name: " + name);
        System.out.println("Skill: " + skill);
        System.out.println("Is Available: " + isAvailable);
        client.getClientDetails();
    }
}