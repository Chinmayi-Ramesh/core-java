class Result {

    static String studentName = "Rahul";
    static String usn = "1RV23CS001";
    static int totalMarks = 800;
    static double percentage = 85.5;
    static String grade = "A";
    static boolean isPassed = true;
    static String semester = "5th";
    static String department = "CSE";
    static int year = 2024;

    public static void main(String[] args) {

        String studentName = "Arjun";
        String usn = "1RV23EC002";
        int totalMarks = 750;
        double percentage = 82.0;
        String grade = "B";
        boolean isPassed = true;
        String semester = "5th";
        String department = "ECE";
        int year = 2024;

        System.out.println("Student Name is " + studentName);
        System.out.println("Student Name (static) is " + Result.studentName);

        System.out.println("USN is " + usn);
        System.out.println("USN (static) is " + Result.usn);

        System.out.println("Total Marks are " + totalMarks);
        System.out.println("Total Marks (static) are " + Result.totalMarks);

        System.out.println("Percentage is " + percentage);
        System.out.println("Percentage (static) is " + Result.percentage);

        System.out.println("Grade is " + grade);
        System.out.println("Grade (static) is " + Result.grade);

        System.out.println("Is Passed: " + isPassed);
        System.out.println("Is Passed (static): " + Result.isPassed);

        System.out.println("Semester is " + semester);
        System.out.println("Semester (static) is " + Result.semester);

        System.out.println("Department is " + department);
        System.out.println("Department (static) is " + Result.department);

        System.out.println("Year is " + year);
        System.out.println("Year (static) is " + Result.year);
    }
}
