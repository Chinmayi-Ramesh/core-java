class Laboratory {

    static String labName = "Computer Lab";
    static String department = "CSE";
    static int totalComputers = 60;
    static String labIncharge = "Mr. Naveen";
    static boolean hasInternet = true;
    static String location = "Block A";
    static int capacity = 70;
    static boolean isAvailable = true;
    static String equipmentType = "Desktop";

    public static void main(String[] args) {

        String labName = "Electronics Lab";
        String department = "ECE";
        int totalComputers = 40;
        String labIncharge = "Ms. Kavya";
        boolean hasInternet = true;
        String location = "Block B";
        int capacity = 50;
        boolean isAvailable = true;
        String equipmentType = "Microcontrollers";

        System.out.println("Lab Name is " + labName);
        System.out.println("Lab Name (static) is " + Laboratory.labName);

        System.out.println("Department is " + department);
        System.out.println("Department (static) is " + Laboratory.department);

        System.out.println("Total Computers are " + totalComputers);
        System.out.println("Total Computers (static) are " + Laboratory.totalComputers);

        System.out.println("Lab Incharge is " + labIncharge);
        System.out.println("Lab Incharge (static) is " + Laboratory.labIncharge);

        System.out.println("Has Internet: " + hasInternet);
        System.out.println("Has Internet (static): " + Laboratory.hasInternet);

        System.out.println("Location is " + location);
        System.out.println("Location (static) is " + Laboratory.location);

        System.out.println("Capacity is " + capacity);
        System.out.println("Capacity (static) is " + Laboratory.capacity);

        System.out.println("Is Available: " + isAvailable);
        System.out.println("Is Available (static): " + Laboratory.isAvailable);

        System.out.println("Equipment Type is " + equipmentType);
        System.out.println("Equipment Type (static) is " + Laboratory.equipmentType);
    }
}
