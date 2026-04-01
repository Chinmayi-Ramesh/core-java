class PawnRunner {

    public static void main(String[] args) {
		
		Pawn p1 = new Pawn("White", "Wood", 5, true, 0.2);
        p1.display();
        Pawn p2 = new Pawn("Black", "Plastic", 4, false, 0.1);
        p2.display();
        Pawn p3 = new Pawn("White", "Metal", 6, true, 0.3);
        p3.display();
        Pawn p4 = new Pawn("Black", "Wood", 5, true, 0.25);
        p4.display();
        Pawn p5 = new Pawn("White", "Fiber", 3, false, 0.15);
        p5.display();
        Pawn p6 = new Pawn("Black", "Steel", 7, true, 0.4);
        p6.display();

		
	}
}