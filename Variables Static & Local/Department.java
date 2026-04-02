class Department {

    static String departmentName = "Computer Science";
    static String hodName = "Dr. Kavitha";
    static int totalFaculty = 25;
    static int totalStudents = 350;
    static String block = "A Block";
    static String email = "cse@college.edu";
    static long contactNumber = 9876543210L;
    static boolean hasLab = true;
    static boolean isActive = true;

    public static void main(String[] args) {

        String departmentName = "Electronics";
        String hodName = "Dr. Mahesh";
        int totalFaculty = 20;
        int totalStudents = 300;
        String block = "B Block";
        String email = "ece@college.edu";
        long contactNumber = 9123456789L;
        boolean hasLab = true;
        boolean isActive = true;

        System.out.println("Department Name is " + departmentName);
        System.out.println("Department Name (static) is " + Department.departmentName);

        System.out.println("HOD Name is " + hodName);
        System.out.println("HOD Name (static) is " + Department.hodName);

        System.out.println("Total Faculty is " + totalFaculty);
        System.out.println("Total Faculty (static) is " + Department.totalFaculty);

        System.out.println("Total Students are " + totalStudents);
        System.out.println("Total Students (static) are " + Department.totalStudents);

        System.out.println("Block is " + block);
        System.out.println("Block (static) is " + Department.block);

        System.out.println("Email is " + email);
        System.out.println("Email (static) is " + Department.email);

        System.out.println("Contact Number is " + contactNumber);
        System.out.println("Contact Number (static) is " + Department.contactNumber);

        System.out.println("Has Lab: " + hasLab);
        System.out.println("Has Lab (static): " + Department.hasLab);

        System.out.println("Is Active: " + isActive);
        System.out.println("Is Active (static): " + Department.isActive);
    }
}

