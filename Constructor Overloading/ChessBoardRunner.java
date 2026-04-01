class ChessBoardRunner {

    public static void main(String[] args) {
		
		ChessBoard cb1 = new ChessBoard("Wood", 8, "Brown", true, 1200);
        cb1.display();
        ChessBoard cb2 = new ChessBoard("Plastic", 6, "Black", false, 800);
        cb2.display();
        ChessBoard cb3 = new ChessBoard("Glass", 10, "White", true, 2000);
        cb3.display();
        ChessBoard cb4 = new ChessBoard("Metal", 8, "Silver", false, 1500);
        cb4.display();
        ChessBoard cb5 = new ChessBoard("Wood", 12, "Brown", true, 2500);
        cb5.display();
        ChessBoard cb6 = new ChessBoard("Fiber", 7, "Grey", false, 900);
        cb6.display();
	}
}