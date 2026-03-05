class Attendance {

    static String studentName = "Rahul";
    static String usn = "1RV23CS001";
    static String subject = "Java";
    static int totalClasses = 60;
    static int attendedClasses = 55;
    static double percentage = 91.6;
    static String semester = "5th";
    static String department = "CSE";
    static boolean isEligible = true;

    public static void main(String[] args) {

        String studentName = "Arjun";
        String usn = "1RV23EC002";
        String subject = "Physics";
        int totalClasses = 50;
        int attendedClasses = 45;
        double percentage = 90.0;
        String semester = "5th";
        String department = "ECE";
        boolean isEligible = true;

        System.out.println("Student Name is " + studentName);
        System.out.println("Student Name (static) is " + Attendance.studentName);

        System.out.println("USN is " + usn);
        System.out.println("USN (static) is " + Attendance.usn);

        System.out.println("Subject is " + subject);
        System.out.println("Subject (static) is " + Attendance.subject);

        System.out.println("Total Classes are " + totalClasses);
        System.out.println("Total Classes (static) are " + Attendance.totalClasses);

        System.out.println("Attended Classes are " + attendedClasses);
        System.out.println("Attended Classes (static) are " + Attendance.attendedClasses);

        System.out.println("Percentage is " + percentage);
        System.out.println("Percentage (static) is " + Attendance.percentage);

        System.out.println("Semester is " + semester);
        System.out.println("
