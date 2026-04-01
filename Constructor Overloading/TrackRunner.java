class TrackRunner {

    public static void main(String[] args) {
		
		Track t1 = new Track("Running", 400, "Stadium", true, 8);
        t1.display();
        Track t2 = new Track("Cycling", 500, "City", true, 6);
        t2.display();
        Track t3 = new Track("Training", 300, "School", false, 4);
        t3.display();
        Track t4 = new Track("Professional", 800, "Arena", true, 10);
        t4.display();
        Track t5 = new Track("Local", 200, "Ground", false, 3);
        t5.display();
        Track t6 = new Track("Olympic", 1000, "National", true, 12);
        t6.display();

		
	}
}