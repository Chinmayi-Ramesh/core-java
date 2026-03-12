class Training {

    static String trainingName = "Industrial Training";
    static String company = "Infosys";
    static int duration = 6;
    static String mentor = "Mr. Arjun";
    static String location = "Bangalore";
    static boolean isPaid = true;
    static double stipend = 15000;
    static String department = "CSE";
    static boolean isCompleted = false;

    public static void main(String[] args) {

        String trainingName = "Internship";
        String company = "TCS";
        int duration = 3;
        String mentor = "Ms. Kavya";
        String location = "Hyderabad";
        boolean isPaid = true;
        double stipend = 12000;
        String department = "ECE";
        boolean isCompleted = true;

        System.out.println("Training Name is " + trainingName);
        System.out.println("Training Name (static) is " + Training.trainingName);

        System.out.println("Company is " + company);
        System.out.println("Company (static) is " + Training.company);

        System.out.println("Duration is " + duration);
        System.out.println("Duration (static) is " + Training.duration);

        System.out.println("Mentor is " + mentor);
        System.out.println("Mentor (static) is " + Training.mentor);

        System.out.println("Location is " + location);
        System.out.println("Location (static) is " + Training.location);

        System.out.println("Is Paid: " + isPaid);
        System.out.println("Is Paid (static): " + Training.isPaid);

        System.out.println("Stipend is " + stipend);
        System.out.println("Stipend (static) is " + Training.stipend);

        System.out.println("Department is " + department);
        System.out.println("Department (static) is " + Training.department);

        System.out.println("Is Completed: " + isCompleted);
        System.out.println("Is Completed (static): " + Training.isCompleted);
    }
}
