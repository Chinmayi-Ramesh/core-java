class Canteen {

    static String canteenName = "Main Canteen";
    static String location = "Campus Center";
    static int seatingCapacity = 150;
    static String managerName = "Ravi";
    static boolean hasVeg = true;
    static boolean hasNonVeg = true;
    static String openingTime = "8:00 AM";
    static String closingTime = "6:00 PM";
    static boolean isOpen = true;

    public static void main(String[] args) {

        String canteenName = "Mini Canteen";
        String location = "Block C";
        int seatingCapacity = 80;
        String managerName = "Sita";
        boolean hasVeg = true;
        boolean hasNonVeg = false;
        String openingTime = "9:00 AM";
        String closingTime = "5:00 PM";
        boolean isOpen = true;

        System.out.println("Canteen Name is " + canteenName);
        System.out.println("Canteen Name (static) is " + Canteen.canteenName);

        System.out.println("Location is " + location);
        System.out.println("Location (static) is " + Canteen.location);

        System.out.println("Seating Capacity is " + seatingCapacity);
        System.out.println("Seating Capacity (static) is " + Canteen.seatingCapacity);

        System.out.println("Manager Name is " + managerName);
        System.out.println("Manager Name (static) is " + Canteen.managerName);

        System.out.println("Has Veg: " + hasVeg);
        System.out.println("Has Veg (static): " + Canteen.hasVeg);

        System.out.println("Has Non-Veg: " + hasNonVeg);
        System.out.println("Has Non-Veg (static): " + Canteen.hasNonVeg);

        System.out.println("Opening Time is " + openingTime);
        System.out.println("Opening Time (static) is " + Canteen.openingTime);

        System.out.println("Closing Time is " + closingTime);
        System.out.println("Closing Time (static) is " + Canteen.closingTime);

        System.out.println("Is Open: " + isOpen);
        System.out.println("Is Open (static): " + Canteen.isOpen);
    }
}
