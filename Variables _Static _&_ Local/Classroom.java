class Classroom {

    static String roomNumber = "A101";
    static int capacity = 60;
    static boolean hasProjector = true;
    static boolean hasAC = true;
    static String block = "A Block";
    static String department = "CSE";
    static int benches = 30;
    static boolean isAvailable = true;
    static String floor = "1st Floor";

    public static void main(String[] args) {

        String roomNumber = "B202";
        int capacity = 50;
        boolean hasProjector = false;
        boolean hasAC = false;
        String block = "B Block";
        String department = "ECE";
        int benches = 25;
        boolean isAvailable = true;
        String floor = "2nd Floor";

        System.out.println("Room Number is " + roomNumber);
        System.out.println("Room Number (static) is " + Classroom.roomNumber);

        System.out.println("Capacity is " + capacity);
        System.out.println("Capacity (static) is " + Classroom.capacity);

        System.out.println("Has Projector: " + hasProjector);
        System.out.println("Has Projector (static): " + Classroom.hasProjector);

        System.out.println("Has AC: " + hasAC);
        System.out.println("Has AC (static): " + Classroom.hasAC);

        System.out.println("Block is " + block);
        System.out.println("Block (static) is " + Classroom.block);

        System.out.println("Department is " + department);
        System.out.println("Department (static) is " + Classroom.department);

        System.out.println("Benches are " + benches);
        System.out.println("Benches (static) are " + Classroom.benches);

        System.out.println("Is Available: " + isAvailable);
        System.out.println("Is Available (static): " + Classroom.isAvailable);

        System.out.println("Floor is " + floor);
        System.out.println("Floor (static) is " + Classroom.floor);
    }
}
