class CarromRunner {

    public static void main(String[] args) {
		
		Carrom cr1 = new Carrom("Standard", 32, "Beige", true, 2000);
        cr1.display();
        Carrom cr2 = new Carrom("Mini", 24, "Brown", false, 1200);
        cr2.display();
        Carrom cr3 = new Carrom("Premium", 36, "White", true, 3000);
        cr3.display();
        Carrom cr4 = new Carrom("Basic", 30, "Black", false, 1500);
        cr4.display();
        Carrom cr5 = new Carrom("Deluxe", 34, "Cream", true, 2500);
        cr5.display();
        Carrom cr6 = new Carrom("Classic", 28, "Wood", true, 1800);
        cr6.display();

		
	}
}