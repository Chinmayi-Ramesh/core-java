class RealEstate {

    int estateId;
    String name;
    String location;
    boolean isApproved;
    Property property;

    public void getEstateDetails() {
	System.out.println("RealEstate Details");
        System.out.println("Estate Id: " + estateId);
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Is Approved: " + isApproved);
        property.getPropertyDetails();
        
    }
}