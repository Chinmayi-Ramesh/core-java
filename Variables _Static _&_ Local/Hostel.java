class   {

    static String hostelName = "Boys Hostel";
    static int totalRooms = 200;
    static int capacity = 400;
    static String wardenName = "Mr. Suresh";
    static boolean hasWifi = true;
    static boolean hasMess = true;
    static String location = "Campus";
    static long contactNumber = 9876543210L;
    static boolean isAvailable = true;

    public static void main(String[] args) {

        String hostelName = "Girls Hostel";
        int totalRooms = 150;
        int capacity = 300;
        String wardenName = "Mrs. Latha";
        boolean hasWifi = true;
        boolean hasMess = true;
        String location = "North Block";
        long contactNumber = 9123456789L;
        boolean isAvailable = true;

        System.out.println("Hostel Name is " + hostelName);
        System.out.println("Hostel Name (static) is " + Hostel.hostelName);

        System.out.println("Total Rooms are " + totalRooms);
        System.out.println("Total Rooms (static) are " + Hostel.totalRooms);

        System.out.println("Capacity is " + capacity);
        System.out.println("Capacity (static) is " + Hostel.capacity);

        System.out.println("Warden Name is " + wardenName);
        System.out.println("Warden Name (static) is " + Hostel.wardenName);

        System.out.println("Has Wifi: " + hasWifi);
        System.out.println("Has Wifi (static): " + Hostel.hasWifi);

        System.out.println("Has Mess: " + hasMess);
        System.out.println("Has Mess (static): " + Hostel.hasMess);

        System.out.println("Location is " + location);
        System.out.println("Location (static) is " + Hostel.location);

        System.out.println("Contact Number is " + contactNumber);
        System.out.println("Contact Number (static) is " + Hostel.contactNumber);

        System.out.println("Is Available: " + isAvailable);
        System.out.println("Is Available (static): " + Hostel.isAvailable);
    }
}
