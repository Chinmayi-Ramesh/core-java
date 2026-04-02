class Exam {

    static String examName = "Semester Exam";
    static String subject = "Mathematics";
    static int totalMarks = 100;
    static int duration = 3;
    static String examiner = "Dr. Rao";
    static String examDate = "10-06-2024";
    static boolean isOnline = false;
    static String department = "CSE";
    static boolean isActive = true;

    public static void main(String[] args) {

        String examName = "Internal Test";
        String subject = "Physics";
        int totalMarks = 50;
        int duration = 2;
        String examiner = "Dr. Kumar";
        String examDate = "05-05-2024";
        boolean isOnline = true;
        String department = "ECE";
        boolean isActive = true;

        System.out.println("Exam Name is " + examName);
        System.out.println("Exam Name (static) is " + Exam.examName);

        System.out.println("Subject is " + subject);
        System.out.println("Subject (static) is " + Exam.subject);

        System.out.println("Total Marks are " + totalMarks);
        System.out.println("Total Marks (static) are " + Exam.totalMarks);

        System.out.println("Duration is " + duration);
        System.out.println("Duration (static) is " + Exam.duration);

        System.out.println("Examiner is " + examiner);
        System.out.println("Examiner (static) is " + Exam.examiner);

        System.out.println("Exam Date is " + examDate);
        System.out.println("Exam Date (static) is " + Exam.examDate);

        System.out.println("Is Online: " + isOnline);
        System.out.println("Is Online (static): " + Exam.isOnline);

        System.out.println("Department is " + department);
        System.out.println("Department (static) is " + Exam.department);

        System.out.println("Is Active: " + isActive);
        System.out.println("Is Active (static): " + Exam.isActive);
    }
}
