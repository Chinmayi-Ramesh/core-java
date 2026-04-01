class PopcornRunner {
    public static void main(String[] args) {

        Popcorn p1 = new Popcorn();  // calls default → then parameterized
        p1.display();

        Popcorn p2 = new Popcorn(2, "Act II", 120);
        p2.display();
    }
}