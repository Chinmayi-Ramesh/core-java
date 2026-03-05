class Transport {

    static String busNumber = "KA01AB1234";
    static String route = "Tumkur to Bangalore";
    static int capacity = 50;
    static String driverName = "Ramesh";
    static long contactNumber = 9876543210L;
    static boolean isAC = true;
    static double fare = 120.5;
    static String timing = "8:00 AM";
    static boolean isRunning = true;

    public static void main(String[] args) {

        String busNumber = "KA02CD5678";
        String route = "Mysore to Bangalore";
        int capacity = 45;
        String driverName = "Suresh";
        long contactNumber = 9123456789L;
        boolean isAC = false;
        double fare = 100.0;
        String timing = "9:00 AM";
        boolean isRunning = true;

        System.out.println("Bus Number is " + busNumber);
        System.out.println("Bus Number (static) is " + Transport.busNumber);

        System.out.println("Route is " + route);
        System.out.println("Route (static) is " + Transport.route);

        System.out.println("Capacity is " + capacity);
        System.out.println("Capacity (static) is " + Transport.capacity);

        System.out.println("Driver Name is " + driverName);
        System.out.println("Driver Name (static) is " + Transport.driverName);

        System.out.println("Contact Number is " + contactNumber);
        System.out.println("Contact Number (static) is " + Transport.contactNumber);

        System.out.println("Is AC: " + isAC);
        System.out.println("Is AC (static): " + Transport.isAC);

        System.out.println("Fare is " + fare);
        System.out.println("Fare (static) is " + Transport.fare);

        System.out.println("Timing is " + timing);
        System.out.println("Timing (static) is " + Transport.timing);

        System.out.println("Is Running: " + isRunning);
        System.out.println("Is Running (static): " + Transport.isRunning);
    }
}
