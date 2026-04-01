class StrawberryRunner {

    public static void main(String[] args) {
		
		 Strawberry s1 = new Strawberry("Red", 0.5, "Sweet", true, 20);
        s1.display();
        Strawberry s2 = new Strawberry("Pink", 0.4, "Sweet", true, 15);
        s2.display();
        Strawberry s3 = new Strawberry("Dark Red", 0.6, "Tangy", false, 25);
        s3.display();
        Strawberry s4 = new Strawberry("Light Red", 0.3, "Sweet", true, 10);
        s4.display();
        Strawberry s5 = new Strawberry("Red", 0.7, "Juicy", true, 30);
        s5.display();
        Strawberry s6 = new Strawberry("Pink", 0.2, "Sour", false, 12);
        s6.display();
		
	}
}