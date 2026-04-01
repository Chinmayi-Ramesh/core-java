class LaptopStand {

    String color;
    String height;
	
	//default Constructor

    LaptopStand() {
        System.out.println("Stand Constructor is invoked");
    }

    public void displayDetails() {
        System.out.println(height);
        System.out.println(color);
    }
}