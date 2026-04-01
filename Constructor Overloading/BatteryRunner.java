class BatteryRunner {

    public static void main(String[] args) {
		
		Battery b1 = new Battery("Duracell", 5000, "Li-ion", true, 300);
        b1.display();
        Battery b2 = new Battery("Sony", 4000, "NiMH", true, 250);
        b2.display();
        Battery b3 = new Battery("Panasonic", 3000, "Li-ion", false, 200);
        b3.display();
        Battery b4 = new Battery("Eveready", 2000, "Dry", false, 150);
        b4.display();
        Battery b5 = new Battery("Amaron", 6000, "Li-ion", true, 400);
        b5.display();
        Battery b6 = new Battery("Exide", 7000, "Lead", true, 500);
        b6.display();
		
	}
}