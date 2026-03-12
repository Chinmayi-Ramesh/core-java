class Workshop {

    static String workshopName = "AI Workshop";
    static String topic = "Machine Learning";
    static String trainerName = "Dr. Suresh";
    static String date = "15-07-2024";
    static int duration = 2;
    static String department = "CSE";
    static int participants = 80;
    static boolean isCompleted = false;
    static String location = "Seminar Hall";

    public static void main(String[] args) {

        String workshopName = "Cloud Workshop";
        String topic = "AWS Basics";
        String trainerName = "Mr. Ramesh";
        String date = "20-07-2024";
        int duration = 1;
        String department = "ISE";
        int participants = 60;
        boolean isCompleted = true;
        String location = "Auditorium";

        System.out.println("Workshop Name is " + workshopName);
        System.out.println("Workshop Name (static) is " + Workshop.workshopName);

        System.out.println("Topic is " + topic);
        System.out.println("Topic (static) is " + Workshop.topic);

        System.out.println("Trainer Name is " + trainerName);
        System.out.println("Trainer Name (static) is " + Workshop.trainerName);

        System.out.println("Date is " + date);
        System.out.println("Date (static) is " + Workshop.date);

        System.out.println("Duration is " + duration);
        System.out.println("Duration (static) is " + Workshop.duration);

        System.out.println("Department is " + department);
        System.out.println("Department (static) is " + Workshop.department);

        System.out.println("Participants are " + participants);
        System.out.println("Participants (static) are " + Workshop.participants);

        System.out.println("Is Completed: " + isCompleted);
        System.out.println("Is Completed (static): " + Workshop.isCompleted);

        System.out.println("Location is " + location);
        System.out.println("Location (static) is " + Workshop.location);
    }
}
