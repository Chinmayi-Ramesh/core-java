class LapStandExecutor {

    public static void main(String[] args) {

        // Using parameterized constructor
        LapStand ref = new LapStand("3m", "White");
        ref.displayDetails();

        // Using default constructor
        LapStand ref1 = new LapStand("2m", "Black");
        ref1.displayDetails();
		
		LapStand ref2 = new LapStand("1m", "Brown");
        ref2.displayDetails();
		
		LapStand ref3 = new LapStand("4m", "Blue");
        ref3.displayDetails();
		
		LapStand ref4 = new LapStand("5m", "Green");
        ref4.displayDetails();
		
		
    }
}