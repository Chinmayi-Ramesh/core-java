class College {

    static String collegeName = "RV College";
    static String university = "VTU";
    static String location = "Bangalore";
    static int establishedYear = 1963;
    static String principalName = "Dr. Kumar";
    static long contactNumber = 9876543210L;
    static String email = "info@rvcollege.edu";
    static int totalStudents = 5000;
    static boolean isAutonomous = true;

    public static void main(String[] args) {

        String collegeName = "PES University";
        String university = "PESU";
        String location = "Bangalore";
        int establishedYear = 1988;
        String principalName = "Dr. Rao";
        long contactNumber = 9123456789L;
        String email = "contact@pes.edu";
        int totalStudents = 8000;
        boolean isAutonomous = true;

        System.out.println("College Name is " + collegeName);
        System.out.println("College Name (static) is " + College.collegeName);

        System.out.println("University is " + university);
        System.out.println("University (static) is " + College.university);

        System.out.println("Location is " + location);
        System.out.println("Location (static) is " + College.location);

        System.out.println("Established Year is " + establishedYear);
        System.out.println("Established Year (static) is " + College.establishedYear);

        System.out.println("Principal Name is " + principalName);
        System.out.println("Principal Name (static) is " + College.principalName);

        System.out.println("Contact Number is " + contactNumber);
        System.out.println("Contact Number (static) is " + College.contactNumber);

        System.out.println("Email is " + email);
        System.out.println("Email (static) is " + College.email);

        System.out.println("Total Students are " + totalStudents);
        System.out.println("Total Students (static) are " + College.totalStudents);

        System.out.println("Is Autonomous: " + isAutonomous);
        System.out.println("Is Autonomous (static): " + College.isAutonomous);
    }
}
