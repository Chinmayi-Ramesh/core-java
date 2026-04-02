class Mobile {

    int mobileId;
    String brand;
    int price;
    boolean is5G;
    Sim sim;

    public void getMobileDetails() {
		System.out.println("Mobile Details");
		
        System.out.println("Mobile Id: " + mobileId);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Is 5G: " + is5G);
        sim.getSimDetails();
        
    }
}