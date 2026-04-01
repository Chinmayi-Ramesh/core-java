class SteelRunner {

    public static void main(String[] args) {
		
		Steel st1 = new Steel("Alloy", 50, "A1", true, 1000);
        st1.display();
        Steel st2 = new Steel("Carbon", 40, "B2", true, 800);
        st2.display();
        Steel st3 = new Steel("Mild", 30, "C3", false, 600);
        st3.display();
        Steel st4 = new Steel("Stainless", 60, "D4", true, 1200);
        st4.display();
        Steel st5 = new Steel("Tool", 70, "E5", true, 1500);
        st5.display();
        Steel st6 = new Steel("Alloy", 55, "F6", false, 900);
        st6.display();
		
	}
}