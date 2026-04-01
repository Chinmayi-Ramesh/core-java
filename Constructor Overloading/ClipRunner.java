class ClipRunner {

    public static void main(String[] args) {

        
        Clip c1 = new Clip("Metal", 5, "Red", true, 10);
        c1.display();
        Clip c2 = new Clip("Plastic", 3, "Blue", false, 5);
        c2.display();
        Clip c3 = new Clip("Steel", 6, "Black", true, 15);
        c3.display();
        Clip c4 = new Clip("Iron", 4, "Silver", true, 12);
        c4.display();
        Clip c5 = new Clip("Fiber", 2, "Green", false, 3);
        c5.display();
        Clip c6 = new Clip("Copper", 7, "Brown", true, 20);
        c6.display();
	}
}