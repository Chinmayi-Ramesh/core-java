class AdityaBirlaGroup {

    int groupId;
    String name;
    String sector;
    boolean isGlobal;
    Rcb rcb;

    public void getGroupDetails() {
        System.out.println("Group Id: " + groupId);
        System.out.println("Name: " + name);
        System.out.println("Sector: " + sector);
        System.out.println("Is Global: " + isGlobal);
        rcb.getRcbDetails();
    }
}