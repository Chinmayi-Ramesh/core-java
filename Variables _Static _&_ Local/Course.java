class Course {

    static String courseName = "Java Programming";
    static String courseCode = "CS301";
    static int duration = 6;
    static String instructor = "Mr. Naveen";
    static int credits = 4;
    static String department = "CSE";
    static boolean isElective = false;
    static int totalStudents = 120;
    static boolean isActive = true;

    public static void main(String[] args) {

        String courseName = "Python Programming";
        String courseCode = "CS302";
        int duration = 4;
        String instructor = "Ms. Kavya";
        int credits = 3;
        String department = "CSE";
        boolean isElective = true;
        int totalStudents = 100;
        boolean isActive = true;

        System.out.println("Course Name is " + courseName);
        System.out.println("Course Name (static) is " + Course.courseName);

        System.out.println("Course Code is " + courseCode);
        System.out.println("Course Code (static) is " + Course.courseCode);

        System.out.println("Duration is " + duration);
        System.out.println("Duration (static) is " + Course.duration);

        System.out.println("Instructor is " + instructor);
        System.out.println("Instructor (static) is " + Course.instructor);

        System.out.println("Credits are " + credits);
        System.out.println("Credits (static) are " + Course.credits);

        System.out.println("Department is " + department);
        System.out.println("Department (static) is " + Course.department);

        System.out.println("Is Elective: " + isElective);
        System.out.println("Is Elective (static): " + Course.isElective);

        System.out.println("Total Students are " + totalStudents);
        System.out.println("Total Students (static) are " + Course.totalStudents);

        System.out.println("Is Active: " + isActive);
        System.out.println("Is Active (static): " + Course.isActive);
    }
}
