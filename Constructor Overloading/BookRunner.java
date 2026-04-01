class BookRunner {

    public static void main(String[] args) {
		
		Book bk1 = new Book("Java", "James", 300, true, 500);
        bk1.display();
        Book bk2 = new Book("Python", "Guido", 250, true, 450);
        bk2.display();
        Book bk3 = new Book("C++", "Bjarne", 400, false, 600);
        bk3.display();
        Book bk4 = new Book("DSA", "Author1", 350, true, 550);
        bk4.display();
        Book bk5 = new Book("AI", "Author2", 280, false, 700);
        bk5.display();
        Book bk6 = new Book("ML", "Author3", 320, true, 650);
        bk6.display();
		
	}
}